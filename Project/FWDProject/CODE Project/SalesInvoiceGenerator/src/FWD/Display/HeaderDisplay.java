/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FWD.Display;

import FWDProject.SalesInvoiceFrame;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;

/**
 *
 * @author iAmira
 */


public class HeaderDisplay  extends JDialog {
    
    private final JTextField CustomerNameField;
    private final JTextField InvoiceDateField;
    private final JLabel CustomerNameLabel;
    private final JLabel InvoiceDateLabel;
    private final JButton OkButton;
    private final JButton CancelButton;

    
    
    public JTextField getCustomerNameField() {
        return CustomerNameField;
    }

    public JTextField getInvoiceDateField() {
        return InvoiceDateField;
    }
    
    
    public HeaderDisplay(SalesInvoiceFrame frame) {
       
        CustomerNameLabel = new JLabel("Customer Name:");     //create a label of customer name 
        CustomerNameField = new JTextField(30);              //create a text field of customer name with width 30
        
        InvoiceDateLabel = new JLabel("Invoice Date:");     //create a label of invoice date
        InvoiceDateField = new JTextField(30);             //create a text field of invoice date with width 30
        
        OkButton = new JButton("OK");                   //create a  button OK of invoice frame
        CancelButton = new JButton("Cancel");          //create a  button cancel of invoice frame
        
        OkButton.setActionCommand("InvoiceOK");
        CancelButton.setActionCommand("InvoiceCancel");
        
        OkButton.addActionListener(frame);
        CancelButton.addActionListener(frame);
       
        
        
        setLayout(new GridLayout(3, 2));        //make a grid ( 3 row * 2 columns)
       
        add(InvoiceDateLabel);                // first row for invoice Date
        add(InvoiceDateField);              
        add(CustomerNameLabel);             // second row for customer name 
        add(CustomerNameField);
        
       
        add(OkButton);                  // third row for ok the frame 
        add(CancelButton);             // to cancel the frame   
        pack();
        
    }

   
}
