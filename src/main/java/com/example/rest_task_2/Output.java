package com.example.rest_task_2;

import java.util.HashMap;

public class Output {

    public HashMap<String, Integer> getOutput(int b1, int b2,int b3, int b4,int b5,int b6,int b7, int b8){

        HashMap<String, Integer> map = new HashMap<>();

        int value_output = b1+b2+b3+b4+b5+b6+b7+b8;

        map.put("result: ", value_output);

        return map;



    }
}
