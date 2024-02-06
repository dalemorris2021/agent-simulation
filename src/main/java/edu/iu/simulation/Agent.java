package edu.iu.simulation;

import javafx.scene.shape.Shape;

public class Agent {
    Shape shape;
    double[] location;
    double[] velocity;
    double[] acceleration;
    Sensor[] sensors;
    Obstacle[] knownObstacles;
    Physics physics;

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public double[] getLocation() {
        return location;
    }

    private void move() {

    }

    public double[] getVelocity() {
        return velocity;
    }

    private void accelerate() {

    }

    public double[] getAcceleration() {
        return acceleration;
    }

    private void setAcceleration(double[] acceleration) {
        
    }

    public Sensor[] getSensors() {
        return sensors;
    }

    public void setSensors(Sensor[] sensors) {
        this.sensors = sensors;
    }

    public Obstacle[] getKnownObstacles() {
        return knownObstacles;
    }

    private void sense() {

    }

    public Physics getPhysics() {
        return physics;
    }

    public void setPhysics(Physics physics) {
        this.physics = physics;
    }
}
