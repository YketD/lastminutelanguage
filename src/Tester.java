import java.util.concurrent.ThreadLocalRandom;

public class Tester
{
    public Tester()
    {
    }

    public static void main(String[] args)
    {
        new Tester().run();
    }

    public void run()
    {
        //int randomNum = ThreadLocalRandom.current().nextInt(0, 100 + 1);

        int num = 5;
        int sum = num + num / num + num * 1;

        System.out.println(sum);
    }
}
