package ihfazh.com;

public class SimpleDecrypt {

    String string;

    public SimpleDecrypt(String myString) {
        string = myString;
    }

    public char decrypt(char character) {
        // get current index
        int currentIndex = string.indexOf(character);
        // when current index == -1 then return the actual character
        if (currentIndex == -1){
            return character;
        }

        // get prev index
        int prevIndex = currentIndex - 3;
        // when prev index < 0, then
            // add with the length of character
        prevIndex = prevIndex < 0 ? prevIndex + string.length(): prevIndex;
        // get char at the prev index
        return string.charAt(prevIndex);
    }
}
