/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio.northwind.bussiness.abstracts;

import java.util.List;
import kodlamaio.northwind.entities.concretes.Product;

/**
 *
 * @author yahya
 */
public interface ProductService {
    List<Product> getAll();
}
