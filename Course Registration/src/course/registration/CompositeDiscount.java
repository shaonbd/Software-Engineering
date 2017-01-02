/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course.registration;
import java.util.ArrayList;
/**
 *
 * @author Jahid
 */
public class CompositeDiscount implements IDiscountStrategy{
    public ArrayList<IDiscountStrategy> discount_stg = null;
    
    public ArrayList<IDiscountStrategy> getDiscount(){
        return discount_stg;
    }
    
    @Override
    public void add(IDiscountStrategy ids){
        if(discount_stg == null){
        discount_stg = new ArrayList<>();
        }
        discount_stg.add(ids);
    }
    @Override
    public int getTotal(Registration r){
        return 0;
    }

    
}
