//------------------------------------------------------------------------------------------------//
//                                                                                                //
//                                              A p p                                             //
//                                                                                                //
//------------------------------------------------------------------------------------------------//
// <editor-fold defaultstate="collapsed" desc="hdr">
//
//  Copyright © Audiveris 2017. All rights reserved.
//
//  This program is free software: you can redistribute it and/or modify it under the terms of the
//  GNU Affero General Public License as published by the Free Software Foundation, either version
//  3 of the License, or (at your option) any later version.
//
//  This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
//  without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
//  See the GNU Affero General Public License for more details.
//
//  You should have received a copy of the GNU Affero General Public License along with this
//  program.  If not, see <http://www.gnu.org/licenses/>.
//------------------------------------------------------------------------------------------------//
// </editor-fold>
package org.omrdataset;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Class {@code App} defines constants for the whole {@code OmrDataSet} application.
 *
 * @author Hervé Bitteur
 */
public abstract class App
{
    //~ Static fields/initializers -----------------------------------------------------------------

    /** Path to where the data is found. */
    public static final Path DATA_PATH = Paths.get("data");

    /** Path to input images. */
    public static final Path IMAGES_PATH = DATA_PATH.resolve("input-images");

    /** Path to CNN model. */
    public static final Path MODEL_PATH = DATA_PATH.resolve("cnn-model.zip");

    /** File name for pixels norms. */
    public static final String PIXELS_NORMS = "pixels.norms";

    /** File name for symbol widths norms. */
    public static final String WIDTHS_NORMS = "widths.norms";

    /** File name for symbol heights norms. */
    public static final String HEIGHTS_NORMS = "heights.norms";

    /** Path to created control-images. */
    public static final Path CONTROL_IMAGES_PATH = DATA_PATH.resolve("control-images");

    /** Path to created sub-images. */
    public static final Path SUB_IMAGES_PATH = DATA_PATH.resolve("sub-images");

    /** Format for output images (sub-images & control-images). */
    public static final String OUTPUT_IMAGES_FORMAT = "png";

    /** File extension for output images. */
    public static final String OUTPUT_IMAGES_EXT = "." + OUTPUT_IMAGES_FORMAT;

    /** File extension for page info. */
    public static final String INFO_EXT = ".xml";

    /** Path to single CSV file. */
    public static final Path CSV_PATH = DATA_PATH.resolve("features.csv");

    /** Height in pixels for symbol context. */
    public static final int CONTEXT_HEIGHT = 96;

    /** Width in pixels for symbol context. */
    public static final int CONTEXT_WIDTH = 48;

    /** Abscissa margin around a None symbol location. */
    public static final int NONE_X_MARGIN = 5;

    /** Value used for background pixel feature. */
    public static final int BACKGROUND = 0;

    /** Value used for foreground pixel feature. */
    public static final int FOREGROUND = 255;

    /** Ordinate margin around a None symbol location. */
    public static final int NONE_Y_MARGIN = 5;

    /** Ratio of None symbols created versus valid symbols found in page. */
    public static final double NONE_RATIO = 1.0;
}
