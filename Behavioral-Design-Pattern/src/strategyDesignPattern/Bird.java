package strategyDesignPattern;

public class Bird extends Animal{
    Bird(){
        super();

        // We set the Flys interface polymorphically
        // This sets the behavior as a non-flying Animal
        SetFlyingType(new itFlys());
    }
}
