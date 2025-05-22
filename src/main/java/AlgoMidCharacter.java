public class AlgoMidCharacter {
    //You are going to be given a non-empty string.
    // Your job is to return the middle character(s) of the string.

//    If the string's length is odd, return the middle character.
//    If the string's length is even, return the middle 2 characters.

    public static void main(String[] args) {
        System.out.println(getMiddle("test"));
        System.out.println(getMiddle("testing"));
        System.out.println(getMiddle("middle"));
        System.out.println(getMiddle("A"));
    }

    public static String getMiddle(String word) {
        int length = word.length();
        int middle = length / 2;

        if (length % 2 == 0) {
            return word.substring(middle -1, middle + 1);
        } else {
            return word.substring(middle, middle + 1);
        }
    }
}
