package com.example.rest_task_2;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SummaryService {

 //   User user = new User(1,2,3,4,5,6,7,8);


    public int result(int a, int b, int c, int d, int e, int f, int g, int h) {
        //int sum_end = user.getFirst() + user.getSecond() + user.getThird() + user.getFourth() + user.getFive() + user.getSix();

        int sum =a+b+c+d+e+f+g+h;
        return sum;

        //return sum_end;
    }

}
