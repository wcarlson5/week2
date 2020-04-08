public class RaceCar extends Car {
    public double topSpeed;

    public RaceCar(double speed){
        this.topSpeed = speed;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    @Override
    public void airBags() {
        super.airBags();
        rollChage();
    }

    private void rollChage(){
        return;
    }
}
