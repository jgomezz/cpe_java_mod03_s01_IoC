package pe.edu.tecsup.ioc;

interface Message {
    void send(String mensaje);
}


class EmailService implements Message{
    @Override
    public void send(String mensaje) {
        System.out.println(mensaje);
    }
}

class Notification {
    private  EmailService emailService;

    Notification(){
        this.emailService = new EmailService();
    }

    public void execute(String message) {
        emailService.send(message);
    }
}


public class Main_IoC {

    public static void main(String[] args) {

        // Fuerte acoplamiento con el servicio de email
        Notification notification = new Notification();

        notification.execute("Hola mundo");

        // ¿Como hacer para enviar una notificacion por Whatsapp?

    }


}
