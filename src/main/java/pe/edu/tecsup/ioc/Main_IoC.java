package pe.edu.tecsup.ioc;

interface Message {
    void send(String mensaje);
}

class EmailService implements Message{
    @Override
    public void send(String mensaje) {
        System.out.println("[Email] -> " + mensaje);
    }
}

class WhatsAppService implements Message{
    @Override
    public void send(String mensaje) {
        System.out.println("[WhatsApp] -> " + mensaje);
    }
}



class Notification {
    //private  EmailService emailService;
    private Message message;

    Notification(Message message){
        // Inversion de control
       // this.emailService = new EmailService();
        this.message = message;
    }

    public void execute(String msg) {
        this.message.send(msg);
    }
}


public class Main_IoC {

    public static void main(String[] args) {

        // ¿Como hacer para enviar una notificacion por Whatsapp?

        Message service = new WhatsAppService(); // new EmailService();
        Notification notification = new Notification(service);

        notification.execute("Hola mundo");


    }


}
