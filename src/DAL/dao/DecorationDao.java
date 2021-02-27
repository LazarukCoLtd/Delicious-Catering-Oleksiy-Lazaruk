package DAL.dao;

import BLL.domain.Decoration;

import java.util.List;

public interface DecorationDao extends CrudDao<Integer, Decoration> {

    Decoration findByDescription(String decsription);

    List<Decoration> findByColour(String colour);
}
