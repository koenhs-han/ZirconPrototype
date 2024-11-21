package org.example.zircon.mainmenu.components;
import org.example.zircon.game.ZirconLookingForGame;
import org.hexworks.zircon.api.component.Button;
import org.hexworks.zircon.api.data.Position;
import org.hexworks.zircon.api.uievent.ComponentEventType;
import org.hexworks.zircon.api.uievent.UIEventResponse;

import static org.hexworks.zircon.api.Components.button;

public class JoinGameButton {

    private final Button button;

    public JoinGameButton(Position position) {
        this.button = button()
                .withPosition(position)
                .withText("Join Game")
                .build();

        this.button.handleComponentEvents(ComponentEventType.ACTIVATED, (event) -> {
            ZirconLookingForGame lookingForGameScreen = new ZirconLookingForGame();
            lookingForGameScreen.display();
            return UIEventResponse.processed();
        });
    }

    public Button getButton() {
        return button;
    }
}