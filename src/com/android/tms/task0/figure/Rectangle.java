package com.android.tms.task0.figure;

import com.android.tms.task0.figure.Figure;

public class Rectangle extends Figure {
    private float a;
    private float b;
    private final String exceptionMessage = "The rectangle does not exist";

    public Rectangle(float a, float b) {
        super(a, b);
        this.a = a;
        this.b = b;
    }

    private boolean checkRectangle(float a, float b) {
        return (a > 0) && (b > 0);
    }

    @Override
    public float getArea() throws Exception {
        if (checkRectangle(a, b)) {
            return a * b;
        } else {
            throw new Exception(exceptionMessage);
        }
    }

    @Override
    public float getPerimeter() throws Exception {
        if (checkRectangle(a, b)) {
            return 2 * (a + b);
        } else {
            throw new Exception(exceptionMessage);
        }
    }
}
