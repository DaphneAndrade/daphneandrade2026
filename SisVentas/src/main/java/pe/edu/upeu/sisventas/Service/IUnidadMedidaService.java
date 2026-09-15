package pe.edu.upeu.sisventas.Service;

import pe.edu.upeu.sisventas.dto.ComboBoxOption;
import pe.edu.upeu.sisventas.model.UnidMedida;

import java.util.List;

public interface IUnidadMedidaService extends ICrudGenericoService<UnidMedida, Long> {
List<ComboBoxOption>listarCombobox();
}
