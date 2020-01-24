
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        return baseValue + valueToBeAdded;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        String output = "";
        for (int i=valueToBeReversed.length()-1; i >= 0; --i) {
            output += Character.toString(valueToBeReversed.charAt(i));
        }
        return output;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        /** even-length strings have two middle characters, tests assume odd-length strings for input **/
/*
        int mid = word.length() % 2 == 0 ? word.length()/2 : (int) Math.floor(word.length()/2);
        if (word.length() % 2 == 0) return word.substring(mid-1,mid);
        else return Character.toString(word.charAt(mid));
*/
        int mid = (int) Math.floor(word.length()/2);
        return word.charAt(mid);
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        String output = "";
        for (int i=0; i < value.length(); ++i) {
            if (value.charAt(i) !== charToRemove) {
                output += value.charAt(i);
            }
        }
        return output;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
/**    public String getLastWord(String sentence) {
        String[] output = sentence.split(" ")
       return output[output.length()-1];
    }**/
    public String getLastWord(String sentence) {
        /** what if there are multiple whitespaces? **/
        String output = "";
        for (int i=sentence.length()-1; i >= 0; --i) {
            if (sentence.charAt(i) != ' ') output += sentence.charAt(i);
            else break;
        }
        return new StringBuilder(output).reverse().toString();
    }

}
