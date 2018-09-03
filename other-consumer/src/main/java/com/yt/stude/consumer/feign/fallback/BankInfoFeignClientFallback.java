package com.yt.stude.consumer.feign.fallback;

import com.yt.stude.consumer.dto.BankInfoDO;
import com.yt.stude.consumer.feign.BankInfoFeignClient;
import org.springframework.stereotype.Component;

/**
 * @ClassName: BankInfoFeignClientImpl
 * @Author: yangting@ty
 * @CreateDate: 2018/8/29 16:35
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/8/29 16:35
 * @UpdateRemark: 更新说明
 **/
@Component
public class BankInfoFeignClientFallback implements BankInfoFeignClient
{
    @Override
    public BankInfoDO findById(Long id)
    {
        return new BankInfoDO();
    }

    @Override
    public void save(BankInfoDO bankInfoDO)
    {
        System.out.println("fallback save");
    }
}
