
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Run {
    public static void main(String[] args) throws IOException, InvocationTargetException, IllegalAccessException {
        Class<?> cl=TextContainer.class;
        TextContainer test=new TextContainer();

        FilePathAnotation anotation=cl.getAnnotation(FilePathAnotation.class);

        Method[] methods= cl.getMethods();
        for(Method method:methods){
            if(method.isAnnotationPresent(Save.class)){
                method.invoke(test,anotation.path());
            }
        }

    }
}
