package com.example.productorderservice.product;

import org.springframework.stereotype.Component;

@Component
class ProductAdapter implements ProductPort {
    private final ProductRepository productRepository;

    ProductAdapter(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void save(final Product product) { //어댑터
        productRepository.save(product);
    }
}
