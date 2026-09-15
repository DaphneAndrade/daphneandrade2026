package pe.edu.upeu.sisventas.Service.impl;

import lombok.RequiredArgsConstructor;
import pe.edu.upeu.sisventas.Service.IUnidadMedidaService;
import pe.edu.upeu.sisventas.dto.ComboBoxOption;
import pe.edu.upeu.sisventas.model.UnidMedida;
import pe.edu.upeu.sisventas.repository.ICrudGenericoRepository;
import pe.edu.upeu.sisventas.repository.UnidMedidaRepository;

import java.util.List;
@RequiredArgsConstructor
public class UnidadMedidaServiceImp extends CrudGenericoServiceImp<UnidMedida,Long>
implements IUnidadMedidaService {
   private  final UnidMedidaRepository unidMedidaRepository;
    @Override
    public List<ComboBoxOption> listarCombobox() {
        return List.of();
    }

    @Override
    protected ICrudGenericoRepository<UnidMedida, Long> getRepo() {
        return unidMedidaRepository;
    }
}
