//Method Overloading: changing no. of arguments
   class Adder{
//        static int add(int a,int b){return a+b;}
//        static int add(int a,int b,int c){return a+b+c;}
//    }
//    class TestOverloading1{
//        public static void main(String[] args){
//            System.out.println(Adder.add(11,11));
//            System.out.println(Adder.add(11,11,11));
//        }
//}
//   Method Overloading: changing data type of arguments

//    static int add(int a, int b){return a+b;}
//    static double add(double a, double b){return a+b;}
//}
//class TestOverloading2{
//    public static void main(String[] args){
//        System.out.println(Adder.add(11,11));
//        System.out.println(Adder.add(12.3,12.6));
//    }}

  // Can we overload java main() method?

   public static void main(String[] args){System.out.println("main with String[]");}
   public static void main(String args){System.out.println("main with String");}
   public static void main(){System.out.println("main without args");}
}