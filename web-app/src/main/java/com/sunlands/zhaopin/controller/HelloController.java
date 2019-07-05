package com.sunlands.zhaopin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Project : zhaopin-sys
 * @Package Name : com.sunlands.zhaopin.controller
 * @Description : TODO
 * @Author : admin
 * @Create Date : 2019年07月05日 11:50
 * @ModificationHistory Who   When     What
 * ------------    --------------    ---------------------------------
 */

@RestController
@RequestMapping("/open")
public class HelloController {

    @GetMapping("/hello")
    public String hello(String str){
        return str;
    }


}
