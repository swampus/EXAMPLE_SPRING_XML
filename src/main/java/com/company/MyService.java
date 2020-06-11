package com.company;

public class MyService {
    private MySpringClass mySpringClass;

    public MySpringClass getMySpringClass() {
        return mySpringClass;
    }

    public void setMySpringClass(MySpringClass mySpringClass) {
        this.mySpringClass = mySpringClass;
    }

    public void doJob(){
        mySpringClass.weWork();
    }
}
