package pers.supermaskv.abstract_factory;

public class WinControlFactory extends ControlFactory{
    @Override
    Button createButton() {
        return new WinButton();
    }

    @Override
    CheckBox createCheckBox() {
        return new WinCheckBox();
    }
}
