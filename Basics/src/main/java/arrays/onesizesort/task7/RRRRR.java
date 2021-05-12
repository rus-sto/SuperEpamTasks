//package arrays.onesizesort.task7;
//
//
//    import static java.lang.System.out;
//    public class RRRRR {
//
//        public static void main(String[] args) {
//            // TODO Auto-generated method stub
//
//            int k = 3;
//            int n = 12;
//            //Создал два массива, вывел
//            //Один с нулями, второй - случ. числами
//            int [] mas = new int [n];
//            int [] mas1 = new int [n+k];
//            out.println();
//            out.println("Заполняем первый массив случайными числами");
//            for (int i = 0; i < mas.length; i++){
//                mas [i] = (int)(Math.random()*30);
//                out.format("%3d", mas [i]);
//            }
//            out.println();
//            out.println("Смещаем массив вправо на k элементов");
//            for (int i = 0; i < mas.length; i++){
//                mas1 [i+k] = mas[i];
//                mas[i] = mas1[i];
//                out.format("%3d", mas [i]);
//            }
//            out.println();
//            out.println("Снова заполняем первый массив случайными числами");
//            for (int i = 0; i < mas.length; i++){
//                mas [i] = (int)(Math.random()*45);
//                out.format("%3d", mas [i]);
//            }
//
//            out.println();
//            out.println("Смещаем массив влево на k элементов");
//            for (int i = mas.length; i > 0 ; i--){
//                mas1 [i-k] = mas[i];
//                mas[i] = mas1[i];
//                out.format("%3d", mas [i]);
//            }
//
//        }
//    }
//
