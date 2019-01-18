import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LatitudeLongitude {
    private String latitudeLongitude;
    public LatitudeLongitude(String str){
        latitudeLongitude=str;
    }
    public LatitudeLongitude(){
    }

    public void isLatitudeLongitude(){
        Pattern p=Pattern.compile("\\([-+]?([1-8]?\\d(\\.\\d+)?|90(\\.0+)?),\\s*[-+]?(180(\\.0+)?|((1[0-7]\\d)|" +
                "([1-9]?\\d))(\\.\\d+)?)\\)");
        Matcher m= p.matcher(latitudeLongitude);
        if (m.find())
            System.out.println(m.group()+" is valid");
        else
            System.out.println("Invalid ");
    }

}
