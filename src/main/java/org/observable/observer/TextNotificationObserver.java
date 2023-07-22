package org.observable.observer;


import org.observable.observables.StockObservable;

public class TextNotificationObserver implements NotificationObserver{

    private  String phone;
    StockObservable stockObservable;

    public TextNotificationObserver(String phone,StockObservable stockObservable)
    {
        this.phone=phone;
        this.stockObservable=stockObservable;
    }

    @Override
    public void update() {

        System.out.println("text"+this.phone+this.stockObservable.getStock());

    }
}
