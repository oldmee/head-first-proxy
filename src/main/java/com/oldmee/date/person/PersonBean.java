package com.oldmee.date.person;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 16:41 2019/1/12
 */
public interface PersonBean {
    String getName();
    String getGender();
    String getInterests();
    int getHotOrNotRating();

    void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);
    void setHotOrNotRating(int rating);
}
