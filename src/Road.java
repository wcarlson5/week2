public interface Road {
    void getOn(Car car);
    void getOff(Car car);
    void move() throws Crash;
}
