package by.bsuir.management.services.servicesImpl;

import by.bsuir.management.models.Share;
import by.bsuir.management.repository.ShareRepository;
import by.bsuir.management.services.ShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShareServiceImpl implements ShareService {
    @Autowired
    ShareRepository shareRepository;

    @Override
    public Share findById(Long id) {
        return shareRepository.findById(id).get();
    }

    @Override
    public List<Share> findAll() {
        return (shareRepository.findAll());
    }

}
