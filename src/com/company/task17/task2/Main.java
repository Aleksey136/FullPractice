package com.company.task17.task2;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        System.out.println("Начало работы программы.");
        try {
            Document document = Jsoup.connect("https://www.mirea.ru/").get();
            Elements listImages = document.select("img");
            for (Element element : listImages) {
                String absSrc = element.attr("abs:src");
                if (absSrc.equals(""))
                    absSrc = element.attr("abs:data-src");
                String strImageName = "";
                for (int i = absSrc.length()-1; i>=0;i--)
                    if (absSrc.charAt(i)=='/')
                    {
                        for (int j = i+1; j<absSrc.length();j++)
                        {
                            strImageName += absSrc.charAt(j);
                        }
                        break;
                    }
                URL urlImage = new URL(absSrc);
                InputStream in = urlImage.openStream();
                byte[] buffer = new byte[4096];
                int n = -1;
                File file = new File("images/" + strImageName);
                if (!file.exists()) {
                    file.mkdirs();
                }
                OutputStream os = new FileOutputStream( "images/" + strImageName );
                while ( (n = in.read(buffer)) != -1 ){
                    os.write(buffer, 0, n);
                }
                os.close();
                System.out.println("Image saved");
                System.out.println(absSrc);
            }

        }
        catch (Exception error) {
            System.out.println(error.toString());
        }
    }
}
