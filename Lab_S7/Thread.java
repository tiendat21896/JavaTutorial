package Lab_S7;

public class Thread implements Runnable {
    public static void main(String[] args) {
        CountDownThread cdt = new CountDownThread();
    //    cdt.run();
        //Lớp Ẩn Danh
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
               for(int i = 10; i > 0 ; i--){
                   for (int j = 60; j > 0; j--){
                       System.out.println(i+ ":" +j);
                       try{
                           java.lang.Thread.sleep(1000);
                       }catch (Exception e){}
                   }
               }
            }
        };
        new java.lang.Thread(r1).start();
    }

    @Override
    public void run() {

    }
}
