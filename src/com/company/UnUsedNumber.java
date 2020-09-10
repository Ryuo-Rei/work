package com.company;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 2020/09/04 16:25 ~
public class UnUsedNumber {

    final static String FILE_PATH = "C:\\Users\\ryuorei\\Desktop\\Git\\work\\test.txt";
    final static String OUTPUTFILE_PATH = "C:\\Users\\ryuorei\\Desktop\\Git\\work\\outputunUsedNumberList.txt";
    final static String OUTPUTFILE_PATH2 = "C:\\Users\\ryuorei\\Desktop\\Git\\work\\outputunUsedNumberList2.txt";

    List<String> unUsedNumberList = new ArrayList<String>();
    int[] countList = new int[10];

    public void Execute() {
        List<String> fileContentList = ReadFile(FILE_PATH);
        ParseData(fileContentList);
        OutputFile();
    }

    private List<String> ReadFile(String path) {
        Path file = Paths.get(path);
        List<String> fileContentList = null;
        try {
            fileContentList = Files.readAllLines(file);

        } catch (Exception e) {
            System.out.println("ファイル読込みに失敗しました。");
        }
        for (int i = 0; i < fileContentList.size(); i++) {
            System.out.println(fileContentList.get(i));
        }

        return fileContentList;
    }

    private void ParseData(List<String> fileContentList) {
        for (int i = 0; i < fileContentList.size(); i++) {
            unUsedNumberList.add(CheckNumber(fileContentList.get(i)));
            countList = CountNumber(fileContentList.get(i), countList);
        }
    }

    private void OutputFile() {

        try {
            File file = new File(OUTPUTFILE_PATH);
            File file2 = new File(OUTPUTFILE_PATH2);
            if (!file.exists()) {
                file.createNewFile();
            }
            if (!file2.exists()) {
                file2.createNewFile();
            }
            FileWriter fw = new FileWriter(OUTPUTFILE_PATH, false);
            fw.write(String.valueOf(unUsedNumberList));

            fw.close();
            FileWriter fw2 = new FileWriter(OUTPUTFILE_PATH2, false);
            fw2.write(Arrays.toString(countList));
            fw2.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String CheckNumber(String unUsedNumberList) {
        String str = "";
        for (int j = 0; j <= 9; j++) {
            int num = unUsedNumberList.indexOf(Integer.toString(j));
            if (num == -1) {
                str += Integer.toString(j);
            }
        }
        if (str == null || str.equals("")) {
            return "none\r\n";
        } else {
            return str + "\r\n";
        }
    }


    private int[] CountNumber(String unUsedNumberList, int[] countList) {
        char targetChar = '0';
        int count = 0;
        for(int i = 0; i <= 9; i++) {
            targetChar = Integer.toString(i).charAt(0);
            count = 0;
            for(int j = 0; j < unUsedNumberList.length(); j++) {
                if(unUsedNumberList.charAt(j) == targetChar) {
                    count++;
                }
            }
            countList[i] += count;
        }
        return countList;
    }


}
