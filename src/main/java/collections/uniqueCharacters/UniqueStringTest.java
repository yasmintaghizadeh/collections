package collections.uniqueCharacters;

public class UniqueStringTest {
    public static void main(String[] args) {
        UniqueString uniqueString = new UniqueString();
        String input = "Yasmin";

        if (uniqueString.uniqueCharacters(input))
            System.out.println("The String " + input
                    + " has all unique characters");
        else
            System.out.println("The String " + input
                    + " has duplicate characters");
    }
}
