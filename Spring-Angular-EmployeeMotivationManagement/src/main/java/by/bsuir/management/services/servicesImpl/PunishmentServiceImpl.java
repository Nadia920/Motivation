package by.bsuir.management.services.servicesImpl;

import by.bsuir.management.models.Punishment;
import by.bsuir.management.repository.PunishmentRepository;
import by.bsuir.management.services.PunishmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PunishmentServiceImpl implements PunishmentService {
    @Autowired
    PunishmentRepository punishmentRepository;

    @Override
    public Punishment findById(Long id) {
        return punishmentRepository.findById(id).get();
    }

    @Override
    public List<Punishment> findAll() {
        return (punishmentRepository.findAll());
    }

}
