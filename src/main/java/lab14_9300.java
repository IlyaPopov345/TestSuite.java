import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class lab14_9300 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(System.in);
        String cx = s.nextLine();
        String cy = s.nextLine();
        String r = s.nextLine();

        String strokeWidth = s.nextLine();
        File f = new File(" out.html");
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
                "\t<circle cx=\"" + cx + "\" cy=\"" + cy + "\" r=\"" + r + "\" stroke=\"green\" stroke-width=\""+strokeWidth+"\" fill=\"yellow\" />\n" +
                "</svg>\n" +
                "</body>\n" +
                "</html>\n" +
                "\t");
        pw.close();


    }
}

