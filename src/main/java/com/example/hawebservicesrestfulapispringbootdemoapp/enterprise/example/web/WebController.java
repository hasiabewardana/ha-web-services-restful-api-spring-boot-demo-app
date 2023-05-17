package com.example.hawebservicesrestfulapispringbootdemoapp.enterprise.example.web;

import com.example.hawebservicesrestfulapispringbootdemoapp.enterprise.example.business.Business;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WebController {
    @Autowired
    private Business business;

    public int returnSum() {
        return business.calculateSum();
    }
}

