import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BubbleSort {

    //    public static
    public static void main(String[] args) {
        ArrayList<Persion> list = new ArrayList<>();
        Persion persion1 = new Persion(01, "híu", 21);
        Persion persion2 = new Persion(03, "toan", 22);
        Persion persion3 = new Persion(05, "công", 25);
        Persion persion4 = new Persion(04, "luc", 27);
        list.add(persion1);
        list.add(persion2);
        list.add(persion3);
        list.add(persion4);
        System.out.println("_____Trước khi sắp xếp");
        showlist(list);
        bubblesort(list);
        System.out.println("Sau khi bubble");
        showlist(list);

    }
    public static void bubblesort(ArrayList<Persion> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = list.size()-1; j > i; j--) {
                if (list.get(j).getId() < list.get(j - 1).getId()) {
                    Persion temp = list.get(j);
                    list.set(j,list.get(j-1));
                    list.set(j-1,temp);
                }
            }
        }
//        for (int i = 0; i < list.size(); i++) {
//            Collections.sort(list, new Comparator<Persion>() {
//                @Override
//                public int compare(Persion o1, Persion o2) {
//                    return o1.getId().compareTo(o2.getId());
//                }
//            });
//        }
    }

    public static void showlist(ArrayList<Persion> list) {
        for (Persion p :
                list) {
            System.out.println(p.toString());
        }
    }

}
