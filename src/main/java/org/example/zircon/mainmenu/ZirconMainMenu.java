package org.example.zircon.mainmenu;

import org.example.zircon.ZirconComponents;
import org.example.zircon.mainmenu.components.JoinGameButton;
import org.example.zircon.mainmenu.components.SetupGameButton;
import org.example.zircon.mainmenu.components.ExitButton;
import org.hexworks.zircon.api.ColorThemes;
import org.hexworks.zircon.api.component.*;
import org.hexworks.zircon.api.screen.Screen;

import static org.hexworks.zircon.api.data.Position.create;

public class ZirconMainMenu {

    public void renderMenu() {
        ZirconScreen zirconScreen = new ZirconScreen();
        Screen screen = zirconScreen.getScreen();

        ZirconComponents components = new ZirconComponents();

        // Create components
        Panel panel = components.createMainPanel();
        Header header = components.createHeader();
        SetupGameButton setupGameButton = new SetupGameButton(create(0, 1).relativeToBottomOf(header));
        JoinGameButton joinGameButton = new JoinGameButton(create(0, 1).relativeToBottomOf(setupGameButton.getButton()));
        ExitButton exitButton = new ExitButton(create(0, 1).relativeToBottomOf(joinGameButton.getButton()));

        // Add components to the panel
        panel.addComponent(header);
        panel.addComponent(setupGameButton.getButton());
        panel.addComponent(joinGameButton.getButton());
        panel.addComponent(exitButton.getButton());

        screen.addComponent(panel);
        screen.setTheme(ColorThemes.justparchment());

        zirconScreen.display();
    }
}