package com.abstract_;

public class Add extends Template {
    //计算任务
//1+....+ 800000
    @Override
    public void job() { //实现 Template 的抽象方法 job
        long num = 0;
        for (long i = 1; i <= 800000; i++) {
            num += i;
        }
    }
}
