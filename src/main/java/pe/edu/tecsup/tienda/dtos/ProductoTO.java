package pe.edu.tecsup.tienda.dtos;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class ProductoTO {

    private Long id;
    private CategoriaTO categoria;
    @NonNull
    private String nombre;
    private String descripcion;
    @NonNull
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
                ", nombre categortia ='" + categoria.getNombre() + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", imagen_nombre='" + imagen_nombre + '\'' +
                ", imagen_tipo='" + imagen_tipo + '\'' +
                ", imagen_tamanio=" + imagen_tamanio +
                ", estado=" + estado +
                "}";

    }

}
