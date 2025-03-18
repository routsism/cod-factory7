package gr.aueb.cf.excercises.classes;

import java.io.Serializable;
import java.util.Objects;

public class Rectangle implements Serializable , Cloneable {
    private static final long serialVersionUID= 1L;
    private double width;
    private double height;

    public Rectangle() {

    }

    public Rectangle(Double width , Double height) {
        this.width = width;
        this.height = height;
    }

    public  Rectangle (Rectangle rectangle) {
        this.height = rectangle.height;
        this.width = rectangle.width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(getWidth(), rectangle.getWidth()) == 0 && Double.compare(getHeight(), rectangle.getHeight()) == 0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Rectangle) super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWidth(), getHeight());
    }
}
