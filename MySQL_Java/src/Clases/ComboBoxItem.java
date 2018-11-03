package Clases;

public class ComboBoxItem {
    public String text;
    public int valor;
    
    public ComboBoxItem()
    {
        this.text = "";
        this.valor = 0;
    }

    @Override
    public String toString() {
        return text;
    }
}
