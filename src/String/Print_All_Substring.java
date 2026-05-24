package String;

public class Print_All_Substring {
    public static void main(String[] args) {
        String a = "Abhay";

        int s = a.length();
        for (int i = 0; i < a.length(); i++) {
            for (int j = i + 1; j <= a.length(); j++) {
                System.out.println(a.substring(i, j));

            }
        }

    }
}
