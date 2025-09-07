# Java Swing Music Player

A clean and functional desktop application for managing a music playlist, built using Java Swing. This project demonstrates core GUI programming concepts like event handling, layout management, and the use of various Swing components.

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Swing](https://img.shields.io/badge/Swing-UI%20Framework-lightgrey?style=for-the-badge)

## Application Preview

![Music Player Application GUI](Screenshot%202025-09-08%20002139.png)

## Features

*   **Add Songs:** Input a song title and artist name to add them to the playlist.
*   **Favorites:** Mark songs as favorites using a checkbox.
*   **Genre Filter:** Select a genre for the song (Pop or Rock) using radio buttons.
*   **Mood Selection:** Choose a mood for the song from a dropdown list (Chill, Workout, Party, Study).
*   **Playlist Management:**
    *   **Remove Last:** Remove the most recently added song from the playlist.
    *   **Clear All:** Clear the entire playlist.

## Files

*   `MusicPlayerUIv2.java` - Contains the main GUI class that builds the interface and handles user interactions.
*   `MusicPlayer.java` - The main launcher class that starts the application (uses `SwingUtilities.invokeLater` for thread safety).

## Prerequisites

To run this application, you need to have installed on your machine:
*   **JDK 8 or higher** (The code is compatible with JDK 1.8)

## How to Run

1.  **Clone or Download the Files:** Ensure all three files (`MusicPlayerUIv2.java`, `MusicPlayer.java`, and the screenshot) are in the same directory on your computer.
2.  **Compile the Code:** Open a terminal or command prompt in that directory and compile the Java files:
    ```bash
    javac MusicPlayer.java MusicPlayerUIv2.java
    ```
3.  **Run the Application:** Execute the program using the launcher class:
    ```bash
    java MusicPlayer
    ```

## How to Use

1.  Enter the name of a song in the **"Song:"** field.
2.  Enter the artist's name in the **"Artist:"** field.
3.  *(Optional)* Select a genre by clicking either **"Pop"** or **"Rock"**.
4.  *(Optional)* Select a mood from the **"Mood"** dropdown menu.
5.  *(Optional)* Check the **"Favourite"** box if you like the song.
6.  Click the **"Add Song"** button to add the entry to the playlist.
7.  Use **"Remove Last"** to undo the last addition or **"Clear All"** to start over.

## License

This project is for educational and demonstration purposes.
