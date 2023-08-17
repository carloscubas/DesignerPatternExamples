class AddToCartCommand implements Command {
    public void execute (){
        System.out.println("Insert row in the cart table");
    }
    public void unexecute (){
        System.out.println("Delete row from the cart table");
    }
}