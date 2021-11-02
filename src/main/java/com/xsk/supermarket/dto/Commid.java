package com.xsk.supermarket.dto;

import com.xsk.supermarket.entity.TCommodity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.mybatis.spring.annotation.MapperScan;

@Data
@EqualsAndHashCode
public class Commid {
    private int T_Commid;
}
