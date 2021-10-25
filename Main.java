package task1;

public class Main {
    public static void main(String[] args) {
        Interface ran = new RandomAlphaNumeric();
        int length = ran.getNumber();
        ran.randomAlphaNumeric(length);
    }
}

