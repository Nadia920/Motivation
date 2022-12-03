package by.bsuir.management.services;

import by.bsuir.management.models.Share;

import java.util.List;

public interface ShareService {
    Share findById(Long id);
    List<Share> findAll();
}
