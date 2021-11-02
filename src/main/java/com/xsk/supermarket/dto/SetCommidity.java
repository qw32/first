package com.xsk.supermarket.dto;


import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class SetCommidity {
    private int tCommid;
    private String Gname;
    private int sell;
    private int count;
}
