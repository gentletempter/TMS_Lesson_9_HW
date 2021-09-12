package com.android.tms.task0.figure;

import com.android.tms.task0.figure.Figure;

public class Triangle extends Figure {

    private float a;
    private float b;
    private float c;
    private final String exceptionMessage = "The triangle does not exist";

    public Triangle(float a, float b, float c) {
        super(a, b, c);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private boolean checkTriangle(float a, float b, float c) {
        return (a < b + c) && (b < a + c) && (c < a + b);
    }

    @Override
    public float getPerimeter() throws Exception {
        if (checkTriangle(a, b, c)) {
            return a + b + c;
        } else {
            throw new Exception(exceptionMessage);
        }
    }

    /**
     * Using Geron's formula
     */
    @Override
    public float getArea() throws Exception {
        if (checkTriangle(a, b, c)) {
            return (float) ((Math.sqrt((a + b + c) * (a + b - c) * (a - b + c) * (b + c - a))) / 4);
        } else {
            throw new Exception(exceptionMessage);
        }
    }
}
