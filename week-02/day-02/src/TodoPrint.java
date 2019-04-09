public class TodoPrint {
    public static void main(String... args){
        StringBuilder todoText = new StringBuilder(" - Buy milk\n");
        todoText.insert(0, "My Todo:\n");
        todoText.insert(21, " - Download games\n");
        todoText.insert(39, "\t - Diablo ");
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected outpt:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        System.out.println(todoText);
    }
}
