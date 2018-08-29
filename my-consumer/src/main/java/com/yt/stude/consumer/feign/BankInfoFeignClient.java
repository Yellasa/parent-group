package com.yt.stude.consumer.feign;

import com.yt.stude.consumer.dto.BankInfoDO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * <br/>
 * Created: 2018/8/28 17:51 <br/>
 *
 * @author yangting
 * @version 1.0
 * @Modified by:
 * @since JDK 1.8
 */
@FeignClient(name = "service-b")
@RequestMapping("mysb")
public interface BankInfoFeignClient
{
    @GetMapping("{id}")
    BankInfoDO findById(@PathVariable("id")Long id);

    @PostMapping("save")
    void save(@RequestBody  BankInfoDO bankInfoDO);

}

