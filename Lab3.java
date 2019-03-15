/**
 #  C3=0    StringBuilder
 #  C13=15  В заданому тексті замінити
 #              слова заданої довжини визначеним рядком.
 */

public class Lab3 {

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("hello world !!!");
        String s1 = s.toString();
        String list[];
        list = s1.split(" ");
        String substring = "test";
        s.delete(0, s.length());
        int kst = 3;

        for(int i = 0; i < list.length; i++){
            if (list[i].length() == kst){
                list[i] = substring;
            }
            if (i == list.length - 1) {
                s.append(list[i]);
            }
            else{
                s.append(list[i]).append(" ");
            }

        }
        System.out.println(s);

    }
}


