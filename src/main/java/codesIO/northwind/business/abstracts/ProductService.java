package codesIO.northwind.business.abstracts;

import codesIO.northwind.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
}
