package com.yt.stude.mysb.domain;

import com.baomidou.mybatisplus.annotations.TableName;
import com.yt.stude.dao.base.IdEntity;

/**
 * @ClassName: BankInfoDO
 * @Author: yangting@ty
 * @CreateDate: 2018/8/28 11:20
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/8/28 11:20
 * @UpdateRemark: 更新说明
 **/
@TableName("fp_bank_info")
public class BankInfoDO  extends IdEntity<BankInfoDO>
{

    private String depositBank;

    private String bankBranch;

    public String getDepositBank()
    {
        return depositBank;
    }

    public void setDepositBank(String depositBank)
    {
        this.depositBank = depositBank;
    }

    public String getBankBranch()
    {
        return bankBranch;
    }

    public void setBankBranch(String bankBranch)
    {
        this.bankBranch = bankBranch;
    }
}
