package AmazonNotificationSystem.Observer;

import AmazonNotificationSystem.Observable.Stock;

public class WhatsappObserver implements StockObserver{
 String whatsappNumber;

    public WhatsappObserver(String whatsappNumber) {
        this.whatsappNumber = whatsappNumber;
    }

    @Override
    public void updateStockObservable(Stock stock){
        sendWhatsappNotificationToAllSubscribedObservers(stock.getItemData());
    }
    public void sendWhatsappNotificationToAllSubscribedObservers(int data){
        System.out.println("Your subscribed product is now in stock you can check and only "+ data+" are left. Hurry Up, Notification is sent on your Whatsapp Number "+whatsappNumber);
    }
}
