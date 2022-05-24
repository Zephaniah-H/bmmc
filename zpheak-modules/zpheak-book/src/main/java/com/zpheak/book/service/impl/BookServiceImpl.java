package com.zpheak.book.service.impl;

import com.zpheak.book.dao.BookDao;
import com.zpheak.book.domain.Book;
import com.zpheak.book.service.IBookService;
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
public class BookServiceImpl extends ServiceImpl<BookDao, Book> implements IBookService {

}
