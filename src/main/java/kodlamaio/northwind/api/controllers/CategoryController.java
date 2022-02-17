/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio.northwind.api.controllers;

import java.util.List;
import kodlamaio.northwind.bussiness.abstracts.CategoryService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.entities.concretes.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/category") //dış dünyadan gelen isteği karşılayan yer
@CrossOrigin
public class CategoryController {
   private CategoryService categoryService;
   
   @Autowired
   public CategoryController(CategoryService categoryService){
       this.categoryService=categoryService;
   }
   @GetMapping("/getall")// istekte bulunuyoruz veri istiyoruz o yüzden getMapping
    public DataResult<List<Category>> getAll() {
        return this.categoryService.getAll();
    }

}
