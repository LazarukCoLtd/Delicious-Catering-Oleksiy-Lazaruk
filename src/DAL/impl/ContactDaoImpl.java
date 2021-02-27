package DAL.impl;

import BLL.domain.Contact;
import DAL.dao.ContactDao;

public class ContactDaoImpl extends CrudDaoImpl<Integer, Contact> implements ContactDao {

    @Override
    public Contact findByContactType(String contactType) {
        return null;
    }
}
