package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {
  private Turtle zofka;

  public static void main(String[] args) {
    new HlavniProgram().start();
  }

  public void start() {
    zofka = new Turtle();
    //TODO implementace domácího úkolu
    nakresliPrasatko();
  }

  public void nakresliTelo() {
    for (int i=0; i<2; i++) {
      zofka.move(250);
      zofka.turnRight(90);
      zofka.move(200);
      zofka.turnRight(90);
    }
  }
  public void hlava() {
    zofka.move(Math.sqrt(2) * 100);
    zofka.turnRight(90);
    zofka.move(Math.sqrt(2) * 100);
    zofka.turnRight(45);
  }
  public void nohy() {
    zofka.turnRight(180);
    zofka.move(50);
    zofka.turnRight(90);
    zofka.move(50);
  }
  public void nakresliPrasatko() {
    zofka.turnLeft(45);
    hlava();
    nakresliTelo();
    zofka.turnRight(90);
    zofka.move(200);
    zofka.turnRight(45);
    zofka.move(50);
    nohy();
    zofka.turnRight(180);
    zofka.move(50);
    zofka.turnRight(135);
    zofka.move(250);
    zofka.turnRight(135);
    zofka.move(50);
    nohy();
  }
}
