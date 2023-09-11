
public class Main
{
    public static void main(String[] args){

        Movable bmw = new Bmw();
        MovableAdapter bmwAdapter = new MovableAdapterImpl(bmw);

        System.out.println(bmwAdapter.getSpeed()); 
        // assertEquals(bmwAdapter.getSpeed(), 431.30312, 0.00001);

    }
}
