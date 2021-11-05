package com.xsk.supermarket.dto;


import lombok.Data;
import lombok.EqualsAndHashCode;

@SuppressWarnings("ALL")
@Data
@EqualsAndHashCode
public class SetPrice {
    private int T_Commid;
    private String Gname;
    private int price;
    private int cost;
}
