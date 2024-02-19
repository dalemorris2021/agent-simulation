package edu.iu.simulation;

import javafx.scene.shape.Shape;

public class Goal {
    Shape shape;
    double[] location;

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public double[] getLocation() {
        return location;
    }

    public void setLocation(double[] location) {
        this.location = location;
    }
}
