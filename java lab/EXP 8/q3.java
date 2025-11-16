class BaseException extends Exception {
    public BaseException(String message) {
        super(message);
    }
}


class LevelTwoException extends BaseException {
    public LevelTwoException(String message) {
        super(message);
    }
}

class LevelThreeException extends LevelTwoException {
    public LevelThreeException(String message) {
        super(message);
    }
}

class A {
    void display() throws BaseException {
        throw new BaseException("Exception from class A (Base Level)");
    }
}

class B extends A {
    @Override
    void display() throws LevelTwoException {
        throw new LevelTwoException("Exception from class B (Level Two)");
    }
}

class C extends B {
    @Override
    void display() throws LevelThreeException {
        throw new LevelThreeException("Exception from class C (Level Three)");
    }
}

class ExceptionHierarchyExample {
    public static void main(String[] args) {
        System.out.println("Raghav 24csu168");
        A obj = new C();

        try {
            // Calls the overridden method in class C
            obj.display();
        } 
        catch (LevelThreeException e) {
            System.out.println("Caught: " + e.getMessage());
        } 
        catch (LevelTwoException e) {
            System.out.println("Caught: " + e.getMessage());
        } 
        catch (BaseException e) {
            System.out.println("Caught: " + e.getMessage());
        } 
        finally {
            System.out.println("Program ended — finally block executed.");
        }
    }
}
