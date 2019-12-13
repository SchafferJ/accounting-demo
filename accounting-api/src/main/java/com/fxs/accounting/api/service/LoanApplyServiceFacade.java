package com.fxs.accounting.api.service;

import com.fxs.accounting.api.dto.request.LoanApplyRequestDTO;
import com.fxs.accounting.api.dto.request.basic.BasicRequestDTO;
import com.fxs.accounting.api.dto.response.LoanApplyResponseDTO;

/**
 * @Author: suxinfa
 * @Date: 2019/12/10 11:40
 * @Description:
 */
public interface LoanApplyServiceFacade {

    LoanApplyResponseDTO apply(BasicRequestDTO<LoanApplyRequestDTO> requestDTO);
}
