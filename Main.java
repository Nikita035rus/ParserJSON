package parser_json;

import parser_json.CodeValute;

public class Main {

    public static void main(String[] args) {
        ParserJSON parserJSON = new ParserJSON();
        System.out.println(parserJSON.course(CodeValute.USD));
    }
}
