
package Main;


import authentication.authentication;
import custumerDashboard.customerDashboard;
import java.util.Scanner;

public class Main {
    
    public static Scanner inp = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        String response;
        do{
           
            System.out.println("1. Add User");
            System.out.println("2. View User");
            System.out.println("3. Update User");
            System.out.println("4. Delete User");
            System.out.println("5. Back");

            System.out.print("\nChoose an option: ");
            int option = inp.nextInt();
            inp.nextLine();

            customerDashboard cd = new customerDashboard();

            switch(option){

                case 1:
                   cd.addCustomer();
                    break;

                case 2:
                    cd.viewCustomer();
                    break;

                case 3:
                    cd.viewCustomer();
                    cd.updateCostumer();
                    break;

                case 4:
                    cd.viewCustomer();
                    cd.deleteCostumer();
                    break;
                    
                case 5:
                    main(null);
                    break;
            }
            
            System.out.print("Do you want to continue (yes / no): ");
            response = inp.nextLine();
        }while(response.equals("yes"));
    }
    
    public static void loginDashboard(){
        
        authentication au = new authentication();
        
        System.out.println("WELCOME TO MY SYSTEM");
        System.out.println("1. login");
        System.out.println("2. register");
        System.out.println("3. exit");
         
        System.out.print("Choose an option: ");
        int option = inp.nextInt();
        inp.nextLine();
         
        switch(option){
             
            case 1:
                 
                break;
                
            case 2:
                au.register();
                break;
         }
         
         
        
    }
    

}


