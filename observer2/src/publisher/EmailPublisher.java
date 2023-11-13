package publisher;

public class EmailPublisher implements PublishListener{

    @Override
    public void update(String message) {
        System.out.println("Send this email " + message);
    }
}
