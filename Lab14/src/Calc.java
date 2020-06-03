import java.awt.*;
import java.awt.event.*;

public class Calc extends Frame{
    TextField textField1, textField2, textField3;
    Button but1, but2;
    Label label1, label2,label3;

    public Calc(String s){
        super(s);
        setLayout (null);

        textField1 = new TextField ();
        textField1.setSize (100, 25);
        textField1.setLocation (110,50);

        label1 = new Label("Число 1");
        label1.setSize (45,25);
        label1.setLocation (50,50);

        textField2 = new TextField ();
        textField2.setSize (100, 25);
        textField2.setLocation (110,80);

        label2 = new Label("Число 2");
        label2.setSize (45,25);
        label2.setLocation (50,80);

        textField3 = new TextField ();
        textField3.setSize (100, 25);
        textField3.setLocation (110,110);

        label3 = new Label("Сумма");
        label3.setSize (40,25);
        label3.setLocation (50,110);

        but1 = new Button ("Вычислить");
        but1.setSize (100,25);
        but1.setLocation (110,150);
        but1.addActionListener (new ActionListener ( ) {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    double a = Double.parseDouble (textField1.getText ( ));
                    double b = Double.parseDouble (textField2.getText ( ));
                    double c = a + b;
                    textField3.setText (String.valueOf (c));
                }
                catch (NumberFormatException nf) {
                    textField3.setText ("Ошибка");
                }
            }
        });

        but2 = new Button ("Очистить");
        but2.setSize (100,25);
        but2.setLocation (110,180);
        but2.addActionListener (new ActionListener ( ) {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textField1.setText ("");
                textField2.setText ("");
                textField3.setText ("");
            }
        });

        add(label1);
        add (textField1);
        add(label2);
        add(textField2);
        add(label3);
        add(textField3);
        add(but1);
        add(but2);

        setVisible (true);
        setSize (300,280);

        addWindowListener (new WindowAdapter ( ) {
            public void windowClosing(WindowEvent ev) {
                System.exit (0);
            }
        });
    }

        public static void main(String[] args) {
            Calc fr = new Calc("Сумма двух чисел");
        }
    }


