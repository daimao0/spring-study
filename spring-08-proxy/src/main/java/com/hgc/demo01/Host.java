package com.hgc.demo01;

/**
 * @Author:daMao
 * @Date: Created in 6:45 2020/7/2
 */
//房东
public class Host implements Rent{

    @Override
    public void rent() {
        System.out.println("房东要出租房子....");
    }
}
