
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class lab14_3951 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(System.in);
        String x = s.nextLine();
        String y = s.nextLine();
        String Width = s.nextLine();
        String height = s.nextLine();



        File f = new File(" sqt.html");
        System.out.println(f.getAbsolutePath());
        PrintWriter pw = new PrintWriter(f);
        pw.println("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<meta charset=\"utf-8\"/>\n" +
                "<head/>\n" +
                "<body>\n" +
                "<h1>Мой первый векторный рисунок</h1>\n" +
                "\n" +
                "<svg width=\"800\" height=\"600\">\n" +
                "\t<rect Width = "+Width+" height = \""+height+"\" x=\"" + x + "\" y=\"" + y + "\" stroke=\"blue \" fill=\"red\" />\n" +
                "</svg>\n" +
                "</body>\n" +
                "</html>\n" +
                "\t");
        pw.close();
    }
}
