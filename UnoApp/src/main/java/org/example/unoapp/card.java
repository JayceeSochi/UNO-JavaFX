/**
 * @author ggarcia
 * @createdOn 1/23/2025 at 3:03 PM
 * @projectName UnoApp
 * @packageName org.example.unoapp;
 */
package org.example.unoapp;

public class card {
    int value;
    colors color;
    public card(int value, colors color) {
        setColor(color);
        setValue(value);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public colors getColor() {
        return color;
    }

    public void setColor(colors color) {
        this.color = color;
    }
}
