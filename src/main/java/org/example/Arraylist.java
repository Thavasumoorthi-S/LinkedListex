package org.example;
import java.util.ArrayList;
import java.util.logging.Logger;
public class Arraylist {
    public static void main(String[] args)
    {
        Logger logger=Logger.getLogger("com-api-jar");
        ArrayList<String> list=new ArrayList<>();
        list.add("Maruti");
        list.add("Hyundai");
        list.add("Mahindra");
        list.add("Toyota");
        list.add("Chevrolet");
        list.add("Ford");
        list.add("Nissan");
        logger.info(list.get(0));
        logger.info(""+list.clone());
        logger.info(""+list.hashCode());
        logger.info(list.remove(6));
        logger.info(""+list.add("BMW"));
        logger.info(""+list.add("Tesla"));
        logger.info(""+list.clone());
        logger.info(list.remove(0));
        logger.info(list.toString());
        logger.info(""+list.isEmpty());
        logger.info(""+list.size());
        list.clear();
        logger.info(""+list.isEmpty());
    }
}
