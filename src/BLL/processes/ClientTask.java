package BLL.processes;

import BLL.domain.Client;
import BLL.util.BusinessRuleViolationException;
import DAL.dao.ClientDao;
import DAL.impl.ClientDaoImpl;

import java.util.List;

public class ClientTask {

    private final ClientDao clientDao = new ClientDaoImpl();

    public Client createNewClient(Client client) {
        Client clientFromDb = clientDao.findByIDNumber(client.getIDNumber());
        if (clientFromDb == null) {
            return clientDao.insert(client);
        } else {
            throw new BusinessRuleViolationException(
                    "System cannot complete request. A client with those credentials already exits.");
        }
    }

    public Client UpdateClient(Client updateClient) {
        Client client = clientDao.findByPrimaryId(updateClient.getPrimaryId());
        if (client != null) {
            client = updateClient;
            return clientDao.save(client);
        } else {
            throw new BusinessRuleViolationException("System cannot complete request. No such client exists.");
        }
    }

    public boolean deleteClient(Client deleteClient) {
        return clientDao.delete(deleteClient);
    }

    public List<Client> findAllClients() {
        return clientDao.findAll();
    }

    public List<Client> findClient(String firstName, String lastName) {
        if (!firstName.isEmpty() && !lastName.isEmpty()) {
            return clientDao.findByFirstAndLastName(firstName, lastName);
        } else {
            throw new BusinessRuleViolationException("Oops... Something went wrong! Please try again.");
        }
    }
}
