package ru.itsjava.collections.lists.linkedlist;


public class MyLinkedList {
    private Node head;

    public int size() {
        int count = 0;
        Node resNode = null;
        if (head != null) {
            count++;
            Node curNode = head;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
                count++;
            }
            curNode.setNext(resNode);
        }
        return count;
    }

    public boolean isEmpty() {
        if (head != null) {
            return false;
        }
        return true;
    }


    public boolean contains(Object o) {
        if (head == null) return false;
        if (head.getValue().equals(o)) return true;
        Node curNode = head;
        while (!(curNode.getNext() == null)) {
            curNode = curNode.getNext();
            if (curNode.getValue().equals(o)) {
                return true;
            }
        }
        return false;
    }

    public boolean add(Object o) {
        Node resNode = new Node(o, null);
        if (head == null) {
            head = resNode;
        } else {
            Node curNode = head;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(resNode);
        }
        return true;
    }

    public boolean remove(Object o) {//Сначала мы проверяем 1 элемент (т.е. head) и если он равен null то
        if (head == null) return false;//соответственно мы и удалить ничего не можем, поэтому и возвращаем false

        if (head.getValue().equals(o)) {//если все таки head равен обьекту,
            head = head.getNext();//то мы присваиваем head-у следующий элемент по порядку
            return true;//
        }
//далее мы создадим curNode и prevNode, но перед этим мы должны проверить если вообще кроме head-а другие элементы
        if (head.getNext() == null) return false;//в списке и если их нет, то проверять нечего и возвратим false

        Node curNode = head;//здесь мы уже создаем curNode и prevNode и ссылаемся на head
        Node prevNode = head;

        while ((curNode = curNode.getNext()) != null) {//здесь мы бежим по списку до последнего элемента и если
            if (curNode.getValue().equals(o)) {//curNode равен указанному объекту то мы останавливаемся
                break;
            }
            prevNode = prevNode.getNext();//в каждой итерации мы должны продвигать prevNode тоже, т.к. они идут
        }//друг за другом, т.е. prevNode идет за curNode

        if (curNode == null) return false;//здесь мы делаем проверку, т.е. если мы пробежали по всему списку и в нем нет
//указанного объекта, т.е. мы получается встали на null, то мы возвращаем false иначе будет ошибка, т.к. у null нельзя
// вызвать какие-либо значения null и будет ошибка nullpointerexception
        prevNode.setNext(curNode.getNext());//если все нормально, то тогда мы перенаправляем ссылку у prevNode
        //на тот элемент который был перед curNode по порядку
        curNode.setNext(null);// а у curNode мы зануляем ссылку, т.е. он больше ни на что ссылаться не будет и
        //будет удален сборщиком мусора
        return true;
    }

    public void clear() {
        head = null;
    }

    public Object get(int index) {
        checkIndex(index);
        if (index == 0) {
            Object resValue = head.getValue();
            return resValue;
        } else {
            Node curNode = head;
            int count = 0;
            while ((curNode = curNode.getNext()) != null) {
                count++;
                if (count == index) {
                    break;
                }
            }
            return curNode.getValue();
        }
    }

    public Object set(int index, Object element) {
        checkIndex(index);
        if (index == 0) {
            head.setValue(element);
        } else {
            Node curNode = head;
            int count = 0;
            while (!((curNode = curNode.getNext()) == null)) {
                count++;
                if (count == index) {
                    break;
                }
            }
            curNode.setValue(element);
        }
        return element;
    }

    public void add(int index, Object element) {
        checkIndex(index);
        Node resNode = new Node(element, head);
        if (index == 0) {
            head = resNode;
        } else {
            Node curNode = head;
            Node prevNode = head;
            int count = 0;
            while ((curNode = curNode.getNext()) != null) {
                count++;
                if (count == index) {
                    break;
                }
            }
            resNode.setNext(prevNode.getNext());
            prevNode.setNext(resNode);
        }
    }

    // СТРОКА1 -> null
    // СТРОКА1 -> СТРОКА2 -> СТРОКА3 -> null
    public Object remove(int index) {
        checkIndex(index); // сначала мы осуществляем проверку индекса(он д.б. от 0 до size-1)
        if (index == 0) {//если индекс = 0, тут может быть 2 случая и мы создаем
            Object resValue = head.getValue();//переменную resValue в которую передаем значение head
            if (head.getNext() == null) {//1 случай если кроме head-а, нет элементов, то тогда
                head = null;//head-у присваиваем null
            } else {//2 случай если элементы все-таки есть и мы на место head присваиваем
                head = head.getNext();//следующий элемент по порядку, т.е. head = head.getNext()
            }
            return resValue;//здесь мы вернем окончательный результат
        }
        Node curNode = head;//далее создаем 2 переменные, т.к. у нас должно быть 2 элемента
        Node prevNode = head;//предыдущий и текущий, потому как можно только чтобы элемент ссылался
        // на следуюший элемент по списку, т.к. мы не можем перенаправлять ссылку в обратном направлении,
        // т.е. например у "строки 1" мы можем перенаправить ссылку на "строку 3", а в обратном порядке нет
        int count = 0;//создаем счетчик
        while ((curNode = curNode.getNext()) != null) {//мы бежим по списку до последнего элемента
            count++;//счетчик увеличивается и когда он будет равен нашему индексу мы
            if (count == index) {//выйдем из цикла при помощи оператора break, таким образом мы остановимся
                break;//на нужном нам индексе
            }
            prevNode = prevNode.getNext();//тут мы prevNode присваиваем следующий элемент, НЕ СОВСЕМ ПОНИМАЮ
        }//тут у нас может быть тоже несколько вариантов: 1. если curNode равен null, то мы возвращаем null
        if (curNode == null) return null;// и в resValue передаем значение curNode
        Object resValue = curNode.getValue();

        if (curNode.getNext() == null) {//2 вариант: если curNode является последним элементом то мы у prevNode изменяем
            prevNode.setNext(null);// ссылку на след. элемент(т.е. null) и он уже становится последним элементом
        } else {//3 вариант: если элемент где-то в середине, то мы  у предыдущего элемента prevNode - перенаправляем
            prevNode.setNext(curNode.getNext());//ссылку на следующий элемент, т.е. тот, который был перед curNode
            curNode.setNext(null);//а curNode-у мы присваиваем ссылку null
        }

        return resValue;//здесь мы вернем окончательный результат
    }

    private void checkIndex(int index) {
        if (!isCorrectIndex(index)) {
            throw new ArrayIndexOutOfBoundsException("Некорректный индекс");
        }
    }

    private boolean isCorrectIndex(int index) {
        if ((index > -1) && (index < size())) {
            return true;
        }
        return false;
    }

    public int indexOf(Object o) {
        int count = 0;
        if (head.getValue() == o) {
            return count;
        } else {
            Node curNode = head;
            while ((curNode = curNode.getNext()) != o) {
                count++;
                if (curNode.getValue() == o) {
                    break;
                }
            }
        }
        return count;
    }

    public int lastIndexOf(Object o) {
        int count = 0;
        int index = -1;
        Node curNode = head;
        if (head.getValue().equals(o)) {
            count++;
            index = count;
        }
        while ((curNode = curNode.getNext()) != null) {
            count++;
            if (curNode.getValue().equals(o)) {
                index = count;
            }
        }
        return index;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                '}';
    }
}
