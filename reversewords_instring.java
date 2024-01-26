import java.util.*;
 

    //////////// TC = O[N] ,, SC =O[1]//////////////////////
public class reversewords_instring {
        public String reverseWords(String s) {
            // Trim leading and trailing spaces, then split words by one or more spaces
            String[] words = s.trim().split("\\s+");
            
            // Reverse the array of words
            reverse(words, 0, words.length - 1);
            
            // Join the reversed words with a single space
            return String.join(" ", words);
        }
    
        private void reverse(String[] words, int start, int end) {
            while (start < end) {
                // Swap the words at start and end indices
                String temp = words[start];
                words[start] = words[end];
                words[end] = temp;
                start++;
                end--;
            }
        }
    }
    
    

    ////////////////////// TC = O[N] , SC = O[N]/////////////////////////////////
    /*class Solution {
        public String reverseWords(String s) {
            String [] word =s.trim().split(" +");
            Collections.reverse(Arrays.asList(word));
            return String.join(" ", word);
           
        }
    }*/