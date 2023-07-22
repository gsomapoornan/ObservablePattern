package org.observable.observer;


import org.observable.observables.StockObservable;

public class EmailNotifictionObserver implements NotificationObserver{

    private  String emailId;
    public StockObservable stockObservable;

    public EmailNotifictionObserver(String emailId,StockObservable stockObservable)
    {
        this.emailId=emailId;
        this.stockObservable=stockObservable;
    }
    @Override
    public void update() {
System.out.println("Email"+this.stockObservable.getStock());
    }
}
