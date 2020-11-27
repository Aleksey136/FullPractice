package com.company.task18;

import com.google.gson.Gson;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Начало работы программы.");
        Gson json = new Gson();
        try {
            Document document = Jsoup.connect("https://www.moscowmap.ru/metro.html#lines").userAgent("Chrome/4.0.249.0 Safari/532.5").referrer("http://www.google.com").maxBodySize(0).get();
            Elements listLines = document.select("div.js-metro-stations.t-metrostation-list-table");
            Map<String, List<String>> stationsMetro = new LinkedHashMap<String, List<String>>();
            List<Lines> linesMetro = new ArrayList<>();
            for (Element element1 : listLines) {
                String numberLine = element1.attr("data-line");
                Elements listStations = element1.select("span.name");
                String lineName = document.select("span.js-metro-line.t-metrostation-list-header.t-icon-metroln.ln-" + numberLine).text();
                List<String> stations1 = new ArrayList<>();
                int i = 1;
                for (Element element2 : listStations) {
                    String nameStation = element2.select("span.name").text();
                    stations1.add(nameStation);
                }
                Lines line1 = new Lines();
                line1.name = lineName;
                line1.number = numberLine;
                stationsMetro.put(numberLine, stations1);
                linesMetro.add(line1);
            }
            Metro metro = new Metro();
            metro.stations = stationsMetro;
            metro.lines = linesMetro;
            String jsonOutput = json.toJson(metro);
            try{
                FileWriter file = new FileWriter("src/com/company/task18/task18.json");
                file.write(jsonOutput);
                file.close();
            } catch (Exception error) {
                System.out.println(error.toString());
            }
            Metro metro1 = json.fromJson(parseFile(), Metro.class);
        }
        catch (Exception error) {
            System.out.println(error.toString());
        }
        Metro metro = json.fromJson(parseFile(), Metro.class);
        Iterator<Map.Entry<String, List<String>>>iterator = metro.stations.entrySet().iterator();
        List<LinesOutput> lines = new ArrayList<>();
        while (iterator.hasNext()){
            Map.Entry<String, List<String>> stations = iterator.next();
            String key = stations.getKey();
            for (Lines lines1 : metro.lines){
                if (key.equals(lines1.number))
                    key = lines1.name;
            }
            List<String> value = stations.getValue();
            lines.add(new LinesOutput(key, value.size()));
        }
        for (LinesOutput linesOutput : lines){
            System.out.println("На линии \"" + linesOutput.nameLine + "\" <" + linesOutput.quantityStation + "> станций.");
        }
    }

    public static String parseFile() {
        StringBuilder builder = new StringBuilder();
        try {
            List<String> files = Files.readAllLines(Paths.get("src/com/company/task18/task18.json"));
            files.forEach(file -> builder.append(file).append("\n"));
            }
        catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return builder.toString();
    }

    static class Metro
    {
        public Map<String, List<String>> stations = new HashMap<String, List<String>>();
        public List<Lines> lines = new ArrayList<>();
    }

    static class Lines
    {
        public String number;
        public String name;
    }

    static class LinesOutput
    {
        String nameLine;
        int quantityStation;
        public LinesOutput(String nameLine, int quantityStation) {
            this.nameLine=nameLine;
            this.quantityStation=quantityStation;
        }
    }
}
