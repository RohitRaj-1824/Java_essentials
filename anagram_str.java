public class anagram_str {


    // SC = O[1] , TC=O[N]
    public boolean isanagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        int alpha[]= new int[26];

        for ( char x :s.toCharArray()){
            alpha[(x-'a')]++;
        }

        for(char y : t.toCharArray()){
            alpha[(y-'a')]--;
        }

        for(int i : alpha){
            if(i!=0)return false;
        }
return true;
    }
    
}
