/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio.northwind.bussiness.concretes;

import java.util.List;
import kodlamaio.northwind.bussiness.abstracts.ProductService;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // bu class projede servis görevi yapıcağını springe bildirmiş oluyoruz 
public class ProductManager implements ProductService{
    private ProductDao productDao;
    
    @Autowired
    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }
    
    @Override
    public List<Product> getAll() {
        return this.productDao.findAll();
    }
    
}
