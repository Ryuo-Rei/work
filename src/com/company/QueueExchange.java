package com.company;

import java.util.regex.Pattern;

// 2020/09/07 14:30 ~　16:00
public class QueueExchange {

    String[][] queue = new String[][] {
            {"1", "2", "3", "A"},
            {"4", "5", "6", "B"},
            {"7", "8", "9", "C"},
    };

    public void Print() {
        System.out.println("変換元配列：");
        ShowTwoDimentionalArray(queue);
        System.out.println("");

        System.out.println("返還後配列：");
        String[][] exchangeQueue = QueueExchange(queue);
        ShowTwoDimentionalArray(exchangeQueue);
        System.out.println("");

        System.out.println("行加算結果：");
        int[] lineAdditionArray = LineAddition(exchangeQueue);
        ShowOneDimensionalArray(lineAdditionArray);
        System.out.println("");

        System.out.println("列加算結果：");
        int[] rowAdditionArray = RowAddition(exchangeQueue);
        ShowOneDimensionalArray(rowAdditionArray);
        System.out.println("");

        System.out.println("全要素加算結果：");
        int num = AllElementAddition(exchangeQueue);
        ShowSum(num);
    }

    public void ShowTwoDimentionalArray(String[][] queue) {
        for(int i = 0; i < queue.length; i++) {
            for(int j = 0; j < queue[i].length; j++) {
                if(j != 0) {
                    System.out.print(" ");
                }
                System.out.print(queue[i][j]);
            }
            System.out.println();
        }
    }

    public String[][] QueueExchange(String[][] queue) {
        String[][] exchangedQueue = new String[queue[0].length][queue.length];
        for(int i = 0; i < queue.length; i++) {
            for(int j = 0; j < queue[0].length; j++) {
                exchangedQueue[j][i] = queue[i][j];
            }
        }

        return exchangedQueue;
    }

    public int[] LineAddition(String[][] queue) {
        int[] lineAdditionArray = new int[queue.length];
        int num = 0;
        String regex = "^-?[0-9]*$";
        Pattern p = Pattern.compile(regex);
        for(int i = 0; i < queue.length; i++) {
            num = 0;
            for(int j = 0; j < queue[0].length; j++) {
                if(p.matcher(queue[i][j]).find()) {
                    num += Integer.parseInt(queue[i][j]);
                }
            }
            lineAdditionArray[i] = num;
        }

        return lineAdditionArray;
    }

    public void ShowOneDimensionalArray(int[] lineAdditionArray) {
        for(int i = 0; i < queue.length; i++) {
            System.out.println(lineAdditionArray[i]);
        }
    }

    public int[] RowAddition(String[][] queue) {
        int [] rowAdditionArray = new int[queue.length];
        int num = 0;
        String regex = "^-?[0-9]*$";
        Pattern p = Pattern.compile(regex);
        for(int i = 0; i < queue[0].length; i++) {
            num = 0;
            for(int j = 0; j < queue.length; j++) {
                if(p.matcher(queue[j][i]).find()) {
                    num += Integer.parseInt(queue[j][i]);
                }
            }
            rowAdditionArray[i] = num;
        }
        return rowAdditionArray;
    }

    public int AllElementAddition(String[][] queue) {
        int num = 0;
        String regex = "^-?[0-9]*$";
        Pattern p = Pattern.compile(regex);
        for(int i = 0; i < queue.length; i++) {
            for(int j = 0; j < queue[0].length; j++) {
                if(p.matcher(queue[i][j]).find()) {
                    num += Integer.parseInt(queue[i][j]);
                }
            }
        }
        return num;
    }

    public void ShowSum(int num) {
        System.out.println(num);
    }
}
