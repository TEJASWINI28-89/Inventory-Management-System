import javax.swing.*;
import java.awt.*;

public class AboutPage extends JFrame {
    
    public AboutPage() {
        // Set up the frame
        setTitle("About Inventory Management System");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame on the screen

        // Create a panel to hold the content
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Set the background image
                ImageIcon backgroundImage = new ImageIcon("port.jpeg");
                g.drawImage(backgroundImage.getImage(), 0, 0, this.getWidth(), this.getHeight(), this);
            }
        };
        panel.setLayout(new BorderLayout());

        // Add a title label
        JLabel titleLabel = new JLabel("About the Inventory Management System", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 26));
        titleLabel.setForeground(Color.YELLOW);
        panel.add(titleLabel, BorderLayout.NORTH);

        // Add content text area
        JTextArea textArea = new JTextArea();
        textArea.setText("This Inventory Management System is designed to help businesses manage their inventory efficiently. "
                + "\n\nFeatures include:\n"
                + "- Product Inventory Storage\n"
                + "- Dynamic Stock Management\n"
                + "- Fast Product Lookup\n"
                + "- Sorted Product Listings\n"
                + "- Reordering Critical Stock\n"
                + "- Supplier and Warehouse Network Mapping\n"
                + "- Quick Product Code Search\n"
                + "- Managing Inventory Restocking Cycles\n"
                + "- Balanced Stock Level Tracking\n"
                + "- Inventory Fraud Detection\n"
                + "\nThis system aims to provide a user-friendly interface and improve inventory tracking "
                + "to reduce losses and enhance productivity.");
        textArea.setFont(new Font("Arial", Font.PLAIN, 16));
        textArea.setForeground(Color.WHITE);
        textArea.setBackground(new Color(0, 0, 0, 0)); // Transparent background
        textArea.setEditable(false);
        panel.add(textArea, BorderLayout.CENTER);

        // Add the panel to the frame
        add(panel);
    }

    public static void main(String[] args) {
        // Create and display the About page
        SwingUtilities.invokeLater(() -> {
            AboutPage aboutPage = new AboutPage();
            aboutPage.setVisible(true);
        });
    }
}
