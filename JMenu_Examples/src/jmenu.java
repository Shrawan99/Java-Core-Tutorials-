import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

public class jmenu extends JFrame {
  private JMenuBar menuBar = new JMenuBar(); // Window menu bar
  private JMenuItem newItem, openItem, closeItem, saveItem, saveAsItem, printItem;
  private JRadioButtonMenuItem lineItem, rectangleItem, circleItem;
  private JCheckBoxMenuItem redItem, yellowItem;
  public jmenu() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setJMenuBar(menuBar);
    JMenu fileMenu = new JMenu("File");
    JMenu elementMenu = new JMenu("Elements");
    newItem = fileMenu.add("New");
    openItem = fileMenu.add("Open");
    closeItem = fileMenu.add("Close");
    fileMenu.addSeparator();
    saveItem = fileMenu.add("Save");
    saveAsItem = fileMenu.add("Save As...");
    fileMenu.addSeparator();
    printItem = fileMenu.add("Print");
    elementMenu.add(lineItem = new JRadioButtonMenuItem("Line", false));
    elementMenu.add(rectangleItem = new JRadioButtonMenuItem("Rectangle", true));
    elementMenu.add(circleItem = new JRadioButtonMenuItem("Circle", false));
    ButtonGroup types = new ButtonGroup();
    types.add(lineItem);
    types.add(rectangleItem);
    types.add(circleItem);
    elementMenu.addSeparator();
    elementMenu.add(redItem = new JCheckBoxMenuItem("Red", false));
    elementMenu.add(yellowItem = new JCheckBoxMenuItem("Yellow", false));
    menuBar.add(fileMenu); 
    menuBar.add(elementMenu);
  }
  public static void main(String[] a) {
    jmenu window = new jmenu(); 
    window.setBounds(30, 30, 300, 300); // Size
    window.setVisible(true);
  }
}