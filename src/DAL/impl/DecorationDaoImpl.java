package DAL.impl;

import BLL.domain.Decoration;
import DAL.dao.DecorationDao;

import java.util.List;

public class DecorationDaoImpl extends CrudDaoImpl<Integer, Decoration> implements DecorationDao {

    @Override
    public Decoration findByDescription(String decsription) {
        return null;
    }

    @Override
    public List<Decoration> findByColour(String colour) {
        return null;
    }
}
