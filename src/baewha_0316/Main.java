package baewha_0316;

class MethodTest {
    public boolean test(char a) {
        return a >= 'a' && a <= 'z';
    }

    public int grade(int kor, int eng, int math) {
        int avg = (kor + eng + math) / 3;
        if (avg >= 90)
            return 'A';
        else if (avg >= 80)
            return 'B';
        else if (avg >= 70)
            return 'C';
        else if (avg >= 60)
            return 'D';
        else
            return 'F';
    }

    public String countEven(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++)
            if (i % 2 == 0)
                count++;
        return "짝수의개수=" + count;
    }

    public void printString(String m, int c) {
        for (int i = 0; i < c; i++)
            System.out.println(m);
    }

    public float multiply(float a, float b) {
        return a * b;
    }
}

class Main {
    public static void main(String[] args) {
        MethodTest a = new MethodTest();
        int c = a.grade(90, 80, 100);
        System.out.println("결과=" + (char)c);
        String d = a.countEven(10, 20);
        System.out.println(d);
        //a.printString("Hello", 5);
        float e = a.multiply(2.5f, 3.0f);
        System.out.println("결과값=" + e);
    }
}