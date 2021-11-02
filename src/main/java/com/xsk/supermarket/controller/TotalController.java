package com.xsk.supermarket.controller;

import com.xsk.supermarket.dto.Commdies_Ans;
import com.xsk.supermarket.dto.Commid;
import com.xsk.supermarket.dto.SetCommidity;
import com.xsk.supermarket.dto.SetPrice;
import com.xsk.supermarket.entity.TCommodity;
import com.xsk.supermarket.mapper.TCommodityMapper;
import com.xsk.supermarket.mapper.TPriceMapper;
import com.xsk.supermarket.mapper.TUserMapper;
import com.xsk.supermarket.mapper.TotalMapper;
import com.xsk.supermarket.vo.ProductMessage;
import com.xsk.supermarket.vo.SoldProduct;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/total")
@Api(tags = "商品总查询")
public class TotalController {

    @Resource
    TCommodityMapper tCommodityMapper;
    @Resource
    TUserMapper tUserMapper;
    @Resource
    TPriceMapper tPriceMapper;
    @Resource
    TotalMapper totalMapper;

    Logger logger = LoggerFactory.getLogger(TotalController.class);
    @RequestMapping("/all")
    @ResponseBody
    public List<Commdies_Ans> GetAll(){
        List<Commdies_Ans> ans = totalMapper.getall();
        return ans;
    }

    @RequestMapping("/setProduct")
    @ResponseBody
    @ApiOperation(value = "设置商品信息")
    public String setProduct(ProductMessage productMessage){
        SetCommidity setCommidity = new SetCommidity();
        setCommidity.setCount(productMessage.getCount());
        setCommidity.setGname(productMessage.getGname());
        setCommidity.setSell(productMessage.getSell());
        totalMapper.setone(setCommidity);

//        logger.info(setCommidity.getTCommid()+"sss是数值");
        SetPrice setPrice = new SetPrice();
        setPrice.setCost(productMessage.getCost());
        setPrice.setGname(productMessage.getGname());
        setPrice.setT_Commid(setCommidity.getTCommid());
        setPrice.setPrice(productMessage.getPrice());
        totalMapper.setone1(setPrice);
        return "success";
    }

    @RequestMapping("/getProduct")
    @ResponseBody
    @ApiOperation(value = "获得商品信息")
    public List<Commdies_Ans> getProduct(){
        List<Commdies_Ans> ans = totalMapper.getall();
        return ans;
    }

    @RequestMapping("/soldProduct")
    @ResponseBody
    @ApiOperation(value = "下架商品信息")
    public String SoldProduct(SoldProduct soldProduct){
        totalMapper.DeleteByID(soldProduct);
        totalMapper.DeleteByID2(soldProduct);
        return "success";
    }





}
