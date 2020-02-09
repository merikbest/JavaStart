package homework.lec08.files.practice;

import java.io.File;
import java.io.IOException;

public class Practice1 {
    public static void main(String[] args) {
        File file1 = new File("a.txt");
        System.out.println("File is real => " + file1.exists());

        try {
            file1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file2 = new File("b.txt");
        file1.renameTo(file2);

        File folder1 = new File("AAA");
        folder1.mkdirs();

        File file3 = new File(folder1, "x.doc");
        file2.renameTo(file3);

//        file3.delete();
//        folder1.delete();
        deleteFolder(folder1);


        System.out.println();
        File file = new File(".");
        File[] folder = file.listFiles();

        for (File files : folder) {
            System.out.println(files + (files.isFile() ? ": file" : ": folder"));
        }
    }

    //Удалить каталог произвольной вложености (Рекурсия)
    public static void deleteFolder(File folder) {
        if (folder.isFile()) {
            System.out.println(folder.getName());
            folder.delete();
        } else {
            File[] files = folder.listFiles();
            for (int i = 0; i < files.length; i++) {
                deleteFolder(files[i]);
            }
            System.out.println("Delete " + folder.getName());
            folder.delete();
        }
    }
}