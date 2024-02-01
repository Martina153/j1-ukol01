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
    zofka.penUp();
    zofka.turnLeft(90);
    zofka.move(700);
    zofka.turnRight(90);
    zofka.penDown();
    nakresliDomek();
    zofka.penUp();
    zofka.turnLeft(90);
    zofka.move(1300);
    zofka.turnLeft(90);
    zofka.move(150);
    zofka.penDown();
    nakreslitCtverecek();
    zofka.turnRight(90);
    zofka.move(200);
    zofka.turnRight(135);
    nakreslitStrechu();
    zofka.penUp();
    zofka.turnLeft(90);
    zofka.move(400);
    zofka.turnRight(90);
    zofka.move(150);
    zofka.turnRight(180);
    zofka.penDown();
    nakresliPrasatko();
    zofka.penUp();
    zofka.turnLeft(45);
    zofka.move(200);
    zofka.turnLeft(90);
    zofka.penDown();
    nakreslitCtverecek();
    zofka.move(200);
    zofka.turnRight(45);
    nakreslitStrechu();
    zofka.turnLeft(180);
    zofka.penUp();
    zofka.move(450);
    zofka.turnLeft(90);
    zofka.move(800);
    zofka.turnRight(90);
    zofka.penDown();
    mojeJmeno();
    zofka.penUp();
    zofka.move(600);
    zofka.turnRight(90);
    zofka.penDown();
    nakresliSlunce();
  }

  public void nakresliTelo() {
    for (int i = 0; i < 2; i++) {
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

  public void nakresliOsmiuhelnik() {
    int strana = 50;
    for (int i = 0; i < 8; i++) {
      zofka.move(strana);
      zofka.turnRight(45);
    }
  }

  public void nakresliKruh() {
    int polomer = 60; // poloměr kruhu
    int pocetSegmentu = 360; // počet segmentů pro aproximaci kruhu

    for (int i = 0; i < pocetSegmentu; i++) {
      zofka.move(polomer * 2 * Math.PI / pocetSegmentu);
      zofka.turnRight(360.0 / pocetSegmentu);
    }
  }

  public void nakresliPoloKruh() {
    int polomer = 5; // poloměr kruhu
    int pocetSegmentu = 180; // počet segmentů pro aproximaci kruhu

    for (int i = 0; i < pocetSegmentu; i++) {
      zofka.move(polomer * 2 * Math.PI / pocetSegmentu);
      zofka.turnRight(180.0 / pocetSegmentu);
    }
  }

  //DOMEK
  public void nakreslitCtverecek() {
    for (int i = 0; i < 4; i++) {
      zofka.move(200);
      zofka.turnRight(90);
    }
  }

  public void nakreslitStrechu() {
    zofka.move(Math.sqrt(2) * 100);
    zofka.turnRight(90);
    zofka.move(Math.sqrt(2) * 100);
    zofka.turnRight(45);
  }

  public void nakresliDomek() {
    for (int i = 0; i < 5; i++) {
      nakreslitCtverecek();
      zofka.move(200);
      zofka.turnRight(45);
      nakreslitStrechu();
      zofka.penUp();
      zofka.move(200);
      zofka.turnLeft(90);
      zofka.move(100);
      zofka.turnLeft(90);
      zofka.penDown();
    }
  }

  public void pismenoM() {
    zofka.move(50);
    zofka.turnRight(140);
    zofka.move(40);
    zofka.turnLeft(100);
    zofka.move(40);
    zofka.turnRight(140);
    zofka.move(50);
  }


  public void pismenoA() {
    zofka.turnRight(20);
    zofka.move(50);
    zofka.turnRight(140);
    zofka.move(50);
    zofka.turnLeft(180);
    zofka.move(10);
    zofka.turnLeft(70);
    zofka.move(25);
  }

  public void pismenoR() {
    zofka.move(50);
    zofka.turnRight(90);
    zofka.move(20);
    nakresliPoloKruh();
    zofka.move(12);
    zofka.turnLeft(130);
    zofka.move(40);

  }

  public void pismenoT() {
    zofka.move(50);
    zofka.turnRight(90);
    zofka.move(20);
    zofka.turnLeft(180);
    zofka.move(40);
  }

  public void pismenoI() {
    zofka.move(50);
  }

  public void pismenoN() {
    zofka.move(50);
    zofka.turnRight(145);
    zofka.move(60);
    zofka.turnLeft(145);
    zofka.move(50);
  }

  public void mojeJmeno() {
    pismenoM();
    zofka.turnLeft(90);
    zofka.penUp();
    zofka.move(10);
    zofka.turnLeft(90);
    zofka.penDown();
    pismenoA();
    zofka.turnLeft(180);
    zofka.penUp();
    zofka.move(10);
    zofka.turnRight(90);
    zofka.move(25);
    zofka.turnLeft(90);
    zofka.move(10);
    //zofka.turnLeft(45);
    zofka.move(20);
    zofka.turnLeft(90);
    zofka.move(15);
    zofka.penDown();
    pismenoR();
    zofka.turnLeft(50);
    zofka.penUp();
    zofka.move(25);
    zofka.turnLeft(90);
    zofka.penDown();
    pismenoT();
    zofka.turnLeft(180);
    zofka.penUp();
    zofka.move(60);
    zofka.turnRight(90);
    zofka.penDown();
    pismenoI();
    zofka.turnLeft(90);
    zofka.penUp();
    zofka.move(20);
    zofka.penDown();
    zofka.turnLeft(90);
    pismenoN();
    zofka.turnRight(90);
    zofka.penUp();
    zofka.move(20);
    zofka.turnRight(90);
    zofka.move(50);
    zofka.turnLeft(180);
    zofka.penDown();
    pismenoA();
  }

  public void nakresliSlunce() {
    nakresliKruh();
    zofka.penUp();
    zofka.turnRight(90);
    zofka.move(60);
    zofka.turnRight(30);

    for (int i = 0; i < 12; i++) {
      zofka.move(60);
      zofka.penDown();
      zofka.move(30);
      zofka.turnRight(180);
      zofka.penUp();
      zofka.move(90);
      zofka.turnRight(210);

    }
  }
}