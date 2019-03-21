package smarthouse;

import smarthouse.enums.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.util.ArrayList;


public class GetInfo{

    private static Logger LOGGER = LoggerFactory.getLogger(GetInfo.class);

    public static Room kitchen = new Room(26);
    public static Room bathroom = new Room(20);
    public static Room livingroom = new Room(38);
    public static Room bedroom = new Room(30);
    public static Room corridor = new Room(10);

    public static VacuumCleaner vacuumCleaner = new VacuumCleaner(StatusOfWear.NEW);

    public static Lighting kitchenLighting = new Lighting(StatusOfWear.USEABLE,Color.YELLOW);
    public static Lighting bathroomLighting = new Lighting(StatusOfWear.NEW, Color.WHITE);
    public static Lighting livingroomLighting = new Lighting(StatusOfWear.USEABLE,Color.YELLOW);
    public static Lighting bedroomLighting = new Lighting(StatusOfWear.NEW,Color.YELLOW);
    public static Lighting corridorLighting = new Lighting(StatusOfWear.OUTDATED, Color.WHITE);

    public static ClimateControl climateControl = new ClimateControl();

    public static MicrowaveAndOven microwaveAndOven = new MicrowaveAndOven(StatusOfWear.USEABLE);

    public static AudioSystem kitchenAudioSystem = new AudioSystem(StatusOfWear.NEW);
    public static AudioSystem bathroomAudioSystem = new AudioSystem(StatusOfWear.USEABLE);
    public static AudioSystem livingroomAudioSystem = new AudioSystem(StatusOfWear.USEABLE);
    public static AudioSystem bedroomAudioSystem = new AudioSystem(StatusOfWear.NEW);
    public static AudioSystem corridorAudioSystem = new AudioSystem(StatusOfWear.NEW);

    public static SmartBath smartBath = new SmartBath(StatusOfWear.NEW);

    public static Jalousie kitchenJalousie = new Jalousie(StatusOfWear.NEW);
    public static Jalousie livingroomJalousie = new Jalousie(StatusOfWear.USEABLE);
    public static Jalousie bedroomJalousie = new Jalousie(StatusOfWear.NEW);


    public static void getInfoAboutTheKitchen(){
        System.out.print("Kitchen[");
        System.out.print("Status:" + kitchen.getStatus() + "; Area: "+kitchen.getArea()+ "; Temperature: " +climateControl.getTemperature()+
                "; smarthouse.Lighting: 1.Status of wear: " + kitchenLighting.getStatusOfWear()+", 2.Status Of Work: "+kitchenLighting.getStatusOfWork()+
                ", 3.Brightness: "+kitchenLighting.getBrightness()+", 4.Color: "+kitchenLighting.getColor()+
                "; Microwave/Oven: 1.Fullness: "+ microwaveAndOven.getFullness()+", 2.Status of wear: "+microwaveAndOven.getStatusOfWear()+
                "; Audio System: 1.Volume: "+kitchenAudioSystem.getVolume()+", 2.Status of work: "+
                kitchenAudioSystem.getStatusOfWork()+", 3.Status of wear:"+ kitchenAudioSystem.getStatusOfWear());
        System.out.println("]");
    }

    public static void getInfoAboutTheBathroom(){
        System.out.print("Bathroom[");
        System.out.print("Status:" + bathroom.getStatus() + "; Area: "+bathroom.getArea()+ "; Temperature: " +climateControl.getTemperature()+
                "; smarthouse.Lighting: 1.Status of wear: " + bathroomLighting.getStatusOfWear()+", 2.Status Of Work: "+bathroomLighting.getStatusOfWork()+
                ", 3.Brightness: "+bathroomLighting.getBrightness()+", 4.Color: "+bathroomLighting.getColor()+
                "; Audio System: 1.Volume: "+bathroomAudioSystem.getVolume()+", 2.Status of work: "+
                bathroomAudioSystem.getStatusOfWork()+", 3.Status of wear:"+ bathroomAudioSystem.getStatusOfWear()+
                "; Smart bath: 1.Level of water: "+ smartBath.getLevelOfWater()+", 2.Temperature: "+ smartBath.getTemperature()+", 3.Status of wear: "+smartBath.getStatusOfWear());
        System.out.println("]");
    }

