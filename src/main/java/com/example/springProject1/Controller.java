package com.example.springProject1;

import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class Controller {

//    @GetMapping("/current-date")
//    public String returnDate(){
//        Date curDate = new Date();
//        return curDate.toString();
//    }

    @GetMapping("/welcome/naam")
    @ResponseBody
    public String returnWelcome(@RequestParam String naam){
        return "Welkom " + naam;
    }
}

