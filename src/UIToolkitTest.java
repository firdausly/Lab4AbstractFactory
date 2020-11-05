import java.util.Scanner;

public class UIToolkitTest {
    public static void main(String[] args) {


        AbstractWidgetFactory widgetFactory;

        Scanner in=new Scanner(System.in);
        int selection=0;

        while(selection!=3){
            System.out.println("Type 1 for Motif, 2 for Presentation Manager, 3 to exit: ");
            selection=in.nextInt();

            if(selection==1){
                widgetFactory=new MotifWidgetFactory();
                widgetFactory.createWindow().setTitle("New Window");
                widgetFactory.createScrollBar().setDirection();

            }
            else if(selection==2){
                widgetFactory=new PMWidgetFactory();
                widgetFactory.createWindow().setTitle("New Window");
                widgetFactory.createScrollBar().setDirection();
            }
            else {
                System.out.println("Invalid selection");
            }
        }


    }
}
