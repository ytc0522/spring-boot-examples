package com.example.spring.cloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
public class FlowLimitController {


    @PostConstruct
    public void init(){
        List<FlowRule> rules = new ArrayList<>();
        //新建一个规则
        FlowRule rule = new FlowRule();
        //保护的资源
        rule.setResource("HelloWorld");
        //设置为QPS的规则类型
        rule.setGrade(RuleConstant.FLOW_GRADE_QPS);
        //值为2,则表示每秒只能访问此资源两次
        rule.setCount(2);
        rules.add(rule);
        //加载此资源
        FlowRuleManager.loadRules(rules);
    }


    @SentinelResource(value = "HelloWorld",blockHandler = "helloHandler")
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    public String helloHandler(BlockException e){
        log.info("限流处理");
        return "限流";
    }




}
