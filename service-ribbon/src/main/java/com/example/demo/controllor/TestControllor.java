package com.example.demo.controllor;

import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: lsg
 * @Date: 2019/7/22 16:26
 * @Description:
 */
@RestController
public class TestControllor {

    @Autowired
    TestService testService;
    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return testService.hiService(name);
    }



}
