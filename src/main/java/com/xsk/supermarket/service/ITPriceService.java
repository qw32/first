package com.xsk.supermarket.service;

import com.xsk.supermarket.dto.Commdies_Ans;
import com.xsk.supermarket.entity.TCommodity;
import com.xsk.supermarket.entity.TPrice;
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
public interface ITPriceService extends IService<TPrice> {
    public List<TPrice> QueryPrice(Commdies_Ans commdies_ans);
}
