package pe.edu.tecsup.tienda.webs;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public String index(Model model) {

        log.info("Call index()");

        return "productos";
    }

}
