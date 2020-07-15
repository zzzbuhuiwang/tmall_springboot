package com.jaden.aveh.web;

import com.jaden.aveh.pojo.AvehHp;
import com.jaden.aveh.service.AvehHpService;
import com.jaden.tmall.util.Page4Navigator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AvehHpController {
    @Autowired
    AvehHpService avehHpService;

    @GetMapping("/AvehHps")
    public Page4Navigator<AvehHp> list(@RequestParam(value = "start", defaultValue = "0") int start, @RequestParam(value = "size", defaultValue = "5") int size) throws Exception {
        start = start<0?0:start;
        Page4Navigator<AvehHp> page = avehHpService.list(start,size,5);
        return page;
    }
}
