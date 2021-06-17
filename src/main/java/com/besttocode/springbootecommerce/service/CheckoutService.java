package com.besttocode.springbootecommerce.service;

import com.besttocode.springbootecommerce.dto.Purchase;
import com.besttocode.springbootecommerce.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
