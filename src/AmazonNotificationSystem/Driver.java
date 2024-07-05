package AmazonNotificationSystem;

import AmazonNotificationSystem.Observable.IpadObservable;
import AmazonNotificationSystem.Observable.LaptopObservable;
import AmazonNotificationSystem.Observable.SamsungMobileObservable;
import AmazonNotificationSystem.Observable.Stock;
import AmazonNotificationSystem.Observer.EmailObserver;
import AmazonNotificationSystem.Observer.MobileObserver;
import AmazonNotificationSystem.Observer.StockObserver;
import AmazonNotificationSystem.Observer.WhatsappObserver;

public class Driver {
    public static void main(String[] args) {
        Stock ipadObservable=new IpadObservable(0);
        Stock laptopObservable=new LaptopObservable(0);
        Stock samsungMobileObservable=new SamsungMobileObservable(0);

        StockObserver mobileObserver1=new MobileObserver("123");
        StockObserver mobileObserver2=new MobileObserver("456");

        StockObserver emailObserver1=new EmailObserver("abc@gmail.com");
        StockObserver emailObserver2=new EmailObserver("def@gmail.com");

        StockObserver whatsappObserver1=new WhatsappObserver("1234");
        StockObserver whatsappObserver2=new WhatsappObserver("5678");

        ipadObservable.addObserver(mobileObserver1);
        ipadObservable.addObserver(emailObserver1);

        laptopObservable.addObserver(mobileObserver2);
        laptopObservable.addObserver(whatsappObserver1);

        samsungMobileObservable.addObserver(whatsappObserver2);
        samsungMobileObservable.addObserver(emailObserver2);

        ipadObservable.setItemData(2);
        laptopObservable.setItemData(5);
        samsungMobileObservable.setItemData(10);

        ipadObservable.setItemData(-5);

        ipadObservable.addObserver(whatsappObserver1);
        ipadObservable.removeObserver(mobileObserver1);

        laptopObservable.removeObserver(whatsappObserver1);
        laptopObservable.addObserver(emailObserver1);

        samsungMobileObservable.addObserver(whatsappObserver1);
        samsungMobileObservable.removeObserver(whatsappObserver2);


        ipadObservable.setItemData(2);
        laptopObservable.setItemData(5);
        samsungMobileObservable.setItemData(10);

        ipadObservable.setItemData(-5);
        ipadObservable.setItemData(0);
        samsungMobileObservable.setItemData(-2);
    }
}
