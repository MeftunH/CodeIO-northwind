package codesIO.northwind.business.abstracts;

import codesIO.northwind.core.utilities.results.DataResult;
import codesIO.northwind.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    DataResult<List<Product>> getAll();
}
