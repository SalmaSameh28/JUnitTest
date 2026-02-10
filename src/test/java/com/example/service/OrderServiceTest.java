package com.example.service;

import org.example.model.Order;
import org.example.service.OrderService;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class OrderServiceTest {
    OrderService orderService;
    Order order;

    @BeforeAll
    void initInitial(){
        orderService = new OrderService();
    }
    @BeforeEach
    void init(){
        order = new Order(10,5);
    }

    @Test
    void testTotalWithoutDiscount(){

        assertEquals(50,orderService.calculateDiscountedTotal(order));
    }




    @AfterEach
    void tearDown(){
        System.out.println("Test Finished");
    }

    @ParameterizedTest
    @CsvSource({
            "50 , 3 ,135",
            "40 , 3 , 120"
    })
    void testDiscountParametrized(double price, int quantity ,double expected){
        Order order = new Order(price,quantity);
        assertEquals(expected,orderService.calculateDiscountedTotal(order));
    }



}