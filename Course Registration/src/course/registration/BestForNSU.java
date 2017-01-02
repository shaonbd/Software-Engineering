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
public class BestForNSU extends CompositeDiscount{
    @Override
    public int getTotal(Registration r){
        int lowestTotal = Integer.MAX_VALUE;
        for(IDiscountStrategy ids : getDiscount()){
        lowestTotal = Math.min(ids.getTotal(r), lowestTotal);
       }
         return lowestTotal;   
    }
}
