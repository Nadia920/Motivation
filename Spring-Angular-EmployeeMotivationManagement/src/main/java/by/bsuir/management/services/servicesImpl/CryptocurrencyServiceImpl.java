package by.bsuir.management.services.servicesImpl;

import by.bsuir.management.models.Cryptocurrency;
import by.bsuir.management.repository.CryptocurrencyRepository;
import by.bsuir.management.services.CryptocurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CryptocurrencyServiceImpl implements CryptocurrencyService {
    @Autowired
    CryptocurrencyRepository cryptocurrencyRepository;

    @Override
    public Cryptocurrency findById(Long id) {
        return cryptocurrencyRepository.findById(id).get();
    }

    @Override
    public List<Cryptocurrency> findAll() {
        return (cryptocurrencyRepository.findAll());
    }

}
