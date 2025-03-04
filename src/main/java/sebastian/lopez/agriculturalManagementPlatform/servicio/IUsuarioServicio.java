package sebastian.lopez.agriculturalManagementPlatform.servicio;

import sebastian.lopez.agriculturalManagementPlatform.modelo.Usuario;

import java.util.List;

public interface IUsuarioServicio {
    public List<Usuario> mostrarUsuarios();

    public Usuario buscarUsuarioPorCedula(Integer cedula);

    public Usuario buscarUsuarioPorCorreo(String correo);

    public Usuario buscarUsuarioPorTelefono(Integer telefono);

    public void eliminarUsuario(Usuario usuario);

    public void guardarUsuario(Usuario usuario);
}
