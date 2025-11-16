class MyCustomException extends Exception {
    private String message;  

    public MyCustomException(String message) {
        this.message = message;  
}

        public void printMessage() {
        System.out.println("Custom Exception Message: " + message);
    }
}

class CustomExceptionExample {
    public static void main(String[] args) {
	System.out.println("Raghav 24csu168");

        try {
            
            throw new MyCustomException("This is my user-defined exception!");
        } 
        catch (MyCustomException e) {
             e.printMessage();
        } 
        finally {
            System.out.println("Finally block executed — program ended successfully.");
        }
    }
}
