package org.example.zircon.game;

import org.hexworks.zircon.api.*;
import org.hexworks.zircon.api.application.AppConfig;
import org.hexworks.zircon.api.component.*;
import org.hexworks.zircon.api.graphics.BoxType;
import org.hexworks.zircon.api.grid.TileGrid;
import org.hexworks.zircon.api.screen.Screen;

import static org.hexworks.zircon.api.ComponentDecorations.box;
import static org.hexworks.zircon.api.ComponentDecorations.shadow;

public class ZirconLookingForGame {

    private final Screen screen;

    public ZirconLookingForGame() {
        final TileGrid tileGrid = SwingApplications.startTileGrid(
                AppConfig.newBuilder()
                        .withSize(80, 48)
                        .withDefaultTileset(CP437TilesetResources.aduDhabi16x16())
                        .withTitle("Looking for Game")
                        .build());
        this.screen = Screen.create(tileGrid);

        Panel panel = Components.panel()
                .withDecorations(
                        box(BoxType.SINGLE, "Looking for Game"),
                        shadow())
                .withSize(78, 46)
                .withPosition(1, 1)
                .build();

        final Header header = Components.header()
                .withPosition(1, 3)
                .withText("Searching for available games...")
                .build();

        panel.addComponent(header);
        screen.addComponent(panel);
        screen.setTheme(ColorThemes.justparchment());
    }

    public void display() {
        screen.display();
    }
}
