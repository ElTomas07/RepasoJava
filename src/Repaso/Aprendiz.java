package Repaso;

public class Aprendiz {

    private int cedula;
    private String nombre;
    private String apellido;
    private String email;
    private String celular;

    public Aprendiz(){
        System.out.println("Este es el constructor vacio de la clase que se crea por defecto");
    }

    public Aprendiz(String nombreAprendiz) {
        this.nombre= nombreAprendiz;
    }
    public Aprendiz(Integer cedulaAprendiz) {
        this.cedula= cedulaAprendiz;
    }

    public Aprendiz(int pcedula, String pnombre, String papellido, String pemail, String pcelular){
        this.cedula = pcedula;
        this.nombre = pnombre;
        this.apellido = papellido;
        this.email = pemail;
        this.celular = pcelular;
    }

    public static void main(String[] args) {
        Aprendiz Ximena = new Aprendiz();
        Aprendiz Santiago = new Aprendiz();
        Aprendiz Jorge = new Aprendiz();

        Aprendiz Erik = new Aprendiz ("Erik");
        Aprendiz Mauricio = new Aprendiz(1092456103);

        Aprendiz Tatiana = new Aprendiz(123, "Tatiana", "Gutierrez", "tg2728@gmail.com", "3186155811");

        Ximena.nombre = "Ximena";
        Ximena.apellido = "Ramirez";

        Santiago.nombre = "Santiago";
        Santiago.apellido = "Rojas";

        Jorge.nombre = "Jorge";
        Jorge.apellido = "Palacio";

        System.out.println("Este es el objeto aprendiz Ximena" + Ximena.toString());
        System.out.println("Este es el objeto aprendiz Santiago" + Santiago.toString());
        System.out.println("Este es el objeto aprendiz Jorge" + Jorge.toString());
    }

    @Override
    public String toString() {
        return "Aprendiz{" +
                "cedula=" + cedula +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", celular='" + celular + '\'' +
                '}';
    }
}
