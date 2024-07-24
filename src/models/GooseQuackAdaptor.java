package models;

public class GooseQuackAdaptor implements Quackable{

    private final Goose goose;

    public GooseQuackAdaptor(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
