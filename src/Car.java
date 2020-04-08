public class Car {
    private boolean isMoving;

    public Car(){
        isMoving = false;
    }

    public boolean start(){
        if(isMoving){
            return false;
        }
        isMoving = true;
        return true;
    }

    public boolean stop(){
        if(isMoving){
            isMoving = false;
            return true;
        }
        return false;
    }

    public boolean isMoving(){
        return isMoving;
    }

    public void airBags(){
        return;
    }

}
