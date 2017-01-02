package pos;

import java.io.IOException;

import javax.swing.JOptionPane;

public class ProcessSaleController {
    private Sale sale;
    
    public void makeNewSale(){
        sale = new Sale();
    }
    
    public void addItem(int id, int quantity){
        try {
            sale.addSaleLineItem(id, quantity);
        } 
        catch(IOException | ClassNotFoundException | IllegalAccessException | InstantiationException ex)
        {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }
    
    public Sale getSale(){
        return this.sale;
    }
}
