package com.xsk.supermarket.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xsk.supermarket.dto.Commdies_Ans;
import com.xsk.supermarket.entity.TCommodity;
import com.xsk.supermarket.mapper.TCommodityMapper;
import com.xsk.supermarket.service.ITCommodityService;
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
public class TCommodityServiceImpl extends ServiceImpl<TCommodityMapper, TCommodity> implements ITCommodityService {

    @Resource
    TCommodityMapper tCommodityMapper;


    @Override
    public List<TCommodity> queryCommdity(Commdies_Ans commdies_ans) {
        QueryWrapper<TCommodity> queryWrapper = new QueryWrapper<TCommodity>();

        if (commdies_ans.getGname()!=null){
            queryWrapper.lambda().like(TCommodity::getGname,commdies_ans.getGname());
        }else
            log.debug(commdies_ans.getGname());
        if (commdies_ans.getT_Commid()!=0){
            queryWrapper.lambda().eq(TCommodity::getTCommid,commdies_ans.getT_Commid());
        }else
            log.debug("失误");

            queryWrapper.lambda().ge(TCommodity::getCount,commdies_ans.getCount()).ge(TCommodity::getSell,commdies_ans.getSell());
            List<TCommodity> ans = tCommodityMapper.selectList(queryWrapper);
        return ans;
    }

}
