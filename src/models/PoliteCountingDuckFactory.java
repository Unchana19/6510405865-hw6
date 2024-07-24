package models;

public class PoliteCountingDuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new QuackPolite(new QuackCounter(new MallardDuck()));
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new QuackPolite(new QuackCounter(new RedHeadDuck()));
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackPolite(new QuackCounter(new DuckCall()));
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackPolite(new QuackCounter(new RubberDuck()));
    }
}
