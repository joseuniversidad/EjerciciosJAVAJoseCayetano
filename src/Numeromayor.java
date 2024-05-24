class Numeromayor {
    private int num1;
    private int num2;
    private int num3;

    public Numeromayor (int n1, int n2, int n3) {
        num1 = n1;
        num2 = n2;
        num3 = n3;
    }

    public int encontrarMaximo() {
        int Mayor = num1;
        if (num2 > Mayor) {
            Mayor = num2;
        }
        if (num3 > Mayor) {
            Mayor = num3;
        }
        return Mayor;
    }
}