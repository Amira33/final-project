/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FWD.model;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


/**
 *
 * @author iAmira
 */
public class SalesInvoiceHeader {
   
    private ArrayList<InvoiceItems> Items;
    private String customerName;
    private int invoiceNumber;
    private Date invoiceDate;
    
    //double invoiceTotal;
    

 //********************************************************//
    
    
    public String getFILESASCSV() {      // return file as comma-separated values
       DateFormat df = new SimpleDateFormat("dd-MM-yyyy"); 
       return "" + getInvoiceNumber() + "," + df.format(getInvoiceDate()) + "," + getCustomerName();
   }
    
 //******************************************************// 
    
    public SalesInvoiceHeader(int invoiceNumber, Date invoiceDate, String customerName) {
        this.invoiceNumber = invoiceNumber;
        this.invoiceDate = invoiceDate;
        this.customerName = customerName;
        
    }
  
   
    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    
 //***************************************************//   
    
     @Override
    public String toString() {
     
       String value =  "InvoiceHeader{" + "invoiceNumber=" + invoiceNumber + ", invoiceDate=" + invoiceDate + ", customerName=" + customerName + '}';
       for (InvoiceItems item :getItems()) {
                value += "\n" + item;    // (\n to insert new line)
    }
  return value;
    
    
    }
    
    
    
    public ArrayList<InvoiceItems> getItems() {
        
        if (Items ==null)
            Items = new ArrayList<>();
        return Items;
        
    }
    
    
    public void setItems(ArrayList<InvoiceItems> Items) {
        this.Items = Items;
    }
     
     
     
    /* public void setInvoiceTotal(double invoiceTotal) {
        this.invoiceTotal = invoiceTotal;
    }

  

   /* public double getInvoiceTotal() {
        return 0.0;
    }*/  
    
    
    public double getInvoiceTotal() {
    double total = 0.0 ;
    for (InvoiceItems Item : getItems()) {
        total += Item.getItemsTotal();
    }
    return total;
}

    /**
     *
     * @param Item
     */
    public void addInvItems(InvoiceItems Item){
    getItems().add(Item);

     }
    
    
}

