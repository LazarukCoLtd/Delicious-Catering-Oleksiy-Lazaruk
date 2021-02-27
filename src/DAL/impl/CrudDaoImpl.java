package DAL.impl;

import DAL.dao.CrudDao;

import java.util.List;

abstract class CrudDaoImpl<P, M> implements CrudDao<P, M> {

    public M save(M entity) {
        //TODO        execute save
        return entity;
    }

    public boolean delete(M entity) {
        //TODO        execute delete
        return true;
    }

    //save a new entity
    public M insert(M entity) {
        //TODO        execute insert

        return entity;
    }

    //find entity by id
    public M findByPrimaryId(P primaryId) {
        //TODO        execute findById
//        need to get to database.
        return null;
    }

    //find all instances of
    public List<M> findAll() {
        //TODO       execute findall
//        explicit parse to list<M>
        return null;
    }
}
