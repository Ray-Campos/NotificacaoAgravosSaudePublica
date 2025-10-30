package util;

import enums.EnumInterface;

public class EnumUtil {
    public static <E extends Enum<E> & EnumInterface> E getFromCodigo(
        Class <E> enumClass, int codigo, E valorPadrao){
        
        for(E e : enumClass.getEnumConstants()) if (e.getCodigo() == codigo) return e;
        return null;
    }
}
