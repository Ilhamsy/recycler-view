package com.example.recyclerview;

import java.util.ArrayList;

public class FoodData {
    private static String[] title = new String[]{"Gudeg","Bakpia Pathok","Sate Klatak","Yangko","Geplak",
    "Gatot Gunungkidul","Nasi Tiwul","Sego Abang Jirak","Peyek Tumpuk","Soto Lenthok"};

    private static int[] thumbnail = new int[]{R.drawable.gudeg,R.drawable.bakpia,R.drawable.sateklatak,
    R.drawable.yangko,R.drawable.geplak,R.drawable.gatot,R.drawable.tiwul,R.drawable.segoabang,R.drawable.sotolenthok};

    public static ArrayList<FoodModel> getListData() {
        FoodModel foodModel = null;
        ArrayList<FoodModel> list = new ArrayList<>();

        for (int i=0; i<title.length; i++) {
            foodModel = new FoodModel();
            foodModel.setFoodPic(thumbnail[i]);
            foodModel.setFoodName(title[i]);
            list.add(foodModel);
        }
        return list;
    }
}
