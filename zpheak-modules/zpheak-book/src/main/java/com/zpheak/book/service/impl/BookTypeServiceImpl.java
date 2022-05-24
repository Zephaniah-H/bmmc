package com.zpheak.book.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zpheak.book.dao.BookTypeDao;
import com.zpheak.book.domain.BookType;
import com.zpheak.book.service.IBookTypeService;
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
public class BookTypeServiceImpl extends ServiceImpl<BookTypeDao, BookType> implements IBookTypeService {

}
