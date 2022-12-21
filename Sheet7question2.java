/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sheet7question2;

/**
 *
 * @author Farouk
 */
class Circle {

    private double radius;
    private String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "RED";
    }

    public void Cirlce() {

    }

    public void Cirlce(double radius) {

    }

    public void Cirlce(double radius, String Color) {

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color=" + color + '}';
    }

    public double getArea(double radius) {
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Circle {

    private double height;

    public Cylinder() {
        this.height = 1.0;
    }

    public void Cylinder() {

    }

    public void Cylinder(double height) {

    }

    public void Cylinder(double height, double radius) {

    }

    public void Cylinder(double height, double radius, String Color) {

    }

    @Override
    public String toString() {
        return "Cylinder{" + "height=" + height + '}';
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(double radius, double height) {
        return Math.PI * height * radius * radius;
    }
}

public class Sheet7question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    }

}
