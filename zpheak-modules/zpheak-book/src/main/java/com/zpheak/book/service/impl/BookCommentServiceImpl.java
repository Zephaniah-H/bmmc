package com.zpheak.book.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zpheak.book.dao.BookCommentDao;
import com.zpheak.book.domain.BookComment;
import com.zpheak.book.service.IBookCommentService;
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
public class BookCommentServiceImpl extends ServiceImpl<BookCommentDao, BookComment> implements IBookCommentService {

}
