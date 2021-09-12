package com.android.tms.task0.figure;

public class Circle extends Figure {
    private float r;
    private final String exceptionMessage = "The circle does not exist";

    public Circle(float a) {
        super(a);
        this.r = a;
    }

    private boolean checkCircle(float r) {
        return (r > 0);
    }

    @Override
    public float getArea() throws Exception {
        if (checkCircle(r)) {
            return (float) (Math.PI * r * r);
        } else {
            throw new Exception(exceptionMessage);
        }
    }

    @Override
    public float getPerimeter() throws Exception {
        if (checkCircle(r)) {
            return (float) (2 * Math.PI * r);
        } else {
            throw new Exception(exceptionMessage);
        }
    }
}
