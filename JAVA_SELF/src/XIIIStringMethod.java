public class XIIIStringMethod {
    public static void main(String[] args) {
        String name = "Bro Fly";
        // boolean result = name.equals("Bro"); // case sensitive
        // boolean result = name.equalsIgnoreCase("bro"); // not case sensitive
        // int result = name.length();
        // char result = name.charAt(4);
        // int result = name.indexOf("F");
        // boolean result = name.isEmpty();
        // String result = name.toUpperCase();
        // String result = name.toLowerCase();
        // String result = name.trim(); // trims extra spaces before and after
        String result = name.replace('o', 'i');
        System.out.println(result);
    }
}
