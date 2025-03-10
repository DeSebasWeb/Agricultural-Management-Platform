package sebastian.lopez.agriculturalManagementPlatform.controlador;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sebastian.lopez.agriculturalManagementPlatform.modelo.Usuario;
import sebastian.lopez.agriculturalManagementPlatform.servicio.IUsuarioServicio;

import java.io.Serializable;

@Component
@Named
@ViewScoped

public class LoginControlador implements Serializable {
    @Autowired
    IUsuarioServicio usuarioServicio;

    private static final Logger logger = LoggerFactory.getLogger(LoginControlador.class);
    public Usuario usuario = new Usuario();

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String registrarUsuario(){
        Usuario usuarioConfirmacion = usuarioServicio.buscarUsuarioPorCedula(usuario.getCedula());
        if(usuarioConfirmacion != null){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "No se puede registrar el usuario, la cedula ya esta con otro usuario"));
        }
        if (usuario.getNombre() != null && usuario.getApellido() != null && usuario.getCedula()!=null ){
            usuarioServicio.guardarUsuario(usuario);
            logger.info("Usuario guardado: "+usuario.toString());
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Informacion", "Registro guardado"));
            return "iniciar-sesion.xhtml?faces-redirect=true";
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error","No Se puede crear el usuario si no ha puesto los espacios requeridos"));
        }
        return null;
    }

    public String iniciarSesion(){
        Usuario usuarioEncontrado = usuarioServicio.buscarUsuarioPorCorreo(usuario.getCorreo());
        if (usuarioEncontrado!=null) {
            if (usuarioEncontrado.getPassword().equals(usuario.getPassword())) {
                return "home.xhtml?faces-redirect=true";
            }else{
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "No corresponde la contraseña", "La contraseña que introduce no es la correcta"));
            }
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "No existe el usuario", "El correo no esta registrado, registrelo y intentelo nuevamente"));
        }
        return null;
    }
}
