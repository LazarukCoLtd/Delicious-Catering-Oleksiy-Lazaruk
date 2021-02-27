package DAL.dao;

import BLL.domain.Contact;

public interface ContactDao extends CrudDao<Integer, Contact> {

    Contact findByContactType(String contactType);


}
