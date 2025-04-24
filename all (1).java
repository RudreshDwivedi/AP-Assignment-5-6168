public class CaseInsensitiveSearch {
    public static void main(String[] args) {
        String[] words = {"Apple", "banana", "Cherry", "DaTe"};
        String searchTerm = "cherry";

        boolean found = false;

        for (String word : words) {
            if (word.equalsIgnoreCase(searchTerm)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(searchTerm + " found in the array.");
        } else {
            System.out.println(searchTerm + " not found in the array.");
        }
    }
}
