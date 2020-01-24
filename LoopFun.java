 

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          int product = 1;
          while (number > 1) {
              product *= number;
              number--;
          }
          return product;
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          String output = "";
          for (int i=0; i < phrase.length(); ++i) {
              if (Character.isUpperCase(phrase.charAt(i)) || i > 0 && phrase.charAt(i-1) == ' ' || i == 0 && phrase.charAt(0) != ' ') {
                  if (!Character.isUpperCase(phrase.charAt(i))) { output += Character.toUpperCase(phrase.charAt(i));}
                  else { output += phrase.charAt(i); }
              }
          }
          return output;
      }

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
      public String encrypt(String word) {
          String output = "";
          for (int i=0; i < word.length(); ++i) {
              char c = word.charAt(i);
              int char_idx = (int) word.charAt(i);
              if (c - 'a' > 22) output += Character.toString(char_idx - 23);
              else output += Character.toString(char_idx + 3);          }
          return output;
      }
}
