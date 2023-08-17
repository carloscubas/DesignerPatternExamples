class CreateOrderCommand implements Command {
    public void execute (){
        System.out.println("Insert row in the order table");
    }
    public void unexecute (){
        System.out.println("Delete row from the order table");
    }
}