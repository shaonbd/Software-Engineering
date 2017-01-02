/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course.registration;

/**
 *
 * @author Jahid
 */
public class FreedomFighterDiscount implements IDiscountStrategy{
    @Override
    public int getTotal(Registration r){
        int ret;
        if(r.getRawTotal()<=20000)
            ret = r.getRawTotal();
        else
            ret = 20000;
    return ret;
    }

    @Override
    public void add(IDiscountStrategy ids){}
    
}
