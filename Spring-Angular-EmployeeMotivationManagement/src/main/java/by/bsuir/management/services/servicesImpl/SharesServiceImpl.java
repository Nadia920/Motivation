package by.bsuir.management.services.servicesImpl;

import by.bsuir.management.models.Shares;
import by.bsuir.management.repository.SharesRepository;
import by.bsuir.management.services.SharesService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SharesServiceImpl implements SharesService {
    @Autowired
    SharesRepository sharesRepository;

    @Override
    public Shares findById(Long id) {
        return sharesRepository.findById(id).get();
    }

    @Override
    public List<Shares> findAll() {
        return (sharesRepository.findAll());
    }

}
