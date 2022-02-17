/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List;
import kodlamaio.northwind.entities.concretes.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author yahya
 */
public interface CategoryDao extends JpaRepository<Category, Integer> {

    Category getByCategoryName(String categoryName);

}
