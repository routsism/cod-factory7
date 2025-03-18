package gr.aueb.cf.excercises;

public class MainAnimal {

    public static void main(String[] args) {
        Dog dog = new Dog("Tommy", 4 , "Golden Retriever");
        Cat cat = new Cat("Ailouros" , 5 , "Scotish");
        Animal animal = new Animal("Rich" , 17);

        animal.speak();
        System.out.println(animal);


        System.out.println(dog);
        dog.speak();

        System.out.println(cat);
        cat.speak();

        doSpeak(dog);
        doSpeak(cat);
        doSpeak(animal);


    }

    public static void doSpeak(Animal animal){
        animal.speak();
    }

}