    public static void getInfoAboutTheLivingRoom(){
        System.out.print("Living room[");
        System.out.print("Status:" + livingroom.getStatus() + "; Area: "+livingroom.getArea()+ "; Temperature: " +climateControl.getTemperature()+
                "; Lighting: 1.Status of wear: " + livingroomLighting.getStatusOfWear()+", 2.Status Of Work: "+livingroomLighting.getStatusOfWork()+
                ", 3.Brightness: "+livingroomLighting.getBrightness()+", 4.Color: "+livingroomLighting.getColor()+
                "; Audio System: 1.Volume: "+livingroomAudioSystem.getVolume()+", 2.Status of work: "+
                livingroomAudioSystem.getStatusOfWork()+", 3.Status of wear: "+ livingroomAudioSystem.getStatusOfWear());
        System.out.println("]");
    }

    public static void getInfoAboutTheBedRoom(){
        System.out.print("Bedroom[");
        System.out.print("Status:" + bedroom.getStatus() + "; Area: "+bedroom.getArea()+ "; Temperature: " +climateControl.getTemperature()+
                "; Lighting: 1.Status of wear: " + bedroomLighting.getStatusOfWear()+", 2.Status Of Work: "+bedroomLighting.getStatusOfWork()+
                ", 3.Brightness: "+bedroomLighting.getBrightness()+", 4.Color: "+bedroomLighting.getColor()+
                "; Audio System: 1.Volume: "+bedroomAudioSystem.getVolume()+", 2.Status of work: "+
                bedroomAudioSystem.getStatusOfWork()+", 3.Status of wear:"+ bedroomAudioSystem.getStatusOfWear());
        System.out.println("]");
    }

    public static void getInfoAboutTheCorridor(){
        System.out.print("Corridor[");
        System.out.print("Status:" + corridor.getStatus() + "; Area: "+corridor.getArea()+ "; Temperature: " +climateControl.getTemperature()+
                "; Vacuum cleaner: 1.Power: "+ vacuumCleaner.getPower()+", 2.Status Of Work: "+vacuumCleaner.getStatusOfWork()+", 3.Status of wear: "+vacuumCleaner.getStatusOfWear()+
                "; Lighting: 1.Status of wear: " + corridorLighting.getStatusOfWear()+", 2.Status Of Work: "+corridorLighting.getStatusOfWork()+
                ", 3.Brightness: "+corridorLighting.getBrightness()+", 4.Color: "+corridorLighting.getColor()+
                "; Audio System: 1.Volume: "+corridorAudioSystem.getVolume()+", 2.Status of work: "+
                corridorAudioSystem.getStatusOfWork()+", 3.Status of wear:"+ corridorAudioSystem.getStatusOfWear());
        System.out.println("]");
    }

    public static void getMenu(){
        System.out.println();
        System.out.println((char) 27 + "[32mMenu: " + (char)27 + "[0m");
        System.out.println("Type " + (char) 27 + "[31m1" + (char)27 + "[0m" + " to get the Vacuum Cleaner menu");
        System.out.println("Type " + (char) 27 + "[31m2" + (char)27 + "[0m" + " to get the Lighting menu");
        System.out.println("Type " + (char) 27 + "[31m3" + (char)27 + "[0m" + " to get the Climate Control menu");
        System.out.println("Type " + (char) 27 + "[31m4" + (char)27 + "[0m" + " to get the Microwave/Oven menu");
        System.out.println("Type " + (char) 27 + "[31m5" + (char)27 + "[0m" + " to get the Audio System menu");
        System.out.println("Type " + (char) 27 + "[31m6" + (char)27 + "[0m" + " to get the Smart Bath menu");
        System.out.println("Type " + (char) 27 + "[31m7" + (char)27 + "[0m" + " to get the Jalousie menu");
        System.out.println("Type " + (char) 27 + "[31mbye" + (char)27 + "[0m" + " to stop the program");
        System.out.println();
    }

