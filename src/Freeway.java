import java.util.ArrayList;

public class Freeway implements  Road{
    private ArrayList<Car> road;

    Freeway(){
        road = new ArrayList<>(10);
    }

    @Override
    public void getOn(Car car) {
        road.add(0, car);
    }

    @Override
    public void getOff(Car car) {
        if(!road.contains(car)){
            throw new IllegalArgumentException();
        }
        road.remove(car);
    }

    @Override
    public void move() throws Crash {
        if(road.get(road.size()-1) != null){
            throw new Crash();
        }
        for(int i=road.size()-1; i>=0;i--){
            road.add(i,road.get(i-1));
            road.remove(i-1);
        }
    }

    public ArrayList<Car> getRoad(){
        return road;
    }
}
