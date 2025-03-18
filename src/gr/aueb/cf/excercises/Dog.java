package gr.aueb.cf.excercises;

public class Dog extends Animal {

    private String breed;

    public Dog() {

    }

    public Dog(String name, int age, String breed) {
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
        System.out.println("I am a dog");
    }

    @Override
    public String toString() {
        return super.toString() +breed  ;
    }
}
