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
public interface IDiscountStrategy {
    public int getTotal(Registration r);
    public void add(IDiscountStrategy ids);
}
