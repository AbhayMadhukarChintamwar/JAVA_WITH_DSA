import java.util.*;
class Solution {
                                                                              
    public static boolean areAnagrams(String s1, String s2) {
       
     if(s1.length()!=s2.length()){
         return false;
     }
     
      char a[]=s1.toCharArray();
      char b[]=s2.toCharArray();
      
      Arrays.sort(a);
      Arrays.sort(b);
      for (int i = 0; i < a.length; i++) {
        if (a[i]!=b[i]) {
            return false;   
        }
      }
      return true;
      
    //   return Arrays.equals(a,b);
    }
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";

        System.out.println(areAnagrams(s1, s2));
        
    }
}


// https://www.geeksforgeeks.org/problems/anagram-1587115620/1
