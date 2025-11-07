package util;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class ValidationUtil {
    private static Scanner input = new Scanner(System.in);

    public static String getString(String prompt) {
        System.out.printf("%s", prompt);
        return input.nextLine(); //could be a problem
        //look hereeeeeeee!!!!!!!!!!
    }

    public static String getStringValido(String prompt) {
        while(true) {
            String str = getString(prompt);
            if(str.isEmpty()) System.out.printf("Campo não pode ser vazio!\n");
            else return str;
        }
    }

    public static int getInt(String prompt) {
        while(true) {
            System.out.printf("%s", prompt);
            try {
                return Integer.parseInt(input.nextLine());
            } catch (NumberFormatException erro) {
                System.out.printf("Número não válido!\n");
            }
        }
    }

    public static int getIntOption(String prompt, int min, int max) {
        while(true) {
            try {
                Integer n = getInt(prompt);
                if(n >= min && n <= max) return n;
            } catch (NumberFormatException erro) {
                System.out.printf("Erro! Escolha uma opção entre %d e %d!\n", min, max);
            }
        }
    }

    public static LocalDate getDate(String prompt) {
        while(true) {
            System.out.printf("%s (AAAA-MM-DD): ");
            try {
                return LocalDate.parse(input.nextLine());
            } catch (DateTimeParseException erro) {
                System.out.printf("Data inválida! Formato aceito: AAAA-MM-DD\n");
            }
        }
    }
}
