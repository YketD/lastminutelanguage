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
        int randomNum = ThreadLocalRandom.current().nextInt(0, 100 + 1);

        int res = (1+7*randomNum+3+2*2+1);
        System.out.println(res);
    }
}