    public static boolean checkForVacuumCleaner(String[] list, String str){
        boolean check = false;
        for (int i = 0; i < list.length ; i++) {
            if (list[i] != null && list[i].equals(str)){
                check = true;
                break;
            }
        }
        return check;
    }

    public static boolean checkForLighting(LightingStatusOfWork statusOfWork){
        boolean check = false;
        if (statusOfWork.equals(LightingStatusOfWork.TURNED_ON)){
            check = true;
        }
        return check;
    }

    public static boolean checkForAudioSystem(AudioSystemStatusOfWork statusOfWork){
        boolean check = false;
        if (statusOfWork.equals(AudioSystemStatusOfWork.PLAYING)){
            check = true;
        }
        return check;
    }

    public static boolean checkForJalousie(JalousieStatusOfWork statusOfWork){
        boolean check = false;
        if (statusOfWork.equals(JalousieStatusOfWork.OPENED)){
            check = true;
        }
        return check;
    }

    public static void getVacuumCleanerMenu() throws InterruptedException {
        int counterOfCleanRooms = 0;
        String message;
        ArrayList<RoomsStatus> listOfRoomStatus = new ArrayList<RoomsStatus>();
        String[] listOfDirtyRooms = new String[5];

        listOfRoomStatus.add(kitchen.getStatus());
        listOfRoomStatus.add(bathroom.getStatus());
        listOfRoomStatus.add(livingroom.getStatus());
        listOfRoomStatus.add(bedroom.getStatus());
        listOfRoomStatus.add(corridor.getStatus());

        for (int i = 0; i < 5; i++) {
            if (listOfRoomStatus.get(i).equals(RoomsStatus.CLEAN)){
                counterOfCleanRooms++;
            }
        }

        System.out.println("Current vacuum cleaner charge " + vacuumCleaner.getPower() + " percents" +
                "; status of work: "+vacuumCleaner.getStatusOfWork()+
                "; status of wear: "+vacuumCleaner.getStatusOfWear());



        if(counterOfCleanRooms == 5){
            System.out.println("All rooms are clear!");
            if (vacuumCleaner.getPower()<100){
                vacuumCleaner.setNeededPower(100);
                System.out.println((char) 27 + "[32mVacuum Cleaner is charging..." + (char) 27  + "[0m");
                vacuumCleaner.setStatusOfWork(VacuumCleanerStatusOfWork.CHARGING);
                new Thread(vacuumCleaner).start();
                Thread.sleep(250);
            }

        }else {
            if (vacuumCleaner.getPower()>38) {
                System.out.println("List of DIRTY rooms:");
                if(kitchen.getStatus().equals(RoomsStatus.DIRTY)){
                    System.out.println("- Kitchen\t\t\t\t\t" + "type " + (char) 27 + "[31mkit" + (char)27 + "[0m" + " to clean ");
                    listOfDirtyRooms[0] = "kit";
                }
                if(bathroom.getStatus().equals(RoomsStatus.DIRTY)){
                    System.out.println("- Bathroom\t\t\t\t\t" + "type " + (char) 27 + "[31mbath" + (char)27 + "[0m" + " to clean ");
                    listOfDirtyRooms[1] = "bath";
                }
                if(livingroom.getStatus().equals(RoomsStatus.DIRTY)){
                    System.out.println("- Living room\t\t\t\t" + "type " + (char) 27 + "[31mliv" + (char)27 + "[0m" + " to clean ");
                    listOfDirtyRooms[2] = "liv";
                }
                if(bedroom.getStatus().equals(RoomsStatus.DIRTY)){
                    System.out.println("- Bedroom\t\t\t\t\t" + "type " + (char) 27 + "[31mbed" + (char)27 + "[0m" + " to clean ");
                    listOfDirtyRooms[3] = "bed";
                }
                if(corridor.getStatus().equals(RoomsStatus.DIRTY)){
                    System.out.println("- Corridor\t\t\t\t\t" + "type " + (char) 27 + "[31mcorr" + (char)27 + "[0m" + " to clean ");
                    listOfDirtyRooms[4] = "corr";
                }
                System.out.println( "type " + (char) 27 + "[31mcancel" + (char)27 + "[0m" + " to go back\n");

                while (true) {
                    LOGGER.info("Type: ");
                    message = Main.scanner.next().trim();
                    if (message.equals("cancel")) {
                        break;
                    } else if (message.equals("kit")) {
                        if (checkForVacuumCleaner(listOfDirtyRooms, message)) {
                            vacuumCleaner.setStatusOfWork(VacuumCleanerStatusOfWork.WORKING);
                            vacuumCleaner.setUniqueNumber(1);
                            new Thread(vacuumCleaner).start();
                            Thread.sleep(250);
                            break;
                        } else {
                            System.out.println("Incorrect message! Try again");
                        }
                    } else if (message.equals("bath")) {
                        if (checkForVacuumCleaner(listOfDirtyRooms, message)) {
                            vacuumCleaner.setStatusOfWork(VacuumCleanerStatusOfWork.WORKING);
                            vacuumCleaner.setUniqueNumber(2);
                            new Thread(vacuumCleaner).start();
                            Thread.sleep(250);
                            break;
                        } else {
                            System.out.println("Incorrect message! Try again");
                        }
                    } else if (message.equals("liv")) {
                        if (checkForVacuumCleaner(listOfDirtyRooms, message)) {
                            vacuumCleaner.setStatusOfWork(VacuumCleanerStatusOfWork.WORKING);
                            vacuumCleaner.setUniqueNumber(3);
                            new Thread(vacuumCleaner).start();
                            Thread.sleep(250);
                            break;
                        } else {
                            System.out.println("Incorrect message! Try again");
                        }
                    } else if (message.equals("bed")) {
                        if (checkForVacuumCleaner(listOfDirtyRooms, message)) {
                            vacuumCleaner.setStatusOfWork(VacuumCleanerStatusOfWork.WORKING);
                            vacuumCleaner.setUniqueNumber(4);
                            new Thread(vacuumCleaner).start();
                            Thread.sleep(250);
                            break;
                        } else {
                            System.out.println("Incorrect message! Try again");
                        }
                    } else if (message.equals("corr")) {
                        if (checkForVacuumCleaner(listOfDirtyRooms, message)) {
                            vacuumCleaner.setStatusOfWork(VacuumCleanerStatusOfWork.WORKING);
                            vacuumCleaner.setUniqueNumber(5);
                            new Thread(vacuumCleaner).start();
                            Thread.sleep(250);
                            break;
                        } else {
                            System.out.println("Incorrect message! Try again");
                        }
                    } else {
                        System.out.println("Incorrect message! Try again");
                    }
                }
            }else {
                System.out.println("The charge of the vacuum cleaner is not enough to clean the room");
                vacuumCleaner.setStatusOfWork(VacuumCleanerStatusOfWork.CHARGING);
                vacuumCleaner.setNeededPower(40);
                new Thread(vacuumCleaner).start();
                Thread.sleep(250);
            }

        }



    }

