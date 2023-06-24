package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController
{
    @RequestMapping("/")
    public String hello()
    {
        return "Hello ";
    }

    @RequestMapping("/first")
    public String first()
    {
        return "Hello first endpoint";
    }

    @RequestMapping("/second")
    public String second()
    {
        return "Hello second endpoint";
    }

    @RequestMapping("/third")
    public String third()
    {
        return "Hello third endpoint";
    }

}
