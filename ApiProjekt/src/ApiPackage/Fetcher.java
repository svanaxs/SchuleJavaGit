package ApiPackage;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Fetcher {

    private static final String API_KEY = "RGAPI-2493a10a-4a0c-4bbb-b1ca-0cbecc2f4953";
    private static final String RIOT_API_BASE_URL = "https://euw1.api.riotgames.com/lol/league/v4/entries/by-summoner/";

    public static void main(String[] args) {
        String summonerName = "FeastOnToxicity";  

        try {
            String encodedSummonerName = encodeSummonerName(summonerName);
            String encryptedSummonerId = getEncryptedSummonerId(encodedSummonerName);
            String summonerData = getSummonerData(encryptedSummonerId);
    
            System.out.println("BySummoner");
            System.out.println(summonerData);
            
          
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String encodeSummonerName(String summonerName)
    {
        return summonerName.replaceAll(" ", "%20");
    }

    private static String getEncryptedSummonerId(String encodedSummonerName) throws IOException {
        String apiUrl = "https://euw1.api.riotgames.com/lol/summoner/v4/summoners/by-name/" + encodedSummonerName;

        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("X-Riot-Token", API_KEY);

        int responseCode = connection.getResponseCode();

        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder content = new StringBuilder();
            String inputLine;
            
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
                System.out.println("ByName");
  
                ByName temp = ByName.fromJson(inputLine);
                System.out.println(temp.getName());
                
                System.out.println();
               
            };
           
            
            
            

            in.close();

            
            String json = content.toString();
            String encryptedSummonerId = json.split("\"id\"")[1].split(":")[1].split(",")[0].replaceAll("\"", "").trim();

            return encryptedSummonerId;
        } else {
            throw new IOException("Error retrieving summoner data. HTTP error code: " + responseCode);
        }
    }
    private static String getSummonerData(String encryptedSummonerId) throws IOException {
        String apiUrl = RIOT_API_BASE_URL + encryptedSummonerId;

        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("X-Riot-Token", API_KEY);

        int responseCode = connection.getResponseCode();

        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
            	
                content.append(inputLine);
                
            }
            in.close();

            return content.toString();
        } else {
            throw new IOException("Error retrieving summoner data. HTTP error code: " + responseCode);
        }
    }
    
}
