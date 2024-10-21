import java.awt.event.*;
import javax.swing.*;

public class Biodata extends JFrame {

    public Biodata() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Label Form Biodata di bagian atas
        JLabel labelForm = new JLabel("Form Biodata");
        labelForm.setBounds(150, 0, 200, 20);
        labelForm.setHorizontalAlignment(SwingConstants.CENTER);

        // Nama
        JLabel labelNama = new JLabel("Nama:");
        labelNama.setBounds(50, 40, 100, 20);

        JTextField textFieldNama = new JTextField();
        textFieldNama.setBounds(150, 40, 200, 30);

        // Nomor HP
        JLabel labelTelepon = new JLabel("Nomor HP:");
        labelTelepon.setBounds(50, 80, 100, 20);

        JTextField textFieldTelepon = new JTextField();
        textFieldTelepon.setBounds(150, 80, 200, 30);

        // Jenis kelamin
        JLabel labelGender = new JLabel("Jenis Kelamin:");
        labelGender.setBounds(50, 120, 100, 20);

        JRadioButton radioButtonLaki = new JRadioButton("Laki-Laki", true);
        radioButtonLaki.setBounds(150, 120, 100, 30);

        JRadioButton radioButtonPerempuan = new JRadioButton("Perempuan");
        radioButtonPerempuan.setBounds(150, 150, 100, 30);

        ButtonGroup bgGender = new ButtonGroup();
        bgGender.add(radioButtonLaki);
        bgGender.add(radioButtonPerempuan);

        // CheckBox WNA
        JCheckBox checkBoxWNA = new JCheckBox("Warga Negara Asing");
        checkBoxWNA.setBounds(150, 190, 200, 30);

        // Tombol Simpan
        JButton buttonSimpan = new JButton("Simpan");
        buttonSimpan.setBounds(150, 230, 100, 30);

        // Output
        JTextArea txtOutput = new JTextArea();
        txtOutput.setEditable(false); // Agar tidak bisa diedit

        JScrollPane scrollPane = new JScrollPane(txtOutput);
        scrollPane.setBounds(50, 280, 300, 100);

        // Tombol Simpan
        buttonSimpan.addActionListener(e -> {
            String nama = textFieldNama.getText();
            String telepon = textFieldTelepon.getText();
            String jenisKelamin = radioButtonLaki.isSelected() ? "Laki-Laki" : "Perempuan";
            String statusWNA = checkBoxWNA.isSelected() ? "WNA" : "Bukan WNA";

            if (!nama.isEmpty() && !telepon.isEmpty()) {
                txtOutput.append("Nama: " + nama + "\n");
                txtOutput.append("No. HP: " + telepon + "\n");
                txtOutput.append("Jenis Kelamin: " + jenisKelamin + "\n");
                txtOutput.append("Status: " + statusWNA + "\n");
                txtOutput.append("==========================\n");

                textFieldNama.setText("");
                textFieldTelepon.setText("");
                checkBoxWNA.setSelected(false);
            } else {
                txtOutput.append("Silakan isi nama dan nomor HP\n");
            }
        });

        // Menambahkan semua komponen ke frame
        this.add(labelForm);
        this.add(buttonSimpan);
        this.add(textFieldNama);
        this.add(textFieldTelepon);
        this.add(labelNama);
        this.add(labelTelepon);
        this.add(labelGender);
        this.add(radioButtonLaki);
        this.add(radioButtonPerempuan);
        this.add(checkBoxWNA);
        this.add(scrollPane);

        // Pengaturan ukuran dan layout window
        this.setSize(400, 450);
        this.setLayout(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Biodata app = new Biodata();
            app.setVisible(true);
        });
    }
}
