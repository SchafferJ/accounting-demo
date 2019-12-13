package com.fxs.accounting.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import java.time.LocalDateTime;

/**
 * @Author: suxinfa
 * @Date: 2019/12/13 18:46
 * @Description:
 */
@Setter
@Getter
@MappedSuperclass
public abstract class BaseEntity {
    /**
     * 版本号
     */
    @Version
    protected Integer version;
    /**
     * 创建人
     */
    protected String createBy;
    /**
     * 创建时间
     */
    protected LocalDateTime createTime;
    /**
     * 更新人
     */
    protected String updateBy;
    /**
     * 更新时间
     */
    protected LocalDateTime updateTime;
}
