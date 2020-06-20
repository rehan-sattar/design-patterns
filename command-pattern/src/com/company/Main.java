package com.company;

import com.company.fx.Button;
import com.company.fx.Command;

public class Main {
    public static void main(String[] args) {
        var customerService = new CustomerService();
        var command = new AddCustomerCommand(customerService);
        var button = new Button(command);
        button.click();
    }
}
