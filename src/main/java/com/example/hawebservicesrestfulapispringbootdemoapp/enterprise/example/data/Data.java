package com.example.hawebservicesrestfulapispringbootdemoapp.enterprise.example.data;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class Data {
    public List<Integer> getNumberList() {
        return Arrays.asList(10, 20, 30, 40, 50);
    }
}