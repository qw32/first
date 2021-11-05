package com.xsk.supermarket.dto;


import lombok.Data;
import lombok.EqualsAndHashCode;

@SuppressWarnings("ALL")
@Data
@EqualsAndHashCode
public class SetCommidity {
    private int tCommid;
    private String Gname;
    private int sell;
    private int count;
}
