package org.example.zircon;

import org.hexworks.zircon.api.Components;
import org.hexworks.zircon.api.component.*;
import org.hexworks.zircon.api.data.Position;
import org.hexworks.zircon.api.graphics.BoxType;

import static org.hexworks.zircon.api.ComponentDecorations.box;
import static org.hexworks.zircon.api.ComponentDecorations.shadow;

public class ZirconComponents {

    public Panel createMainPanel() {
        return Components.panel()
                .withDecorations(
                        box(BoxType.SINGLE, "Distribution Game"),
                        shadow())
                .withSize(78, 46)
                .withPosition(1, 1)
                .build();
    }

    public Header createHeader() {
        return Components.header()
                .withPosition(1, 3)
                .withText("Welcome!")
                .build();
    }

    public Button createButton(String text, Position position) {
        return Components.button()
                .withPosition(position)
                .withText(text)
                .build();
    }

    public TextArea createTextArea(Position position) {
        return Components.textArea()
                .withPosition(position)
                .withSize(10, 2)
                .build();
    }
}