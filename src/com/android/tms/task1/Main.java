package com.android.tms.task1;

import com.android.tms.task1.employee.Accountant;
import com.android.tms.task1.employee.Director;
import com.android.tms.task1.employee.IEmployee;
import com.android.tms.task1.employee.Worker;

/**
 * Serves for testing system operation
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("___________________Task 1___________________");
        IEmployee iEmployee = new Accountant();
        IEmployee iEmployee1 = new Worker();
        IEmployee iEmployee2 = new Director();
        iEmployee.getPosition();
        iEmployee1.getPosition();
        iEmployee2.getPosition();
        System.out.println("____________________________________________");
    }
}
