package com.medsoft.contentmanagementsystem;

import com.medsoft.contentmanagementsystem.dao.AuthorRepository;
import com.medsoft.contentmanagementsystem.dao.CategoryRepository;
import com.medsoft.contentmanagementsystem.dao.PostRepository;
import com.medsoft.contentmanagementsystem.entities.Author;
import com.medsoft.contentmanagementsystem.entities.Category;
import com.medsoft.contentmanagementsystem.entities.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class ContentManagementSystemApplication  implements CommandLineRunner {
    @Autowired
    private AuthorRepository authorRepository ;
    @Autowired
    private CategoryRepository categoryRepository ;
    @Autowired
    private PostRepository postRepository ;
    public static void main(String[] args) {
        SpringApplication.run(ContentManagementSystemApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Author author1 = (Author) authorRepository.save(new Author("Medsoft" , "Medsoft@gmail.com"));
        Author author2 = (Author) authorRepository.save(new Author("Ahmed" , "Ahmed@gmail.com"));
        Category category1 = (Category) categoryRepository.save(new Category("Tech"));
        Category category2 = (Category) categoryRepository.save(new Category("Sante"));
        Category category3 = (Category) categoryRepository.save(new Category("Sport"));
        Category category4 = (Category) categoryRepository.save(new Category("Culture"));
        Post Post1 = (Post) postRepository.save(new Post("About Kubernets" , "Devops tools are more and more used to upgrade the level of appls ...", new Date(), category1,author1));
        Post Post2 = (Post) postRepository.save(new Post("About Java" , "Lorem Upsum dolor si amet  ...", new Date(), category1,author1));
        Post Post3 = (Post) postRepository.save(new Post("About Kubernets" , "Lorem Upsum dolor si amet  ... ...", new Date(), category1,author1));
        Post Post4 = (Post) postRepository.save(new Post("About Kubernets" , "Lorem Upsum dolor si amet  ... ...", new Date(), category2,author2));
        Post Post5 = (Post) postRepository.save(new Post("About Kubernets" , "Lorem Upsum dolor si amet  ... ...", new Date(), category3,author2));
        Post Post6 = (Post) postRepository.save(new Post("About Kubernets" , "Lorem Upsum dolor si amet  ... ...", new Date(), category1,author1));
    }
}
