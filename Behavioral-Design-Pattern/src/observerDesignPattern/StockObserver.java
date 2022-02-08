package observerDesignPattern;

public class StockObserver implements Observer {

    private double ibmPrice;
    private double aaplPrice;

    private static int observerIdTracker = 0;

    private int observerID;

    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIdTracker;

        System.out.println("New Observer:: " + this.observerID);

        stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double aaplPrice) {
        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;

        printPrices();
    }

    public void printPrices() {
        System.out.println();
        System.out.println("Observer::: " + observerID);
        System.out.println("IBM Price::: " + ibmPrice);
        System.out.println("APPLE Price::: " + aaplPrice);
    }
}
