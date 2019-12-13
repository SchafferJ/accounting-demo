package com.fxs.accounting.api.dto.response.basic;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @Author: suxinfa
 * @Date: 2019/12/11 15:41
 * @Description:
 */
@Setter
@Getter
public class HeaderResponseDTO implements Serializable {
    /**
     * 响应码
     */
    private String code;
    /**
     * 响应信息
     */
    private String msg;
}
