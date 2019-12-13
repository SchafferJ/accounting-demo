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
 * @Date: 2019/12/11 16:53
 * @Description:
 */
@Entity
@Table(name = "demo_model")
@Setter
@Getter
@ToString
public class DemoModel {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
