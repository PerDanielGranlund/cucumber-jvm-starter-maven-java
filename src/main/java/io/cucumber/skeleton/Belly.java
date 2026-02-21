package io.cucumber.skeleton;

public class Belly {
    public void eat(int cukes) {
        cukes -= 1;
    }

    public double comsume(int energy) {
        return (energy / 1000);
    }
}

