package sebastian.lopez.agriculturalManagementPlatform.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorInicio {

    @GetMapping("/")
    public String redirigirAlLogin(){
        return "redirect:/login.xhtml";
    }
}
