public class Insert_And_Delete_String {
    public static void main(String[] args) {
        String s = "Abhay";
        StringBuilder sb = new StringBuilder(s);
        sb.deleteCharAt(2);
        System.out.println(sb); // Abay
        sb.insert(2,'a' );
        System.out.println(sb); // Abaay
        sb.delete(2, 5); // 2 to 4
        System.out.println(sb); // Ab
    }
}
