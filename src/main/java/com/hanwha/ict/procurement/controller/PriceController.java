package com.hanwha.ict.procurement.controller;

import com.hanwha.ict.procurement.service.PriceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test")
@RequiredArgsConstructor
@Slf4j
public class PriceController {

    private final PriceService priceService;

    @GetMapping("/{id}")
    public String getPrice(@PathVariable Long id) {
        long start = System.currentTimeMillis();
        String result = priceService.getPrice(id);
        long end = System.currentTimeMillis();
        long duration = end - start;

        log.info("📌 단가 조회 요청 - 상품 ID: {} | 응답 시간: {}ms", id, duration);
        return "Result: " + result + " | Response time: " + duration + "ms";
    }
}