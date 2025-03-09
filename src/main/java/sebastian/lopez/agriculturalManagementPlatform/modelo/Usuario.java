package sebastian.lopez.agriculturalManagementPlatform.modelo;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idUsuario;
    String nombre;
    String apellido;
    String username;
    String password;
    String correo;
    Integer telefono;
    Integer cedula;
//    El atributo rol se refiere a si es productor y quiere vender sus productos y si es consumidor que quiera ver o contactar con los productores
    String rol;
    String Direccion;
//El atributo estado se refiere a si es una cuenta activa/inactiva 1 para activa y 0 para inactiva
    Integer estado;
    String descripcionProductos;

    public Usuario(Integer idUsuario, String nombre, String apellido, String username, String password, String correo, Integer telefono, Integer cedula, String rol, String direccion, Integer estado, String descripcionProductos) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.username = username;
        this.password = password;
        this.correo = correo;
        this.telefono = telefono;
        this.cedula = cedula;
        this.rol = rol;
        Direccion = direccion;
        this.estado = estado;
        this.descripcionProductos = descripcionProductos;
    }

    public Usuario() {
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public String getDescripcionProductos() {
        return descripcionProductos;
    }

    public void setDescripcionProductos(String descripcionProductos) {
        this.descripcionProductos = descripcionProductos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(idUsuario, usuario.idUsuario) && Objects.equals(nombre, usuario.nombre) && Objects.equals(apellido, usuario.apellido) && Objects.equals(username, usuario.username) && Objects.equals(password, usuario.password) && Objects.equals(correo, usuario.correo) && Objects.equals(telefono, usuario.telefono) && Objects.equals(cedula, usuario.cedula) && Objects.equals(rol, usuario.rol) && Objects.equals(Direccion, usuario.Direccion) && Objects.equals(estado, usuario.estado) && Objects.equals(descripcionProductos, usuario.descripcionProductos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsuario, nombre, apellido, username, password, correo, telefono, cedula, rol, Direccion, estado, descripcionProductos);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono=" + telefono +
                ", cedula=" + cedula +
                ", rol='" + rol + '\'' +
                ", Direccion='" + Direccion + '\'' +
                ", estado=" + estado +
                ", descripcionProductos='" + descripcionProductos + '\'' +
                '}';
    }
}
