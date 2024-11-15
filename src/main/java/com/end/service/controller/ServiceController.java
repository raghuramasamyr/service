package com.end.service.controller;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
@EnableDiscoveryClient
public class ServiceController {

    @GetMapping("/gfg")
    public ResponseEntity<String> invokeByGateway(){
        System.out.println("------------------hu----------------");
        return  new ResponseEntity<>("Service invoked through gateway", HttpStatus.OK);
    }

}
