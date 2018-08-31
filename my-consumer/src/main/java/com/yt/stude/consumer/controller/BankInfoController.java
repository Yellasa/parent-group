package com.yt.stude.consumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.yt.stude.consumer.dto.BankInfoDO;
import com.yt.stude.consumer.feign.BankInfoFeignClient;
import org.slf4j.LoggerFactory;
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

    /**
     * 使用Hystrix降级
     * @param id
     * @return
     */
    @HystrixCommand(fallbackMethod = "fallback",
            commandProperties = {@HystrixProperty(name = "execution.isolation.thread.timeoutInMillisecends",value = "5000")},
            threadPoolProperties = {@HystrixProperty(name = "coreSize",value = "1"),@HystrixProperty(name = "maxQueueSize",value = "5")})
    @GetMapping("/hystrix/sucess/{id}")
    public String findBankInfoSucessHystrix(@PathVariable("id") Long id){
        return restTemplate.getForObject("http://SERVICE-B/mysb/{1}",BankInfoDO.class,id).toString();
    }

    /**
     * @param id
     * @return
     */
    @HystrixCommand(fallbackMethod = "fallback")
    @GetMapping("/hystrix/fail/{id}")
    public String findBankInfoFailHystrix(@PathVariable("id") Long id) throws InterruptedException
    {
        int i = 1/0;
        return restTemplate.getForObject("http://SERVICE-B/mysb/{1}",BankInfoDO.class,id).toString();
    }

    private String fallback(Long id,Throwable throwable){
        LoggerFactory.getLogger(BankInfoController.class).info("========{}=============",throwable.getMessage());
        return "Error:"+id;
    }
}
