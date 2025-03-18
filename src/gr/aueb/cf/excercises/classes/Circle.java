package gr.aueb.cf.excercises.classes;


import java.io.Serializable;
import java.util.Objects;

public class Circle implements Serializable , Cloneable {
    private static final long serialVersionUID= 1L;
    private double radius;

    public Circle() {

    }

    public Circle (Double radius) {
        this.radius = radius;
    }

    public Circle(Circle circle) {
        this.radius = circle.radius;;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(getRadius(), circle.getRadius()) == 0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Circle) super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getRadius());
    }
}
