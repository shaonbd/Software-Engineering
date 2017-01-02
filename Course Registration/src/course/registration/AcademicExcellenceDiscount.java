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
public class AcademicExcellenceDiscount implements IDiscountStrategy{
    @Override
    public int getTotal(Registration r){
         return  (int) (r.getRawTotal() * .5);
}

    /**
     *
     * @param ids
     */
    @Override
    public void add(IDiscountStrategy ids){}


}
