package com.fxs.accounting.repository;


import com.fxs.accounting.BaseServiceTest;
import com.fxs.accounting.model.DemoModel;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: suxinfa
 * @Date: 2019/12/11 16:57
 * @Description:
 */
public class DemoModelRepositoryTest extends BaseServiceTest {
    @Autowired
    private DemoModelRepository demoModelRepository;
    @Autowired
    private SysDictRepository sysDictRepository;

    @org.junit.Test
    public void test() {
        DemoModel demoModel = new DemoModel();
        demoModel.setName("abcd");
        demoModelRepository.save(demoModel);

        Iterable<DemoModel> all = demoModelRepository.findAll();
        for (DemoModel model : all) {
            System.out.println(model);
        }
        DemoModel fromDB = demoModelRepository.findByName("abcd");
        System.out.println(fromDB);
        sysDictRepository.findAll().forEach(System.out::println);
    }

}