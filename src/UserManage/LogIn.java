/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserManage;

import ItemController.ItemController;

import View.ViewLogIn;
import java.sql.PreparedStatement;
import java.util.ArrayList;



/**
 *
 * @author goyum
 */
public class LogIn {
    
    private ItemController itemController;
    
    public LogIn()throws Exception {
        itemController = new ItemController();
    }

    

    public int checkUser(Users users)throws Exception {
        
        String userID = users.getUserID();
        String password = users.getPassword();
        
        String ManagerID = "Manager";
        String ManagerPW = "Manager123";
        
        if(userID.equals(ManagerID) && password.equals(ManagerPW) ){
          return 1;  
        }
        return 0;
    }
     public int CheckCashier(Users users)throws Exception {
        String userID = users.getUserID();
        String password = users.getPassword();
        
       String passpassword = itemController.searchUserPw(userID);
        
          
        
        String checkIDandPw;
        
        //checkIDandPw= "Cashier3";
        
        
        
        System.out.println(passpassword);
        if(passpassword.equals(password)){
            return 1;
        } else{
        return 0;
        }
        
        
        
     }
    }
    
   
       
    
    
      //Users user = new Users(txt, Password)
      //String userID =  ViewLogIn.GetUserID();
//    String password = ViewLogIn.GetPassword(password);
//    
//    String ManagerUserID = "Manager";
//    String ManagerPW = "Manager123";
//        
//    if (userID.equals(ManagerUserID) && password.equals(ManagerPW)){
//        JOptionPane.showMessageDialog(this, "Welcome Manager");
//        
//        
//    }else{
//        JOptionPane.showMessageDialog(this, "Wrong UserID or Password");
//    
//    }
    

