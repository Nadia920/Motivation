package by.bsuir.management.services;

import by.bsuir.management.models.Punishment;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PunishmentService {
    Punishment findById(Long id);
    List<Punishment> findAll();
}
