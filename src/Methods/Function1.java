package Methods;

public class Function1 {
    public static void main(String[] args) {
        functions1();
        functions2();
    }
    public  static void functions1(){
        functions3();
        System.out.println("Hello Functions 1");
    }  public  static void functions2(){
        functions1();
        System.out.println("Hello Functions 2");
    }  public  static void functions3(){
        System.out.println("Hello Functions 3");

    }

}
