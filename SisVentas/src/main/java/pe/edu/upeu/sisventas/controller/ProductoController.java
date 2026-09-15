package pe.edu.upeu.sisventas.controller;

import lombok.RequiredArgsConstructor;
import pe.edu.upeu.sisventas.Service.ICategoriaService;
import pe.edu.upeu.sisventas.Service.IMarcaService;
import pe.edu.upeu.sisventas.Service.IProductoService;
import pe.edu.upeu.sisventas.Service.IUnidadMedidaService;
@RequiredArgsConstructor
public class ProductoController {
    private  final IMarcaService ms;
    private final ICategoriaService cs;
    private final IProductoService PS;
    private final IUnidadMedidaService us;
}
