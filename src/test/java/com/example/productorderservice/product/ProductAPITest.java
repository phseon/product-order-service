package com.example.productorderservice.product;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductAPITest {  //ApiTest 클래스를 상속받아 사용

    //productService에 addProduct 요청을 보내면 productService에서 product를 생성하고 productPort에게 저장하라고 시킴
    //그러면 그 productPort의 구현체인 어댑터에서 이걸 메모리로 저장
    
    @Autowired
    private ProductService productService;
   
    @Test
    void 상품등록() {
        final AddProductRequest request = 상품등록요청_생성();

        //API 요청
    }

    private static AddProductRequest 상품등록요청_생성() {
        final String name = "상품명";
        final int price = 1000;
        final DiscountPolicy discountPolicy = DiscountPolicy.NONE;
        return new AddProductRequest(name, price, discountPolicy);
    }

}
