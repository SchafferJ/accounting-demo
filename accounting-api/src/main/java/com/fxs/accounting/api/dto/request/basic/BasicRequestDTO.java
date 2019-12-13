package com.fxs.accounting.api.dto.request.basic;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @Author: suxinfa
 * @Date: 2019/12/10 11:45
 * @Description:
 */
@Setter
@Getter
public class BasicRequestDTO<T> implements Serializable {
    @NotNull(message = "头信息不能为空")
    HeaderRequestDTO header;
    T data;
}
