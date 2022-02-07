package strategy;

public class Animal {
    private String name;
    private double weight;

    // Instead of using an interface in a traditional way
    // we use an instance variable that is a subclass
    // of the Flys interface.
    // Animal doesn't care what flyingType does, it just
    // knows the behavior is available to its subclasses

    // This is known as Composition : Instead of inheriting
    // an ability through inheritance the class is composed
    // with Objects with the right ability
    // Composition allows you to change the capabilities of
    // objects at run time!

    public Flys flyingType;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setWeight(double weight) {
        if (weight < 0) {
            System.out.println("Weight should be >0");
        } else {
            this.weight = weight;
        }
    }

    public double getWeight() {
        return this.weight;
    }

    /* BAD
    * You don't want to add methods to the super class.
    * You need to separate what is different between subclasses
    * and the super class

    public void fly(){
        System.out.println("I'm flying");
    }

    */


    public String tryToFly() {
        return flyingType.fly();
    }

    public void SetFlyingType(Flys newFlyingType) {
        this.flyingType = newFlyingType;
    }

}
