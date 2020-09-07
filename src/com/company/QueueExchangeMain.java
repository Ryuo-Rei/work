package com.company;

public class QueueExchangeMain {

    public static void main(String[] args) {
        // write your code here
        QueueExchange queueExchange = new QueueExchange();
        queueExchange.ShowTwoDimentionalArray(queueExchange.queue);
        System.out.println("");
        String[][] exchangedQueue = queueExchange.QueueExchange(queueExchange.queue);
        queueExchange.ShowTwoDimentionalArray(exchangedQueue);
        System.out.println("");
        int[] lineAdditionArray = queueExchange.LineAddition(exchangedQueue);
        queueExchange.ShowOneDimensionalArray(lineAdditionArray);
        System.out.println("");
        int[] rowAdditionArray = queueExchange.RowAddition(exchangedQueue);
        queueExchange.ShowOneDimensionalArray(rowAdditionArray);
        System.out.println("");
        int num = queueExchange.AllElementAddition(exchangedQueue);
        queueExchange.ShowSum(num);
    }
}
