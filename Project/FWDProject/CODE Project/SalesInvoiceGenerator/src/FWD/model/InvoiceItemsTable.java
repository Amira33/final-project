/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FWD.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author iAmira
 */
    

public class InvoiceItemsTable extends AbstractTableModel {

    private final List<InvoiceItems> itemsList;
    private final DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
    
    
    public InvoiceItemsTable(List<InvoiceItems> itemsList) {
        this.itemsList = itemsList;
    }
    
    public List<InvoiceItems> getItemsList() {
        return itemsList;
    }
    
    
    
    
    @Override
    public int getRowCount() {
       return itemsList.size();      //Size of row itmes list of  invoice items table
    }

    @Override
    public int getColumnCount() {
        return 4;                   // number of coulumns of invoice items table ( item Name,item Price, item Count ,item TOTAL)
    }

   /* @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }*/
    
    
    
     @Override
    public String getColumnName(int columnIndex) {      // index name of columns of invoice items table
          return switch (columnIndex) {
             
              case 0 -> "Item Name";
              case 1 -> "Item Price";
              case 2 -> "Item Count";
              case 3 -> "Item Total";
              default -> "";
          };
    }

    
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
          return switch (columnIndex) {
              
              case 0 -> String.class;     //for item name
              case 1 -> Double.class;    //for item price
              case 2 -> Integer.class;   //for item count
              case 3-> Double.class;    //for item total
              default-> Object.class;
          };
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;             //not allwoed the user to modify the  table  
    }

    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {    // to draw the data of table 
        InvoiceItems row;
        row = itemsList.get(rowIndex);
        
          return switch (columnIndex) {
              
              case 0 -> row.getItemName();
              case 1 -> row.getItemPrice();
              case 2 -> row.getItemCount();
              case 3 -> row.getItemsTotal();    
              default -> "";
          };
        
    }
}
