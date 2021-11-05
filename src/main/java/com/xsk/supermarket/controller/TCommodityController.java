package com.xsk.supermarket.controller;


import com.xsk.supermarket.dto.Commdies_Ans;
import com.xsk.supermarket.entity.TCommodity;
import com.xsk.supermarket.service.impl.TCommodityServiceImpl;
import com.xsk.supermarket.vo.Commdities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Properties;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xsk
 * @since 2021-10-30
 */
@SuppressWarnings("ALL")
@RestController
@RequestMapping("/supermarket/tcommodity")
public class TCommodityController {

    @Resource
    TCommodityServiceImpl tCommodityService;

    Logger logger = LoggerFactory.getLogger(TCommodityController.class);

    @RequestMapping("/getcommdity")
    @ResponseBody
    public List<TCommodity> QueryCommdity(Commdities commdities){
        Commdies_Ans commdies_ans = new Commdies_Ans();
        commdies_ans.setT_Commid(commdities.getT_Commid());
        commdies_ans.setCount(commdities.getCount());
        commdies_ans.setGname(commdities.getGname());
        commdies_ans.setSell(commdities.getSell());
        logger.info(commdities.getGname()+"  "+commdities.getT_Commid()+"  "+commdities.getSell()+"  "+commdities.getCount());
        logger.info(commdies_ans.getGname()+"  "+commdies_ans.getT_Commid()+"   "+commdies_ans.getSell()+"   "+commdies_ans.getCount());
        List<TCommodity> list = tCommodityService.queryCommdity(commdies_ans);
        return list;
    }


//    @RequestMapping("/setcommdity")
//    @ResponseBody
//    public List<TCommodity> QueryCommdity(Commdities commdities){
//        Commdies_Ans commdies_ans = new Commdies_Ans();
//        commdies_ans.setT_Commid(commdities.getT_Commid());
//        commdies_ans.setCount(commdities.getCount());
//        commdies_ans.setGname(commdities.getGname());
//        commdies_ans.setSell(commdities.getSell());
//        logger.info(commdities.getGname()+"  "+commdities.getT_Commid()+"  "+commdities.getSell()+"  "+commdities.getCount());
//        logger.info(commdies_ans.getGname()+"  "+commdies_ans.getT_Commid()+"   "+commdies_ans.getSell()+"   "+commdies_ans.getCount());
//        List<TCommodity> list = tCommodityService.queryCommdity(commdies_ans);
//        return list;
//    }



}
