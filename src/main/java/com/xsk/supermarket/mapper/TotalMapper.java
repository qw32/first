package com.xsk.supermarket.mapper;

import com.xsk.supermarket.dto.Commdies_Ans;
import com.xsk.supermarket.dto.Commid;
import com.xsk.supermarket.dto.SetCommidity;
import com.xsk.supermarket.dto.SetPrice;
import com.xsk.supermarket.entity.TCommodity;
import com.xsk.supermarket.vo.SoldProduct;

import java.util.List;

@SuppressWarnings("ALL")
public interface TotalMapper {

    List<Commdies_Ans> getall();

    void DeleteByID(SoldProduct soldProduct);

    void DeleteByID2(SoldProduct soldProduct);

    void setone(SetCommidity productMessage);

    void setone1(SetPrice productMessage);
}
