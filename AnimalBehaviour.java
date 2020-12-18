public class AnimalBehaviour {

    public static void main(String[] args) {
        AnimalSpeak xyz = new AnimalSpeak();
        Animal animal = new Dog();
        xyz.setAnimal(animal);
        xyz.makeAnimalSpeak();
    }

}