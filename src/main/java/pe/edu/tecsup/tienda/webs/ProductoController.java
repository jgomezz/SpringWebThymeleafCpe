package pe.edu.tecsup.tienda.webs;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class ProductoController {

    @GetMapping("")
    public String home (){
        return "Hello world again..!";
    }

}
