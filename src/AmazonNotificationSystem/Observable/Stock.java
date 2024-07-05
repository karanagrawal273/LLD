package AmazonNotificationSystem.Observable;

import AmazonNotificationSystem.Observer.StockObserver;

public interface Stock {
    public void addObserver( StockObserver stockObserver);
    public void removeObserver(StockObserver stockObserver);
    public void setItemData(int newData);
    public int getItemData();
    public void notifyToAllSubscribedObservers();

}
