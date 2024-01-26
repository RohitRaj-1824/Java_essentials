public class merge_2str {

    /*Given two strings S1 and S2 as input, the task is to merge them alternatively i.e.
     the first character of S1 then the first character of S2 and so on till the strings end.
    NOTE: Add the whole string if other string is empty.
        S1 = "Hello" S2 = "Bye"
        Output: HBeylelo
    */

    
        public String mergeAlternately(String word1, String word2) {
            StringBuilder sb = new StringBuilder();
            int minLength = Math.min(word1.length(), word2.length());
    
            for (int i = 0; i < minLength; i++) {
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            }
    
            sb.append(word1.substring(minLength));// unequality ke baad ek word khatam ke baad baki sara add ho sakein!
            sb.append(word2.substring(minLength));
    
            return sb.toString();
        }
    }

/*
 * class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb =new StringBuilder();
            for(int i =0; i<word1.length()+word2.length(); i++){
                if(i<word1.length()){
                    sb.append(word1.charAt(i));
                }
                if(i<word2.length()){
                    sb.append(word2.charAt(i));
                }
                
            }
            return sb.toString();

        }
        
    }

 */

    

