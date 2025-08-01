package component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class TextFieldComponent extends JTextField {

    private String realValue;
    private boolean valueModified = false;

    public TextFieldComponent(String placeholder, int length) {

        super(placeholder, length);
        setForeground(Color.GRAY);

        addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (!valueModified) {
                    setText("");
                    setForeground(Color.BLACK);
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if (getText().isEmpty()) {
                    setText(placeholder);
                    setForeground(Color.GRAY);
                    valueModified = false;
                }  else {
                    realValue = getText();
                    valueModified = true;
                }
            }
        });
    }

    public String getRealValue() {
        return valueModified ? realValue : "";
    }

}
