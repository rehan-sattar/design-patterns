package com.company;

import com.company.exercise.ChatWindow;
import com.company.exercise.ToolbarWindow;

public class Main {
    public static void main(String[] args) {
        var task = new TransferMoneyTask();
        task.execute();
        // exercise code.
        var toolbarWindow = new ToolbarWindow();
        toolbarWindow.close();
        var chatWindow = new ChatWindow();
        chatWindow.close();
    }
}
