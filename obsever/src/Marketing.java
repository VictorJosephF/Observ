public class Marketing implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Marketing recebeu a notificação: " + message);
    }
}