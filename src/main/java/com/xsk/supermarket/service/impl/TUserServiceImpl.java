package com.xsk.supermarket.service.impl;

import com.xsk.supermarket.entity.TUser;
import com.xsk.supermarket.mapper.TUserMapper;
import com.xsk.supermarket.service.ITUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xsk
 * @since 2021-10-30
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements ITUserService {

}
