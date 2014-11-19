package Aplication;

import model.Document;
import view.Display;

public class Main {

    public static void main(String[] args) {
        
        Document document = new Document();
        
        Display display1 = new Display(document);
        document.setText("Hola Mundo");
        Display display2 = new Display(document);
        document.setText(document.getText() + ", ¿que tal estas?");
        
        
    }
    
}
