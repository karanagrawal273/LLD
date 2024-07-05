package AmazonNotificationSystem.Observer;

import AmazonNotificationSystem.Observable.Stock;

public class EmailObserver implements StockObserver{
    String emailId;

    public EmailObserver(String emailId) {
        this.emailId = emailId;
    }

    @Override public void updateStockObservable(Stock stock){
        sendEmailToAllSubscribedObservers(stock.getItemData());
    }

    public void sendEmailToAllSubscribedObservers(int data){
        System.out.println("Your subscribed product is now in stock you can check and only "+ data+" are left. Hurry Up, Notification is sent on your Email "+emailId);
    }
}
