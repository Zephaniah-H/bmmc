package com.zpheak.book.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zpheak.book.dao.OneBookTypeDao;
import com.zpheak.book.domain.OneBookType;
import com.zpheak.book.service.IOneBookTypeService;
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
public class OneBookTypeServiceImpl extends ServiceImpl<OneBookTypeDao, OneBookType> implements IOneBookTypeService {

}
