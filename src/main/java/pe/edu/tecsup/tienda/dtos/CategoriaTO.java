package pe.edu.tecsup.tienda.dtos;

import java.util.ArrayList;
import java.util.List;

public class CategoriaTO {

    private Long id;
    private String nombre;
    private Integer orden;
    private List<ProductoTO> productos = new ArrayList<>();

    @Override
    public String toString() {
        return "Categoria{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", orden=" + orden +
                '}';
    }
}
