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

    public int value()
    {
        int randomNum = ThreadLocalRandom.current().nextInt(0, 1000);
        return randomNum;
    }

    public void run()
    {
        int asd = value();
        System.out.println(asd);
    }
}
