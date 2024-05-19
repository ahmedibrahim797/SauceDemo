package data;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class JsonDataReader 
{
	public String firstname, lastname ,postalcode, username , password  ; 

	public void JsonReader() throws IOException, ParseException 
	{
		String filePath = System.getProperty("user.dir")+"/src/test/java/data/UserData.json";

		File srcFile = new File(filePath); 

		JSONParser parser = new JSONParser(); 
		JSONArray jarray = (JSONArray)parser.parse(new FileReader(srcFile)); 

		for(Object jsonObj : jarray) 
		{
			JSONObject person = (JSONObject) jsonObj ; 
			firstname  = (String) person.get("firstname"); 
			System.out.println(firstname);

			lastname = (String) person.get("lastname"); 
			System.out.println(lastname);
			
			postalcode = (String) person.get("postalcode"); 
			System.out.println(postalcode);

			username = (String) person.get("username"); 
			System.out.println(username);

			password = (String) person.get("password"); 
			System.out.println(password);

		}

	}

}
