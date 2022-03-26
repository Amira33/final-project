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
public class InvoiceHeaderTable extends AbstractTableModel {


    private final  List<SalesInvoiceHeader> salesinvoicesMenu;
    private final  DateFormat df = new SimpleDateFormat("dd-MM-yyyy");  //DateFormat (Day, Month, Year)
    
    public InvoiceHeaderTable(List<SalesInvoiceHeader> invoicesList) {
        this.salesinvoicesMenu = invoicesList; 
    }

    
    
    public List<SalesInvoiceHeader> getSalesinvoicesMenu() {
        return salesinvoicesMenu;
    }

    
    @Override
    public int getRowCount() {
       
        return salesinvoicesMenu.size();       //Size of row invoice list of  invoice header table
    }

    @Override
    public int getColumnCount() {
        return 4;                      // number of coulumns of invoice header table( invoice NO,invoice DATE,Customer Name, invoice TOTAL)
    }

 
    
    @Override
    public String getColumnName(int columnIndex) {      // index name of columns of invoice header table
          return switch (columnIndex) {
              case 0 -> "Invoice Number";
              case 1 -> "Customer Name";
              case 2 -> "Invoice Date";
              case 3 -> "Invoice Total";
              default -> "";
          };
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;             //not allwoed the user to modify the  table  
    }
    
    
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
          return switch (columnIndex) {
              case 0 -> Integer.class;     //for invoice number
              case 1 -> String.class;     //for customer name
              case 2 -> String.class;    //for invoice date
              case 3 -> Double.class;   //for invoice total
              default-> Object.class;
          };
    }

   /* @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }*/
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {    // to draw the data of table 
        SalesInvoiceHeader row;
        row = salesinvoicesMenu.get(rowIndex);
        
          return switch (columnIndex) {
              case 0 -> row.getInvoiceNumber();
              case 1 -> row.getCustomerName();
              case 2 -> df.format(row.getInvoiceDate());
              case 3 -> row.getInvoiceTotal();
              default -> "";
          };
        
    }

}

    

