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
public class DevelopmentFeeCalculator implements IExtraFeeCalculator{
    
    @Override
    public int getExtraAmount(int courseTotal)
    {
        return (int)(courseTotal*0.1);
    }
}
