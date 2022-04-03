import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

    public JPanel contentPane;
    public static JTextField WidthField;
    public static JTextField LengthField;
    public JTextField HeightField;
    public JLabel squareAreaResult;
    public JLabel circumferenceResult;
    public JLabel volumeResult;
    public JLabel surfaceareaResult;
    public static int panjang;
    public static int lebar;
    public static int tinggi;
    // public static int hasil;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainFrame frame = new MainFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public MainFrame() {
        setTitle("Cuboid Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 750);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel HeightLable = new JLabel("Height");
        HeightLable.setFont(new Font("Tahoma", Font.PLAIN, 15));
        HeightLable.setBounds(78, 257, 58, 21);
        contentPane.add(HeightLable);

        JLabel Width = new JLabel("Width");
        Width.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Width.setBounds(78, 141, 58, 21);
        contentPane.add(Width);

        JLabel Length = new JLabel("Length");
        Length.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Length.setBounds(78, 199, 58, 21);
        contentPane.add(Length);

        JLabel Judul = new JLabel("Cuboid Calculator");
        Judul.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Judul.setBounds(165, 29, 217, 21);
        contentPane.add(Judul);

        WidthField = new JTextField();
        WidthField.setBounds(165, 141, 185, 21);
        contentPane.add(WidthField);
        WidthField.setColumns(10);

        LengthField = new JTextField();
        LengthField.setColumns(10);
        LengthField.setBounds(165, 202, 185, 21);
        contentPane.add(LengthField);

        HeightField = new JTextField();
        HeightField.setColumns(10);
        HeightField.setBounds(165, 260, 185, 21);
        contentPane.add(HeightField);

        JButton count = new JButton("Count");
        count.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Balok persegiObject = new Balok();
                try {
                    lebar = Integer.parseInt(WidthField.getText());
                    panjang = Integer.parseInt(LengthField.getText());
                    tinggi = Integer.parseInt(HeightField.getText());
                } catch (Exception a) {
                    JOptionPane.showMessageDialog(contentPane, a);

                }

                Double hasil = persegiObject.luas(panjang, lebar);
                squareAreaResult.setText(Double.toString(hasil));

                Double hasilkeliling = persegiObject.Keliling(panjang, lebar);
                circumferenceResult.setText(Double.toString(hasilkeliling));

                Double hasilvolume = persegiObject.volume(tinggi);
                volumeResult.setText(Double.toString(hasilvolume));

                Double hasilLuasPermukaan = persegiObject.volume(tinggi);
                surfaceareaResult.setText(Double.toString(hasilLuasPermukaan));

            }
        });
        count.setBounds(49, 619, 112, 38);
        contentPane.add(count);

        JButton reset = new JButton("Reset");
        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                WidthField.setText("");
                LengthField.setText("");
                HeightField.setText("");
                squareAreaResult.setText("");
                volumeResult.setText("");
                surfaceareaResult.setText("");
                circumferenceResult.setText("");
            }
        });
        reset.setBounds(319, 619, 112, 38);
        contentPane.add(reset);

        JLabel resultLable = new JLabel("Result :");
        resultLable.setFont(new Font("Tahoma", Font.PLAIN, 15));
        resultLable.setBounds(165, 318, 58, 21);
        contentPane.add(resultLable);

        JLabel areaLable = new JLabel("Square Area :");
        areaLable.setFont(new Font("Tahoma", Font.PLAIN, 15));
        areaLable.setBounds(78, 361, 112, 21);
        contentPane.add(areaLable);

        JLabel circumferenceLable = new JLabel("Square Circumference :");
        circumferenceLable.setFont(new Font("Tahoma", Font.PLAIN, 15));
        circumferenceLable.setBounds(78, 392, 163, 21);
        contentPane.add(circumferenceLable);

        JLabel volumeLable = new JLabel("Cuboid Volume :");
        volumeLable.setFont(new Font("Tahoma", Font.PLAIN, 15));
        volumeLable.setBounds(78, 423, 112, 21);
        contentPane.add(volumeLable);

        JLabel surfaceAreaLable = new JLabel("Cuboid Surface Area :");
        surfaceAreaLable.setFont(new Font("Tahoma", Font.PLAIN, 15));
        surfaceAreaLable.setBounds(78, 454, 163, 21);
        contentPane.add(surfaceAreaLable);

        squareAreaResult = new JLabel("");
        squareAreaResult.setFont(new Font("Tahoma", Font.PLAIN, 15));
        squareAreaResult.setBounds(183, 361, 94, 21);
        contentPane.add(squareAreaResult);

        circumferenceResult = new JLabel("");
        circumferenceResult.setFont(new Font("Tahoma", Font.PLAIN, 15));
        circumferenceResult.setBounds(251, 392, 71, 21);
        contentPane.add(circumferenceResult);

        volumeResult = new JLabel("");
        volumeResult.setFont(new Font("Tahoma", Font.PLAIN, 15));
        volumeResult.setBounds(200, 423, 77, 21);
        contentPane.add(volumeResult);

        surfaceareaResult = new JLabel("");
        surfaceareaResult.setFont(new Font("Tahoma", Font.PLAIN, 15));
        surfaceareaResult.setBounds(234, 454, 88, 21);
        contentPane.add(surfaceareaResult);
    }
}
