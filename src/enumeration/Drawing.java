package enumeration;

import java.util.Arrays;

public class Drawing {
    public static void main(String[] args) {
        System.out.println(Palette.Colors.RED);
        System.out.println(Palette.Colors.RED.ordinal());
        System.out.println(Palette.Colors.RED.name());
        System.out.println(Palette.Colors.valueOf("RED"));

        System.out.println(Arrays.toString(Palette.Colors.values()));
        // [RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET]
    }
}
