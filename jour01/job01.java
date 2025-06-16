import java.util.Scanner;

class job02 {
    public static void main(String[]args) {
        Scanner myObj = new Scanner(System.in); //Create Scanner object
        System.out.print("Saisissez une saisie : "); //print to not jump lines 

        String userName = myObj.nextLine(); //Read input
        System.out.println("You just said : " + userName); //Output user input
        myObj.close();
    }  
}