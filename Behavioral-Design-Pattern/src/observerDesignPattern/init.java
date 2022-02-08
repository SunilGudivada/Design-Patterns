package observerDesignPattern;

public class init {
    public static void main(String[] args) {

        StockGrabber stockGrabber = new StockGrabber();

        Observer stockObserver1  = new StockObserver(stockGrabber);

        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setAAPLPrice(200.00);

        Observer stockObserver2  = new StockObserver(stockGrabber);

        stockGrabber.setIBMPrice(187.00);
        stockGrabber.setAAPLPrice(600.00);

        stockGrabber.unregister(stockObserver1);

        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setAAPLPrice(200.00);

        Runnable getIBMStock = new GetTheStock(stockGrabber, 2, "IBM", 197.00);
        Runnable getAAPLStock = new GetTheStock(stockGrabber, 2, "AAPL", 500.00);

        new Thread(getIBMStock).start();
        new Thread(getAAPLStock).start();

    }
}
