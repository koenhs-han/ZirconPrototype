package org.example.zircon.mainmenu.components;

import org.hexworks.zircon.api.component.Button;
import org.hexworks.zircon.api.data.Position;
import org.hexworks.zircon.api.uievent.ComponentEventType;
import org.hexworks.zircon.api.uievent.UIEventResponse;

import static org.hexworks.zircon.api.Components.button;

public class SetupGameButton {

    private final Button button;

    public SetupGameButton(Position position) {
        this.button = button()
                .withPosition(position)
                .withText("Setup Game")
                .build();

        this.button.handleComponentEvents(ComponentEventType.ACTIVATED, (event) -> {
            System.out.println("Setting up game...");
            return UIEventResponse.processed();
        });
    }

    public Button getButton() {
        return button;
    }
}