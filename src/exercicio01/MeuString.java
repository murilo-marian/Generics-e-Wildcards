package exercicio01;

public class MeuString<T> {
    private T str;

    public MeuString(T str) {
        this.str = str;
    }

    public T getStr() {
        return str;
    }
}
