package com.drl.stock.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author dongronglong
 * @Date 2022/3/18 16:16
 */
@RestController
@RequestMapping("/stock")
public class StockController {

    @RequestMapping("/reduct")
    public String reduct(){
        System.out.println("扣减库存");
        return "扣减库存";
    }
}
