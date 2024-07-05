package AmazonNotificationSystem.Observable;

import AmazonNotificationSystem.Observer.StockObserver;

import java.util.ArrayList;
import java.util.List;

public class LaptopObservable implements Stock{
    int countLeft;
    List<StockObserver>stockObserversList;

    public LaptopObservable(int countLeft) {
        this.countLeft = countLeft;
        stockObserversList = new ArrayList<>();
    }

    @Override
    public int getItemData() {
        return countLeft;
    }

    @Override
    public void addObserver(StockObserver stockObserver) {
        stockObserversList.add(stockObserver);
    }

    @Override
    public void notifyToAllSubscribedObservers() {
        for(StockObserver stockObserver:stockObserversList){
            stockObserver.updateStockObservable(this);
        }
    }

    @Override
    public void removeObserver(StockObserver stockObserver) {
        stockObserversList.remove(stockObserver);
    }

    @Override
    public void setItemData(int newData) {
        if(newData<=0){
            System.out.println("Laptop is out of stock now, will notify once updated");
        }
        else{
            this.countLeft=newData;
            System.out.println("Laptop is available now and only "+newData+" stock is left");
            notifyToAllSubscribedObservers();
        }
    }
}
