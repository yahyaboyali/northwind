/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio.northwind.bussiness.concretes;

import java.util.List;
import kodlamaio.northwind.bussiness.abstracts.CategoryService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.dataAccess.abstracts.CategoryDao;
import kodlamaio.northwind.entities.concretes.Category;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author yahya
 */
public class CategoryManager implements CategoryService {

    private CategoryDao categoryDao;
    
    @Autowired
    public CategoryManager(CategoryDao categoryDao){
        this.categoryDao=categoryDao;
    }

    @Override
    public DataResult<List<Category>> getAll() {
        return new SuccessDataResult<List<Category>>(this.categoryDao.findAll(),"kategoriler geldi");
    }

}
