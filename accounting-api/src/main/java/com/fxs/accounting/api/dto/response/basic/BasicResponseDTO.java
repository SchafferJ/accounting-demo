package com.fxs.accounting.api.dto.response.basic;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @Author: suxinfa
 * @Date: 2019/12/10 11:46
 * @Description:
 */
@Setter
@Getter
public class BasicResponseDTO<T> implements Serializable {
    private HeaderResponseDTO header;
    private T data;
}
