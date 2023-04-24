package com.kk.wiki.controller;

import com.kk.wiki.domain.Test;
import com.kk.wiki.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {
    @Resource
    private TestService testService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/test/list")
    public List<Test> list() {
        return testService.list();
    }
}
