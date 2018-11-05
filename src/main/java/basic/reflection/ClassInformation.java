package basic.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassInformation {
    public static void main(String[] args){
        try{
        printClassInformation("test");
        printClassInformation(1);
        printClassInformation(new TestClass());
        }
        catch (IllegalAccessException | InvocationTargetException | InstantiationException | NoSuchFieldException ex){
            System.out.println(ex.getMessage());
        }

    }
    private static void printClassInformation(Object instance) throws IllegalAccessException,InvocationTargetException,InstantiationException,NoSuchFieldException{
        Class classInfo=instance.getClass();
        System.out.println(classInfo.getName());
        Method[] methods=classInfo.getDeclaredMethods();
        for (int i=0;i<methods.length;i++){
            System.out.println(methods[i].getName()+" "+methods[i].getReturnType().getName());
            if (classInfo==TestClass.class){
                methods[i].setAccessible(true);
                Object invokeObj=classInfo.newInstance();
                methods[i].invoke(invokeObj);
                Field field=classInfo.getDeclaredField("lng1");
                field.setAccessible(true);

                field.set(invokeObj,222L);
                methods[i].invoke(invokeObj);
            }
        }
    }

}
class TestClass{
    private String var1="aaa";
    private Long lng1=111L;
    private void method1(){
        System.out.println(lng1);
    }
    private String method2(){
        return var1;
    }
}