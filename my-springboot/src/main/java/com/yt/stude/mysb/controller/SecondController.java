package com.yt.stude.mysb.controller;

import com.yt.stude.mysb.config.MyConfig;
import com.yt.stude.mysb.domain.BankInfoDO;
import com.yt.stude.mysb.service.BankInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName: SecondController
 * @Author: yangting@ty
 * @CreateDate: 2018/8/28 10:08
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/8/28 10:08
 * @UpdateRemark: 更新说明
 **/
@RestController
@RequestMapping("/mysb")
public class SecondController
{
    private Logger logger = LoggerFactory.getLogger(SecondController.class);
    @Autowired
    MyConfig defineEntity;

    @Autowired
    private BankInfoService bankInfoService;

    @GetMapping("define")
    String define(){
        logger.info(defineEntity.getPname()+":"+defineEntity.getPassword());
        return "test.name:" + defineEntity.getPname() + ", test.password:" + defineEntity.getPassword();
    }

    @GetMapping("/{id}")
    BankInfoDO findById(@PathVariable("id")Long id){
        BankInfoDO bankInfoDO = bankInfoService.selectById(id);
        return bankInfoDO;
    }

    @PostMapping("save")
    boolean bankInfo(@RequestBody BankInfoDO bankInfoDO){
        boolean insert = bankInfoService.insert(bankInfoDO);
        return insert;
    }

}
