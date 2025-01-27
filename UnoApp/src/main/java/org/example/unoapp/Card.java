package org.example.unoapp;

public class Card {
    public enum Color {
        Red("Red"),
        Blue("Blue"),
        Yellow("Yellow"),
        Green("Green"),
        Black("Black");

        /*
        0 = 0
        1 = 1
        2 = 2
        3 = 3
        4 = 4
        5 = 5
        6 = 6
        7 = 7
        8 = 8
        9 = 9
        10 = Skip
        11 = Reverse
        12 = +2
        13 = Color Swap
        14 = +4
         */

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