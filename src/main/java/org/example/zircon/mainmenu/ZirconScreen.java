package org.example.zircon.mainmenu;

import org.hexworks.zircon.api.*;
import org.hexworks.zircon.api.application.AppConfig;
import org.hexworks.zircon.api.grid.TileGrid;
import org.hexworks.zircon.api.screen.Screen;

public class ZirconScreen {

    private final Screen screen;

    public ZirconScreen() {
        final TileGrid tileGrid = SwingApplications.startTileGrid(
                AppConfig.newBuilder()
                        .withSize(80, 48)
                        .withDefaultTileset(CP437TilesetResources.aduDhabi16x16())
                        .withTitle("Distribution Game")
                        .build());
        this.screen = Screen.create(tileGrid);
    }

    public Screen getScreen() {
        return screen;
    }

    public void display() {
        screen.display();
    }
}