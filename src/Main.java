public class Main {
    public static void main(String[] args) {

        Fish fish = new Fish();
        fish.setTofloat("fish is float");
        fish.setColors("fish is white");
        fish.setMass(2);
        System.out.println(fish.getTofloat());
        System.out.println(fish.getColors());
        System.out.println(fish.getMass()+" kg");

        Parrot parrot = new Parrot();
        parrot.setColors("\nparrot is blue");
        parrot.setSpeak("parrot say hello");
        parrot.setMass(1);
        System.out.println(parrot.getColors());
        System.out.println(parrot.getSpeak());
        System.out.println("Parrot mass "+parrot.getMass()+" kg");

        Cat cat = new Cat();
        cat.setName("\ncat name's Tom");
        cat.setPlay("Tom play whith ball");
        cat.setAge(3);
        System.out.println(cat.getName());
        System.out.println(cat.getPlay());
        System.out.println("Tom's age "+cat.getAge()+" years");

        Dog dog = new Dog();
        dog.setName("\nDog name's Belka");
        dog.setColors("Belka is black-white");
        dog.setAge(5);
        System.out.println(dog.getName());
        System.out.println(dog.getColors());
        System.out.println("Belka "+dog.getAge()+" years");
    }
}