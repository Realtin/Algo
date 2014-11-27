package tree;

public class StringKeyAble implements KeyAble {

    private String data;

    public StringKeyAble(String s) {
        data = s;
    }


    private int pow(int x, int y) {
        if (y == 0) return 1;
        if (y % 2 == 0) {
            int z = pow(x, y / 2);
            return z * z;
        } else {
            return x * pow(x, y - 1);
        }
    }


    @Override
    public int getKey() {
        int k = 1;
        for (int i = 0; i < data.length(); i++) {
            int c = data.charAt(data.length() - i - 1) - 96;
            k = k + c * pow(26, i);
        }
        return k;
    }


    public String getString() {
        return data;
    }


    public String toString() {
        return data;
    }

}