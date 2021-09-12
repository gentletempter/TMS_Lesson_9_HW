package com.android.tms.task0;

import com.android.tms.task0.figure.Circle;
import com.android.tms.task0.figure.Figure;
import com.android.tms.task0.figure.Rectangle;
import com.android.tms.task0.figure.Triangle;

/**
 *Designed to test system operation
 */
public class Main {
    public static void main(String[] args) {
        float sumOfPerimeters = 0;
        System.out.println("___________________Task 0___________________");
        Figure[] figures = new Figure[]{
                new Triangle(2, 3, 3),
                new Rectangle(2, 4),
                new Circle(5),
                new Triangle(2, 3, 4),
                new Circle(3)
        };

        for (Figure figure : figures) {
            try {
                sumOfPerimeters += figure.getPerimeter();
                System.out.println(figure.getClass().getSimpleName() + " --> Area: " + figure.getArea());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("The sum of the perimeters of all figures: " + sumOfPerimeters);
        System.out.println("____________________________________________");
    }
}
