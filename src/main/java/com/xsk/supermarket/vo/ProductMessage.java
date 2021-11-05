package com.xsk.supermarket.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@SuppressWarnings("ALL")
@Data
@EqualsAndHashCode(callSuper = false)
public class ProductMessage {

    private String Gname;

    private int Count;

    private int Price;

    private int Cost;

    private int sell;

}
