package pe.edu.tecsup.tienda.webs;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.tecsup.tienda.dtos.ProductoTO;
import pe.edu.tecsup.tienda.dtos.UsuarioTO;

import java.util.ArrayList;
import java.util.List;


@Slf4j
@Controller
public class ProductoController {

    @GetMapping("")
    public String home (){
        //return "Hello world again again..!";
        return "home";
    }

    /**
     * Crear una peticion GET "/manager" y qye me redireccione a la
     * plantilla manager.html
     */

    /**
     *
     * @param model
     * @return
     */
    @GetMapping("/productos")
    public String obtenerProductos(Model model) {

        log.info("Call index()");

        // Adicionar mensaje al modelo
        String mensaje = "Hola a todos!";
        model.addAttribute("mensaje", mensaje);

        // Adicionar lista de productos al modelo
        List<ProductoTO> productos = new ArrayList<>();
        productos.add(new ProductoTO("IPhone", 2000.0));
        productos.add(new ProductoTO("Galaxy", 2500.0));
        productos.add(new ProductoTO("Huawei", 1600.0));
        productos.add(new ProductoTO("Xiaomi", 1200.1));
        model.addAttribute("productos", productos);

        return "productos";
    }

    @GetMapping("/usuarios")
    public String obtenerUsuarios(Model model) {

        log.info("Call obtenerUsuarios()");

        // Adicionar lista de usuarios al modelo
        List<UsuarioTO> usuarios = new ArrayList<>();
        usuarios.add(new UsuarioTO(1L, "Alberto","Perez",24));
        usuarios.add(new UsuarioTO(2L, "Pedro","Flores",22));
        usuarios.add(new UsuarioTO(3L, "Elizabetn","Garcia",24));
        usuarios.add(new UsuarioTO(4L, "Carmen","Pariona",28));
        model.addAttribute("usuarios", usuarios);

        return "usuarios";
    }

}
