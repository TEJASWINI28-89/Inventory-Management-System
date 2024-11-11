import javax.swing.*;
import java.awt.*;

public class HomePage extends JFrame {
    
    public HomePage() {
        // Set up the frame
        setTitle("Enhanced Inventory Management System");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame on the screen

        // Create a panel to hold the content
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Set the background image
                ImageIcon backgroundImage = new ImageIcon("flower.jpeg");
                g.drawImage(backgroundImage.getImage(), 0, 0, this.getWidth(), this.getHeight(), this);
            }
        };
        panel.setLayout(new BorderLayout());

        // Add a title label
        JLabel titleLabel = new JLabel("Welcome to the Enhanced Inventory Management System", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 26));
        titleLabel.setForeground(Color.YELLOW);
        panel.add(titleLabel, BorderLayout.NORTH);

        // Add a description label
        JLabel descriptionLabel = new JLabel("<html>This system allows you to efficiently manage your inventory and streamline your operations.<br/>"
                + "Use the navigation to explore features like product management, stock tracking, and supplier coordination.</html>", SwingConstants.CENTER);
        descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        descriptionLabel.setForeground(Color.WHITE);
        panel.add(descriptionLabel, BorderLayout.CENTER);

        // Add buttons or navigation links
        JPanel buttonPanel = new JPanel();
        buttonPanel.setOpaque(false); // Make the panel transparent
        JButton aboutButton = new JButton("About");
        JButton exitButton = new JButton("Exit");

        // Button styles
        aboutButton.setFont(new Font("Arial", Font.BOLD, 16));
        aboutButton.setBackground(Color.GREEN);
        exitButton.setFont(new Font("Arial", Font.BOLD, 16));
        exitButton.setBackground(Color.RED);

        // Add action listeners
        aboutButton.addActionListener(e -> {
            new AboutPage().setVisible(true);
            dispose(); // Close the current window
        });
        exitButton.addActionListener(e -> System.exit(0));

        buttonPanel.add(aboutButton);
        buttonPanel.add(exitButton);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        // Add the panel to the frame
        add(panel);
    }

    public static void main(String[] args) {
        // Create and display the Home page
        SwingUtilities.invokeLater(() -> {
            HomePage homePage = new HomePage();
            homePage.setVisible(true);
        });
    }
}
