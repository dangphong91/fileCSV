import java.util.*;
import java.io.*;

public class CsvReaderCountry {
    private static final String DELIMITER = ",";

    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader("D:\\bai tap\\country.csv"));
            while ((line = br.readLine()) != null) {
                printCountry(csvLine(line));
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
    }

    private static ArrayList<String> csvLine(String line) {
        ArrayList<String> result = new ArrayList<>();
        if (line != null) {
            String[] splitData = line.split(DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    private static void printCountry(ArrayList<String> country) {
        System.out.println(country);
    }

}
