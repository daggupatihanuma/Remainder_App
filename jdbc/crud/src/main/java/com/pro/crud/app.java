package com.pro.crud;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController 
public class app {
    @RequestMapping("/tej")
    
    public String hello(){
        return "hi";

    }
}
