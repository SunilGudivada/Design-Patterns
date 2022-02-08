package observerDesignPattern;

import java.util.ArrayList;

public class StockGrabber implements Subject{

    ArrayList<Observer> observers = new ArrayList<>();
    private double ibmPrice;
    private double aaplPrice;

    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unregister(Observer deleteObserver) {
        int observerIndex = observers.indexOf(deleteObserver);
        System.out.println("\n unregister Observer::: " + (observerIndex +1));
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        for(Observer current:observers){
            current.update(ibmPrice, aaplPrice);
        }
    }

    public void setIBMPrice(double newIBMPrice){
        this.ibmPrice = newIBMPrice;
        notifyObserver();
    }

    public void setAAPLPrice(double newAAPLPrice){
        this.aaplPrice = newAAPLPrice;
        notifyObserver();
    }
}
