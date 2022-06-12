package com.example.onlineshop.service;

import com.example.onlineshop.model.Purchase;
import com.example.onlineshop.repository.projection.PurchaseItem;

import java.util.List;

public interface PurchaseServiceInterface {
    Purchase savePurchase(Purchase purchase);

    List<PurchaseItem> findPurchaseItemsOfUser(Long userId);
}
