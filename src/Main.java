public class Main {
    public static void main(String[] args) {
        Tank tank = new Tank (0, 0, 0, 200);
        tank.goForward(10);
        tank.printPosition();
        tank.turnRight();
        tank.goForward(50);
        tank.printPosition();
        tank.turnLeft();
        tank.goBackward(180);
        tank.goBackward(180);
        tank.goBackward(180);
        tank.goBackward(180);
        tank.goBackward(180);
        tank.goBackward(180);
        tank.goBackward(180);
        tank.printPosition();




    }
}