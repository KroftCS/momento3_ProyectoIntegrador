public class Usuario {

    // Atributos: los datos de cada usuario
    private String nombreUsuario;
    private String contrasena;
    private String rol;

    // Constructor: se ejecuta al crear un objeto con new
    public Usuario(String nombreUsuario, String contrasena, String rol) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.rol = rol;
    }

    // Getters: permiten leer los atributos privados desde otra clase
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getRol() {
        return rol;
    }

    // Devuelve true si el usuario y la contrasena escritos son los de este objeto
    public boolean coincide(String usuarioIngresado, String contrasenaIngresada) {
        return nombreUsuario.equals(usuarioIngresado) && contrasena.equals(contrasenaIngresada);
    }
}
