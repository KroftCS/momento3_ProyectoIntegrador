public class ValidadorLogin {

    // Vector con los usuarios registrados
    private Usuario[] usuarios;

    public ValidadorLogin(Usuario[] usuarios) {
        this.usuarios = usuarios;
    }

    // Recorre el vector: devuelve el usuario si coincide, o null si ninguno coincide
    public Usuario validar(String usuarioIngresado, String contrasenaIngresada) {
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i].coincide(usuarioIngresado, contrasenaIngresada)) {
                return usuarios[i];
            }
        }
        return null;
    }
}