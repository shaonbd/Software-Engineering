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
public class BDTaxAdapter implements IExtraFeeCalculator{
    
    BDTAXCalculator bd_tax_cal= new BDTAXCalculator();
    @Override
    public int getExtraAmount(int courseTotal)
    {
        return (int)(bd_tax_cal.calculateVATAmount(courseTotal));
    }
}
