package com.company;

import java.util.List;

public class FileReadMain {

    public static void main(String[] args) {
	// write your code here
        FileRead fileRead = new FileRead();
        List<String> text = fileRead.ReadTextFile(FileRead.FILE_PATH);
        fileRead.OutputConsole(text);
    }
}
