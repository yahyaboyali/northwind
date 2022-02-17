/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio.northwind.bussiness.abstracts;

import java.util.List;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.entities.concretes.Category;

/**
 *
 * @author yahya
 */
public interface CategoryService {

    DataResult<List<Category>> getAll();

}
