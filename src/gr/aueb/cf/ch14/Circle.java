package gr.aueb.cf.ch14;

public class Circle extends Shape {

    public Circle() {
        // super();  Το δίνει η JAVA δε χρειάζεται να το δώσουμε
    }

    @Override
    public void draw() {
        System.out.println("Draw a circle.");
    }
}
