package by.bsuir.management.services.servicesImpl;

import by.bsuir.management.models.Event;
import by.bsuir.management.repository.EventRepository;
import by.bsuir.management.services.EventService;
import by.bsuir.management.services.TypesFinancialMotivationService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EventServiceImpl implements EventService {
    @Autowired
    EventRepository eventRepository;

    @Autowired
    TypesFinancialMotivationService typesFinancialMotivationService;

    @Override
    public Event findById(Long id) {
        return eventRepository.findById(id).get();
    }

    @Override
    public List<Event> findAll() {
        return (eventRepository.findAll());
    }

    @Override
    public boolean save(Event obj) {
        obj.setTypesFinancialMotivation(typesFinancialMotivationService.findById(obj.getTypesFinancialMotivation().getId()));
        Event a = eventRepository.save(obj);
        if (a == null) {
            return false;
        } else {
            return true;
        }
    }


}
