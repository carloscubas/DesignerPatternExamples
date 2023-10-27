public class Main
{
    public static void main(String[] args){
        LazyDBConnection conection = LazyDBConnection.getInstance();
        conection.executeAction();
    }
}
