public class Compras implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Compras recebeu a notificação: " + message);
    }
}