package org.example;

import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.gui2.*;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;

public class LanternaMainMenu {

    public void renderMenu() {
        try {
            // Create a terminal screen
            Screen screen = new DefaultTerminalFactory().createScreen();
            screen.startScreen();


            // Create a GUI
            WindowBasedTextGUI textGUI = new MultiWindowTextGUI(screen);
            BasicWindow window = new BasicWindow("Distribution Game");

            // Create a main panel
            Panel panel = new Panel();
            panel.setLayoutManager(new GridLayout(1)); // 1-column layout

            // Add some buttons
            Button button1 = new Button("Setup game", () -> System.out.println("You selected Option 1!"));
            Button button2 = new Button("Join game", () -> System.out.println("You selected Option 2!"));
            Button exitButton = new Button("Quit", () -> {
                try {
                    screen.stopScreen();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.exit(0);
            });

            // Add components to the panel
            panel.addComponent(new Label("Welcome to the Text-Based UI!"));
            panel.addComponent(button1);
            panel.addComponent(button2);
            panel.addComponent(new EmptySpace(new TerminalSize(0, 1))); // Add empty space
            panel.addComponent(exitButton);

            // Set the panel as the main component of the window
            window.setComponent(panel);

            // Show the window
            textGUI.addWindowAndWait(window);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

