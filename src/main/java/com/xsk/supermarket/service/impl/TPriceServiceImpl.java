package com.xsk.supermarket.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xsk.supermarket.dto.Commdies_Ans;
import com.xsk.supermarket.entity.TCommodity;
import com.xsk.supermarket.entity.TPrice;
import com.xsk.supermarket.mapper.TPriceMapper;
import com.xsk.supermarket.service.ITPriceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xsk
 * @since 2021-10-30
 */
@Service

public class TPriceServiceImpl extends ServiceImpl<TPriceMapper, TPrice> implements ITPriceService {

    @Resource
    TPriceMapper tPriceMapper;

    public List<TPrice> QueryPrice(Commdies_Ans commdies_ans) {
        QueryWrapper<TPrice> queryWrapper= new QueryWrapper<TPrice>();
        if (commdies_ans.getT_Commid()!=0) {
            queryWrapper.lambda().eq(TPrice::getTCommid, commdies_ans.getT_Commid());
        }
        if (commdies_ans.getGname()!=null) {
            queryWrapper.lambda().like(TPrice::getGname, commdies_ans.getGname());
        }

        List<TPrice> list = tPriceMapper.selectList(queryWrapper);

//        if (list.size()!=0) System.out.println("不是空的");
//        for (TPrice tPrice:list){
//            System.out.println(tPrice);
//        }

        return list;
    }
}
