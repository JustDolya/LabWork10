public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Floda", "Chocolate balls", "Germany", "German Shepherd", "izan");
        Cat cat = new Cat("Anfisa", "Tuna", "Switzerland", "Just cat, i have no more fantasy", "white");
        Horse horse = new Horse("Sinep", "Grass", "Russia", "idk", "brown");
        Veterinarian veterinarian = new Veterinarian();
        veterinarian.threatAnimal(dog);
        cat.makeNoise();
        horse.eat();
    }
}

class Animal{
    String name;
    String food;
    String location;
    Animal(String name, String food, String location){
        this.name = name;
        this.food = food;
        this.location = location;
    }

    public void makeNoise(){
        System.out.println("Только что был издан звук животного, не поддающийся описанию");
    }

    public void eat(){
        System.out.println("Ням-ням");
    }

    public void sleep(){
        System.out.println("Zzzzzz");
    }
}

class Dog extends Animal{
    String breed;
    String color;
    Dog(String name, String food, String location, String breed, String color){
        super(name, food, location);
        this.breed = breed;
        this.color = color;
    }

    @Override
    public void makeNoise() {
        System.out.println("Bark bark bark");
    }

    @Override
    public void eat() {
        System.out.println(STR."\{name} ест по-собачьи");
    }
}

class Cat extends Animal{
    String breed;
    String color;
    Cat(String name, String food, String location, String breed, String color){
        super(name, food, location);
        this.breed = breed;
        this.color = color;
    }

    @Override
    public void makeNoise() {
        System.out.println(STR."\{name} says 'Meow'");
    }

    @Override
    public void eat() {
        System.out.println(STR."\{name} ест по-кошачьи");
    }
}

class Horse extends Animal{
    String breed;
    String color;
    boolean isUnicorn;
    Horse(String name, String food, String location, String breed, String color){
        super(name, food, location);
        this.breed = breed;
        this.color = color;
        this.isUnicorn = false;
    }

    @Override
    public void makeNoise() {
        System.out.println("100101 1010 10010 1010");
    }

    @Override
    public void eat() {
        System.out.println(STR."\{name} ест по-лошадиному");
    }
}

class Veterinarian{
    String name = "Иосиф Виссарионович"; //Все совпадения случайны, параметр имеет развлекательный характер
    String address = "Какой-то физический адрес"; //Представим, что в нашем абстрактном мире всего 1 ветеринар

    public void threatAnimal(Animal animal){
        System.out.println(STR."Этому животному нужно давать \{animal.food}, а так же любовь и Карла Маркса на освоение. Вид преимущественно распространен в \{animal.location}");
    }
}