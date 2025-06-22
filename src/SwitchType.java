public class SwitchType {
    public static int testValue = 0;

    public static void main(String[] args) {
        System.out.println(exerciseOne('C') + exerciseOne('A'));
    }
    
    public static void firstSwitchType() {
        // enhanced switch syntax
        switch (testValue) {
            case 1 -> System.out.println("testValue is " + testValue);
            case 2 -> {
                System.out.println("testValue is " + testValue + " holy sheet");
            }
            case 3, 4, 5 -> {
                System.out.println("testValue is " + testValue + " good");
            }
            default -> {
                System.out.println("Nothing leh");
            }
        }
    }

    public static String secondSwitchType() {
        return switch (testValue) {
            case 1 -> "One";
            case 2 -> "Two";
            default -> {
                String badResponse = testValue + " is bad";

                // like return but not really, need to be in a code block
                yield badResponse;
            }
        };
    }

    public static String exerciseOne(char variable) {
        return switch (variable) {
            case 'A' -> "Able";
            case 'B' -> "Baker";
            case 'C' -> "Charlie";
            case 'D' -> "Dog";
            case 'E' -> "Easy";
            default -> {
                yield "Not Found";
            }
        };
    }
}