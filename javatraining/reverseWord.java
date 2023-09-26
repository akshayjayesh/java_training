public class reverseWord {

        public static void main(String[] args) {
            String originalString = "My Name is Akshay";

            // Split the original string into words
            String[] words = originalString.split(" ");

            // Create a StringBuilder to build the reversed string
            StringBuilder reversedString = new StringBuilder();

            // Loop through the words in reverse order and append them to the StringBuilder
            for (int i = words.length - 1; i >= 0; i--) {
                reversedString.append(words[i]);
                if (i > 0) {
                    reversedString.append(" "); // Add a space between words
                }
            }

            // Print the reversed string
            System.out.println(reversedString.toString());
        }


}
