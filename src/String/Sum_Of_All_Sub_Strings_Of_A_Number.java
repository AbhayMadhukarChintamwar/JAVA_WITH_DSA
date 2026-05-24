package String;

public class Sum_Of_All_Sub_Strings_Of_A_Number {
    public static void main(String[] args) {
        String str = "123";
        int sum = 0;
        int  n = str.length();

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <=n; j++) {
                String sub = str.substring(i,j);
                sum += Integer.parseInt(sub);
            }
            
        } 
        System.out.println(sum);
    }
}


// gfg practice problem
// https://www.geeksforgeeks.org/problems/sum-of-all-substrings-of-a-number-1587115621/1
