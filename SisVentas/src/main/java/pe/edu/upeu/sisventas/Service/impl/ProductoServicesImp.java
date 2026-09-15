package pe.edu.upeu.sisventas.Service.impl;

import lombok.RequiredArgsConstructor;
import pe.edu.upeu.sisventas.Service.IProductoService;
import pe.edu.upeu.sisventas.model.Producto;
import pe.edu.upeu.sisventas.repository.ICrudGenericoRepository;
import pe.edu.upeu.sisventas.repository.ProductoRepository;
@RequiredArgsConstructor
public class ProductoServicesImp extends CrudGenericoServiceImp<Producto,Long>implements IProductoService {
    private final ProductoRepository productoRepository;
    @Override
    protected ICrudGenericoRepository<Producto, Long> getRepo() {
        return productoRepository;
    }
}
