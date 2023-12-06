import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IO extends Mainhandler
{
	public IO(String datei)
	{
		try
		{

			out = new BufferedWriter(new FileWriter(datei));
			in = new BufferedReader(new FileReader(datei));
		}
		catch (IOException e)
		{
			System.out.println(e.getStackTrace());
			System.out.println("Fehler beim Öffnen der Datei");
		}

	}

}
