package pe.edu.tecsup;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


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