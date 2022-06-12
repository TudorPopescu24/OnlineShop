package com.example.onlineshop.controller;

import com.example.onlineshop.model.Purchase;
import com.example.onlineshop.model.User;
import com.example.onlineshop.security.UserPrinciple;
import com.example.onlineshop.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/purchase")
public class PurchaseController {
    @Autowired
    private PurchaseService purchaseService;

    @PostMapping
    public ResponseEntity<?> savePurchase(@RequestBody Purchase purchase) {
        return new ResponseEntity<>(purchaseService.savePurchase(purchase), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?> getAllPurchasesOfUser(@AuthenticationPrincipal UserPrinciple userPrinciple) {
        return ResponseEntity.ok(purchaseService.findPurchaseItemsOfUser(userPrinciple.getId()));
    }
}
