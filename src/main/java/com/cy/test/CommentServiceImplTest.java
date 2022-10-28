package com.cy.test;

import com.cy.pojo.Comment;
import com.cy.service.CommentService;
import com.cy.service.impl.CommentServiceImpl;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CommentServiceImplTest {

    private CommentService commentService = new CommentServiceImpl();

    @Test
    void addComment(){
        commentService.addComment(new Comment(1,1,3,"test context_2"));
    }
    @Test
    void deleteCommentById(){
        commentService.deleteCommentById(1);
    }

    @Test
    void queryCommentById(){
        Comment commentById =commentService.queryCommentById(2);
        System.out.println(commentById.getComment_content());
    }

    @Test
    void queryComments(){
        for(Comment queryComment:commentService.queryComments())
            System.out.println(queryComment);
    }

    @Test
    void queryCommentByBlogId(){
        List<Comment> commentByBlogId = commentService.queryCommentByBlogId(2);
        System.out.println(commentByBlogId);
    }

}
