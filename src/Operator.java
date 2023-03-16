public class Operator {
    public static void main(String args[]){
        int x=10;
        //  unary operator
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
// logical and bitwise operator
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

// ternary operator
//        int a=2;
//        int b=5;
//        String min=(a>b)?"a is greater than b":"b is greater than a";
//        System.out.println(min);

//  assignment operator
        int a=8;
        a+=3;//8+3
        System.out.println(a);
        a-=4;//11-4
        System.out.println(a);
        a*=2;//7*2
        System.out.println(a);
        a/=2;//14/2
        System.out.println(a);
    }
}
