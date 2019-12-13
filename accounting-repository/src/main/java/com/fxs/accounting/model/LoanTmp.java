package com.fxs.accounting.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * @Author: suxinfa
 * @Date: 2019/12/13 15:15
 * @Description:
 */
@Entity
@Table(name = "loan_tmp")
@Setter
@Getter
@ToString
public class LoanTmp {
    @Id
    @GeneratedValue
    private Long id;
    /**
     * 授权编号
     * 出账授权编号
     */
    private String acctAuthNo;

    private Boolean delete;

    private Integer version;
    /**
     * 创建时间
     */
    private LocalDateTime createTime;
    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
}
