package com.oldmee.status;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 13:58 2019/1/11
 */
public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
