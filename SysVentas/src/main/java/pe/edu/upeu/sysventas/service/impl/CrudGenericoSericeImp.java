package pe.edu.upeu.sysventas.service.impl;

import pe.edu.upeu.sysventas.exception.ModelNotFonudException;
import pe.edu.upeu.sysventas.repository.ICrudGenericoRepository;
import pe.edu.upeu.sysventas.service.ICrudGenericoService;

import java.util.List;

public abstract class CrudGenericoSericeImp<T, ID> implements ICrudGenericoService<T, ID> {
    protected abstract ICrudGenericoRepository<T,ID> getRepo();

    @Override
    public T save(T t) {
        return getRepo().save(t);
    }

    @Override
    public T update(ID id, T t) {
        if(!getRepo().existsById(id)){
            throw new ModelNotFonudException("Id no existe "+id);
        }
        return getRepo().save(t);
    }

    @Override
    public List<T> findAll() {
        return getRepo().findAll();
    }

    @Override
    public T findByID(ID id) {
        return getRepo().findById(id).orElseThrow(()->new ModelNotFonudException("ID no existe:"+id));
    }

    @Override
    public void delete(ID id) {
        if(!getRepo().existsById(id)){
            throw new ModelNotFonudException("Id no existe "+id);
        }
        getRepo().deleteById(id);
    }
}
