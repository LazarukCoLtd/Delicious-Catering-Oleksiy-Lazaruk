package DAL.dao;

import BLL.domain.Event;

import java.time.LocalDate;
import java.util.List;

public interface EventDao extends CrudDao<Integer, Event> {

    List<Event> findByDate(LocalDate date);

    List<Event> findByTheme(String theme);

    Integer countByDate(LocalDate date);

    Integer countByTheme(String theme);
}
