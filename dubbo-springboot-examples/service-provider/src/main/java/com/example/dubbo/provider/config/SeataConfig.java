package com.example.dubbo.provider.config;

import org.springframework.context.annotation.Configuration;

/**
 * 注意服务提供者不能有这个配置，不然回滚不会失效！
 */
@Deprecated
@Configuration
public class SeataConfig {

//    @Bean
//    public DataSourceProxy dataSourceProxy(DataSourceProperties dataSourceProperties) {
//        HikariDataSource dataSource = dataSourceProperties.initializeDataSourceBuilder().type(HikariDataSource.class).build();
//        if (StringUtils.hasText(dataSourceProperties.getName())) {
//            dataSource.setPoolName(dataSourceProperties.getName());
//        }
//        return new DataSourceProxy(dataSource);
//    }
//
//    @Bean
//    public GlobalTransactionScanner globalTransactionScanner() {
//        return new GlobalTransactionScanner("stock-seata-example", "my_test_tx_group");
//    }



}
