public class Reverse {
    public static void main(String... args){
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        StringBuilder sb = new StringBuilder();
        for(int i = reversed.length() - 1; i >= 0; i--)
        {
            sb.append(reversed.charAt(i));
        }
        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.

        System.out.println(sb.toString());
    }
}