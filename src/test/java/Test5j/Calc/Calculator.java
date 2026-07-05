package Test5j.Calc;

public class Calculator {
    public int add(int i, int i1) {
        return i + i1;
    }

    public int factorial(int i) {
        int res = 1;
        for(int curr = 1; curr <= i; curr++){
            res *= curr;
        }
        return res;

    }
}
