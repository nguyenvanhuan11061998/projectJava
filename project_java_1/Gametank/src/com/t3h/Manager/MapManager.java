package com.t3h.Manager;

import com.t3h.Model.Maptank;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class MapManager {
    private ArrayList<Maptank> arrMap;
    private static final int SIZE =19;

    public void readMap(String name){
        try {
            arrMap = new ArrayList<>();
            File file = new File("src/sound/Map/"+name);
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();
            int i = 0;
            while (line != null){
                for (int j = 0; j < line.length(); j++) {
                    int x = j*SIZE;
                    int y = i*SIZE;
                    int bit = Integer.parseInt(line.charAt(j)+"");
                    arrMap.add(new Maptank(x,y,bit));
                }
                i++;
                line = reader.readLine();
            }
            reader.close();
            fileReader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList<Maptank> getArrMap(){
        return arrMap;
    }

}
