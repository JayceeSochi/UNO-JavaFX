package org.example.unoapp;

public class Card {
    public enum Color {
        Red("Red"),
        Blue("Blue"),
        Yellow("Yellow"),
        Green("Green"),
        Black("Black");

        private String label;

        Color(String label) {
            this.label = label;
        }

        @Override
        public String toString() {
            return label;
        }
    }

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    // Needs Fixing
    @Override
    public String toString() {
        return "Card {" +
                "value=" + value +
                " || color=" + Color.values().toString() + '}';
    }
}