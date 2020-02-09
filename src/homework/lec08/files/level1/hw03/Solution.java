package homework.lec08.files.level1.hw03;

import java.io.File;

public class Solution {
    public static void main(String[] args) {
        File folder = new File("C:/Users/Miroslav/IdeaProjects/JavaStart/src/homework");
        getFolders(folder);
    }

    public static void getFolders(File folder) {
        File[] folders = folder.listFiles();

        for (File files : folders) {
            if (files.isDirectory()) {
                System.out.println(files.getName());
                getFolders(files);
            }
        }
    }
}