public class max_occur_string {

    /*Given a string str of lowercase alphabets. The task is to find the maximum occurring character in the string str. If more than one character occurs the maximum number of time then print the lexicographically smaller character. */
    public static char maxim(String s){

        char[]input= s.trim().toCharArray();
        int[]store = new int[26];

         for(char x :input){
            if(x ==' '){
                continue;
            }
            store[(x-'a')]++;
         }
            int max = -1;
            char result='\0' ;
         
            for(int i =0;i<store.length;i++){
                if(max < store[i]){
                    max = store[i];
                    result = (char)(i+'a');
            }
        }
        return result;






    
    
}
}
