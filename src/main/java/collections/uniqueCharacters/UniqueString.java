package collections.uniqueCharacters;

import java.util.Arrays;

public class UniqueString {

    int MAX_CHAR = 256;

    boolean uniqueCharacters(String str)
    {

        if (str.length() > MAX_CHAR)
            return false;

        boolean[] chars = new boolean[MAX_CHAR];
        Arrays.fill(chars, false);

        for (int i = 0; i < str.length(); i++) {
            int index = (int)str.charAt(i);  //turning each char to ASCII


            if (chars[index])
                return false;

            chars[index] = true;
        }

        return true;
    }
}
