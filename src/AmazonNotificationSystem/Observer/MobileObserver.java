package AmazonNotificationSystem.Observer;

import AmazonNotificationSystem.Observable.Stock;

public class MobileObserver implements StockObserver{

    String mobileNumber;

    public MobileObserver(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public void updateStockObservable(Stock stock) {
        sendMobileNotificationToAllSubscribedObservers(stock.getItemData());
    }
    public void  sendMobileNotificationToAllSubscribedObservers(int data){
        System.out.println("Your subscribed product is now in stock you can check and only "+ data+" are left. Hurry Up, Notification is sent on your Mobile Number "+mobileNumber);
    }
}
