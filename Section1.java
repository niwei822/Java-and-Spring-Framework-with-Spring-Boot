public class Section1 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int num = 5;
        int a = ++num;
        System.out.println(a);
        //ternary
        int n = 5;
        int result = n > 0 ? 1 : 0;
        System.out.println(result);

        //switch
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Sunday");
        }
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb.reverse());
        System.out.println(sb.capacity());
    }
}
