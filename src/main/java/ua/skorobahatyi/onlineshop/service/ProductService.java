package ua.skorobahatyi.onlineshop.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ua.skorobahatyi.onlineshop.entity.Product;
import ua.skorobahatyi.onlineshop.repository.ProductRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
}
