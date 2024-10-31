/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ItemController;

import ItemDTO.ItemDto;
import ItemManage.ItemModel;
import UserManage.Users;
import java.util.ArrayList;

/**
 *
 * @author goyum
 */
public class ItemController {
    private ItemModel itemModel;
    
    public ItemController() throws Exception{
        this.itemModel = new ItemModel();
    }
    
    public String saveItem(ItemDto itemDto) throws Exception{
        String resp = itemModel.saveItem(itemDto);
        return resp;
    }
    public ArrayList<ItemDto> getAllItem() throws Exception{
        
        ArrayList<ItemDto> itemDtos = itemModel.getAllItem();
        return itemDtos;
    }
    public String saveUser(Users users) throws Exception{
        String resp = itemModel.saveUser(users);
        return resp;
    }
    
    public ArrayList<ItemDto> searchItem(int ItemCatgry) throws Exception {
         ArrayList<ItemDto> itemDtos = itemModel.getItem(ItemCatgry);
         return itemDtos;
}
    public String searchUserPw(String UserId) throws Exception{
        String passpassword =itemModel.checkpassword(UserId);
        
        return passpassword;
    }
}