package pe.edu.tecsup.tienda.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductoTO {

    Long id;
    CategoriaTO categoria;
    private String nombre;
    private String descripcion;
    private Double precio;
    private Integer stock;
    private String imagen_nombre;
    private String imagen_tipo;
    private Long imagen_tamanio;
    private Integer estado;

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", categortia='" + categoria + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", imagen_nombre='" + imagen_nombre + '\'' +
                ", imagen_tipo='" + imagen_tipo + '\'' +
                ", imagen_tamanio=" + imagen_tamanio +
                ", estado=" + estado +
                "}";

    }

}
