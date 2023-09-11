package com.example.demo.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//1번 서버
//@CrossOrigin(origins = "http://localhost:9128")
//CORS적용할 주소를 입력하면 된다.
@RestController
@RequestMapping("/test")
public class TaController {
    
    @GetMapping
    public String test(){
        return "TEST입니다.";
    }
}
