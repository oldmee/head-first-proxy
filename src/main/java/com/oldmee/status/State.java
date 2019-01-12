package com.oldmee.status;

import java.io.Serializable;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 13:58 2019/1/11
 */
public interface State extends Serializable {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
