package sebastian.lopez.agriculturalManagementPlatform.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sebastian.lopez.agriculturalManagementPlatform.modelo.Usuario;

import java.util.Optional;
@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findByCedula(Integer cedula);
    Optional<Usuario> findByCorreo(String correo);
    Optional<Usuario> findByTelefono(Integer telefono);
}
