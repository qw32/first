package com.xsk.supermarket.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@SuppressWarnings("ALL")
@Data
@EqualsAndHashCode(callSuper = false)
public class Commdities {

    private int T_Commid;

    private String Gname;

    private int Count;

    private int Sell;


}
