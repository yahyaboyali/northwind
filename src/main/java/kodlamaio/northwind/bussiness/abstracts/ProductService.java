/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio.northwind.bussiness.abstracts;

import java.util.List;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;

/**
 *
 * @author yahya
 */
public interface ProductService {
    DataResult<List<Product>> getAll();
    DataResult<List<Product>> getAll(int pageNo,int pageSize);
    DataResult<List<Product>> getAllSorted();
    Result add(Product product);
    
    DataResult<Product> getByProductName(String productName);// implemantasyon istemiyor jpa yerimize yapıyor getby önemli detay

    DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId);// veritabanında and ona göre sorgu yazdırıyor
    
    DataResult<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId);// or işlemi
    
    DataResult<List<Product>> getByCategoryIdIn(List<Integer> categories);
    
    DataResult<List<Product>> getByProductNameContains(String productName);
    
    DataResult<List<Product>> getByProductNameStartsWith(String productName);// şu harfle başlayan vs 
    
    DataResult<List<Product>> getByNameAndCategory(String productName,int categoryId);// sorguyu kendimiz yazacağımızda bunu kullanıyoruz
    
    DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails();
}
