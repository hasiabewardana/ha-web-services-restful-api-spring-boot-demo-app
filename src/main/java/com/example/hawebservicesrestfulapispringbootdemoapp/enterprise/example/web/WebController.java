package com.example.hawebservicesrestfulapispringbootdemoapp.enterprise.example.web;

import com.example.hawebservicesrestfulapispringbootdemoapp.enterprise.example.business.Business;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WebController {
    private final Business business;

    public WebController(Business business) {
        this.business = business;
    }

    public int returnSum() {
        return business.calculateSum();
    }
}

