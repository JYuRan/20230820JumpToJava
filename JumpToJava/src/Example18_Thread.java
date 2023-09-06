public class Example18_Thread extends Thread{
    int seq ;
    public Example18_Thread(int seq){
        this.seq = seq;
    }
    
    public  void run(){
        System.out.println("thread run");
        try {
            Thread.sleep(1000);
        }catch (Exception e){
            
        }
        System.out.println(this.seq + " thread.end.");  //스레드 종료
    }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread t = new Example18_Thread(i);
            t.start();
        }
        System.out.println("main end,");
        // run 열번 실행 후 main 종료,
        // 1초 대기들 끝나고 end출력(new 클래스 생성)
    }
}
