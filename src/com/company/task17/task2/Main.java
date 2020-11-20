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
        System.out.println("Начало работы программы. Список изображений:");
        try {
            Document document = Jsoup.connect("https://www.mirea.ru/").userAgent("Chrome/4.0.249.0 Safari/532.5").referrer("http://www.google.com").get();
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
                            if (absSrc.charAt(j) == '?')
                                break;
                            strImageName += absSrc.charAt(j);
                        }
                        break;
                    }
                URL urlImage = new URL(absSrc);
                InputStream in = urlImage.openStream();
                byte[] buffer = new byte[4096];
                int n = -1;
                File file = new File("images");
                if (!file.exists()) {
                    file.mkdirs();
                }
                OutputStream os = new FileOutputStream( "images/" + strImageName );
                while ( (n = in.read(buffer)) != -1 ){
                    os.write(buffer, 0, n);
                }
                os.close();
                System.out.println(strImageName + ";");
            }

        }
        catch (Exception error) {
            System.out.println(error.toString());
        }
    }
}
