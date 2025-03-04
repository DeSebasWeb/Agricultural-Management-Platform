package sebastian.lopez.agriculturalManagementPlatform.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import sebastian.lopez.agriculturalManagementPlatform.modelo.Usuario;
import sebastian.lopez.agriculturalManagementPlatform.repositorio.UsuarioRepositorio;

import java.util.List;

public class UsuarioServivio implements IUsuarioServicio{
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Override
    public List<Usuario> mostrarUsuarios() {
        return usuarioRepositorio.findAll();
    }

    @Override
    public Usuario buscarUsuarioPorCedula(Integer cedula) {
        Usuario usuario = usuarioRepositorio.findByCedula(cedula).orElse(null);
        return usuario;
    }

    @Override
    public Usuario buscarUsuarioPorCorreo(String correo) {
        Usuario usuario = usuarioRepositorio.findByCorreo(correo).orElse(null);
        return usuario;
    }

    @Override
    public Usuario buscarUsuarioPorTelefono(Integer telefono) {
        Usuario usuario = usuarioRepositorio.findByTelefono(telefono).orElse(null);
        return usuario;
    }

    @Override
    public void eliminarUsuario(Usuario usuario) {
        usuarioRepositorio.delete(usuario);
    }

    @Override
    public void guardarUsuario(Usuario usuario) {
        usuarioRepositorio.save(usuario);
    }
}
