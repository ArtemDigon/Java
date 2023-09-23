package lab_2;

public class testList{

    public static void main (String[] args){
        myList<Integer> a = new myList<Integer>();// инициализируем обьект класса
        for (int i = 0; i < 6; i++){// заполнение списка с головы
            a.push_back(i);
        }
        System.out.println("это лист a: ");
        a.printf();//вывод списка
        a.deleteElement(1);//удаляем элемент равный 1 в списке
        a.printf();//вывод списка
        a.push_front(3);// добавим 3 в лист с хвоста
        int size = a.listSize();// размер листа
        System.out.println("размер листа:" + size);
        System.out.println("это лист b: ");
        myList<Integer> b = new myList<>(a);// инициализируем лист b
        b.push_back(15);// добавляем элемент 15 с головы
        b.printf();// вывод списка
        b.deleteList();// очищаем список
        b.printf();
    }
}
