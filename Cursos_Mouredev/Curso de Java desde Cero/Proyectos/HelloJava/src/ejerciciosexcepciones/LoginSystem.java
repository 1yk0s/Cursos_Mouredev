package ejerciciosexcepciones;

public class LoginSystem {
    private String user;
    private String pass;

    public LoginSystem(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public void checkUser(String usuario, String pass) throws Credenciales {
        if(usuario != this.user || pass != this.pass) {
            throw new Credenciales("Usuario o contraseña incorrectos");
        } else {
            System.out.println("Acceso garantizado");
        }
    }
}
