package Lesson5;

public class Main {
    public static void main(String[] args) {
        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] wrongSizeArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"}
        };

        String[][] wrongDataArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "A", "12"},
                {"13", "14", "15", "16"}
        };

        int[] demoArray = new int[3];

        System.out.println();
        try {
            int sum = processArray(correctArray);
            System.out.println("Сумма элементов: " + sum);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка размера массива: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка в данных в ячейке [" + e.getRow() + "][" + e.getCol() + "]: " + e.getMessage());
        }

        System.out.println("\n");
        try {
            int sum = processArray(wrongSizeArray);
            System.out.println("Сумма элементов: " + sum);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка размера массива: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка в данных в ячейке [" + e.getRow() + "][" + e.getCol() + "]: " + e.getMessage());
        }

        System.out.println("\n");
        try {
            int sum = processArray(wrongDataArray);
            System.out.println("Сумма элементов: " + sum);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка размера массива: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка в данных в ячейке [" + e.getRow() + "][" + e.getCol() + "]: " + e.getMessage());
        }

        System.out.println("\n ArrayIndexOutOfBoundsException ");
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Элемент [" + i + "]: " + demoArray[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Поймано исключение ArrayIndexOutOfBoundsException: " + e.getMessage());
            System.out.println("Попытка обратиться к несуществующему индексу массива");
        }
    }

    public static int processArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        // Проверка размера массива
        if (array.length != 4) {
            throw new MyArraySizeException("Массив должен быть размером 4х4, а получено строк: " + array.length);
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("Массив должен быть размером 4х4, в строке " + i + " получено столбцов: " + array[i].length);
            }
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Не удалось преобразовать строку '" + array[i][j] + "' в число", i, j);
                }
            }
        }

        return sum;
    }
}
