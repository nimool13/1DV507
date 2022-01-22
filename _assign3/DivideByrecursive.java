package ns222tv_assign3;


class DivisionBySubtractionRecursive {

    public static void main(String[] args) {

        var test = divideBySubtractionRecursive (20, 3);

        System.out.println(test);
    }



    static int divideBySubtractionRecursive(int a, int b) {
        if (a < 0 || b < 0)
            throw new RuntimeException("Both a and b must be positive");

        if (b == 0)
            return 0;

        else if (a - b == 0)
            return 1;

        else if (a < b)
            return 0;
        else
            return (1 + divideBySubtractionRecursive(a - b, b));

    }
}