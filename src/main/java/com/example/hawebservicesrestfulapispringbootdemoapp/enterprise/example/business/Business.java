package com.example.hawebservicesrestfulapispringbootdemoapp.enterprise.example.business;

import com.example.hawebservicesrestfulapispringbootdemoapp.enterprise.example.data.Data;
import org.springframework.stereotype.Component;

@Component
public class Business {
    private final Data data;

    public Business(Data data) {
        this.data = data;
    }

    public int calculateSum() {
        return data.getNumberList().stream().reduce(Integer::sum).isPresent() ? data.getNumberList().stream().reduce(Integer::sum).get() : 0;
    }
}

