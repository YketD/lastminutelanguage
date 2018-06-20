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
        String abc = "abc";
        abc += "def";
        System.out.println(abc);
    }
}
