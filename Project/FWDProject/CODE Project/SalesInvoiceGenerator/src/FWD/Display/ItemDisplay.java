/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package FWD.Display;

import FWDProject.SalesInvoiceFrame;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author iAmira
 */
public class ItemDisplay extends JDialog {
    private final JTextField itemNameField;
    private final JTextField itemCountField;
    private final JLabel itemPriceLabel;
    private final JTextField itemPriceField;
    private final JLabel itemNameLabel;
    private final JLabel itemCountLabel;
    private final JButton OkButton;
    private final JButton CancelButton;
    
    public ItemDisplay(SalesInvoiceFrame frame) {
        
        itemNameField = new JTextField(30);               //create a text field of item name with width 30
        itemNameLabel = new JLabel("Item Name");     
        
        itemCountField = new JTextField(30);            //create a text field of item count with width 30
        itemCountLabel = new JLabel("Item Count");
        
        itemPriceField = new JTextField(30);          //create a text field of item price with width 30
        itemPriceLabel = new JLabel("Item Price");
 //*****************************************************//   
       
        OkButton = new JButton("OK");               //create a button Ok of item frame
        CancelButton = new JButton("Cancel");      //create a button cancel of item frame
        
        OkButton.setActionCommand("ItemOK");
        CancelButton.setActionCommand("ItemCancel");
        
        OkButton.addActionListener(frame);
        CancelButton.addActionListener(frame);
        
  //**************************************************//      
        
        setLayout(new GridLayout(4, 2));             // 4 row * 2 columns
        
        add(itemNameLabel);                         // first row for item Name
        add(itemNameField);
        add(itemCountLabel);                       // second row for item count
        add(itemCountField);
        add(itemPriceLabel);                     //  third row for item price
        add(itemPriceField);
        add(OkButton);                          // for ok button frame 
        add(CancelButton);                     // for cancel button frame
        
        pack();
    }

    
    public JTextField getItemPriceField() {
        return itemPriceField;
    }
    public JTextField getItemNameField() {
        return itemNameField;
    }

    public JTextField getItemCountField() {
        return itemCountField;
    }

    
}

