package com.fxs.accounting.repository;

import com.fxs.accounting.model.LoanTmp;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @Author: suxinfa
 * @Date: 2019/12/13 15:16
 * @Description:
 */
public interface LoanTmpRepository extends PagingAndSortingRepository<LoanTmp, Long> {
    boolean existsByAcctAuthNo(String acctAuthNo);
}
