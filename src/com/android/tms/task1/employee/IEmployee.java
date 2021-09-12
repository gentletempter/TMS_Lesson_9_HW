package com.android.tms.task1.employee;

/**
 * We define a default method that can not be overridden in inherited classes
 */
public interface IEmployee {
    default void getPosition() {
        System.out.println(this.getClass().getSimpleName());
    }
}
