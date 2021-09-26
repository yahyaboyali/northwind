package kodlamaio.northwind.api.controllers;

import java.util.List;
import kodlamaio.northwind.bussiness.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public DataResult<List<Product>> getAll(){
        return this.productService.getAll();
    }
    
    @PostMapping("/add")
    public Result add(@RequestBody Product product){
        // requestbody büyük iş yapıyor 
        // arka planda bir product oluşturup bilgilerini eşleştiriyor
        return this.productService.add(product);
    }
}
