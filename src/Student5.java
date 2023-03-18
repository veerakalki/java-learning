// Object and Class Example: Initialization through reference
// class Student {
//    int id;
//    String name;
//}
//class TestStudent3 {
//    public static void main(String args[]) {
//        //Creating objects
//        Student s1 = new Student();
//        Student s2 = new Student();
//        //Initializing objects
//        s1.id = 101;
//        s1.name = "Sonoo";
//        s2.id = 102;
//        s2.name = "Amit";
//        //Printing data
//        System.out.println(s1.id + " " + s1.name);
//        System.out.println(s2.id + " " + s2.name);

//Object and Class Example: Initialization through method
//        class Student{
//            int rollno;
//            String name;
//            void insertRecord(int r, String n){
//                rollno=r;
//                name=n;
//            }
//            void displayInformation(){System.out.println(rollno+" "+name);}
//        }
//        class TestStudent4{
//            public static void main(String args[]){
//                Student s1=new Student();
//                Student s2=new Student();
//                s1.insertRecord(111,"Karan");
//                s2.insertRecord(222,"Aryan");
//                s1.displayInformation();
//                s2.displayInformation();

                class Student5{
                    int id;
                    String name;
                    int age;
                    //creating two arg constructor
                    Student5(int i,String n){
                        id = i;
                        name = n;
                    }
                    //creating three arg constructor
                    Student5(int i,String n,int a){
                        id = i;
                        name = n;
                        age=a;
                    }
                    void display(){System.out.println(id+" "+name+" "+age);}

                    public static void main(String args[]){
                        Student5 s1 = new Student5(111,"Karan");
                        Student5 s2 = new Student5(222,"Aryan",25);
                        s1.display();
                        s2.display();
                    }
                }
