package AmazonNotificationSystem.Observable;

import AmazonNotificationSystem.Observer.StockObserver;

import java.util.ArrayList;
import java.util.List;

public class SamsungMobileObservable implements Stock{

    int countLeft;
    List<StockObserver>stockObserverList;

    public SamsungMobileObservable(int countLeft) {
        this.countLeft = countLeft;
        stockObserverList = new ArrayList<>();
    }

    @Override
    public void setItemData(int newData) {
        if(newData<=0){
            System.out.println("Samsung Mobile is out of stock now, will notify once updated");
        }
        else{
            this.countLeft=newData;
            System.out.println("Samsung Mobile is available now and only "+newData+" stock is left");
            notifyToAllSubscribedObservers();
        }
    }

    @Override
    public void notifyToAllSubscribedObservers() {
        for(StockObserver stockObserver:stockObserverList){
            stockObserver.updateStockObservable(this);
        }
    }

    @Override
    public int getItemData() {
        return countLeft;
    }

    @Override
    public void addObserver(StockObserver stockObserver) {
        stockObserverList.add(stockObserver);
    }

    @Override
    public void removeObserver(StockObserver stockObserver) {
        stockObserverList.remove(stockObserver);
    }
}
