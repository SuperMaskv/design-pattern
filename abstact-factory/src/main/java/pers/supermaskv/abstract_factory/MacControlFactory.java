package pers.supermaskv.abstract_factory;

public class MacControlFactory extends ControlFactory {
    @Override
    Button createButton() {
        return new MacButton();
    }

    @Override
    CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
