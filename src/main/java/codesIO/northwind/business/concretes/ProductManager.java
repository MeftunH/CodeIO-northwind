package codesIO.northwind.business.concretes;

import codesIO.northwind.business.abstracts.ProductService;
import codesIO.northwind.dataAccess.abstracts.ProductDao;
import codesIO.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager implements ProductService {

    private ProductDao productDao;

    public ProductManager(ProductDao productDao) {
        super();
        this.productDao = productDao;
    }

    @Autowired


    @Override
    public List<Product> getAll() {

        return this.productDao.findAll();

    }
}
