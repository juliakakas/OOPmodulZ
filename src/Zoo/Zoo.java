package Zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    static List<String> zooAsStrings = FileInputHandler.getLinesOfTextFile("");
    static List<Zoo> zooList = new ArrayList<>();

    static List<Zoo> mammal = new ArrayList<>();
    static List<Zoo> bird = new ArrayList<>();
    static List<Zoo> reptile = new ArrayList<>();

    /*private static void createZooList() {
        for (String zooLine : zooAsStrings) {
            String[] zooData = zooLine.split(",");
            switch (zooData[0]){
                case "mammal" -> zooList.add(new Mammal(zooData[1],Integer.parseInt(zooData[2]));
                case "bird" -> zooList.add(new Bird(zooData[1],Integer.parseInt(zooData[2]));
                case "reptile" -> zooList.add(new Reptile(zooData[1],Integer.parseInt(zooData[2]));
            }

        }
    }*/



    public static void main(String[] args) {

    }

}
