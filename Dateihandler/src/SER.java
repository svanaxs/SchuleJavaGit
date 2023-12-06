import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SER extends Mainhandler
{
	private ObjectOutputStream out;
	private ObjectInputStream in;

	public SER(String datei)
	{
		try
		{
			out = new ObjectOutputStream(new FileOutputStream(datei));
			in = new ObjectInputStream(new FileInputStream(datei));
		}
		catch (Exception e)
		{
			System.out.println(e.getStackTrace());
			System.out.println("Fehler in SER datei set");
		}

	}

	// Change here
	@Override
	public void schreiben(ArrayList<Dummy> t)
	{
		try
		{
			for (Dummy dummy : t)
			{
				out.writeObject(dummy);
			}

			out.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("Fehler in SER schreiben");
		}
	}

	@Override
	public void lesen()
	{
		try
		{
			// Change here
			ArrayList<Dummy> tempList = new ArrayList<>();
			while (true)
			{
				try
				{
					// Change here
					Dummy temp = (Dummy) in.readObject();
					tempList.add(temp);
				}
				catch (EOFException e)
				{
					break;
				}
			}

			// Change here
			for (Dummy temp : tempList)
			{
				System.out.println(temp);
			}

			in.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("Fehler in SER lesen");
		}
	}
}
