package by.bsuir.management.services;

import by.bsuir.management.models.Event;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EventService {
    Event findById(Long id);


    List<Event> findAll();

    boolean save(Event obj);

}
