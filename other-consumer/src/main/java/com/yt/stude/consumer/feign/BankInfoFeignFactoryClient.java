package com.yt.stude.consumer.feign;

import com.yt.stude.consumer.config.FeignClientFallbackFactory;
import com.yt.stude.consumer.dto.BankInfoDO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * <br/>
 * Created: 2018/8/28 17:51 <br/>
 *
 * @author yangting
 * @version 1.0
 * @Modified by:
 * @since JDK 1.8
 */
@FeignClient(name = "service-b",path = "/provider/api/v1",fallbackFactory = FeignClientFallbackFactory.class)
public interface BankInfoFeignFactoryClient
{
    @GetMapping("mysb/{id}")
    BankInfoDO findById(@PathVariable("id") Long id);

    @PostMapping("mysb/save")
    void save(@RequestBody BankInfoDO bankInfoDO);

}

