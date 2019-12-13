package com.fxs.accounting.repository;

import com.fxs.accounting.model.DemoModel;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @Author: suxinfa
 * @Date: 2019/12/11 16:55
 * @Description:
 */
public interface DemoModelRepository extends PagingAndSortingRepository<DemoModel, Long> {

    DemoModel findByName(String name);
}
