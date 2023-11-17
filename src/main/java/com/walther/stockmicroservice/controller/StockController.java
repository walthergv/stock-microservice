package com.walther.stockmicroservice.controller;

import com.walther.stockmicroservice.entity.StockEntity;
import com.walther.stockmicroservice.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/stocks")
public class StockController {
    @Autowired
    private StockService stockService;

    @RequestMapping("/{code}")
    public boolean stockAvailable(@PathVariable String code) {
        Optional<StockEntity> stock = stockService.findByCode(code);
        stock.orElseThrow(() -> new RuntimeException("Cannot find stock with code " + code));
        return stock.get().getQuantity() > 0;
    }
}
