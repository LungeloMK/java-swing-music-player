
package za.ac.tut.ui;

// MusicPlayerUI_v2.java
// Full GUI code (old-school listeners, no invokeLater):
// - song + artist fields
// - favourite checkbox
// - two genre radio buttons
// - combo box (mood)
// - buttons: Add Song, Remove Last, Clear All

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class MusicPlayerUI_v2 extends JFrame {
    private JTextField songField;
    private JTextField artistField;
    private JCheckBox favCheck;
    private JRadioButton genrePop, genreRock;
    private JComboBox<String> moodCombo;
    private JTextArea playlistArea;
    private JButton addButton, removeButton, clearAllButton;

    public MusicPlayerUI_v2() {
        super("Music Player - v2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(8, 8));

        // Input panels
        JPanel inputPanel = new JPanel(new GridLayout(2, 1, 6, 6));
        JPanel songPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        songPanel.add(new JLabel("Song:"));
        songField = new JTextField(18);
        songPanel.add(songField);
        JPanel artistPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        artistPanel.add(new JLabel("Artist:"));
        artistField = new JTextField(18);
        artistPanel.add(artistField);
        inputPanel.add(songPanel);
        inputPanel.add(artistPanel);
        add(inputPanel, BorderLayout.NORTH);

        // Playlist area
        playlistArea = new JTextArea(10, 30);
        playlistArea.setEditable(false);
        playlistArea.setLineWrap(true);
        playlistArea.setWrapStyleWord(true);
        add(new JScrollPane(playlistArea), BorderLayout.CENTER);

        // Options (genre, favourite, mood)
        JPanel optionsPanel = new JPanel();
        optionsPanel.setLayout(new BoxLayout(optionsPanel, BoxLayout.Y_AXIS));
        optionsPanel.setBorder(BorderFactory.createTitledBorder("Options"));
        favCheck = new JCheckBox("Favourite");
        JPanel genrePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genrePanel.add(new JLabel("Genre:"));
        genrePop = new JRadioButton("Pop");
        genreRock = new JRadioButton("Rock");
        ButtonGroup genreGroup = new ButtonGroup();
        genreGroup.add(genrePop);
        genreGroup.add(genreRock);
        genrePanel.add(genrePop);
        genrePanel.add(genreRock);
        JPanel moodPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        moodPanel.add(new JLabel("Mood:"));
        moodCombo = new JComboBox<>(new String[] {
            "Select mood", "Chill", "Workout", "Party", "Study"
        });
        moodPanel.add(moodCombo);
        optionsPanel.add(genrePanel);
        optionsPanel.add(favCheck);
        optionsPanel.add(moodPanel);
        add(optionsPanel, BorderLayout.WEST);

        // Buttons
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        addButton = new JButton("Add Song");
        removeButton = new JButton("Remove Last");
        clearAllButton = new JButton("Clear All");
        buttonPanel.add(addButton);
        buttonPanel.add(removeButton);
        buttonPanel.add(clearAllButton);
        add(buttonPanel, BorderLayout.SOUTH);

        // Event handlers omitted for brevity...
        // (as in the full listing shown earlier)

        getRootPane().setDefaultButton(addButton);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

  
}
