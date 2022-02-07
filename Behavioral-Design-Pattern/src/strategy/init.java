package strategy;

public class init {
    public static void main(String[] args) {
        Animal puppy = new Dog();
        Animal parrot = new Bird();

        System.out.println("Puppy:: " + puppy.tryToFly());
        System.out.println("Parrot:: "+parrot.tryToFly());

        // This allows dynamic changes for flyingType
        puppy.SetFlyingType(new itFlys());
        System.out.println("Puppy new strategy:: " + puppy.tryToFly());

    }
}
