import java.util.ArrayList;

public class XVIIForEachLoop {
    public static void main(String[] args) {

        // for-each = traversing technique to iterate through the elements in an array/collection.
        //          # Fewer steps, more readable
        //          # less flexible though


//        String[] animals = {"cat", "dog", "rat", "bird"};
//        for(String i : animals) {
//            System.out.println(i);
//        }
        ArrayList<String> animals = new ArrayList();
        animals.add("cat");
        animals.add("dog");
        animals.add("pigeon");
        animals.add("lion");

        for (String i : animals) {
            System.out.println(i);
        }
    }
}
