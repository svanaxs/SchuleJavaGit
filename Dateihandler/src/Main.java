import java.util.ArrayList;

public class Main
{
    protected static ArrayList<Dummy> dummies = new ArrayList<Dummy>();

    public static void main(String[] args)
    {
        try
        {
            dummies.add(new Dummy(1, "abc"));
            dummies.add(new Dummy(2, "abc"));
            dummies.add(new Dummy(3, "abc"));

            Mainhandler MH1 = new IO("Test1.txt");
            MH1.schreiben(dummies);
            MH1.lesen();

            Mainhandler MH2 = new NIO("Test2.txt");
            MH2.schreiben(dummies);
            MH2.lesen();

            Mainhandler MH3 = new SER("Test3.txt");
            MH3.schreiben(dummies);
            MH3.lesen();
        }
        catch (Exception e)
        {
            System.out.println("Fehler in Driver");
            e.printStackTrace();
        }

    }

}
