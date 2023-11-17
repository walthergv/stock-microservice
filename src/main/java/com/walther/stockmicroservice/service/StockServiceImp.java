package com.walther.stockmicroservice.service;

import com.walther.stockmicroservice.entity.StockEntity;
import com.walther.stockmicroservice.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StockServiceImp implements StockService{
    @Autowired
    private StockRepository stockRepository;
    @Override
    public Optional<StockEntity> findByCode(String code) {
        return stockRepository.findByCode(code);
    }
}
