package gr.aueb.cf.excercises.classes;

import java.io.Serializable;
import java.util.Objects;

public class Line implements Serializable , Cloneable {
    private static final long serialVersionUID = 1L;
    private double length;

    public Line() {

    }

    public Line(Double length) {
        this.length = length;
    }

    public Line(Line line) {
        this.length = line.length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Double.compare(getLength(), line.getLength()) == 0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Line) super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getLength());
    }
}
