import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class MessageQueue {
    private final BlockingQueue<String> messages = new LinkedBlockingQueue<>();

    public void putMessage(String message) throws InterruptedException {
        messages.put(message);
    }

    public String getMessage() throws InterruptedException {
        return messages.take();
    }
}

class Sender extends Thread {
    MessageQueue queue;

    public Sender(MessageQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            queue.putMessage("Hello from sender Thread");
            System.out.println("Sender : Sending message...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Receiver extends Thread {
    MessageQueue queue;

    public Receiver(MessageQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            System.out.println("Received : " + queue.getMessage());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Exp12 {
    public static void main(String[] args) throws InterruptedException {
        MessageQueue queue = new MessageQueue();
        Sender sender = new Sender(queue);
        Receiver receiver = new Receiver(queue);

        sender.start();
        Thread.sleep(3000);
        receiver.start();
    }
}