    public static void getLightingMenu(){

        String message;

        System.out.println("Current status of lighting in house:");
        System.out.println("- Kitchen\t\t\t\t\tstatus: "+kitchenLighting.getStatusOfWork() +" type " + (char) 27 + "[31mkit" + (char)27 + "[0m" + " to change lighting status of room");
        System.out.println("- Bathroom\t\t\t\t\tstatus: "+bathroomLighting.getStatusOfWork() +" type " + (char) 27 + "[31mbath" + (char)27 + "[0m" + " to change lighting status of room");
        System.out.println("- Living room\t\t\t\tstatus: "+livingroomLighting.getStatusOfWork() +" type " + (char) 27 + "[31mliv" + (char)27 + "[0m" + " to change lighting status of room");
        System.out.println("- Bedroom\t\t\t\t\tstatus: "+bedroomLighting.getStatusOfWork() +" type " + (char) 27 + "[31mbed" + (char)27 + "[0m" + " to change lighting status of room");
        System.out.println("- Corridor\t\t\t\t\tstatus: "+corridorLighting.getStatusOfWork() +" type " + (char) 27 + "[31mcorr" + (char)27 + "[0m" + " to change lighting status of room");
        System.out.println( "type " + (char) 27 + "[31mcancel" + (char)27 + "[0m" + " to go back\n");

        while (true){
            LOGGER.info("Type: ");
            message = Main.scanner.next().trim();
            if(message.equals("cancel")){
                break;
            }else if(message.equals("kit")){
                if (checkForLighting(kitchenLighting.getStatusOfWork())){
                    kitchenLighting.setStatusOfWork(LightingStatusOfWork.TURNED_OFF);
                }else {
                    kitchenLighting.setStatusOfWork(LightingStatusOfWork.TURNED_ON);
                    while (true){
                        LOGGER.info("Type brightness(0-100):");
                        int brightness = Main.scanner.nextInt();
                        if (brightness>=1 && brightness<=100) {
                            kitchenLighting.setBrightness(brightness);
                            break;
                        }else {
                            System.out.println("Incorrect message! Try again");
                        }
                    }
                }
                System.out.println((char) 27 + "[32mChanged" + (char) 27  + "[0m\n");
                getLightingMenu();
                break;
            }else if(message.equals("bath")){
                if (checkForLighting(bathroomLighting.getStatusOfWork())){
                    bathroomLighting.setStatusOfWork(LightingStatusOfWork.TURNED_OFF);
                }else {
                    bathroomLighting.setStatusOfWork(LightingStatusOfWork.TURNED_ON);
                    while (true){
                        LOGGER.info("Type brightness(0-100):");
                        int brightness = Main.scanner.nextInt();
                        if (brightness>=1 && brightness<=100) {
                            bathroomLighting.setBrightness(brightness);
                            break;
                        }else {
                            System.out.println("Incorrect message! Try again");
                        }
                    }
                }
                System.out.println((char) 27 + "[32mChanged" + (char) 27  + "[0m\n");
                getLightingMenu();
                break;
            }else if(message.equals("liv")){
                if (checkForLighting(livingroomLighting.getStatusOfWork())){
                    livingroomLighting.setStatusOfWork(LightingStatusOfWork.TURNED_OFF);
                }else {
                    livingroomLighting.setStatusOfWork(LightingStatusOfWork.TURNED_ON);
                    while (true){
                        LOGGER.info("Type brightness(0-100):");
                        int brightness = Main.scanner.nextInt();
                        if (brightness>=1 && brightness<=100) {
                            livingroomLighting.setBrightness(brightness);
                            break;
                        }else {
                            System.out.println("Incorrect message! Try again");
                        }
                    }
                }
                System.out.println((char) 27 + "[32mChanged" + (char) 27  + "[0m\n");
                getLightingMenu();
                break;
            }else if(message.equals("bed")){
                if (checkForLighting(bedroomLighting.getStatusOfWork())){
                    bedroomLighting.setStatusOfWork(LightingStatusOfWork.TURNED_OFF);
                }else {
                    bedroomLighting.setStatusOfWork(LightingStatusOfWork.TURNED_ON);
                    while (true){
                        LOGGER.info("Type brightness(0-100):");
                        int brightness = Main.scanner.nextInt();
                        if (brightness>=1 && brightness<=100) {
                            bedroomLighting.setBrightness(brightness);
                            break;
                        }else {
                            System.out.println("Incorrect message! Try again");
                        }
                    }
                }
                System.out.println((char) 27 + "[32mChanged" + (char) 27  + "[0m\n");
                getLightingMenu();
                break;
            }else if(message.equals("corr")){
                if (checkForLighting(corridorLighting.getStatusOfWork())){
                    corridorLighting.setStatusOfWork(LightingStatusOfWork.TURNED_OFF);
                }else {
                    corridorLighting.setStatusOfWork(LightingStatusOfWork.TURNED_ON);
                    while (true){
                        LOGGER.info("Type brightness(0-100):");
                        int brightness = Main.scanner.nextInt();
                        if (brightness>=1 && brightness<=100) {
                            corridorLighting.setBrightness(brightness);
                            break;
                        }else {
                            System.out.println("Incorrect message! Try again");
                        }
                    }
                }
                System.out.println((char) 27 + "[32mChanged" + (char) 27  + "[0m\n");
                getLightingMenu();
                break;
            }else{
                System.out.println("Incorrect message! Try again");
            }
        }
    }

