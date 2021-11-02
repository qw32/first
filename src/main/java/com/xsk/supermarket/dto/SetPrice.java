package com.xsk.supermarket.dto;


import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class SetPrice {
    private int T_Commid;
    private String Gname;
    private int price;
    private int cost;
}
