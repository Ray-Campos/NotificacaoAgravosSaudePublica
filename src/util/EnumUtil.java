package util;

import enums.EnumInterface;
import util.ValidationUtil;

public class EnumUtil {
    public static <E extends Enum<E> & EnumInterface> E getFromCodigo(
        Class <E> enumClass, int codigo, E valorPadrao){
        
        for(E e : enumClass.getEnumConstants()) if (e.getCodigo() == codigo) return e;
        return valorPadrao;
    }

    public static <E extends Enum<E> & EnumInterface> E escolherEnum(Class<E> enumClass, String prompt) {
        while(true) {
            System.out.printf("Opções --- %s\n", prompt);
            for(E e : enumClass.getEnumConstants()) {
                System.out.printf("%d - %s\n", e.getCodigo(), e.getDescricao());
            }

            int codigo = ValidationUtil.getInt("Escolha uma opção: ");
            E en = EnumUtil.getFromCodigo(enumClass, codigo, null);

            if(en != null) return en;
            System.out.printf("Opçõa inválida!\n");
        }
    }
}
