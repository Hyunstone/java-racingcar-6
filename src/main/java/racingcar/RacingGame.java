package racingcar;

public class RacingGame {
    private InputHandler inputHandler = new InputHandler();
    private static int count;
    public void play() {
        inputHandler.inputCarName();
        inputHandler.inputMatchCount();
    }

    private static void registerCar() {}

    private static void moveCar() {}

    public static void announceWinner() {}

}
