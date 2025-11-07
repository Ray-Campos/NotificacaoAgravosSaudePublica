package util;

import enums.EnumInterface;

public class EnumUtil {
    public static <E extends Enum<E> & EnumInterface> E getFromCodigo(
        Class <E> enumClass, int codigo, E valorPadrao){
        
        for(E e : enumClass.getEnumConstants()) if (e.getCodigo() == codigo) return e;
        return valorPadrao;
    }

    public static <E extends Enum<E> & EnumInterface> E escolherEnum(Class<E> enumClass) {
        while(true) {
            System.out.printf("Opções:\n");
            for(E e : enumClass.getEnumConstants()) {
                System.out.printf("%d - %s\n", e.getCodigo(), e.getDescricao());
            }

            int codigo = InputUtil.getInt("Escolha uma opção: ");
            E en = EnumUtil.getFromCodigo(enumClass, codigo, null);

            if(en != null) return en;
            System.out.printf("Opçõa inválida!\n");
        }
    }
}
