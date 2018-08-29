package com.yt.stude.consumer.controller;

import com.yt.stude.consumer.dto.BankInfoDO;
import com.yt.stude.consumer.feign.BankInfoFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: BankInfoController
 * @Author: yangting@ty
 * @CreateDate: 2018/8/28 17:59
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/8/28 17:59
 * @UpdateRemark: 更新说明
 **/
@RequestMapping("/bankInfo")
@RestController
public class BankInfoController
{
    @Autowired
    private RestTemplate restTemplate;


    @Autowired
    private BankInfoFeignClient bankInfoFeignClient;

    @GetMapping("/feign/bankinfo/{id}")
    public BankInfoDO findFeignById(@PathVariable("id") Long id) {
        return this.bankInfoFeignClient.findById(id);
    }

    @PostMapping("/feign/post")
    public void post(@RequestBody BankInfoDO bankInfoDO){
         this.bankInfoFeignClient.save(bankInfoDO);
    }

    @GetMapping("/banlance/bankinfo/id/{id}")
    public BankInfoDO findFeignById2(@PathVariable("id")Long id) {
        return restTemplate.getForObject("http://SERVICE-B/mysb/{1}",BankInfoDO.class,id);

    }
}
