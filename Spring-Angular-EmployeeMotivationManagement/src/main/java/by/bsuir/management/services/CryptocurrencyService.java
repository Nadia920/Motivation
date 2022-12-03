package by.bsuir.management.services;

import by.bsuir.management.models.Cryptocurrency;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CryptocurrencyService {
    Cryptocurrency findById(Long id);
    List<Cryptocurrency> findAll();
}
