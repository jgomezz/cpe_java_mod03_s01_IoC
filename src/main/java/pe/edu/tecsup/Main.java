package pe.edu.tecsup;

class EmailService {
    void sendEmail(String mensaje) {
        System.out.println(mensaje);
    }
}

public class Main {

    private  EmailService emailService;

    Main(){
        this.emailService = new EmailService();
    }

    public static void main(String[] args) {
        Main main = new Main();

        main.emailService.sendEmail("Hola mundo");
    }
}