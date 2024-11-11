import java.util.ArrayList;
import java.util.List;

public class ProdutoEstoque implements Estoque {
    private List<Observer> observers;
    private String nomeProduto;
    private boolean emEstoque;

    public ProdutoEstoque(String nomeProduto) {
        this.nomeProduto = nomeProduto;
        this.observers = new ArrayList<>();
        this.emEstoque = false;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void setEmEstoque(boolean emEstoque) {
        this.emEstoque = emEstoque;
        if (emEstoque) {
            notifyObservers("O produto '" + nomeProduto + "' voltou ao estoque.");
        }
    }
}
