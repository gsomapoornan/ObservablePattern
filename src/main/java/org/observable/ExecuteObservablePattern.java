package org.observable;


import org.observable.observables.IphoneStockObservable;
import org.observable.observables.WashingMachineStockObservable;
import org.observable.observer.EmailNotifictionObserver;
import org.observable.observer.TextNotificationObserver;

public class ExecuteObservablePattern {
    public static void main(String[] args) {
        IphoneStockObservable iphoneStockObservable=new IphoneStockObservable();
        iphoneStockObservable.add(new EmailNotifictionObserver("ganesh.soma",iphoneStockObservable));
        iphoneStockObservable.add(new TextNotificationObserver("6394808233",iphoneStockObservable));

        WashingMachineStockObservable washingMachineStockObservable=new WashingMachineStockObservable();
        washingMachineStockObservable.add(new EmailNotifictionObserver("ganesh.soma",washingMachineStockObservable));
        washingMachineStockObservable.add(new TextNotificationObserver("6394808233",washingMachineStockObservable));

         washingMachineStockObservable.setStock(10);
         iphoneStockObservable.setStock(100);
         iphoneStockObservable.setStock(0);
         iphoneStockObservable.setStock(150);
    }
}
