package com.yaomalang.springclouddemo.controller;

import com.yaomalang.springclouddemo.entity.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
@EnableDiscoveryClient
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/game/{id}")
    public Game queryById(@PathVariable("id") Integer id) {
        ServiceInstance instance = discoveryClient.getInstances("odds-service").get(0);
        String request = "http://" + instance.getHost() + ":" + instance.getPort() + "/game/" + id;
        return restTemplate.getForObject(request, Game.class);
    }
}
