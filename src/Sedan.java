public class Sedan extends Car implements StreetLegal {
    public int doors;
    private String dir;

    public Sedan(int doors){
        this.doors = doors;
    }

    public int getDoors(){
        return doors;
    }

    @Override
    public void trunSignal(String dir) {
        if(dir.toLowerCase().equals("left") || dir.toLowerCase().equals("right")){
            this.dir = dir;
        }
    }

    @Override
    public void airBags() {
        super.airBags();
    }
}
