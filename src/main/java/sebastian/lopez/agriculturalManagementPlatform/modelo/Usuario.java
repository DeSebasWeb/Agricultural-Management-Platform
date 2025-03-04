package sebastian.lopez.agriculturalManagementPlatform.modelo;

import jakarta.persistence.*;
import lombok.*;

@Entity

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
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
}
