package models;

public class QuackPolite implements Quackable{
    Quackable quackable;

    public QuackPolite(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackable.quack();
        System.out.println("Kub");
    }
}

//6510405865 Oanchana Changcharoen