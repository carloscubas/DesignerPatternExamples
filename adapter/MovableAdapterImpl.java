public class MovableAdapterImpl implements MovableAdapter {
    private Movable luxuryCars;
    
    MovableAdapterImpl(Movable luxuryCars){
        this.luxuryCars = luxuryCars;
    }
    
    // standard constructors
    @Override
    public double getSpeed() {
        return convertMPHtoKMPH(luxuryCars.getSpeed());
    }
    
    private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }
}