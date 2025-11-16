//q1(c)
interface X {
    void printX();
}

interface Y {
    void printY();
}

interface Z extends X, Y {
    void printZ();
}

class Demo2 implements Z {
    public void printX() {
        System.out.println("From Interface X");
    }

    public void printY() {
        System.out.println("From Interface Y");
    }

    public void printZ() {
        System.out.println("From Interface Z");
    }
}

class MultipleInterfaceExtend {
    public static void main(String[] args) {
	System.out.println("Raghav 24csu168");
        Demo2 d = new Demo2();
        d.printX();
        d.printY();
        d.printZ();
    }
}
