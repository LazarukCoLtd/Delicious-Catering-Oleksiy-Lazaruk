package BLL.processes;

import BLL.domain.Event;
import BLL.domain.Statuses;
import BLL.util.BusinessRuleViolationException;
import DAL.dao.EventDao;
import DAL.impl.EventDaoImpl;

public class EventTask {

    private final EventDao eventDao = new EventDaoImpl();

    public Event createNewEvent(Event event) {
        Integer eventCount = eventDao.countByDate(event.getEventDate());
        if (eventCount.equals(0)) {
            return eventDao.save(event);
        } else {
            throw new BusinessRuleViolationException("System cannot complete request." +
                    " This event is conflicting with another event.");
        }
    }


    public Event updateExistingEvent(Event updateEvent) {
        Event event = eventDao.findByPrimaryId(updateEvent.getId());
        if (event != null) {
            event = updateEvent;
            return eventDao.save(event);
        } else {
            throw new BusinessRuleViolationException("System cannot complete request." +
                    "Event you are trying to update doesn't exist.");
        }
    }

    public void confirmEvent(Event event) {
        event = eventDao.findByPrimaryId(event.getId());
        if (event.getEventStatus() == Statuses.UNCONFIRMED) {
            event.setEventStatus(Statuses.CONFIRMED);
            eventDao.save(event);
        }
    }

    public void cancelEvent(Event event) {
        event = eventDao.findByPrimaryId(event.getId());
        if (event.getEventStatus() != Statuses.CANCELLED) {
            event.setEventStatus(Statuses.CANCELLED);
            eventDao.save(event);
        }
    }
}
