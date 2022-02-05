package codesIO.northwind.api;

import codesIO.northwind.business.abstracts.ProductService;
import codesIO.northwind.core.utilities.results.DataResult;
import codesIO.northwind.core.utilities.results.Result;
import codesIO.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductsController {

    private ProductService productService;

    @Autowired
    public ProductsController(ProductService productService) {
        super();
        this.productService = productService;
    }

    @GetMapping("/getAll")
    public DataResult<List<Product>> getAll() {
        return this.productService.getAll();
    }

    @PostMapping("/add")
    public Result addProduct(Product product) {
        return new Result(true, "Product added successfully");
    }
}
