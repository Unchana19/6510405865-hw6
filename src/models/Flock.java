package models;

import java.util.ArrayList;
import java.util.List;

public class Flock implements Quackable {
    List<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quackable) {
        quackers.add(quackable);
    }

    @Override
    public void quack() {
        System.out.println("---Flock---");
        for (Quackable q : quackers) {
            q.quack();
        }
    }
}
