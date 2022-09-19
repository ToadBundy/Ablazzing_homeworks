package module2_package4;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Homework4 {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        UserMeta usr = new UserMeta("Ivan", 15);
        aboveType(usr);
        aboveField(usr);
        aboveMethod(usr);



    }


    public static void aboveType(Object obj) throws IllegalAccessException {
        if(obj.getClass().getDeclaredAnnotation(GetMetaData.class)!=null){
            for(Field o : obj.getClass().getDeclaredFields()){
                System.out.println(o.get(obj));
            }
        }else{
            System.out.println("THERE NO ANNOTATION");
        }

    }
    public static void aboveField(Object obj) throws IllegalAccessException {

        for(Field o : obj.getClass().getDeclaredFields()){
                if(o.getDeclaredAnnotation(GetMetaData.class)!=null){
                    System.out.println(o.get(obj));
                }
            }

    }
    public static void aboveMethod(Object obj) throws InvocationTargetException, IllegalAccessException {
        for(Method method : obj.getClass().getDeclaredMethods()){
            if(method.getAnnotation(GetMetaData.class) != null){
                long start = System.currentTimeMillis();
                method.invoke(obj,"SANYA");
                long fin = System.currentTimeMillis();
                System.out.println(fin - start);
            }
        }
    }


    @GetMetaData
    static class UserMeta{
        @GetMetaData
        String name;
        Integer count;

        public UserMeta(String name, Integer count){
            this.name = name;
            this.count = count;
        }
        @GetMetaData
        public void getSuperName(String prefix) throws InterruptedException {
            Thread.sleep(100);
            name = prefix;
        }

    }
}