    public static void getClimateControlMenu() throws InterruptedException {
        System.out.println("Current temperature: "+ climateControl.getTemperature());
        System.out.println("Type " + (char) 27 + "[31mchange" + (char)27 + "[0m" + " to change temperature");
        System.out.println("Type " + (char) 27 + "[31mcancel" + (char)27 + "[0m" + " to go back\n");

        while (true){
            LOGGER.info("Type: ");
            String message = Main.scanner.next().trim();
            if(message.equals("cancel")){
                break;
            }else if(message.equals("change")){
                while (true){
                    LOGGER.info("Type the desired temperature:");
                    int temperature = Main.scanner.nextInt();
                    if (temperature == climateControl.getTemperature()){
                        System.out.println("Incorrect message! Try again");
                    }else {
                        climateControl.setNeededTemperature(temperature);
                        climateControl.setStatusOfWork(ClimateControlStatusOfWork.WORKING);
                        break;
                    }
                }
                new Thread(climateControl).start();
                Thread.sleep(250);
                break;
            }else {
                System.out.println("Incorrect message! Try again");
            }
        }
    }

    public static void getMicrowaveAndOvenMenu() throws InterruptedException {
        if(microwaveAndOven.getFullness()){
            System.out.println("Current microwave/oven is full.");
            System.out.println("Type " + (char) 27 + "[31mstart" + (char)27 + "[0m" + " to start microwave/oven working");
            System.out.println("Type " + (char) 27 + "[31mcancel" + (char)27 + "[0m" + " to go back\n");
            while (true){
                LOGGER.info("Type: ");
                String message = Main.scanner.next().trim();
                if(message.equals("cancel")){
                    break;
                }else if(message.equals("start")){
                    while (true) {
                        LOGGER.info("Type time for preparing(milliseconds):");
                        long time = Main.scanner.nextInt();
                        if (time>0) {
                            microwaveAndOven.setTime(time);
                            break;
                        }else {
                            System.out.println("Incorrect message! Try again");
                        }
                    }
                    microwaveAndOven.setStatusOfWork(MicrowaveAndOvenStatusOfWork.WORKING);
                    microwaveAndOven.setUniqueNumber(1);
                    new Thread(microwaveAndOven).start();
                    Thread.sleep(250);
                    break;
                }else {
                    System.out.println("Incorrect message! Try again");
                }
            }

        }else {
            System.out.println("Current microwave/oven is empty.");
            System.out.println("Type " + (char) 27 + "[31mcancel" + (char)27 + "[0m" + " to go back\n");
            while (true){
            LOGGER.info("Type: ");
            String message = Main.scanner.next().trim();
            if(message.equals("cancel")){
                break;
            }else {
                System.out.println("Incorrect message! Try again");
            }
            }
        }
    }

