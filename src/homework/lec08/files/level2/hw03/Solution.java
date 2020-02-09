package homework.lec08.files.level2.hw03;

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        File file = new File("ascii-art.txt");
        addToFile(file);
    }


    public static void addToFile(File file) {
        String string = "       _                        \n" +
                "       \\`*-.                    \n" +
                "        )  _`-.                 \n" +
                "       .  : `. .                \n" +
                "       : _   '  \\               \n" +
                "       ; *` _.   `*-._          \n" +
                "       `-.-'          `-.       \n" +
                "         ;       `       `.     \n" +
                "         :.       .        \\    \n" +
                "         . \\  .   :   .-'   .   \n" +
                "         '  `+.;  ;  '      :   \n" +
                "         :  '  |    ;       ;-. \n" +
                "         ; '   : :`-:     _.`* ;\n" +
                "[bug] .*' /  .*' ; .*`- +'  `*' \n" +
                "      `*-*   `*-*  `*-*'";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(string);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}