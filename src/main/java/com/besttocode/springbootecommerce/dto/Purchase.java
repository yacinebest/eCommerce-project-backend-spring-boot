package com.besttocode.springbootecommerce.dto;

import com.besttocode.springbootecommerce.entity.Address;
import com.besttocode.springbootecommerce.entity.Customer;
import com.besttocode.springbootecommerce.entity.Order;
import com.besttocode.springbootecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}