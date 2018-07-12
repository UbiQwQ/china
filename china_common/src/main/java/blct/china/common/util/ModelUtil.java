package blct.china.common.util;

import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

public class ModelUtil {

    /**
     * 将实体转换为Dto List
     *
     * @param target
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> List<T> modelToDto(List target, Class<T> clazz) {
        List<T> result = new ArrayList<>();
        try {
            for (Object item : target) {
                T t = clazz.newInstance();
                BeanUtils.copyProperties(item, t);
                result.add(t);
            }
        } catch (Exception e) {

        }
        return result;
    }

    /**
     * 将实体转换为Dto
     *
     * @param target
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> T modelToDto(Object target, Class<T> clazz) {
        T t = null;
        try {
            t = clazz.newInstance();
            BeanUtils.copyProperties(target, t);
        } catch (Exception e) {

        }
        return t;
    }
}

