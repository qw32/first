package com.xsk.supermarket.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author xsk
 * @since 2021-10-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TPrice implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "T_commid", type = IdType.AUTO)
    private Integer tCommid;

    private Integer price;

    private Integer cost;

    private String Gname;

    private String createTime;


}
