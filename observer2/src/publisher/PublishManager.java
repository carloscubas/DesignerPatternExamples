package publisher;

import java.util.ArrayList;
import java.util.List;

public class PublishManager {

    List<PublishListener> listeners = new ArrayList<>();

    public void subscribe(PublishListener publishListener) {
        listeners.add(publishListener);
    }

    public void notify(String message) {
        for (PublishListener listener : listeners) {
            listener.update(message);
        }
    }
}
