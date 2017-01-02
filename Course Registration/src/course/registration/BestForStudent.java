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
public class BestForStudent extends CompositeDiscount{

        @Override
    public int getTotal(Registration r){
        int highestTotal = Integer.MIN_VALUE;
        for(IDiscountStrategy ids : getDiscount()){
        highestTotal = Math.max(ids.getTotal(r), highestTotal);
       }
         return highestTotal;
    }
}
