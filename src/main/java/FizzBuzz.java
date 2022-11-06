public class FizzBuzz {
    public static void main(String[] args) {
        int Fizz = 0;
        int Buzz = 0;
        int FizzBuzz = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                FizzBuzz = FizzBuzz + i;
                System.out.println("FizzBuzz = " + i);
                continue;
            } else if (i % 5 == 0) {
                Buzz = Buzz + i;
                System.out.println("Buzz = " + i);
                continue;
            } else if (i % 3 == 0) {
                Fizz = Fizz + i;
                System.out.println("Fizz = " + i);
            }
            System.out.println("i = " + i);

        }

    }

}