    public static void getAudioSystemMenu(){

        String message;

        System.out.println("Current status of audio system in house:");
        System.out.println("- Kitchen\t\t\t\t\tstatus: "+kitchenAudioSystem.getStatusOfWork() +" type " + (char) 27 + "[31mkit" + (char)27 + "[0m" + " to change audio system status of room");
        System.out.println("- Bathroom\t\t\t\t\tstatus: "+bathroomAudioSystem.getStatusOfWork() +" type " + (char) 27 + "[31mbath" + (char)27 + "[0m" + " to change audio system status of room");
        System.out.println("- Living room\t\t\t\tstatus: "+livingroomAudioSystem.getStatusOfWork() +" type " + (char) 27 + "[31mliv" + (char)27 + "[0m" + " to change audio system status of room");
        System.out.println("- Bedroom\t\t\t\t\tstatus: "+bedroomAudioSystem.getStatusOfWork() +" type " + (char) 27 + "[31mbed" + (char)27 + "[0m" + " to change audio system status of room");
        System.out.println("- Corridor\t\t\t\t\tstatus: "+corridorAudioSystem.getStatusOfWork() +" type " + (char) 27 + "[31mcorr" + (char)27 + "[0m" + " to change audio system status of room");
        System.out.println( "type " + (char) 27 + "[31mcancel" + (char)27 + "[0m" + " to go back\n");

        while (true){
            LOGGER.info("Type: ");
            message = Main.scanner.next().trim();
            if(message.equals("cancel")){
                break;
            }else if(message.equals("kit")){
                if (checkForAudioSystem(kitchenAudioSystem.getStatusOfWork())){
                    kitchenAudioSystem.setStatusOfWork(AudioSystemStatusOfWork.NOT_PLAYING);
                }else {
                    kitchenAudioSystem.setStatusOfWork(AudioSystemStatusOfWork.PLAYING);
                    while (true){
                        LOGGER.info("Type volume(0-100):");
                        int volume = Main.scanner.nextInt();
                        if (volume>=1 && volume<=100) {
                            kitchenAudioSystem.setVolume(volume);
                            break;
                        }else {
                            System.out.println("Incorrect message! Try again");
                        }
                    }
                }
                System.out.println((char) 27 + "[32mChanged" + (char) 27  + "[0m\n");
                getAudioSystemMenu();
                break;
            }else if(message.equals("bath")){
                if (checkForAudioSystem(bathroomAudioSystem.getStatusOfWork())){
                    bathroomAudioSystem.setStatusOfWork(AudioSystemStatusOfWork.NOT_PLAYING);
                }else {
                    bathroomAudioSystem.setStatusOfWork(AudioSystemStatusOfWork.PLAYING);
                    while (true){
                        LOGGER.info("Type volume(0-100):");
                        int volume = Main.scanner.nextInt();
                        if (volume>=1 && volume<=100) {
                            bathroomAudioSystem.setVolume(volume);
                            break;
                        }else {
                            System.out.println("Incorrect message! Try again");
                        }
                    }
                }
                System.out.println((char) 27 + "[32mChanged" + (char) 27  + "[0m\n");
                getAudioSystemMenu();
                break;
            }else if(message.equals("liv")){
                if (checkForAudioSystem(livingroomAudioSystem.getStatusOfWork())){
                    livingroomAudioSystem.setStatusOfWork(AudioSystemStatusOfWork.NOT_PLAYING);
                }else {
                    livingroomAudioSystem.setStatusOfWork(AudioSystemStatusOfWork.PLAYING);
                    while (true){
                        LOGGER.info("Type volume(0-100):");
                        int volume = Main.scanner.nextInt();
                        if (volume>=1 && volume<=100) {
                            livingroomAudioSystem.setVolume(volume);
                            break;
                        }else {
                            System.out.println("Incorrect message! Try again");
                        }
                    }
                }
                System.out.println((char) 27 + "[32mChanged" + (char) 27  + "[0m\n");
                getAudioSystemMenu();
                break;
            }else if(message.equals("bed")){
                if (checkForAudioSystem(bedroomAudioSystem.getStatusOfWork())){
                    bedroomAudioSystem.setStatusOfWork(AudioSystemStatusOfWork.NOT_PLAYING);
                }else {
                    bedroomAudioSystem.setStatusOfWork(AudioSystemStatusOfWork.PLAYING);
                    while (true){
                        LOGGER.info("Type volume(0-100):");
                        int volume = Main.scanner.nextInt();
                        if (volume>=1 && volume<=100) {
                            bedroomAudioSystem.setVolume(volume);
                            break;
                        }else {
                            System.out.println("Incorrect message! Try again");
                        }
                    }
                }
                System.out.println((char) 27 + "[32mChanged" + (char) 27  + "[0m\n");
                getAudioSystemMenu();
                break;
            }else if(message.equals("corr")){
                if (checkForAudioSystem(corridorAudioSystem.getStatusOfWork())){
                    corridorAudioSystem.setStatusOfWork(AudioSystemStatusOfWork.NOT_PLAYING);
                }else {
                    corridorAudioSystem.setStatusOfWork(AudioSystemStatusOfWork.PLAYING);
                    while (true){
                        LOGGER.info("Type volume(0-100):");
                        int volume = Main.scanner.nextInt();
                        if (volume>=1 && volume<=100) {
                            corridorAudioSystem.setVolume(volume);
                            break;
                        }else {
                            System.out.println("Incorrect message! Try again");
                        }
                    }
                }
                System.out.println((char) 27 + "[32mChanged" + (char) 27  + "[0m\n");
                getAudioSystemMenu();
                break;
            }else{
                System.out.println("Incorrect message! Try again");
            }
        }

    }

