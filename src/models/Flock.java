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
        boolean first = true;
        for (Quackable q : quackers) {
            if (first) {
                for (int i = 0; i < 3; i++) {
                    q.quack();
                }
                first = false;
            } else {
                q.quack();
            }
        }
    }
}

//6510405865 Oanchana Changcharoen
