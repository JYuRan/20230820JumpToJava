import java.util.*;

public class Example07_Test03 {

    public static void main(String[] args) {
        //Q1 평균을 구하자 ㅎㅎ
        int a = 80;
        int b = 75;
        int c = 55;
        System.out.println((a+b+c) / 3);

        //Q3 주민등록번호를 자리와 뒷자리로 나누자 ㅎㅎ
        String pin = "881120-108234";
        String yyyyMMdd = pin.substring(0, 6);
        String num = pin.substring(7);
        System.out.println(yyyyMMdd);
        System.out.println(num);
        System.out.println(pin);

        //Q4 뒷번호 첫자리 추출
        System.out.println(pin.charAt(7));

        //Q6 리스트를 역순으로 정렬하자
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1,3,5,4,2));
        myList.sort(Comparator.reverseOrder());
        System.out.println(myList);

        //Q7 리스트를 문자열로 만들기
        ArrayList<String> myList2 = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
        String result07 = String.join(" ", myList2);
        System.out.println(result07);

        //Q8 맵에서 값 삭제하기
        HashMap<String, Integer> greade = new HashMap<>();
        greade.put("A", 90);
        greade.put("B", 80);
        greade.put("C", 70);
        int result08 = greade.remove("B");
        System.out.println(result08);
        System.out.println(greade);

        //Q09 중복 숫자 제거하기
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
        HashSet<Integer> temp = new HashSet<>(numbers);
        ArrayList<Integer> result09 = new ArrayList<>(temp);
        System.out.println(result09);

        //Q10 매직 넘버 제거하기
        printCoffePrice(CoffeType.AMERICANO);
        //printCoffePrice(99);


    }
    enum CoffeType{
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    };
    static void printCoffePrice(CoffeType type){
        HashMap<CoffeType, Integer> priceMap = new HashMap<>();

        priceMap.put(CoffeType.AMERICANO, 3000);
        priceMap.put(CoffeType.ICE_AMERICANO, 4000);
        priceMap.put(CoffeType.CAFE_LATTE, 5000);
        int price = priceMap.get(type);
        System.out.println(String.format("가격은%d원 입니다.", price));


    }

}
