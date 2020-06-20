package com.company;

import com.company.fx.Button;
import com.company.fx.Command;

public class Main {
    public static void main(String[] args) {
        // simple command
        var customerService = new CustomerService();
        var command = new AddCustomerCommand(customerService);
        var button = new Button(command);
        button.click();
        // composite commands
        var composite = new CompositeCommands();
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());
        composite.execute();
    }
}
