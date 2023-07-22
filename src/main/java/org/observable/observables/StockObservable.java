package org.observable.observables;


import org.observable.observer.NotificationObserver;

public interface StockObservable {
    public void add(NotificationObserver notificationObserver);
    public void remove(NotificationObserver notificationObserver);

    public void notifyObservers();

    public void setStock(int count);
    public String getStock();

}
