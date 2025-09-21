class Test{
    int a,b;
    Test(int i, int j){
        this.a = i;
        this.b = j;
    }

    void math(Test obj){
        obj.a *= 2;
        obj.b /= 2;
    }
}


class callbyref{
    public static void main(String[] args){
        Test obj = new Test(10, 20);
        System.out.println(obj.a + " " + obj.b);
        obj.math(obj);
        System.out.println(obj.a + " " + obj.b);
    }
}