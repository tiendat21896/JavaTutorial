package Lab_S7;

public class CountDownThread extends Thread {

    public void run() {
        int Count = 10;
        for(int i = Count; i > 0 ; i-- ){
            System.out.println(i);
            try{
                java.lang.Thread.sleep(1000);
            }catch (Exception e){}
        }
        System.out.println("HAPPY NEW YEAR");
    }
}
