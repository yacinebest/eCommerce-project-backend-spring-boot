package com.besttocode.springbootecommerce.controller;

import com.besttocode.springbootecommerce.dto.Purchase;
import com.besttocode.springbootecommerce.dto.PurchaseResponse;
import com.besttocode.springbootecommerce.service.CheckoutService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin({"http://localhost:4200","http://localhost:80",
            "http://ecommerce-angular-frontend","http://ecommerce-angular-frontend:4200","http://ecommerce-angular-frontend:80"})
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {

        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);

        return purchaseResponse;
    }

}