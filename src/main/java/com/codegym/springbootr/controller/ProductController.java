package com.codegym.springbootr.controller;

import com.codegym.springbootr.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public ModelAndView indexProduct(){
        ModelAndView list = new ModelAndView("product/list", "products", productService.findAll());
        return list;
    }
}
