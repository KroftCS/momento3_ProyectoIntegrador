import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int MAX_INTENTOS = 3;

        // Mismos usuarios de prueba de la base de datos
        Usuario[] usuarios = new Usuario[3];
        usuarios[0] = new Usuario("admin404", "Admin123", "admin");
        usuarios[1] = new Usuario("lauragomez", "Laura123", "cliente");
        usuarios[2] = new Usuario("carlosruiz", "Carlos123", "cliente");

        ValidadorLogin validador = new ValidadorLogin(usuarios);
        Scanner entrada = new Scanner(System.in);

        int intentos = 0;
        Usuario usuarioValido = null;

        System.out.println("=== 404 Shoes - Iniciar sesion ===");

        // Se repite mientras queden intentos y nadie haya entrado
        while (intentos < MAX_INTENTOS && usuarioValido == null) {
            System.out.print("Usuario: ");
            String usuarioIngresado = entrada.nextLine();

            System.out.print("Contrasena: ");
            String contrasenaIngresada = entrada.nextLine();

            usuarioValido = validador.validar(usuarioIngresado, contrasenaIngresada);

            if (usuarioValido == null) {
                intentos++;
                int restantes = MAX_INTENTOS - intentos;
                System.out.println("Usuario o contrasena incorrectos. Intentos restantes: " + restantes);
            }
        }

        if (usuarioValido != null) {
            System.out.println("Bienvenido, " + usuarioValido.getNombreUsuario()
                    + ". Rol: " + usuarioValido.getRol());
        } else {
            System.out.println("Cuenta bloqueada: superaste los " + MAX_INTENTOS + " intentos.");
        }

        entrada.close();
    }
}
