package pe.edu.tecsup;

class EmailService {
    void sendEmail(String mensaje) {
        System.out.println(mensaje);
    }
}

class Notification {
    private  EmailService emailService;

    Notification(){
        this.emailService = new EmailService();
    }

    void execute(String message) {
        emailService.sendEmail(message);
    }
}

public class Main {

    public static void main(String[] args) {

        Notification notification = new Notification();
        notification.execute("Hola mundo");

    }
}