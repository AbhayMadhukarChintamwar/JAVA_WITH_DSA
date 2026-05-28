public class Reverse_String_In_StringBuilder {
    public static void main(String[] args) {
        String s = "Abhay";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        s = sb.toString();
        System.out.println(s);
    }
}
