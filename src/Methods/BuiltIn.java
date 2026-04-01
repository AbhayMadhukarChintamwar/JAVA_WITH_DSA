package Methods;

public class BuiltIn {
    static void main(String[] args) {

        System.out.println(Math.sqrt(100));
        System.out.println(Math.cbrt(125));
        System.out.println(Math.PI);
        System.out.println(Math.abs(-125)); // 125
        System.out.println(Math.floor(6.8)); // 6.0
        System.out.println(Math.floor(-7.8)); // -8.0
        System.out.println(Math.ceil(6.8));  // 7.0
        System.out.println(Math.ceil(-7.8)); // -7.0
        System.out.println(Math.min(4,8));
        System.out.println(Math.max(4,8));
        System.out.println(Math.min(Math.min(4,6),3));
        System.out.println(Math.max(Math.max(4,6),3));
        System.out.println(Math.max(Math.max(4,6),Math.max(3,8)));
        System.out.println(Math.min(Math.min(4,6),Math.min(3,1)));
        System.out.println(Math.pow(3.1415,2 ));

    }
}
