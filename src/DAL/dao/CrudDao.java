package DAL.dao;

import java.util.List;

public interface CrudDao<P, M> {
    //save an already existing entity
    M save(M entity);

    //delete an already existing entity
    boolean delete(M entity);

    //save a new entity
    M insert(M entity);

    //find entity by id
    M findByPrimaryId(P primaryId);

    //find all instances of
    List<M> findAll();
}
