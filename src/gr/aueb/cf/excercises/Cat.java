package gr.aueb.cf.excercises;

public class Cat extends Animal {

    private String breed;

    public Cat() {

    }

    public Cat(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void speak() {
        System.out.println("I am a cat");
    }

    @Override
    public String toString() {
        return super.toString() +breed ;
    }
}
