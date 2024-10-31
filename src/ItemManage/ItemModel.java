package ItemManage;


import ItemDTO.ItemDto;
import UserManage.Users;
import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author goyum
 */
public class ItemModel {
    
    private final Connection connection;
    
    public ItemModel() throws SQLException, ClassNotFoundException{
        this.connection = DBConnection.getInstance().getConnection();
    }
    
    
    public String saveItem(ItemDto itemDto) throws Exception{
    
    String sql = "INSERT INTO thepawsshopitems VALUES(?,?,?,?,?,?)";
        
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, itemDto.getCode());
        statement.setInt(2, itemDto.getCategory());
        statement.setString(3, itemDto.getDescription());
        statement.setString(4, itemDto.getPackSize());
        statement.setDouble(5, itemDto.getUnitPrice());
        statement.setInt(6, itemDto.getQoh());
        
        
        return statement.executeUpdate() >0 ? "Success" : "Fail";
    }
    
    
    public ArrayList<ItemDto> getAllItem() throws Exception{
        
        String sql = "SELECT * FROM thepawsshopitems";
        
        PreparedStatement statement = connection.prepareStatement(sql);
        
        ResultSet rst = statement.executeQuery();
        
        ArrayList<ItemDto> itemDtos = new ArrayList<>();
                
        while(rst.next()){
            ItemDto dto = new ItemDto(rst.getString("code"), rst.getInt("category") ,rst.getString("description"), rst.getString("packSize"), rst.getDouble("unitPrice"), rst.getInt("qoh"));
            itemDtos.add(dto);
        }
        return itemDtos;
    }
    
    public String saveUser(Users users) throws SQLException{
       
       String sql = "INSERT INTO cashiers VALUES(?,?)";
        
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, users.getUserID());
        statement.setString(2, users.getPassword());
       
       
       return statement.executeUpdate() >0 ? "Success" : "Fail";
       }
    
    
    public ArrayList<ItemDto>  getItem(int ItemCatgry) throws Exception{
        
        String sql = "SELECT * FROM thepawsshopitems WHERE category = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, ItemCatgry);
        ResultSet rst = statement.executeQuery();
        
        
        
        ArrayList<ItemDto> itemDtos = new ArrayList<>();
                
        while(rst.next()){
            ItemDto dto = new ItemDto(rst.getString("code"),rst.getInt("category"), rst.getString("description"), rst.getString("packSize"), rst.getDouble("unitPrice"), rst.getInt("qoh"));
            itemDtos.add(dto);
        
        
        
        
//        while (rst.next()) {
//            
//            
//            //ItemDto dto = new ItemDto(rst.getString("code"),rst.getInt("category"), rst.getString("description"), rst.getString("packSize"), rst.getDouble("unitPrice"), rst.getInt("qoh"));
//            System.out.println(dto.toString());
//            return dto;
//        }
//        
       
    }
        return itemDtos;
}
    
        public String  checkpassword(String userID) throws Exception{
        
        String sql = "SELECT Password FROM cashiers WHERE UserID = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, userID);
        ResultSet rst = statement.executeQuery();
        String passpassword = null;
        ArrayList<Users> userss = new ArrayList<>();
        //String passingPW =  rst.getString("Password").toString();
        //System.out.println(passingPW);
       if(rst.next()){
           passpassword = rst.getString("Password");
        
      //  System.out.println(userss);
       // Users users = new Users(rst.getString("UserID"), rst.getString("Password"));
      //  userss.add(users);
       }
       
        return passpassword;
        
        }    
}


