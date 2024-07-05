package AmazonNotificationSystem.Observer;

import AmazonNotificationSystem.Observable.Stock;

public interface StockObserver {
    public void updateStockObservable(Stock stock);
}
