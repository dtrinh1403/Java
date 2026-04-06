package BT5;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ArrayList_BT {

   public static LinkedHashMap<String,String> addInfo(String ten, String tuoi, String vitri){
        LinkedHashMap<String, String> listInfo = new LinkedHashMap<>();
        listInfo.put("Ten", ten);
        listInfo.put("Tuoi", tuoi);
        listInfo.put("Vi tri", vitri);

        return listInfo;
    }
    public static void main(String[] args) {
        ArrayList<Integer> sochan = new ArrayList<Integer>();

        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                sochan.add(i);
            }
        }
        for (int i = 0; i < sochan.size() ; i++) {
            System.out.print(sochan.get(i) + " ");
        }
        System.out.println("");
        LinkedHashMap<String, String> info = addInfo("Dat", "26", "QA");
//        for (Map.Entry<String, String> entry : info.entrySet()) {
//            System.out.println(entry.getKey() + " - " + entry.getValue());
//        }

        Object keyArray[] = info.keySet().toArray();
        for (int i = 0; i < keyArray.length ; i++) {
            System.out.println(keyArray[i] + " - " + info.get(keyArray[i]));
        }


    }
}
