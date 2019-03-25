import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import javax.swing.AbstractAction;
import javax.swing.DefaultDesktopManager;
import javax.swing.JComponent;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Desktop extends javax.swing.JFrame {
   
    public Desktop() {
    	getContentPane().setBackground(new Color(204, 204, 204));
    	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\balamuralikrishna\\Desktop\\MiniOS\\MiniOS\\desktop.png"));
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        filechooser = new javax.swing.JFileChooser();
        desk = new javax.swing.JDesktopPane();
        desk.setBackground(new Color(102, 153, 204));
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MINI OS");
        setName("minios");
        setSize(new Dimension(1386, 745));

        //set background image
        desk.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        desk.setDoubleBuffered(true);
        ImageIcon icon = new ImageIcon(getClass().getResource("/back.jpg"));
        JLabel l = new JLabel(icon);
        l.setBounds(0, 0,1379,740);
        desk.add(l, new Integer(Integer.MIN_VALUE));
        
        //creates a layout (Absolute Layout)
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(desk, GroupLayout.PREFERRED_SIZE, 1379, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(396, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(desk, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );
        getContentPane().setLayout(layout);
        
        //Text Editor Button
        TextEditor = new javax.swing.JButton();
        TextEditor.setBounds(10, 11, 53, 54);
        desk.add(TextEditor);
        TextEditor.setToolTipText("Text Editor");
        TextEditor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor.png")));
           
        //Terminal Button
        Terminal = new javax.swing.JButton();
        Terminal.setBounds(10, 76, 53, 54);
        desk.add(Terminal);
        Terminal.setToolTipText("Terminal");
        Terminal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/terminal.png")));
        
        //CpuAlgo Button
        CpuAlgo = new javax.swing.JButton();
        CpuAlgo.setBounds(10, 141, 53, 54);
        desk.add(CpuAlgo);
        CpuAlgo.setToolTipText("CPU Scheduling");
        CpuAlgo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cpualgo.png")));
        
        //File Manager Button
        FileManager = new javax.swing.JButton();
        FileManager.setBounds(10, 206, 50, 54);
        desk.add(FileManager);
        FileManager.setToolTipText("File Manager");
        FileManager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/filemanager.png")));
        
        //Calendar Button
        Calender = new javax.swing.JButton();
        Calender.setToolTipText("Calender");
        Calender.setBounds(10, 271, 53, 54);
        desk.add(Calender);
        Calender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calendar.png")));
        
        //Calculator Button
        Calculator = new javax.swing.JButton();
        Calculator.setToolTipText("Calculator");
        Calculator.setBounds(10, 336, 53, 54);
        desk.add(Calculator);                        
        Calculator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator.png")));
        
        MineSweeper = new javax.swing.JButton();
        MineSweeper.setToolTipText("MineSweeper");
        MineSweeper.setBounds(10, 466, 53, 54);
        desk.add(MineSweeper);
        MineSweeper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game.png")));
        
        Clock = new javax.swing.JButton();
        Clock.setToolTipText("Clock");
        Clock.setBounds(10, 401, 53, 54);
        desk.add(Clock);
        Clock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clock.png")));
        
        
        
        //Action part
        Calculator.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		CalculatorActionPerformed(evt);
            }
        });
        Calender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalenderActionPerformed(evt);
            }
        });
        FileManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileManagerActionPerformed(evt);
            }
        });
        CpuAlgo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                 CpuAlgoActionPerformed(evt);
            }
        });
        Terminal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                 TerminalActionPerformed(evt);
            }
        });
        TextEditor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                 TextEditorActionPerformed(evt);
            }
        });
        MineSweeper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                  MineSweeperActionPerformed(evt);
            }
        });
        Clock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                 ClockActionPerformed(evt);
            }
        });
        pack();
    }    
    
    private void TextEditorActionPerformed(java.awt.event.ActionEvent evt) {
            new Notepad().setVisible(true);
    }
    private void TerminalActionPerformed(java.awt.event.ActionEvent evt) {
    		Terminal t=new Terminal();
            desk.add(t);
            t.show();
    }
    private void MineSweeperActionPerformed(java.awt.event.ActionEvent evt) {
    		new MineSweeper().main();
    }
    private void CalculatorActionPerformed(java.awt.event.ActionEvent evt) {
    		new Calculator().setVisible(true);
    }                               
    private void ClockActionPerformed(java.awt.event.ActionEvent evt) {
    		new Clock().main(null);
    }
    private void CalenderActionPerformed(java.awt.event.ActionEvent evt) {
        	new Calandar().setVisible(true);
    }
    private void CpuAlgoActionPerformed(java.awt.event.ActionEvent evt) {
        	S_Algo s=new S_Algo();
        	desk.add(s);
            s.show();
    }
    private void FileManagerActionPerformed(java.awt.event.ActionEvent evt) {
            filechooser.setDialogTitle("Open File");
            int returnVal = filechooser.showSaveDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                    File file = filechooser.getSelectedFile();
                    String s=file.getName();
                    if(s.substring(s.lastIndexOf('.')+1).equals("txt"))
                    {
                            Notepad note_new=new Notepad();
                            note_new.setVisible(true);
                            try {
                                note_new.appendtotextArea(file.getAbsolutePath());
                            } catch (IOException ex) {
                                Logger.getLogger(Desktop.class.getName()).log(Level.SEVERE, null, ex);
                            }
                    }
                }
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Desktop().setVisible(true);     
            }
        });   
    }
    public static javax.swing.JDesktopPane desk;
    private javax.swing.JFileChooser filechooser;
    private javax.swing.JButton TextEditor;
    private javax.swing.JButton Terminal;
    private javax.swing.JButton Calculator;
    private javax.swing.JButton Calender;
    private javax.swing.JButton CpuAlgo;
    private javax.swing.JButton FileManager;
    private javax.swing.JButton MineSweeper;
    private javax.swing.JButton Clock;
}