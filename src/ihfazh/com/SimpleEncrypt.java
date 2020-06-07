package ihfazh.com;

public class SimpleEncrypt {
    String string;

    public SimpleEncrypt(String myString) {
        string = myString;
    }

    public char encrypt(char character) {
        // get current character index
        int currentIndex = string.indexOf(character);

        if (currentIndex == -1){
            return character;
        }

        // get the next index
        int nextIndex = currentIndex + 3;
        // if next index is over than length or equals
            // next index - length
        nextIndex = nextIndex >= string.length() ? nextIndex - string.length(): nextIndex;
        // get character at the next index
        return string.charAt(nextIndex);
    }
}
