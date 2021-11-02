package com.xsk.supermarket.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
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
public class TCommodity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "T_commid", type = IdType.AUTO)
    private Integer tCommid;

    private Integer count;

    @TableField("Gname")
    private String gname;

    private Integer sell;

    private String createTime;


}
