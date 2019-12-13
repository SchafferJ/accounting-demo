package com.fxs.accounting.core.impl;


import com.fxs.accounting.BaseServiceTest;
import com.fxs.accounting.api.dto.request.basic.BasicRequestDTO;
import com.fxs.accounting.api.service.LoanApplyServiceFacade;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: suxinfa
 * @Date: 2019/12/13 14:37
 * @Description:
 */
public class LoanApplyServiceFacadeImplTest extends BaseServiceTest {
    @Autowired
    private LoanApplyServiceFacade loanApplyServiceFacade;

    @Test
    public void apply() {
        loanApplyServiceFacade.apply(new BasicRequestDTO());
    }
}