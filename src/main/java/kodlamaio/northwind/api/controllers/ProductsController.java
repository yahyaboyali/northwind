package kodlamaio.northwind.api.controllers;

import java.util.List;
import kodlamaio.northwind.bussiness.abstracts.ProductService;
import kodlamaio.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products") //dış dünyadan gelen isteği karşılayan yer
public class ProductsController {
    private ProductService productService;
    
    @Autowired// projeyi tarayıp bizim yerimize newliyor
    public ProductsController(ProductService productService) {
        this.productService = productService;
    }
    
    // api yerleştirmiş oluyoruz farklı platformların ortak dili için
    @GetMapping("/getall")// istekte bulunuyoruz veri istiyoruz o yüzden getMapping
    public List<Product> getAll(){
        return this.productService.getAll();
    }
}
