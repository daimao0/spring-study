package com.hgc.demo01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author:daMao
 * @Date: Created in 6:47 2020/7/2
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Proxy implements Rent{

    private Host host;

    @Override
    public void rent() {
        System.out.println("中介联系房东...");
        host.rent();
        contract();
        fare();
    }

    //看房
    public void seeHouse(){
        System.out.println("中介带你看房...");
    }

    //收中介费
    public void fare(){
        System.out.println("收中介费...");
    }

    //签合同
    public void contract(){
        System.out.println("签合同...");
    }
}
