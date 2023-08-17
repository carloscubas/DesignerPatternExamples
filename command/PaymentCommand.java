class PaymentCommand implements Command {
    public void execute (){
        System.out.println("Insert row in the payments table");
    }
    public void unexecute (){
        System.out.println("Delete row from the payments table");
    }
}