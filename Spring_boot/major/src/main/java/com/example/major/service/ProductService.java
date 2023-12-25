package com.example.major.service;

import com.example.major.model.Product;
import com.example.major.repository.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private ProductRepository productRepository;
    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public List<Product> getAllproduct(){
        return productRepository.findAll();
    }
    @Transactional
    public void addProduct(Product product){
        productRepository.save(product);
    }
    public void removeProductBYId(long id){
        productRepository.deleteById(id);
    }
    public Optional<Product> getProudctById(long id){
        return productRepository.findById(id);
    }

    public List<Product> getAllproudctsByCategoryId(int id){
        return productRepository.findAllByCategory_Id(id);
    }
}
