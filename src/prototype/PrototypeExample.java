package prototype;

public class PrototypeExample {
    public static void main(String[] args) {
        AnimalCache.initCache();

        Dog dog = (Dog)AnimalCache.getAnimal("Dog");
        dog.setName("Reksio");
        System.out.println(dog);

        Dog dog2 = (Dog)AnimalCache.getAnimal("Dog");
        dog2.setName("Pieseł");
        System.out.println(dog2);

        Cat cat = (Cat)AnimalCache.getAnimal("Cat");
        System.out.println(cat);
    }
}
