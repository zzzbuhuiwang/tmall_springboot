package com.jaden.aveh.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AvehPageController {
    @GetMapping(value="/avehHp")
    public String listAvehHp(){
        return "aveh/listAvehHp";
    }
}
