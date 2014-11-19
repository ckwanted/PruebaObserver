package model;

public class Document extends Observable {
    
    private String text;

    public Document() {
        text = "";
    }

    public Document(String text) {
        this.text = text;
    }
    
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        notifyObservers();
    }

    @Override
    public void addListener(Observer observer) {
        observers.add(observer);
    }
    
}
