package com.company;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileRead {

    // 2020/09/01 11:06 ~

    final static String FILE_PATH = "C:\\Users\\rysuorei\\Desktop\\work\\ReadFile用テキスト.txt";

    public List<String> ReadTextFile(String path) {
        Path file = Paths.get(path);
        List<String> fileContentList = null;
        try {
            fileContentList = Files.readAllLines(file);

        } catch (Exception e) {
            System.out.println("ファイル読込みに失敗しました。");
        }

        return fileContentList;
    }

    public void OutputConsole(List<String> text) {
        System.out.println(text);
    }
}
