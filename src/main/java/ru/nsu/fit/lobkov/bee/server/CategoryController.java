package ru.nsu.fit.lobkov.bee.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Lobkov on 27.12.2016.
 */

@RestController
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CommentRepository commentRepository;

    @RequestMapping("/categories")
    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }

    @RequestMapping(value = "/category", method = RequestMethod.POST)
    public HttpStatus insertCategory(@RequestBody Category category) {
        categoryRepository.save(category);
        return HttpStatus.OK;
    }

    @RequestMapping("/products")
    public List<Product> getProducts(@RequestParam(name = "category_id") String categoryID) {
//        Category category = categoryRepository.findByName(categoryName);
        return productRepository.findByCategoryID(categoryID);
    }

    @RequestMapping("/comments")
    public List<Comment> getComments(@RequestParam(name = "product_id") String productID) {
//        Product p = productRepository.findByName("Latte");
//        Comment c = new Comment(p, "Very good!", "Roman");
//        commentRepository.save(c);
//        Product product = productRepository.findById(productID);
        return commentRepository.findByProductID(productID);
    }

//    @RequestMapping(value = "/product", method = RequestMethod.POST)
//    public HttpStatus insertCategory(@RequestBody Product product) {
//        productRepository.save(product);
//        return HttpStatus.OK;
//    }

}
