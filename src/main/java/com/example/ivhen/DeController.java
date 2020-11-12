package com.example.ivhen;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeController {
    @RequestMapping("ni")
    public String show(){

        return "你好";
    }

}
