package com.medsoft.contentmanagementsystem.web;

import com.medsoft.contentmanagementsystem.dao.AuthorRepository;
import com.medsoft.contentmanagementsystem.dao.CategoryRepository;
import com.medsoft.contentmanagementsystem.dao.PostRepository;
import com.medsoft.contentmanagementsystem.entities.Author;
import com.medsoft.contentmanagementsystem.entities.Category;
import com.medsoft.contentmanagementsystem.entities.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;
import java.util.List;

@Controller
public class PostsController {
    @Autowired
    private PostRepository postRepository ;
    @Autowired
    private CategoryRepository categoryRepository ;
    @Autowired
    private AuthorRepository authorRepository ;
    @RequestMapping(value = "/posts")
    public String index  (Model model ){
        List<Post> posts  = postRepository.findAll();
        List<Category> categories = categoryRepository.findAll();
        List<Author> authors = authorRepository.findAll();
        model.addAttribute("posts", posts) ;
        model.addAttribute("categories", categories);
        model.addAttribute("authors", authors);
        return "posts";
    }
    @RequestMapping(value = "/savePost" , method = RequestMethod.POST)
    public String newPost(Model model , String title, String description  , Date dateCreation , Category category ,Author author  ){
        Post post = new Post (title , description  ,  dateCreation , category , author) ;
        postRepository.save(post) ;

        return "posts" ;
    }
}
