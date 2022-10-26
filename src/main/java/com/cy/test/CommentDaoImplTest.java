package com.cy.test;

import com.cy.dao.CommentDao;
import com.cy.dao.impl.CommentDaoImpl;
import com.cy.pojo.Comment;
import org.junit.jupiter.api.Test;

public class CommentDaoImplTest {

    private CommentDao commentDao = new CommentDaoImpl();
    @Test
    void addComment(){commentDao.addComment(new Comment(null,1,2,"this is a test for comment"));}

    @Test
    void deleteCommentById(){commentDao.deleteCommentById(1);}

    @Test
    void queryCommentById(){
        Comment commentById = commentDao.queryCommentById(1);
        System.out.println(commentById.getComment_content());
    }

    @Test
    void queryComments(){
        for(Comment commentById :commentDao.queryComments())
            System.out.println(commentById);
    }
}
