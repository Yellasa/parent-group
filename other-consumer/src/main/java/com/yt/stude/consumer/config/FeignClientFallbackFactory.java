package com.yt.stude.consumer.config;

import com.yt.stude.consumer.dto.BankInfoDO;
import com.yt.stude.consumer.feign.BankInfoFeignFactoryClient;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 服务降级原因工厂类
 *
 * @ClassName: FeignClientFactory
 * @Author: yangting@ty
 * @CreateDate: 2018/8/31 15:09
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/8/31 15:09
 * @UpdateRemark: 更新说明
 **/
@Component
public class FeignClientFallbackFactory  implements FallbackFactory<BankInfoFeignFactoryClient>
{
    private static Logger logger = LoggerFactory.getLogger(FeignClientFallbackFactory.class);

    //日志不要放在create方法中
    @Override
    public BankInfoFeignFactoryClient create(Throwable cause)
    {
        return new BankInfoFeignFactoryClient()
        {
            @Override
            public BankInfoDO findById(Long id)
            {

                FeignClientFallbackFactory.logger.info("BankInfoFeignClient.findById() 降级原因："+cause.getMessage());
                logger.info(cause.getClass().toString());
                if (cause instanceof RuntimeException){
                    BankInfoDO bo = new BankInfoDO();
                    bo.setBankBranch("哎呀，服务出错啦");
                    return bo;
                }
                return new BankInfoDO();
            }

            @Override
            public void save(BankInfoDO bankInfoDO)
            {
                FeignClientFallbackFactory.logger.info("BankInfoFeignClient.save() 降级原因："+cause.getMessage());
            }
        };
    }
}
