public class VISwitch {
    public static void main(String[] args) {
        String day = "Friday";

        switch (day) {
            case "Sunday" -> System.out.println("it is Sunday");
            case "Monday" -> System.out.println("it is Monday");
            default -> System.out.println("not valid");
        }
    }
}
