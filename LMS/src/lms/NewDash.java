package lms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class NewDash extends JFrame {

    public NewDash() {
        setTitle("Library Management System - Dashboard");
        setSize(900, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(700, 500));
        setLayout(new BorderLayout());

        // Header panel
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(new Color(30, 41, 59));
        headerPanel.setPreferredSize(new Dimension(900, 70)); // Fixed width
        headerPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 20));

        JLabel titleLabel = new JLabel("Library Management System");
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("SansSerif", Font.BOLD, 28));
        headerPanel.add(titleLabel);

        add(headerPanel, BorderLayout.NORTH);

        // Navigation panel (left sidebar)
        JPanel navPanel = new JPanel();
        navPanel.setBackground(new Color(44, 62, 80));
        navPanel.setPreferredSize(new Dimension(220, 600)); // Fixed height
        navPanel.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(15, 10, 15, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;

        String[] navButtons = {
                "Add Book",
                "View Books",
                "Issue Book",
                "Return Book",
                "View Members",
                "Logout"
        };

        for (int i = 0; i < navButtons.length; i++) {
            JButton btn = createNavButton(navButtons[i]);
            gbc.gridy = i;
            navPanel.add(btn, gbc);
        }

        add(navPanel, BorderLayout.WEST);

        // Main content panel
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.WHITE);
        mainPanel.setLayout(new BorderLayout());

        // Welcome panel inside main content
        JPanel welcomePanel = new JPanel();
        welcomePanel.setBackground(Color.WHITE);
        welcomePanel.setLayout(new BoxLayout(welcomePanel, BoxLayout.Y_AXIS));
        welcomePanel.setBorder(BorderFactory.createEmptyBorder(60, 60, 60, 60));

        JLabel welcomeLabel = new JLabel("Welcome to the Library Management System");
        welcomeLabel.setFont(new Font("SansSerif", Font.BOLD, 28));
        welcomeLabel.setForeground(new Color(30, 41, 59));
        welcomeLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel infoLabel = new JLabel("<html><div style='text-align: center;'>"
                + "Manage your library efficiently.<br>"
                + "Add new books, issue and return books,<br>"
                + "and keep track of members all in one place."
                + "</div></html>");
        infoLabel.setFont(new Font("SansSerif", Font.PLAIN, 17));
        infoLabel.setForeground(new Color(85, 85, 85));
        infoLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        infoLabel.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));

        welcomePanel.add(welcomeLabel);
        welcomePanel.add(Box.createVerticalStrut(20)); // Adds spacing between labels
        welcomePanel.add(infoLabel);

        mainPanel.add(welcomePanel, BorderLayout.CENTER);

        add(mainPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    private JButton createNavButton(String text) {
        JButton button = new JButton(text);
        button.setFocusPainted(false);
        button.setForeground(Color.WHITE);
        button.setBackground(new Color(52, 73, 94));
        button.setFont(new Font("SansSerif", Font.BOLD, 16));
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.setBorder(BorderFactory.createEmptyBorder(12, 20, 12, 20));

        // Hover effect
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setBackground(new Color(41, 128, 185));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button.setBackground(new Color(52, 73, 94));
            }
        });

        // Placeholder action listener - replace with actual logic
        button.addActionListener(e -> JOptionPane.showMessageDialog(this,
                text + " clicked!",
                "Action",
                JOptionPane.INFORMATION_MESSAGE));

        return button;
    }

    public static void main(String[] args) {
        // Set system look and feel for better UI consistency
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {}

        SwingUtilities.invokeLater(NewDash::new);
    }
}
