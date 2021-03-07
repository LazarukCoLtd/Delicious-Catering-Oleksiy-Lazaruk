package DAL.dao;

import BLL.domain.Client;

import java.util.List;

public interface ClientDao extends CrudDao<Integer, Client> {

    Client findByIDNumber(String idNumber);

    List<Client> findByFirstAndLastName(String firstName, String LastName);

    Client findByUsernameAndPassword(String username, String password);
}
