public class SubStrings {
    public static void main(String[] args) {
        String s = "Abhay";
      System.out.println(s);
    //   s.charAt(0) = 'a'; // This will give an error because strings are immutable in Java...this is not possible
    //   System.out.println(s);
        
       System.out.println(s.substring(0, 3)); // This will print the substring from index 0 to index 2 (3-1)  //Abh
       System.out.println(s.substring(3, 5)); // This will print the substring from index 3 to index 4 (5-1)  // ay
       System.out.println(s.substring(2)); // This will print the substring from index 2 to the end of the string  // hay
       

    }
}
