package PaymentCommandManager.Services;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class ApiService {
   public String fetch(){
       try {
           URL url =new URL("https://mocki.io/v1/98d0fbf8-3952-46a9-8936-c6c264983135");
           HttpURLConnection connection= (HttpURLConnection) url.openConnection();
           connection.setRequestMethod("GET");
           int responseCode = connection.getResponseCode();
           if (responseCode==HttpURLConnection.HTTP_OK){
               BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(connection.getInputStream()));
               String line;
               StringBuilder response=new StringBuilder();
               while ((line = bufferedReader.readLine())!=null){
                   response.append(line);
               }
               bufferedReader.close();
//               System.out.println("JSON response: " + response.toString());
               return response.toString();
           }else {
               System.out.println("Error in request");
           }
           connection.disconnect();
       }catch (Exception msg){
           System.out.println(msg.getMessage());
       }
       return null;
   }

    public   Map<String, Object> getData(String jsonString) {
        Map<String, Object> jsonMap = new HashMap<>();
        String[] keyValuePairs = jsonString.replaceAll("[{}]", "").split(",");
        for (String pair : keyValuePairs) {
            String[] entry = pair.split(":");
            String key = entry[0].trim().replaceAll("\"", "");
            String value = entry[1].trim().replaceAll("\"", "");
            jsonMap.put(key, value);
        }
//        System.out.println("Map : "+jsonMap);
        return jsonMap;

   }
}


