package DAL.impl;

import BLL.domain.Client;
import DAL.dao.ClientDao;

import java.util.List;

public class ClientDaoImpl extends CrudDaoImpl<Integer,Client> implements ClientDao {

    @Override
    public Client findByIDNumber(String idNumber) {
//        TODO find the client by idNumber
        return new Client();
    }

    @Override
    public List<Client> findByFirstAndLastName(String firstName, String LastName) {
        return null;
    }
}
