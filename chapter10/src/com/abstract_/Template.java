package com.abstract_;

public abstract class Template {
    public abstract void job();//抽象方法
    public void calculateTime() {//实现方法，调用 job 方法
//得到开始的时间
        long start = System.currentTimeMillis();
        job(); //动态绑定机制
//得的结束的时间
        long end = System.currentTimeMillis();
        System.out.println("任务执行时间" + (end - start));
    }
}
