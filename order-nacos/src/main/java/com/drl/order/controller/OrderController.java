package com.drl.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description TODO
 * @Author dongronglong
 * @Date 2022/3/18 16:14
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/add")
    public String add(){
        String result=restTemplate.getForObject("http://stock-service/stock/reduct",String.class);
        System.out.println("下单成功！");
        return "下单成功"+result;
    }
}
