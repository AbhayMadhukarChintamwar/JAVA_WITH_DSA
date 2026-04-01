package Methods;

public class ReturnFunctions {
    static int isReturn(int n){
        if(n>0) {
            System.out.println(" Greater Than 0 ");
            return 5;
        }else {
            System.out.println(" Less than or equal to  0 ");
            return 10;
        }

    }
    static void main(String[] args) {
        int x = isReturn(2);
        System.out.println(3+x);
    }
}
