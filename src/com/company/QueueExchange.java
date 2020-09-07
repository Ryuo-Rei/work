package com.company;

import java.util.regex.Pattern;

// 2020/09/07 14:30 ~　16:00
public class QueueExchange {

    String[][] queue = new String[][] {
            {"1", "2", "3", "A"},
            {"4", "5", "6", "B"},
            {"7", "8", "9", "C"},
    };

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
                else {
                    num += 0;
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
                else {
                    num += 0;
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
                else {
                    num += 0;
                }
            }
        }
        return num;
    }

    public void ShowSum(int num) {
        System.out.println(num);
    }
}
