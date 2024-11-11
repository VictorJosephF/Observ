public class Vendas implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Vendas recebeu a notificação: " + message);
    }
}

