public class Student {
    public static void main(String[] args) {
        String address = "Delhi, India";

        if(address.endsWith("India")) {

            if(address.contains("Chennai")) {
                System.out.println("Your city is Chennai");
            }
            else if(address.contains("Noida")) {
                        System.out.println("Your city is Noida");
                    }
            else {
                        System.out.println(address.split(",")[0]);
                    }
                }
        else {
                    System.out.println("You are not living in India");
                }
            }
        }
