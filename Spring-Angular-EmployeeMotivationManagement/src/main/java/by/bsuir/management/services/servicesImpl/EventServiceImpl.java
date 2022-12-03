package by.bsuir.management.services.servicesImpl;

import by.bsuir.management.models.Event;
import by.bsuir.management.repository.EventRepository;
import by.bsuir.management.services.EventService;
import by.bsuir.management.services.TypeFinancialMotivationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {
    @Autowired
    EventRepository eventRepository;

    @Autowired
    TypeFinancialMotivationService typeFinancialMotivationService;

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
        obj.setTypeFinancialMotivation(typeFinancialMotivationService.findById(obj.getTypeFinancialMotivation().getId()));
        Event a = eventRepository.save(obj);
        if (a == null) {
            return false;
        } else {
            return true;
        }
    }


}
