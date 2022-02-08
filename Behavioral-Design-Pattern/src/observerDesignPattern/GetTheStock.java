package observerDesignPattern;

import java.text.DecimalFormat;

public class GetTheStock implements Runnable {

    private int startTime;
    private String stock;
    private double price;

    private StockGrabber stockGrabber;


    public GetTheStock(StockGrabber stockGrabber, int newStartTime, String stock, double price) {
        this.stockGrabber = stockGrabber;
        this.startTime = newStartTime;
        this.stock = stock;
        this.price = price;
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {

            try {
                Thread.sleep(2000);
            } catch (InterruptedException exception) {
                System.out.println(exception.getMessage());
            }

            double randNum = (Math.random() * (.06)) - 0.03;

            DecimalFormat df = new DecimalFormat("#.##");

            price = Double.parseDouble(df.format(price + randNum));

            if (stock.equals("IBM")) {
                stockGrabber.setIBMPrice(price);
            } else if (stock.equals("AAPL")) {
                stockGrabber.setAAPLPrice(price);
            }

            System.out.println("Stock:: " + (df.format(price + randNum)) + " " + df.format(randNum));
            System.out.println();
        }
    }
}
