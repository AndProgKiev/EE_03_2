
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

@FilePathAnotation(path="D:\\test.txt")
public class TextContainer {
    private String s="Hello World of Java";

    public TextContainer() {
    }

    public String getS() {
        return s;
    }
    @Save
    public void save(String path) throws IOException{
        try(OutputStreamWriter writer=new OutputStreamWriter(new FileOutputStream(path))){
            writer.write(s);
        }
    }

}
