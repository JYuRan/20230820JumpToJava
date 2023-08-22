class Singleton{
    private static Singleton one;
    private Singleton(){

    }

    public static Singleton getInstance(){
        if (one == null){
            // 객체가 없으면 생성
            one = new Singleton();
        }
        // 존재하면 객체 반환
        return one;
    }
}

public class Example17_Singleton {
    public static void main(String[] args) {
        //Singleton singleton = Singleton();

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2 == singleton1);
    }
}
