package com.walther.stockmicroservice.service;

import com.walther.stockmicroservice.entity.StockEntity;

import java.util.Optional;

public interface StockService {
    Optional<StockEntity> findByCode(String code);
}
