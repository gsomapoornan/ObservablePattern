package org.observable.observables;



import org.observable.observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class WashingMachineStockObservable implements StockObservable{

    List<NotificationObserver> notificationObserverList=new ArrayList<>();
    int stockCount=0;
    @Override
    public void add(NotificationObserver notificationObserver) {
        this.notificationObserverList.add(notificationObserver);

    }

    @Override
    public void remove(NotificationObserver notificationObserver) {
        this.notificationObserverList.remove(notificationObserver);
    }

    @Override
    public void notifyObservers() {
        for(NotificationObserver notificationObserver:notificationObserverList)
        {
            notificationObserver.update();
        }
    }

    @Override
    public void setStock(int count) {
        if(stockCount==0)
            notifyObservers();
        stockCount=count;

    }

    @Override
    public String getStock() {
        return "Washimachine Available";
    }
}
