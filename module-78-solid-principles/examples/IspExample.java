interface WorkerViolation {
    void work();
    void eat();
    void sleep();
}

class HumanWorkerViolation implements WorkerViolation {

    @Override
    public void work() {
        System.out.println("Human working");
    }

    @Override
    public void eat() {
        System.out.println("Human eating");
    }

    @Override
    public void sleep() {
        System.out.println("Human sleeping");
    }
}

class RobotWorkerViolation implements WorkerViolation {

    @Override
    public void work() {
        System.out.println("Robot working");
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Robot does not eat");
    }

    @Override
    public void sleep() {
        throw new UnsupportedOperationException("Robot does not sleep");
    }
}

interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

interface Sleepable {
    void sleep();
}

class HumanWorker implements Workable, Eatable, Sleepable {

    @Override
    public void work() {
        System.out.println("Human working");
    }

    @Override
    public void eat() {
        System.out.println("Human eating");
    }

    @Override
    public void sleep() {
        System.out.println("Human sleeping");
    }
}

class RobotWorker implements Workable {

    @Override
    public void work() {
        System.out.println("Robot working");
    }
}

public class IspExample {

    public static void main(String[] args) {
        HumanWorker human = new HumanWorker();
        human.work();
        human.eat();
        human.sleep();

        RobotWorker robot = new RobotWorker();
        robot.work();
    }
}
