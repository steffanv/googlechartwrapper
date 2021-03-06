package de.toolforge.googlechartwrapper.style;

import de.toolforge.googlechartwrapper.ChartTypeFeature;
import de.toolforge.googlechartwrapper.util.AppendableFeature;
import de.toolforge.googlechartwrapper.util.IFeatureAppender;

import java.util.ArrayList;
import java.util.List;


/**
 * Specifies BarWidthAndSpacing <a href=
 * "http://code.google.com/intl/de-DE/apis/chart/styles.html#bar_width"
 * >http://code.google.com/intl/de-DE/apis/chart/styles.html#bar_width</a>
 * <br />
 * To construct a new object see {@link BarWidthAndSpacing#newRelativeResize(float, float)}, {@link BarWidthAndSpacing#newAutomaticallyResize()} and
 * {@link BarWidthAndSpacing#newAutomaticallyResize(int, int)}.
 *
 * @author steffan
 */
public class BarWidthAndSpacing implements IFeatureAppender {

    private BarWidthAndSpacing() {
    }

    /**
     * Returns a {@link BarWidthAndSpacing} object, which performs auto resize
     * with the availbale space.
     *
     * @return {@link BarWidthAndSpacing}
     */
    public static BarWidthAndSpacing newAutomaticallyResize() {

        return new BarWidthAndSpacing() {

            @Override
            public List<AppendableFeature> getAppendableFeatures(
                    List<? extends IFeatureAppender> otherAppenders) {

                StringBuilder builder = new StringBuilder();

                builder.append("a");

                List<AppendableFeature> feature = new ArrayList<AppendableFeature>();

                feature.add(new AppendableFeature(builder.toString(),
                        ChartTypeFeature.ChartData));

                return feature;
            }

        };

    }

    /**
     * Returns a {@link BarWidthAndSpacing} object.
     *
     * @param spaceBetweenBars   space in pixel, >= 0
     * @param spaceBetweenGroups space in pixel, >= 0
     * @return {@link BarWidthAndSpacing}
     * @throws IllegalArgumentException if spaceBetweenBars is < 0 and/or spaceBetweenGroups is < 0
     */
    public static BarWidthAndSpacing newAutomaticallyResize(
            final int spaceBetweenBars, final int spaceBetweenGroups) {

        if (spaceBetweenBars < 0)
            throw new IllegalArgumentException(
                    "spaceBetweenBars can not be < 0");
        if (spaceBetweenGroups < 0)
            throw new IllegalArgumentException(
                    "spaceBetweenGroups can not be < 0");

        return new BarWidthAndSpacing() {

            @Override
            public List<AppendableFeature> getAppendableFeatures(
                    List<? extends IFeatureAppender> otherAppenders) {

                StringBuilder builder = new StringBuilder();

                builder.append("a");
                builder.append(",");
                builder.append(spaceBetweenBars);
                builder.append(",");
                builder.append(spaceBetweenGroups);

                List<AppendableFeature> feature = new ArrayList<AppendableFeature>();

                feature.add(new AppendableFeature(builder.toString(),
                        ChartTypeFeature.ChartData));

                return feature;
            }

        };

    }

    /**
     * Returns a {@link BarWidthAndSpacing} object, that perform a Resize relative to the given values.
     *
     * @param spaceBetweenBars   0.0 are 0% 1.0 are 100% and so on...
     * @param spaceBetweenGroups 0.0 are 0% 1.0 are 100% and so on...
     * @return {@link BarWidthAndSpacing}
     * @throws IllegalArgumentException if spaceBetweenBars < 0 and/or spaceBetweenGroups < 0
     */
    public static BarWidthAndSpacing newRelativeResize(final float spaceBetweenBars,
                                                       final float spaceBetweenGroups) {

        if (spaceBetweenBars < 0)
            throw new IllegalArgumentException("spaceBetweenBars can not be < 0");
        if (spaceBetweenGroups < 0)
            throw new IllegalArgumentException("spaceBetweenGroups can not be < 0");

        return new BarWidthAndSpacing() {
            @Override
            public List<AppendableFeature> getAppendableFeatures(
                    List<? extends IFeatureAppender> otherAppenders) {
                StringBuilder builder = new StringBuilder();

                builder.append("r");
                builder.append(",");
                builder.append(spaceBetweenBars);
                builder.append(",");
                builder.append(spaceBetweenGroups);

                List<AppendableFeature> feature = new ArrayList<AppendableFeature>();

                feature.add(new AppendableFeature(builder.toString(),
                        ChartTypeFeature.ChartData));

                return feature;

            }

        };
    }

    public List<AppendableFeature> getAppendableFeatures(
            List<? extends IFeatureAppender> otherAppenders) {

        return null;
    }

}
