package Exercicio02;

public class Triangulo {
    private double base;
    private double altura;
    private double area;

    public Triangulo(double base, double altura, double area) {
        this.base = base;
        this.altura = altura;
        this.area = area;
    }

    public Triangulo(double i, int i1) {
    }


    public void area(){
       this.area = (this.base*this.altura) /2;

    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}


