package com.fxs.accounting.core.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @Author: suxinfa
 * @Date: 2019/12/11 17:39
 * @Description:
 */
@SpringBootApplication(scanBasePackages = "com.fxs.accounting.core")
@EntityScan(basePackages = "com.fxs.accounting.model", basePackageClasses = Jsr310JpaConverters.class)
@EnableJpaRepositories(basePackages = "com.fxs.accounting.repository")
public class ServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
    }
}
