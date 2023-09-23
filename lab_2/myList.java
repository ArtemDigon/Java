package lab_2;

public class myList<T> {
    class node {
        node next; // указатель на следующие данные
        T data; // данные

        public node(T data) {// конструктор
            this.data = data;
            next = null;
        }
    }

    private node tail;
    private node head;
    private  int size;

    public myList() { // конструктор поумолчанию
        head = null;
        tail = null;
    }
    public myList(myList<T> list) {//конструктор копирования
        tail = list.tail;
        head = list.head;
    }

    public void push_back(T data) {// метод добавления данных с головы листа
        node newNode = new node(data);//создаем новый новый обьект
        if (head == null) { // если список пустой
            head = newNode;// один элемент, значит хвост и голова равны
            tail = newNode;
        } else {
            newNode.next = head;// передаем ссылку на бывшую верхушку
            head = newNode;// верхушка списка теперь новый элемент
        }
    }

    public void deleteElement(T data){
        node current = head;// текущее позиция
        node previous = null;// перед текущей позицией
        int flag = 0;//нашли или не нашли нужный элемент
        if (head == null)// если список пуст
            System.out.println("список пуст");
        else if (head == tail){// если в списке один элемент
            head = null;
            tail = null;
        }
        else {
            while (current.next != null){ // идем по списку

                if (current.data == data){//нашли нужный элемент
                    if (current == head){//если он верхушка
                        head = current.next;// то голова списка это след.
                        //элемент в списке
                        flag = 1;// нашли нужный элемент
                        return;//выходим,чтобы не удалять похожие элементы
                    }
                    else{// если не верхушка
                        previous.next = current.next;//передаем ссылку текущего предыдущему
                        flag = 1;//нашли нужный элемент
                        return;// чтобы не удалить похожие
                   }
                }
                previous = current;// предыдущий равен текущему
                current = current.next;// текущий равен следующему
                // делаем иттераци/
            }
        }
        if (flag == 0)// проверка нашли или не нашли нужный элемент
            System.out.println("данного элемента нету в списке");
    }

    public void deleteList(){
        head = null;
        tail = null;
    }


    public void deleteHead(){
        if (head == null)// если нет элементво в списке
            System.out.println("список пуст");
        else if (head == tail){// если в списке один элемент
            head = null;
            tail = null;
        }
        else {
            head = head.next;// голова теперь следующий после текущего
        }
    }

    public void push_front(T data) {
        node newNode = new node(data);
        if (tail == null){// если список пуст
            tail = newNode;
            head = newNode;
        }
        else {
            tail.next = newNode;// передаем ссылку на новый элемент
            tail =  newNode;// хвост теперь это новый элемент
        }
    }
    public int listSize(){
        this.size = 0;
        node start = head;
        while (start.next != null) {// идем по списку и увеличиваем size
            this.size++;
            start = start.next;// переходим на новый элемент
        }
        return this.size;
    }

    public void printf() {
        if (head == null)
            System.out.println("этот список пуст!");
        else{
            node start = head;// передаем ссылку на голову(начало списка)
            while (start.next != null){// идем по списку и выводим
                System.out.print(start.data + " ");// выводим
                start = start.next;// переходим к следующему элементу
            }
            System.out.println();
        }
    }
}
