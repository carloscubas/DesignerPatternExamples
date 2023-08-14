public class LazyDBConnection {

    private static volatile LazyDBConnection instance;
 
    private LazyDBConnection(){}

    public static LazyDBConnection getInstance(){
        if (instance == null) {
            instance = new LazyDBConnection();
        }
        
        return instance;
    }

    public void executeAction(){
        System.out.println("CRUD action execute successfully");
    }
}