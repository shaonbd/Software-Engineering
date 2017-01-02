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
public class BDTAXCalculator {
    
    public float calculateVATAmount(int total)
    {
        return (float) (total*0.15);
    }
}
