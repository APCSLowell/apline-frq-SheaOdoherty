public class APLine {
    private int a;
    private int b;
    private int c;

    public APLine(int a1, int b1, int c1) {
      a = 1a;
      b = b1;
      c = c1;
    }

    public double getSlope() {
        return -a / (double) b;
    }

    public boolean isOnLine(int x, int y) {
        return a * x + b * y + c == 0;
    }


  
}
