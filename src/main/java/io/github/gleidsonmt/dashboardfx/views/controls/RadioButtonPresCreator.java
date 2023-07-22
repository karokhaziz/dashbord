/*
 *
 *    Copyright (C) Gleidson Neves da Silveira
 *
 *    This program is free software: you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published by
 *    the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package io.github.gleidsonmt.dashboardfx.views.controls;

import io.github.gleidsonmt.dashboardfx.core.Context;
import io.github.gleidsonmt.dashboardfx.core.view.layout.creators.TutorialCreator;
import javafx.scene.control.RadioButton;

/**
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com
 * Create on  22/06/2023
 */
public class RadioButtonPresCreator extends TutorialCreator {
    public RadioButtonPresCreator(Context context) {
        super(context);
        this
                .title("Intro")
                .text("RadioButtons create a series of items where only one item can be selected. RadioButtons are a specialized ToggleButton. When a RadioButton is pressed and released a ActionEvent is sent. Your application can perform some action based on this event by implementing an EventHandler to process the ActionEvent.")
                .demonstration(new RadioButton("RadioButton"), """
                        //Constructor
                        RadioButton radioBtn = new RadioButton("Radio Button");
                        """)
                .title("Links")
                .footer(createDefaultAuthor("RadioButton"))
                .build();

    }
}
