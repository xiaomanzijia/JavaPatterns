package effectivejava.mutiparamsconstructor.myenum;

/**
 * Created by licheng on 20/4/16.
 */
public enum  Operation {
    PLUS("+") {
       double apply(double a, double b){
           return a + b;
       }
    },
    MINUS("-") {
        double apply(double a, double b){
            return a - b;
        }
    },
    TIMES("*") {
        double apply(double a, double b) {
            return a * b;
        }
    },
    DIVIDE("/") {
        double apply(double a, double b) {
            return a / b;
        }
    };

    private final String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }

    abstract double apply(double a, double b);

    @Override
    public String toString() {
        return symbol;
    }
}
