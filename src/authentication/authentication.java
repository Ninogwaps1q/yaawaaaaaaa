
package authentication;

import Main.Main;
import confiig.config;


public class authentication {
    
    public void register(){
        
        System.out.print("Add user name: ");
        String name = Main.inp.nextLine();
        
        System.out.print("Enter user email: ");
        String email = Main.inp.nextLine();
        
        System.out.print("Enter Password: ");
        String pass = Main.inp.nextLine();
        
        System.out.println("Choose role (1. Admin, 2. User): ");
        int chooseRole = Main.inp.nextInt();
        
        String role = "";
        if(chooseRole == 1){
            role = "Admin";
        }else{
            role = "User";
        }
        
        
        config con = new config();
        String sql = "INSERT INTO tbl_costumer(c_name, c_email, c_pass, c_role, c_status) VALUES(?, ?, ?, ?, ?)";
        con.addRecord(sql, name, email, pass, role, "Pending");
    }
}
