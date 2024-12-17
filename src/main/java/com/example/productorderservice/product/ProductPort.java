package com.example.productorderservice.product;

interface ProductPort { //인터페이스 구현은 어댑터에서.
    void save(Product product);
}
