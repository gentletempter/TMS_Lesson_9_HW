package com.android.tms.task0.figure;

/**
 * Provides basic functionality
 */
public abstract class Figure {
    private float a;
    private float b;
    private float c;

    public Figure(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Figure(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public Figure(float a) {
        this.a = a;
    }

    /**
     *Calculation of the area of the figure
     */
    public abstract float getArea() throws Exception;

    /**
     *Calculation of the perimeter of the figure
     */
    public abstract float getPerimeter() throws Exception;
}