    public static void getSmartBathMenu() throws InterruptedException {
        System.out.println("Current smart bath status of work: " + smartBath.getStatusOfWork() +
                            ", level of water: " + smartBath.getLevelOfWater() +
                            ", temperature of water: "+smartBath.getTemperature());

        System.out.println("Type " + (char) 27 + "[31mstart" + (char)27 + "[0m" + " to start smart bath working");
        System.out.println("Type " + (char) 27 + "[31mcancel" + (char)27 + "[0m" + " to go back\n");

        while (true){
            LOGGER.info("Type: ");
            String message = Main.scanner.next().trim();
            if (message.equals("cancel")){
                break;
            }else if (message.equals("start")){
                smartBath.setStatusOfWork(SmartBathStatusOfWork.WORKING);
                while (true){
                    LOGGER.info("Type level of water(1-10): ");
                    int levelOfWater = Main.scanner.nextInt();
                    LOGGER.info("Type temperature of water(0+): ");
                    int temperature = Main.scanner.nextInt();
                    if (levelOfWater>=1 && levelOfWater<=10 && temperature>=1){
                        smartBath.setNeededLevelOfWater(levelOfWater);
                        smartBath.setTemperature(temperature);
                        break;
                    }else {
                        System.out.println("Incorrect message! Try again");
                    }
                }
                new Thread(smartBath).start();
                Thread.sleep(250);
                break;
            }else {
                System.out.println("Incorrect message! Try again");
            }
        }


    }

