package com.company;

import java.util.List;

public class UnUsedNumberMain {
    public static void main(String[] args) {
        // write your code here
        UnUsedNumber uUN = new UnUsedNumber();
        List<String> fileContentList = uUN.ReadFile(UnUsedNumber.FILE_PATH);
        uUN.OutputFile(fileContentList);
    }
}
