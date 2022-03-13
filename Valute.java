package parser_json;

public class Valute {

    //"CharCode":"AUD",
    // "Value":85.6374,
    // "Previous":88.2856,
    // "ID":"R01010",
    // "Nominal":1,
    // "NumCode":"036",
    // "Name":"Австралийский доллар"

    private String CharCode;
    private double Value;
    private double Previous;
    private String ID;
    private int Nominal;
    private String Name;

    public String getCharCode() {
        return CharCode;
    }

    public void setCharCode(String charCode) {
        CharCode = charCode;
    }

    public double getValue() {
        return Value;
    }

    public void setValue(double value) {
        Value = value;
    }

    public double getPrevious() {
        return Previous;
    }

    public void setPrevious(double previous) {
        Previous = previous;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getNominal() {
        return Nominal;
    }

    public void setNominal(int nominal) {
        Nominal = nominal;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Valute{" +
                "CharCode='" + CharCode + '\'' +
                ", Value=" + Value +
                ", Previous=" + Previous +
                ", ID='" + ID + '\'' +
                ", Nominal=" + Nominal +
                ", Name='" + Name + '\'' +
                '}';
    }
}
