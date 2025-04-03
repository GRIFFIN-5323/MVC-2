/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.model;

import edu.ijse.mvc.DBConnection.DBConnection;
import edu.ijse.mvc.dto.ItemDto;

/**
 *
 * @author gihan5323
 */
public class ItemModel {
    
    public String saveItem(ItemDto itemDto){
        Connection connection=DBConnection.getInstance().getConnection();
       
    }
    
}
