import java.awt.event.*;
import javax.swing.*;

public class Latihan4Biodata extends JFrame {

    public Latihan4Biodata() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Nama
        JLabel labelNama = new JLabel("Nama:");
        labelNama.setBounds(50, 40, 100, 20);

        JTextField textFieldNama = new JTextField();
        textFieldNama.setBounds(150, 40, 200, 30);

        // Nomor Telepon
        JLabel labelTelepon = new JLabel("No. Telepon:");
        labelTelepon.setBounds(50, 80, 100, 20);

        JTextField textFieldTelepon = new JTextField();
        textFieldTelepon.setBounds(150, 80, 200, 30);

        // Simpan
        JButton button = new JButton("Simpan");
        button.setBounds(150, 120, 100, 30);

        // Output
        JTextArea txtOutput = new JTextArea();
        txtOutput.setEditable(false); // Agar hanya bisa membaca

        // JTextArea
        JScrollPane scrollPane = new JScrollPane(txtOutput);
        scrollPane.setBounds(50, 170, 300, 150);

        // Tombol Simpan
        button.addActionListener(e -> {
            String nama = textFieldNama.getText();
            String telepon = textFieldTelepon.getText();

            if (!nama.isEmpty() && !telepon.isEmpty()) {
                txtOutput.append("Nama: " + nama + "\n");
                txtOutput.append("No. Telepon: " + telepon + "\n");
                txtOutput.append("==========================\n");

                textFieldNama.setText("");
                textFieldTelepon.setText("");
            } else {
                txtOutput.append("Silakan isi nama dan nomor telepon\n");
            }
        });

        this.add(button);
        this.add(textFieldNama);
        this.add(textFieldTelepon);
        this.add(labelNama);
        this.add(labelTelepon);
        this.add(scrollPane);

        this.setSize(400, 400);
        this.setLayout(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Latihan4Biodata app = new Latihan4Biodata();
            app.setVisible(true);
        });
    }
}
