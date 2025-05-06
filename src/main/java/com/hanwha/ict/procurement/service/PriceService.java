package com.hanwha.ict.procurement.service;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PriceService {

    @Cacheable(value = "price", key = "#productId")
    public String getPrice(Long productId) {
        simulateSlowQuery(); // 의도적 지연
        return "Price for product " + productId;
    }

    private void simulateSlowQuery() {
        try {
            Thread.sleep(500); // 0.5초 지연
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
