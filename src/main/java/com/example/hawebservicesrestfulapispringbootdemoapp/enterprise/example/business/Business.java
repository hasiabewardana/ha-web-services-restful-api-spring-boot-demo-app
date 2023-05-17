package com.example.hawebservicesrestfulapispringbootdemoapp.enterprise.example.business;

import com.example.hawebservicesrestfulapispringbootdemoapp.enterprise.example.data.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Business {
    @Autowired
    private Data data;

    public int calculateSum() {
        return data.getNumberList().stream().reduce(Integer::sum).get();
    }
}

