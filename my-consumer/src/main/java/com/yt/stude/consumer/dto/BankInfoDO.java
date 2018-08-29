package com.yt.stude.consumer.dto;

/**
 * @ClassName: BankInfoDO
 * @Author: yangting@ty
 * @CreateDate: 2018/8/28 11:20
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/8/28 11:20
 * @UpdateRemark: 更新说明
 **/
public class BankInfoDO
{
    private Long id;

    private String depositBank;

    private String bankBranch;

    private String bankName;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

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

    public String getBankName()
    {
        return bankName;
    }

    public void setBankName(String bankName)
    {
        this.bankName = bankName;
    }
}
