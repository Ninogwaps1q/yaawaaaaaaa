
package custumerDashboard;

import Main.Main;
import confiig.config;


public class customerDashboard {
    
    public void addCustomer(){
        
        System.out.println("\nAdd Customer");
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
    
    public void viewCustomer(){
        
        config con = new config();
        String spaQuery = "SELECT * FROM tbl_costumer";
        String[] spaHeaders = {"ID","NAME", "EMAIL", "PASSWORD", "ROLE", "STATUS"};
        String[] spaColumns = {"c_id","c_name", "c_email", "c_pass", "c_role","c_status"};
        
        con.viewRecords(spaQuery, spaHeaders, spaColumns);
    } 
    
    public void updateCostumer(){
        
        System.out.print("Enter id to update: ");
        int uid = Main.inp.nextInt();
        Main.inp.nextLine();
       System.out.print("Add user name: ");
        String name = Main.inp.nextLine();
        
        System.out.print("Enter user email: ");
        String email = Main.inp.nextLine();
        
        System.out.print("Enter Password: ");
        String pass = Main.inp.nextLine();
        
        config con = new config();
        String sqlUpdate = "UPDATE tbl_costumer SET c_name = ?, c_email = ?, c_pass = ? WHERE c_id = ?";
        con.updateRecord(sqlUpdate, name, email, pass, uid);
    }
    
    public void deleteCostumer(){
        
        System.out.print("Enter id to delete: ");
        int did = Main.inp.nextInt();
        
        config con = new config();
        String sqlDelete = "DELETE FROM tbl_costumer WHERE c_id = ?";
        con.deleteRecord(sqlDelete, did);
        
    }
    
}
