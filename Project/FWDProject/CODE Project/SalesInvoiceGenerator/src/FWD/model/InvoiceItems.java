/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FWD.model;

/**
 *
 * @author iAmira
 */
public class InvoiceItems {
   private  String itemName;
   private  double itemPrice;
   private  int    itemCount;
   private SalesInvoiceHeader header;      // read header

  
//****************************************************//   
   
   
   public String getFILESASCSV() {      // return file as comma-separated values
       
       return "" + getHeader().getInvoiceNumber() + "," + getItemName() + "," + getItemPrice() + "," + getItemCount();
   }
   
//*************************************************//
   
    public InvoiceItems(String itemName, double itemPrice, int itemCount, SalesInvoiceHeader header) {
        this.header = header;
        this.itemPrice = itemPrice;
        this.itemName = itemName;
        this.itemCount = itemCount;
      
    }
  

    
    public SalesInvoiceHeader getHeader() {
        return header;
    }

    public void setHeader(SalesInvoiceHeader header) {
        this.header = header;
    }
    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

  
    
    @Override
    public String toString() {
        return "InvoiceItems{" + "itemName=" + itemName + ", itemPrice=" + itemPrice + ", itemCount=" + itemCount + '}';
    }
    
   public double getItemsTotal(){
   return itemPrice * itemCount ;
    
    }

}

