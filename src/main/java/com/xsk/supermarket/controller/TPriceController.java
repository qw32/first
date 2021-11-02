package com.xsk.supermarket.controller;


import com.xsk.supermarket.dto.Commdies_Ans;
import com.xsk.supermarket.entity.TPrice;
import com.xsk.supermarket.service.impl.TCommodityServiceImpl;
import com.xsk.supermarket.service.impl.TPriceServiceImpl;
import com.xsk.supermarket.service.impl.TUserServiceImpl;
import com.xsk.supermarket.vo.Commdities;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xsk
 * @since 2021-10-30
 */
@RestController
@RequestMapping("/supermarket/tprice")
@Slf4j
public class TPriceController {

//    @Resource
//    TCommodityServiceImpl tCommodityService;
//
//    @Resource
//    TUserServiceImpl tUserService;

    @Resource
    TPriceServiceImpl tPriceService;

    @RequestMapping(value = "/QueryPrice",method = RequestMethod.POST)
    @ResponseBody
    public List<TPrice> QueryPrice(Commdities commdities){

//        QueryWrapper<Commdies_Ans> queryWrapper = new QueryWrapper<Commdies_Ans>();
//        queryWrapper.lambda().eq(Commdies_Ans::getT_Commid,commdities.getT_Commid());
//        queryWrapper.lambda().eq(Commdies_Ans::getGname,commdities.getGname());
//        List<Commdies_Ans> commdies_ansList = tCommodityService.list(queryWrapper);
        Commdies_Ans commdies_ans = new Commdies_Ans();
        commdies_ans.setGname(commdities.getGname());
        commdies_ans.setT_Commid(commdities.getT_Commid());
        System.out.println(commdies_ans.getGname()+"     "+commdies_ans.getT_Commid());
//        List<TCommodity> ans = tCommodityService.list(commdies_ans);
        List<TPrice> ans1 = tPriceService.QueryPrice(commdies_ans);
        return ans1;
    }

    @RequestMapping("/test")
    public String  QueryALL(){
        return "ok";
    }

//    @RequestMapping("/QuerySell")
//    public int QuerySell(){
//
//    }

}
