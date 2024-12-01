package pe.edu.tecsup.tienda.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
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
