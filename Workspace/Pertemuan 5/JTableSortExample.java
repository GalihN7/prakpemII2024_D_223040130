import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class JTableSortExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTable Sorting Example");

        String[] columnNames = { "ID", "Name", "Age" };
        Object[][] data = {
                { 1, "John", 25 },
                { 3, "Mike", 35 },
                { 2, "Anna", 30 },
        };

        // Membuat model tabel
        DefaultTableModel model = new DefaultTableModel(data, columnNames);

        // Membuat JTable dengan model
        JTable table = new JTable(model);

        // Mengaktifkan pengurutan otomatis
        table.setAutoCreateRowSorter(true);

        // Menambahkan JTable ke JScrollPane
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);

        // Konfigurasi frame
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
