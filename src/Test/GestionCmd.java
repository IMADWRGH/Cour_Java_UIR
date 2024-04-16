package Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Constructor;

public class GestionCmd {
    public static Paiment Mode() throws Exception{
            BufferedReader reader = new BufferedReader(new FileReader("D:\\JobInTech-UIR\\Java\\Cour_Java_UIR\\src\\Test\\ModePaiment.txt"));
            String paymentType = reader.readLine();
            Class<?> type = Class.forName(paymentType);
            Constructor<?> constructor = type.getConstructor();
            return (Paiment) constructor.newInstance();

    }
}
