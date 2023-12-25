package com.example.major.controller;

import com.example.major.dto.ProductDTO;
import com.example.major.model.Category;
import com.example.major.model.Product;
import com.example.major.service.Categoryservice;
import com.example.major.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class AdminController {
    private Categoryservice categoryservice;
    private ProductService productService;
    @Autowired

    public AdminController(Categoryservice categoryservice,ProductService productService) {
        this.categoryservice = categoryservice;
        this.productService=productService;
    }

    //    @GetMapping("/admin")
//    public String adminHome(){
//        return "adminHome";
//    }
//    @GetMapping("/admin/categories")
//    public String getCat(){
//        return "categories";
//    }
    @GetMapping("/add")
    public String getCatAdd(Model model){
        Category category=new Category();
        model.addAttribute("cate",new Category() );
        return "categoriesAdd";
    }
    @PostMapping("/add")
    public String postCatAdd(@ModelAttribute ("cate") Category category){
        categoryservice.addCategory(category);
        return"redirect:/admin";
    }


    @GetMapping("/admin")
    public String getcat(Model model){
        model.addAttribute("catego",categoryservice.getAllCategory());
        return "categories";
    }
    @GetMapping("/categories/delete/{id}")
    public String deleteCat(@PathVariable int id){
        categoryservice.removeCategoryBYId(id);
        return"redirect:/admin";
    }
    @GetMapping("/categories/update/{id}")
    public String updateCat(@PathVariable int id, Model model){
        Optional<Category> category= categoryservice.getCategoryById(id);
        if (category.isPresent()){
            categoryservice.removeCategoryBYId(id);
            model.addAttribute("category",category.get());
            return "redirect:/add";
        } else {
            return "404";
        }
    }
    //-----------------------------------product section---------------------------------

    @GetMapping("/getproduct")
    public String products( Model model){
        model.addAttribute("prod",productService.getAllproduct());
        return "Products";
    }

    @GetMapping("/postdata")
    public String productAddGet(Model model){
        model.addAttribute("productDTO",new ProductDTO());
        model.addAttribute("categories",categoryservice.getAllCategory());
        return "ProductAdd";
    }
   @PostMapping("/postdata")
    public String postProduct(@ModelAttribute("produ") ProductDTO productDTO,){

        return "redirect:getproduct";
   }



}
