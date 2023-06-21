package prototype;

import java.util.Hashtable;

public class AnimalCache {
    private static Hashtable<String, Animal> hashtable
            = new Hashtable<>();

    public static Animal getAnimal(String name) {
        Animal animal = hashtable.get(name.toUpperCase());
        if(animal != null) return (Animal) animal.clone();
        return null;
    }

    public static void initCache() {
        hashtable.put("CAT", new Cat("Leon"));
        hashtable.put("DOG", new Dog("Burek"));
    }
}
