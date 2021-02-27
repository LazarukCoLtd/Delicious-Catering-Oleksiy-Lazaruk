package DAL.impl;

import BLL.domain.Event;
import DAL.dao.EventDao;

import java.time.LocalDate;
import java.util.List;

public class EventDaoImpl extends CrudDaoImpl<Integer, Event> implements EventDao {


    @Override
    public List<Event> findByDate(LocalDate date) {
        return null;
    }

    @Override
    public List<Event> findByTheme(String theme) {
        return null;
    }

    @Override
    public Integer countByDate(LocalDate date) {
        return null;
    }

    @Override
    public Integer countByTheme(String theme) {
        return null;
    }
}
