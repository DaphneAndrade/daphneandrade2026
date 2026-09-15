package pe.edu.upeu.sisventas.Service.impl;

import lombok.RequiredArgsConstructor;
import pe.edu.upeu.sisventas.Service.IMarcaService;
import pe.edu.upeu.sisventas.model.Marca;
import pe.edu.upeu.sisventas.repository.ICrudGenericoRepository;
import pe.edu.upeu.sisventas.repository.MarcaRepository;

public class MarcaServisimp {
    @RequiredArgsConstructor
    public static class MarcaServiceImp extends CrudGenericoServiceImp<Marca, Long>
            implements IMarcaService {

        private final MarcaRepository marcaRepository;
        @Override
        protected ICrudGenericoRepository<Marca, Long> getRepo() {
            return marcaRepository;
        }
    }

}
