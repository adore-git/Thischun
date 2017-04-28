package edu.nf.utils;

import java.util.Random;

public class RandomUtil {

    public String createRandom(){
        String result = "";
        for (int i=0;i<6;i++){
            Random random = new Random();
            result += random.nextInt(9);
        }
        return result;
    }
}
