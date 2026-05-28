public class String_Buiders {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Abhay");
        System.out.println(s.length() + " "+ s.capacity());
        System.out.println(s);

        s.append(" Madhukar");
        System.out.println(s.length() + " "+ s.capacity());
        System.out.println(s);

        s.append(" Chintamwar");
        System.out.println(s.length() + " "+ s.capacity());
        System.out.println(s);


    }
}
