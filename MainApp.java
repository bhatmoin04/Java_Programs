package university.main;

import university.results.Result;

public class MainApp {
    public static void main(String[] args) {
        Result r1 = new Result(101, "Alice", 80, 75, 90);
        Result r2 = new Result(102, "Bob", 60, 55, 70);
        Result r3 = new Result(103, "Charlie", 30, 40, 25);

        r1.displayResult();
        r2.displayResult();
        r3.displayResult();
    }
}
