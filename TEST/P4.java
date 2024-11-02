public class P4{
   static void  mostWordsFound(String[] s) {
        int maxWords = 0;
        
        for (String s1 : s) {
           
            String[] words = s1.split(" ");
            
            maxWords = Math.max(maxWords, words.length);
        }
       System.out.print(maxWords);
    }
    
    public static void main(String[] args) {
        String[] s = {"please wait", "continue to fight", "continue to win"};
       mostWordsFound(s);  
    }
}

