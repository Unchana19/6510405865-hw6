package models;

public class PigeonQuackAdaptor implements Quackable {
    private final Pigeon pigeon;

    public PigeonQuackAdaptor(Pigeon pigeon) {
        this.pigeon = pigeon;
    }

    @Override
    public void quack() {
        pigeon.coo();
        pigeon.coo();
    }
}
