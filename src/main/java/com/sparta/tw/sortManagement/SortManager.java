package com.sparta.tw.sortManagement;

import com.sparta.tw.sorters.SortFactory;
import com.sparta.tw.sorters.Sorter;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class SortManager {

    static final String LOG_PROPERTIES_FILE = "resources/log4j.properties";
    static Logger log = Logger.getLogger(SortManager.class.getName());

    public int[] sortArray(int[] arrayToSort){
//      Sorter sorter = SortFactory.getInstance("Bubble"); //BUBBLE
        Sorter sorter = SortFactory.getInstance("Merge"); //MERGE
        startLog();

        return sorter.sortArray(arrayToSort);


    }

    public static void startLog(){
        initialiseLogging();
        LoggingExample loggingExample = new LoggingExample();
        loggingExample.setMessage("Welcome to Logging");
        loggingExample.displayMessage();
    }

    public static void initialiseLogging(){
        PropertyConfigurator.configure(LOG_PROPERTIES_FILE);
        log.debug("Logging initialised");
    }
    public void displayArray() {
    }

    private void createArray(){
    }



}
