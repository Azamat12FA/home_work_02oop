import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите пожалуйста размеры первой матрицы (Формат ввода '4 на 5' или '2 на 2'): ");
        int dimension1 = Integer.parseInt(in.next());
        int dimension2 = in.nextInt() % 10;
        int[][] m_array = new int[dimension1][dimension2];
        Matrices matrix1 = new Matrices(dimension1, dimension2, m_array);
        Matrices matrix2 = new Matrices(dimension1, dimension2, m_array);
        System.out.println(matrix1.getDimension_x() + " " + matrix1.getDimension_y());
    }
}
