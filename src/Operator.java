public class Operator {
    public static void main(String args[]){
        int x=10;
//        System.out.println(x++);//10 (11)
//        System.out.println(x);
//        System.out.println(++x);//12
//        System.out.println(x--);//12 (11)
//        System.out.println(x);
//        System.out.println(--x);//10

//        int a=10;
//        int b=-10;
//        boolean c=true;
//        boolean d=false;
//        System.out.println(~a);//-11 (minus of total positive value which starts from 0)
//        System.out.println(~b);//9 (positive of total minus, positive starts from 0)
//        System.out.println(!c);//false (opposite of boolean value)
//        System.out.println(!d);//true
//
//        int a=10;
//        int b=5;
//        int c=20;
//        System.out.println(a>b&&a++<c);//false && true = false
//        System.out.println(a);//10 because second condition is not checked
//        System.out.println(a<b&a++<c);//false && true = false
//        System.out.println(a);//11 because second condition is checked
//
//        System.out.println(a>b||a<c);//true || true = true
//        System.out.println(a>b|a<c);//true | true = true
//|| vs |

//        int a=10;
//        int b=5;
//        int c=20;
//        System.out.println(a>b||a++<c);//true || true = true
//        System.out.println(a);//10 because second condition is not checked
//        System.out.println(a>b|a++<c);//true | true = true
//        System.out.println(a);//11 because second condition is checked

        int a=2;
        int b=5;
        String min=(a>b)?"a is greater then b":"b is greater then a";
        System.out.println(min);
    }
}
