package Java_Basic;

public class Java_Basic {

    public static void main(String[] args){
        boolean a = true;
        boolean b = false;
        System.out.println("a && b " + (a && b));
        System.out.println("a || b " + (a || b));
        System.out.println("!a " + (!a));


        int marks = 32;
        String res = (marks > 34)?"Pass" :"Fail";
        System.out.println(res);
    }
}
