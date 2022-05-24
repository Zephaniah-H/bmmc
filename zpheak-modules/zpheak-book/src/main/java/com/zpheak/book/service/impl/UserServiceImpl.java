package com.zpheak.book.service.impl;

import com.zpheak.book.dao.UserDao;
import com.zpheak.book.domain.User;
import com.zpheak.book.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Zphaniah.
 * @since 2022-05-24
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements IUserService {

}
