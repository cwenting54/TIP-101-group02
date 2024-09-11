package Competition;

public interface Sleepable {
    abstract void tryToSleep();
    abstract void sleep();
    abstract boolean canSleep();
    abstract void printSleepMessage();
}
