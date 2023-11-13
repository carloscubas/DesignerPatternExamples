package publisher;

public class PushNotificationPublisher implements PublishListener{
    @Override
    public void update(String message) {
        System.out.println("Send this push notification " + message);
    }
}
