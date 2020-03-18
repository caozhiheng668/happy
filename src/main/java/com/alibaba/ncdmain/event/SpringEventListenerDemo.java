package com.alibaba.ncdmain.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringEventListenerDemo {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyApplicationListener.class);

        context.publishEvent(new MyApplicationEvent("你好"));
        context.publishEvent(new MyApplicationEvent("杭州"));
    }
}


 class MyApplicationListener implements ApplicationListener<MyApplicationEvent>{
    @Override
    public void onApplicationEvent(MyApplicationEvent event) {
        System.out.println("监听的资源==>"+event.getSource());
    }
}

 class MyApplicationEvent extends ApplicationEvent {
    public MyApplicationEvent(Object source){
        super(source);
    }
}