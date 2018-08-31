package com.yt.stude.consumer.controller;

import com.yt.stude.consumer.dto.BankInfoDO;
import com.yt.stude.consumer.feign.BankInfoFeignFactoryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: BankInfoController
 * @Author: yangting@ty
 * @CreateDate: 2018/8/28 17:59
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/8/28 17:59
 * @UpdateRemark: 更新说明
 **/
@RequestMapping("/bankInfoFactory")
@RestController
public class BankInfoFactoryController
{

    @Autowired
    private BankInfoFeignFactoryClient bankInfoFeignFactoryClient;

    @GetMapping("/feign/bankinfo/{id}")
    public BankInfoDO findFeignById(@PathVariable("id") Long id) {
        return this.bankInfoFeignFactoryClient.findById(id);
    }

}
