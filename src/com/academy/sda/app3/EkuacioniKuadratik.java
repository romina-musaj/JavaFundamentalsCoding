package com.academy.sda.app3;

public class EkuacioniKuadratik {
    private int a;
    private int b;
    private int c;

    public EkuacioniKuadratik(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void afishoRrenjet(){
        int dallori = this.getDallori();
        System.out.println("Vlera e dallorit eshte: "+dallori);
        if(dallori < 0){
            System.out.println("Dallori eshte negative ");
        }
        else if (dallori == 0){
            double x = (double)(-b) / (2 * a);
            System.out.println("x1 = x2 = "+x);
        }
        else {
            double x1 = (-b - Math.sqrt(dallori))/ (2*a);
            double x2 =  (-b + Math.sqrt(dallori))/(2*a);
            System.out.println("x1 = "+x1);
            System.out.println("x2 = "+x2);
        }
    }
    private int getDallori(){
        return (int) (Math.pow(b,2) - 4 * a * c);
    }

    @Override
    public String toString() {
        return "EkuacioniKuadratik{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
