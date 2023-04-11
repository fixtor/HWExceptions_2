/* Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
необходимо повторно запросить у пользователя ввод данных. */

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		String userInput = null;                   //Переменная для проверки в цикле на прерывание
		float temp = 0;                            //Переменная для блока try-catch
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Введите вещественное число число или \"q\" для выхода :");
			userInput = scanner.next();
			try {
				temp = Float.parseFloat(userInput); //Проверка на корректность способом преобразования в тип float
			} catch (NumberFormatException e) {     /*Используем исключение "Неверное преобразование символьной
												    строки в числовой формат" */
				System.out.println("Внимание!!! Введите корректное значение, последнее введенное значение было:");
			}
			System.out.println(temp);
		} while(!userInput.equals("q"));            //Ввод "q" для выхода из программы
		scanner.close();
		}
	}
