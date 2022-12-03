package by.bsuir.management.services;

import by.bsuir.management.models.Shares;

import java.util.List;

public interface SharesService {
    Shares findById(Long id);
    List<Shares> findAll();
}
