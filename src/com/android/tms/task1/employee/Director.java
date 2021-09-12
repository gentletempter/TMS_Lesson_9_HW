package com.android.tms.task1.employee;

public class Director implements IEmployee{
    @Override
    public void getPosition() {
        System.out.println("The Director is an important person, so he decided to override the default method =)");
    }
}
