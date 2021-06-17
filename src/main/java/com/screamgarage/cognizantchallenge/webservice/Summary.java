package com.screamgarage.cognizantchallenge.webservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Summary {
    @RequestMapping(value="/top", method = RequestMethod.GET)
    String topChart(){
        return "top of the top";
    }
}
