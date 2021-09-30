package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List;
import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductDao extends JpaRepository<Product, Integer> {

    // isimlendirme standardına uy gerisini o halleder getBy... 
    Product getByProductName(String productName);// implemantasyon istemiyor jpa yerimize yapıyor getby önemli detay

    Product getByProductNameAndCategory_CategoryId(String productName, int categoryId);// veritabanında and ona göre sorgu yazdırıyor

    List<Product> getByProductNameOrCategory_CategoryId(String productName, int categoryId);// or işlemi

    List<Product> getByCategoryIn(List<Integer> categories);

    List<Product> getByProductNameContains(String productName);

    List<Product> getByProductNameStartsWith(String productName);// şu harfle başlayan vs 

    // parametreyi : kullanarak aşağıdan aldırıyorsun 
//    @Query("from Product where productName=:productName and category.categoryId =:categoryId")// select yazmana gerek yok bu hallediyor veritabanı tablosundaki column adına da gerek yok
//    List<Product> getByNameAndCategory(String productName,int categoryId);// sorguyu kendimiz yazacağımızda bunu kullanıyoruz
    @Query("From Product where productName=:productName and category.categoryId=:categoryId")
    List<Product> getByNameAndCategory(String productName, int categoryId);

    // özel bir listeleme yapılacağından dolayı neyi listeleyeceğimizin paket bilgisini new leyerek veriyoruz 
    //ardından nereden nasıl bir join yapacağımızı önce ana tabloyu yazarak belirtiyoruz
    // constructor var onun içini entityne göre dolduracaksın alacağın şeyleri bu entity özelillkerline at demek
    @Query("Select new kodlamaio.northwind.entities.dtos.ProductWithCategoryDto"
            + "(p.id, p.productName, c.categoryName) "
            + "From Category c Inner Join c.products p")
    List<ProductWithCategoryDto> getProductWithCategoryDetails();
}
