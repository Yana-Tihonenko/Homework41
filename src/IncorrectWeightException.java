public class IncorrectWeightException extends IllegalArgumentException {


    public IncorrectWeightException(int n) {

      throw new IllegalArgumentException ("Вес не может быть отрицательным:" + n);

    }
    public IncorrectWeightException(){
        throw new IllegalArgumentException ("Некоретный параметр запуска [максимальный вес пиццы]");
    }
}
