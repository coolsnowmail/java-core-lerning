public class Tank {
 int x, y, dir, fuel;

 public Tank(int x, int y, int dir, int fuel) {
  this.x = x;
  this.y = y;
  this.dir = dir;
  this.fuel = fuel;
 }


 public void turnRight() {
  dir++;
  if (dir == 4) {
   dir = 0;
  }
 }

 public void turnLeft() {
  dir--;
  if (dir == -1) {
   dir = 3;
  }
 }

 public void goForward(int move) {
  fuelWasting(move);
  switch (dir) {
   case 0:
    x += move;
    break;
   case 1:
    y += move;
    break;
   case 2:
    x -= move;
    break;
   case 3:
    y -= move;
    break;
  }
  System.out.println(dir);
 }

 public void goBackward(int move) {
  goForward(-move);
 }

 public void printPosition() {
  System.out.println("The Tank is at " + x + ":" + y + " now. " + "GAS: " + fuel);
 }

 public void fuelWasting(int move) {
  move = Math.abs(move);
  if((fuel-move) <= 0) {
   System.out.println("Не хватает топлива для такого перемещения. Введите другие координаты!/n" + "остаток топлива: " + fuel);
  }else {
   fuel -= move;
   System.out.println("Tank.fuelWasting");
  }
 }

}
