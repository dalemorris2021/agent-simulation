package main.java.edu.iu;

public class App implements Runnable {
    Agent[] agents;
    Obstacle[] obstacles;
    Goal goal;
    
    public static void main(String[] args) {
        (new App()).run();
    }

    public void run() {
        System.out.println("Hello, World!");
    }
}