import java.util.*;

public class Main {
    public static void main (String args[]){
        // Stores history of commands so that we can reverse the transactions
        // or go back to the previous state of the applicaion.
        Stack<Command> commandHistory = new Stack<Command>();
        // If add to cart api called
        Command command = new AddToCartCommand();
        Invoker invoker = new Invoker(command);
        invoker.executeCommand();
        commandHistory.push(command);

        // If payment api called
        command = new PaymentCommand();
        invoker = new Invoker(command);
        invoker.executeCommand();
        commandHistory.push(command);

        // If order creation api called
        command = new CreateOrderCommand();
        invoker = new Invoker(command);
        invoker.executeCommand();
        commandHistory.push(command);
        
        // Rollback
        command = commandHistory.pop();
        invoker = new Invoker(command);
        invoker.unexecuteCommand();
        
        command = commandHistory.pop();
        invoker = new Invoker(command);
        invoker.unexecuteCommand();
        
        command = commandHistory.pop();
        invoker = new Invoker(command);
        invoker.unexecuteCommand();
    }
}