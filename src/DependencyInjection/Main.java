package DependencyInjection;

public class Main {
    public static void main(String[] args) {
        // dep inj with email service
        MessageService emailService = new EmailService();
        MessageClient client = new MessageClient(emailService);
        client.processMessage("Hello via Email", "email@example.com");

        // dep inj with sms service
        MessageService smsService = new SmsService();
        client = new MessageClient(smsService);
        client.processMessage("Hello via SMS", "1234567890");
    }

}
