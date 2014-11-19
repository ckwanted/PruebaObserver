package view;

import model.Document;
import model.Observer;

public class Display extends Observer {
    
    private final Document document;

    public Display(Document document) {
        this.document = document;
        document.addListener(this);
    }

    @Override
    public void changeModel() {
        System.out.println(document.getText());
    }
    
}
