package com.xsk.supermarket.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xsk.supermarket.dto.Commdies_Ans;
import com.xsk.supermarket.entity.TPrice;
import com.xsk.supermarket.mapper.TPriceMapper;
import com.xsk.supermarket.service.ITPriceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xsk
 * @since 2021-10-30
 */
@SuppressWarnings("ALL")
@Service

public class TPriceServiceImpl extends ServiceImpl<TPriceMapper, TPrice> implements ITPriceService {

    private Logger log = LoggerFactory.getLogger(this.getClass());
    @Resource
    TPriceMapper tPriceMapper;

    @Resource
    private RedisTemplate<String, String> redisTemplate;

    public List<TPrice> QueryPrice(Commdies_Ans commdies_ans) {
        QueryWrapper<TPrice> queryWrapper= new QueryWrapper<TPrice>();
        if (commdies_ans.getT_Commid()!=0) {
            queryWrapper.lambda().eq(TPrice::getTCommid, commdies_ans.getT_Commid());
        }
        if (commdies_ans.getGname()!=null) {
            queryWrapper.lambda().like(TPrice::getGname, commdies_ans.getGname());
        }
        //这边只是测试
//        log.info("生成缓存key");
        String key = "commdies_"+commdies_ans;
        ValueOperations<String,String> operations = redisTemplate.opsForValue();
        Gson gson = new Gson();

        boolean hasKey = redisTemplate.hasKey(key);
        if (hasKey){
//            log.debug("这里这里");
//            log.debug("这里这里");
//            log.debug("这里这里");
            String s = operations.get(key);
            log.info("取得缓存");
//            log.debug(s);
            List<TPrice> array = gson.fromJson(s,new TypeToken<ArrayList<TPrice>>(){}.getType());
            return array;
        }

        log.info("缓存不存在");
        List<TPrice> list = tPriceMapper.selectList(queryWrapper);
//        if (list.size()!=0) System.out.println("不是空的");
//        for (TPrice tPrice:list){
//            System.out.println(tPrice);
//        }

        String s = gson.toJson(list);
//        log.debug("转换成这样");
//        log.debug(s);
//        log.debug("转换成这样");
        operations.set(key,s,100, TimeUnit.SECONDS);
//        log.info("从DB走");
        return list;
    }
}
