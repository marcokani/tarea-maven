package bo.edu.uap.app;
import static spark.Spark.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws FileNotFoundException, IOException
    {
        Properties prop=new Properties();
        prop.load(new FileInputStream(new File("src/main/resources/vars.properties")));
        // System.out.println( "Hello World!" );
         System.out.println( "valor recuperado: "+prop.getProperty("PROPIEDAD_1"));
        String resource= prop.getProperty("PROPIEDAD_1");
        get("/tarea", (req, res) -> "En el ambiente '"+resource+"'");
    }
}
