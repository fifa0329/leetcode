import java.util.logging.Logger;


/**
 * Created by lingxiang.wang on 2015/2/1.
 */
public class Program {




    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub


        StringtoIntegerAtoi a=new StringtoIntegerAtoi();

        int j=a.atoi("111111111111111111111111111111111111111111111111111111111111111111111");

        
        ExcelSheetColumnTitle title=new ExcelSheetColumnTitle();
        
        
        String b=title.convertToTitle(27);
        
        System.out.print(b);
        
    }



}
