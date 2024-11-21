package org.example.zircon.mainmenu.components;

import org.hexworks.zircon.api.component.Button;
import org.hexworks.zircon.api.data.Position;
import org.hexworks.zircon.api.uievent.ComponentEventType;
import org.hexworks.zircon.api.uievent.UIEventResponse;

import static org.hexworks.zircon.api.Components.button;

public class ExitButton {

    private final Button button;

    public ExitButton(Position position) {
        this.button = button()
                .withPosition(position)
                .withText("Exit Game")
                .build();

        this.button.handleComponentEvents(ComponentEventType.ACTIVATED, (event) -> {
            System.out.println("Exiting game...");
            System.exit(0);
            return UIEventResponse.processed();
        });
    }

    public Button getButton() {
        return button;
    }
}