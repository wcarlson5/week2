public class Truck extends Car implements StreetLegal {
    public double bedLength;
    private String dir;

    public Truck(double bedLength){
        this.bedLength = bedLength;
    }

    public double getBedLength() {
        return bedLength;
    }

    @Override
    public void trunSignal(String dir) {
        if(dir.toLowerCase().equals("left") || dir.toLowerCase().equals("right")){
            this.dir = dir;
        }
        turnOnSignal();
    }

    private void turnOnSignal(){
        return;
    }
}
