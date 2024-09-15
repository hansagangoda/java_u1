import java.util.Arrays; //pro2

public class SortStrings {
    public static void main(String[] args) {
        
        if (args.length != 5) {
            System.out.println("Please provide exactly 5 strings as command line arguments.");
            return;
        }

        
        String[] strings = new String[5];
        System.arraycopy(args, 0, strings, 0, 5);

        
        Arrays.sort(strings);

    
        System.out.println("Sorted strings:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
