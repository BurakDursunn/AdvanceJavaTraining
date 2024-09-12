package DependencyInjection;

public class MessageClient {

    private MessageService messageService;

    // Constructor Injection
    public MessageClient(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String message, String receiver) {
        messageService.sendMessage(message, receiver);
    }
}