    public static void getJalousieMenu(){
        String message;

        System.out.println("Current status of jalousie in house:");
        System.out.println("- Kitchen\t\t\t\t\tstatus: "+kitchenJalousie.getStatusOfWork() +" type " + (char) 27 + "[31mkit" + (char)27 + "[0m" + " to change jalousie status of room");
        System.out.println("- Living room\t\t\t\tstatus: "+livingroomJalousie.getStatusOfWork() +" type " + (char) 27 + "[31mliv" + (char)27 + "[0m" + " to change jalousie status of room");
        System.out.println("- Bedroom\t\t\t\t\tstatus: "+bedroomJalousie.getStatusOfWork() +" type " + (char) 27 + "[31mbed" + (char)27 + "[0m" + " to change jalousie status of room");
        System.out.println( "type " + (char) 27 + "[31mcancel" + (char)27 + "[0m" + " to go back\n");

        while (true){
            LOGGER.info("Type: ");
            message = Main.scanner.next().trim();
            if(message.equals("cancel")){
                break;
            }else if(message.equals("kit")){
                if (checkForJalousie(kitchenJalousie.getStatusOfWork())){
                    kitchenJalousie.setStatusOfWork(JalousieStatusOfWork.CLOSED);
                }else {
                    kitchenJalousie.setStatusOfWork(JalousieStatusOfWork.OPENED);
                }
                System.out.println((char) 27 + "[32mChanged" + (char) 27  + "[0m\n");
                getJalousieMenu();
                break;
            }else if(message.equals("liv")){
                if (checkForJalousie(livingroomJalousie.getStatusOfWork())){
                    livingroomJalousie.setStatusOfWork(JalousieStatusOfWork.CLOSED);
                }else {
                    livingroomJalousie.setStatusOfWork(JalousieStatusOfWork.OPENED);
                }
                System.out.println((char) 27 + "[32mChanged" + (char) 27  + "[0m\n");
                getJalousieMenu();
                break;
            }else if(message.equals("bed")){
                if (checkForJalousie(bedroomJalousie.getStatusOfWork())){
                    bedroomJalousie.setStatusOfWork(JalousieStatusOfWork.CLOSED);
                }else {
                    bedroomJalousie.setStatusOfWork(JalousieStatusOfWork.OPENED);
                }
                System.out.println((char) 27 + "[32mChanged" + (char) 27  + "[0m\n");
                getJalousieMenu();
                break;
            }else{
                System.out.println("Incorrect message! Try again");
            }
        }
    }
}
