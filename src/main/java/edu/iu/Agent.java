package main.java.edu.iu;

public class Agent {
    double[] location;
    double[] velocity;
    double[] acceleration;
    Sensor[] sensors;
    Obstacle[] knownObstacles;
    Physics physics;

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
