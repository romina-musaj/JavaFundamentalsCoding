package com.academy.sda.app1;

public class Rrethi {
    private float diameter;
    private double pi;

    public Rrethi(float diameter, double pi) {
        this.diameter = diameter;
        this.pi = pi;
    }

    public float getDiameter() {
        return diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double llogaritPerimeter(){
        return diameter*pi;
    }

    @Override
    public String toString() {
        return "Rrethi{" +
                "diameter=" + diameter +
                ", pi=" + pi +
                '}';
    }
}
