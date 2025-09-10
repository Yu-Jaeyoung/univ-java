package chap04.finalex;

public class FinalEx {
    int normal;
    final int finalValue;
    final static int STATIC_FINAL_VALUE = 100;

    void f() {
        this.normal = 100;
        // this.finalValue = 20;
    }

    // 메소드의 매개 변수에는 final을 작성하여 변경을 방지
    public FinalEx(final int normal, final int finalValue) {
        this.normal = normal;
        this.finalValue = finalValue;
    }
}
