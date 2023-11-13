package publisher;

public class Conta {

    public PublishManager events;
    private double balance = 0;

    public Conta(){
        this.events = new PublishManager();
        this.events.subscribe(new EmailPublisher());
        this.events.subscribe(new PushNotificationPublisher());
    }

    public void deposit(double value){
        this.balance += value;
        this.events.notify("deposit  " + value);
    }

    public void withdraw(double value){
        this.balance -= value;
        this.events.notify("withdraw  " + value);
    }
}
