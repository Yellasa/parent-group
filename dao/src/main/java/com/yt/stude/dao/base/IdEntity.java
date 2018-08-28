package com.yt.stude.dao.base;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;

import java.io.Serializable;

/**
 * @ClassName: IdEntity
 * @Author: yangting@ty
 * @CreateDate: 2018/8/28 11:38
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/8/28 11:38
 * @UpdateRemark: 更新说明
 **/
public class IdEntity <T extends Model> extends Model<T> implements Serializable
{
    /**
     * 主键
     */
    @TableId
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
