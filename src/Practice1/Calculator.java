package Practice1;

import static org.assertj.core.api.Assertions.*;
public class Calculator {
    double discountSum(double purchaseAmount, int discountAmount){
        // проверяем что аргументы метода не отрицательные
        try {
            assertThat(purchaseAmount).isNotNegative();
        }
        catch (Throwable error){
            throw new ArithmeticException("аргумент сумма покупки отрицательный");
        }
        try {
            assertThat(discountAmount).isNotNegative();
        }
        catch (Throwable error) {
            throw new ArithmeticException("аргумент размер скидки отрицательный");
        }

        // проверяем что аргументы метода не ноль
        try {
            assertThat(purchaseAmount).isNotZero();
        }
        catch (Throwable error) {
            throw new ArithmeticException("аргумент сумма покупки нулевой");
        }
        try {
            assertThat(discountAmount).isNotZero();
        }
        catch (Throwable error) {
            throw new ArithmeticException("аргумент размер скидки нулевой");
        }
            // проверяем что скидка меньше или равна 100%
        try {
            assertThat(discountAmount).isLessThanOrEqualTo(100);
        }
        catch (Throwable error) {
            throw new ArithmeticException("аргумент размер скидки меньше илии равен 100");
        }

        double resultSum = purchaseAmount - (purchaseAmount * discountAmount / 100);

        // проверяем правильность расчёта обычных скидок
        try {
            assertThat(purchaseAmount - (purchaseAmount * discountAmount / 100)).isEqualTo(resultSum);
        }
        catch (Throwable error){
            throw new ArithmeticException("неверный расчёт окончательной суммы покупки");
        }
            System.out.println("сумма покупки со скидкой - " + resultSum);
        return resultSum;
    }
}
