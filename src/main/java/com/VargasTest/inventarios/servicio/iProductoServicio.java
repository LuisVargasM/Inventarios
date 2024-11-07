package com.VargasTest.inventarios.servicio;

import com.VargasTest.inventarios.modelo.Producto;

import java.util.List;

public interface iProductoServicio {
    public List<Producto> listarProductos();

    public Producto buscarProductoPorId(Integer idProducto);

    public Producto guardarProducto(Producto producto);

    public void eliminarProductoPorId(Integer idProducto);
}
