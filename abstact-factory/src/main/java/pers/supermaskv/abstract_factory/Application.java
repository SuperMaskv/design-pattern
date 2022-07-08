package pers.supermaskv.abstract_factory;

public class Application {
    public static void main(String[] args) {
        // if app is now in windows
        // if u need switch to Mac, u can switch WinControlFactory to MacControlFactory
        ControlFactory factory = new WinControlFactory();
        Button button = factory.createButton();
        CheckBox checkBox = factory.createCheckBox();
        button.print();
        checkBox.print();
    }
}
