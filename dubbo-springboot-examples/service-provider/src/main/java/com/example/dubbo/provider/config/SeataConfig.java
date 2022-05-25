package com.example.dubbo.provider.config;

import io.seata.rm.datasource.DataSourceProxy;
import io.seata.spring.annotation.GlobalTransactionScanner;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SeataConfig {

    //@Bean
    public DataSourceProxy dataSourceProxy(DataSource dataSource) {
        return new DataSourceProxy(dataSource);
    }

    //@Bean
    public GlobalTransactionScanner globalTransactionScanner() {
        return new GlobalTransactionScanner("stock-seata-example", "my_test_tx_group");
    }




}
