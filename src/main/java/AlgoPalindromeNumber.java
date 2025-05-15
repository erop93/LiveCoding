public class AlgoPalindromeNumber {
    public static void main(String[] args) {
        // проверить, является ли число палиндромом
        int num = 1221; // исходное число, которое будем проверять

        int numCopy = num; // создаем копию числа, чтобы не изменять оригинал
        int reverseNum = 0; // переменная для хранения "перевернутого" числа

        // Пока число не стало 0
        while (numCopy > 0) {
            int lastDigit = numCopy % 10; // получаем последнюю цифру (остаток от деления на 10)
            reverseNum = reverseNum * 10 + lastDigit; // сдвигаем текущий reverse на разряд и добавляем новую цифру
            numCopy /= 10; // отбрасываем последнюю цифру у числа (делим на 10)
        }
        // Сравниваем оригинальное число с перевернутым — если равны, значит это палиндром
        System.out.println(reverseNum == num);
    }
}
