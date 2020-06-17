package by.bsu.tasks.exception;

public class AskToBuyException extends Exception {
    private int userChoice;

    public int getChoice() {
        return userChoice;
    }

    public AskToBuyException(String message, int num){
        super(message);
        userChoice=num;
    }
}
