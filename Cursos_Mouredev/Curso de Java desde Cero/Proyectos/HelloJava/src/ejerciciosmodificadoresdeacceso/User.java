package ejerciciosmodificadoresdeacceso;

public class User {
    private String username;
    private String password;

    public User() {

    }

    public User(String username, String password) {
        setUsername(username);
        setPassword(password);
    }

    public String setUsername(String username) {
        this.username = username;
        return username;
    }

    public String setPassword(String password){
        this.password = password;
        return password;
    }

    public String checkPassword(String contrasenia){
        if(contrasenia.equals(setPassword(password)))  {
            System.out.println("Las contraseñas coinciden");
        } else {
            System.out.println("Las contraseñas no coinciden");
        }
        return contrasenia;
    }
}
