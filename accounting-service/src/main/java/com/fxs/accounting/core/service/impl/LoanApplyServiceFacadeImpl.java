package com.fxs.accounting.core.service.impl;

import com.fxs.accounting.api.dto.request.LoanApplyRequestDTO;
import com.fxs.accounting.api.dto.request.basic.BasicRequestDTO;
import com.fxs.accounting.api.dto.response.LoanApplyResponseDTO;
import com.fxs.accounting.api.service.LoanApplyServiceFacade;
import com.fxs.accounting.repository.LoanTmpRepository;
import org.hibernate.validator.HibernateValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

/**
 * @Author: suxinfa
 * @Date: 2019/12/11 15:36
 * @Description:
 */
@Service
public class LoanApplyServiceFacadeImpl implements LoanApplyServiceFacade {
    @Autowired
    private LoanTmpRepository loanTmpRepository;

    @Override
    public LoanApplyResponseDTO apply(@Validated BasicRequestDTO<LoanApplyRequestDTO> requestDTO) {
        ValidatorFactory validatorFactory = Validation.byProvider(HibernateValidator.class)
                .configure()
                .failFast(false)
                .buildValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<BasicRequestDTO>> constraintViolationSet = validator.validate(requestDTO);
        for (ConstraintViolation<BasicRequestDTO> constraintViolation : constraintViolationSet) {
            System.out.println(constraintViolation.getMessage());
        }
        final LoanApplyRequestDTO data = requestDTO.getData();
        final String acctAuthNo = data.getAcctAuthNo();
        boolean existsLoanTmp = loanTmpRepository.existsByAcctAuthNo(acctAuthNo);
        if (existsLoanTmp) {
            return null;
        }
        final String loanAccountingType = data.getLoanAccountingType();
        final String calPiPart = data.getCalPiPart();
        final Boolean calPi = data.getCalPi();
        final String loanType = data.getLoanType();

        return null;
    }
}
