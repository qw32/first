package com.xsk.supermarket.service;

import com.xsk.supermarket.dto.Commdies_Ans;
import com.xsk.supermarket.entity.TCommodity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xsk
 * @since 2021-10-30
 */
public interface ITCommodityService extends IService<TCommodity> {

    List<TCommodity> queryCommdity(Commdies_Ans commdies_ans);
}
