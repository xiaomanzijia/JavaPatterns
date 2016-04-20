package effectivejava.mutiparamsconstructor.myenum;

/**
 * Created by licheng on 20/4/16.
 */
public enum  PayrollDay {
    MONDAY(PayType.WEEKDAY),
    TUESDAY(PayType.WEEKDAY),
    WEDNESDAY(PayType.WEEKDAY),
    THURSDAY(PayType.WEEKDAY),
    FRIDAY(PayType.WEEKDAY),
    SATURDAY(PayType.WEEKEND),
    SUNDAY(PayType.WEEKEND);

    private final PayType payType;

    PayrollDay(PayType payType) {
        this.payType = payType;
    }

    double pay(double hoursWorked, double payRate){
        return payType.pay(hoursWorked,payRate);
    }

    private enum PayType{
        WEEKDAY {
            double overTimePay(double hrs, double payRate) {
                return hrs < HOUSE_PER_SHIFT ? 0 :
                        (hrs - HOUSE_PER_SHIFT) * payRate / 2;
            }
        },
        WEEKEND {
            double overTimePay(double hrs, double payRate) {
                return hrs * payRate / 2;
            }
        };

        private static final int HOUSE_PER_SHIFT = 8;

        abstract double overTimePay(double hrs, double payRate);

        double pay(double hrs, double payRate){
            double basePay = hrs * payRate;
            return basePay + overTimePay(hrs,payRate);
        }
    }
}
