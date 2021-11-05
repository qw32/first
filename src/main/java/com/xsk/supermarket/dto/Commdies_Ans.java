package com.xsk.supermarket.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.mybatis.spring.annotation.MapperScan;

@SuppressWarnings("ALL")
@Data
@EqualsAndHashCode
public class Commdies_Ans  {

    private int T_Commid;
    private String Gname;
    private int sell;
    private int count;
    private int price;
    private int cost;

}
