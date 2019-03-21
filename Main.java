package smarthouse;

import smarthouse.enums.*;

import java.util.ArrayList;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

      static {
        ArrayList<Room> listOfRooms = new ArrayList<Room>();

        listOfRooms.add(GetInfo.kitchen);
        listOfRooms.add(GetInfo.bathroom);
        listOfRooms.add(GetInfo.livingroom);
        listOfRooms.add(GetInfo.bedroom);
        listOfRooms.add(GetInfo.corridor);

        for (int i = 0; i <5 ; i++) {
            int randomNumber  = (int)(Math.random()*2);
            if(randomNumber == 0){
                listOfRooms.get(i).setStatus(RoomsStatus.CLEAN);
            }else {
                listOfRooms.get(i).setStatus(RoomsStatus.DIRTY);
            }
        }

        GetInfo.vacuumCleaner.setPower((int)(Math.random()*(100-50))+50+1);
    }

    private static Logger LOGGER = LoggerFactory.getLogger(Main.class);
    public static Scanner scanner = new Scanner(System.in);
    static String message;

    public static void main(String[] args) throws InterruptedException {

        System.err.println((char) 27 + "[31m☻☻☻------------Welcome to the Smart House------------☻☻☻" + (char)27 + "[0m");
        Thread.sleep(100);
        System.out.println("\n" + (char) 27 + "[32mInfo about each room in house: " + (char)27 + "[0m");

        GetInfo.getInfoAboutTheKitchen();
        GetInfo.getInfoAboutTheBathroom();
        GetInfo.getInfoAboutTheLivingRoom();
        GetInfo.getInfoAboutTheBedRoom();
        GetInfo.getInfoAboutTheCorridor();
        ;
        while (true){
           GetInfo.getMenu();
           LOGGER.info("Type: ");
           message = scanner.next().trim();
           if (message.equals("bye")) {
               break;
           } else if (message.equals("1")) {
               if(GetInfo.vacuumCleaner.getStatusOfWork().equals(VacuumCleanerStatusOfWork.WORKING)){
                   System.out.println("Vacuum Cleaner is working... Wait!");
               }else {
                   GetInfo.getVacuumCleanerMenu();
               }
           } else if (message.equals("2")) {
                GetInfo.getLightingMenu();
           } else if (message.equals("3")) {
               if (GetInfo.climateControl.getStatusOfWork().equals(ClimateControlStatusOfWork.WORKING)){
                   System.out.println("Smart Bath is working...Wait!  ");
               }else {
                   GetInfo.getClimateControlMenu();
               }
           } else if (message.equals("4")) {
               if(GetInfo.microwaveAndOven.getStatusOfWork().equals(MicrowaveAndOvenStatusOfWork.WORKING)){
                   System.out.println("Microwave/Oven is working... Wait!");
               }else if(GetInfo.microwaveAndOven.getUniqueNumber() == 0) {
                   GetInfo.getMicrowaveAndOvenMenu();
               }else {
                   System.out.println((char) 27 + "[31mThe dish is ready" + (char)27 + "[0m");
               }
           } else if (message.equals("5")) {
                GetInfo.getAudioSystemMenu();
           } else if (message.equals("6")) {
                if (GetInfo.smartBath.getStatusOfWork().equals(SmartBathStatusOfWork.WORKING)){
                    System.out.println("Smart Bath is working...Wait!  ");
                }else {
                    GetInfo.getSmartBathMenu();
                }
           } else if (message.equals("7")) {
                GetInfo.getJalousieMenu();
           }else {
               System.out.println("Incorrect message! Try again");
           }

       }
    }



}
