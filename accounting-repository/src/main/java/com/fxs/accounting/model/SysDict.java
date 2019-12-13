package com.fxs.accounting.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author: suxinfa
 * @Date: 2019/12/13 15:59
 * @Description:
 */
@Entity
@Table(name = "sys_dict")
@Setter
@Getter
@ToString
public class SysDict extends BaseEntity {
    @Id
    @GeneratedValue
    private Long id;
    /**
     * 标签
     */
    private String tag;
    /**
     * 键
     */
    private String key;
    /**
     * 值
     */
    private String value;
    /**
     * 描述
     */
    private String desc;
}
