package com.hanwha.ict.procurement.controller;

import com.hanwha.ict.procurement.service.PriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
@RequiredArgsConstructor
public class PriceController {

    private final PriceService priceService;

    @GetMapping("/{id}")
    public String getPrice(@PathVariable Long id) {
        long start = System.currentTimeMillis();
        String result = priceService.getPrice(id);
        long end = System.currentTimeMillis();
        return "Result: " + result + " | Response time: " + (end - start) + "ms";
    }
}