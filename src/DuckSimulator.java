import models.*;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new DuckFactory();
        AbstractDuckFactory politeCountingFactory = new PoliteCountingDuckFactory();

        simulator.simulate(duckFactory, politeCountingFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory, AbstractDuckFactory politeCountingFactory) {
        Quackable mallardDuck = politeCountingFactory.createMallardDuck();
        Quackable redHeadDuck = politeCountingFactory.createRedHeadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();

        Quackable goose = new GooseQuackAdaptor(new Goose());
        Quackable pigeon = new PigeonQuackAdaptor(new Pigeon());

        Flock flock1 = new Flock();
        flock1.add(mallardDuck);
        flock1.add(redHeadDuck);

        Flock flock2 = new Flock();
        flock2.add(duckCall);
        flock2.add(rubberDuck);
        flock2.add(goose);
        flock2.add(pigeon);

        System.out.println("\nDuck Simulator");

        simulate(flock1);
        simulate(flock2);

        System.out.println("Number of quack = " + QuackCounter.getNumOfQuacks());
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}