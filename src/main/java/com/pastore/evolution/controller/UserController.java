package com.pastore.evolution.controller;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/users")
public class UserController {


    @RequestMapping(value={""}, method= RequestMethod.GET)
    public List<User> getUserList() {
        List<User> r = new ArrayList<User>();
        return r;
    }

    public static void main(String[] args) {
        BigDecimal ss = new BigDecimal(4343);
        System.out.println(ss);
    }


}
