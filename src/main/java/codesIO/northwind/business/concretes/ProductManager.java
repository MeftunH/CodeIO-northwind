package codesIO.northwind.business.concretes;

import codesIO.northwind.business.abstracts.ProductService;
import codesIO.northwind.core.utilities.results.DataResult;
import codesIO.northwind.core.utilities.results.SuccessDataResult;
import codesIO.northwind.dataAccess.abstracts.ProductDao;
import codesIO.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager implements ProductService {

    private ProductDao productDao;

    @Autowired
    public ProductManager(ProductDao productDao) {
        super();
        this.productDao = productDao;
    }

    @Override
    public DataResult<List<Product>> getAll() {

        return new SuccessDataResult<List<Product>>(
                this.productDao.findAll(),"Data listed"
        );

    }
}
