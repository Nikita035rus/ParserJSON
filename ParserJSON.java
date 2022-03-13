package parser_json;

import com.google.gson.Gson;
import org.json.JSONException;
import org.json.JSONObject;
import parser_json.CodeValute;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class ParserJSON {

    public String course(CodeValute codeValute) {
        Valute valute = getValute(codeValute);
        return "1 " + valute.getCharCode() + " = " +
                (valute.getValue() / valute.getNominal()) +
                " RUB";
    }

    private String convertJSONFromString() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                new URL("https://www.cbr-xml-daily.ru/daily_json.js").openStream(),
                StandardCharsets.UTF_8))) {
            StringBuilder sb = new StringBuilder();
            int temp;
            while ((temp = br.read()) != -1) {
                sb.append((char) temp);
            }
            return sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private Valute getValute(CodeValute codeValute){
        try {
            JSONObject json = new JSONObject(convertJSONFromString());
            JSONObject valute1 = json.getJSONObject("Valute");

            JSONObject name = (JSONObject) valute1.get(codeValute.name());

            Gson gson = new Gson();
            return gson.fromJson(name.toString(), Valute.class);

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }
}