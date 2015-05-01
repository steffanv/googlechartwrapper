# Introduction #

We created a _AbstractPieChart_ and the two derived classes _PieChart_ and _ConcentricPieChart_. This wiki page deals with the _PieChart_. Pie charts are good for showing simple proportional part-to-whole information. Javadoc can be found online: [PieChart javadoc](http://www.toolforge.de/javadoc/googlechartwrapper/de/toolforge/googlechartwrapper/PieChart.html).

# A simple example #

Like other charts the first step is the size.

```
PieChart pieChart = new PieChart(new Dimension(300,200));
```

But whats about the data?
Lets say you have the values 50,20 and 30.

```
pieChart.addPieChartSlice(new PieChartSlice.PieChartSliceBuilder(20).build());
pieChart.addPieChartSlice(new PieChartSlice.PieChartSliceBuilder(50).build());
pieChart.addPieChartSlice(new PieChartSlice.PieChartSliceBuilder(30).build());
```

Looks complicated? Okay I will explain this step by step.
There are two ways to add data. In this case we use the _addPieChartSlice_ method. The expected _PieChartSlice_
base upon the builder pattern. This means we have a some required parameters and some optional parameters. In this case the data value is required. This is what we get with the first example.

**Tip**: You don't have to calculate the percentage values yourself. Just use the raw numbers and the chart will automatically calculate percentages based on the total and individual numbers. (e.g. inputs 20 and 40 will be automatically converted into 33% and 66%)

<img src='http://chart.apis.google.com/chart?cht=p&chs=300x300&chd=e:Zm..mZ&nonsense=something_that_ends_with.png' />

```
PieChart pieChart = new PieChart(new Dimension(300,200));

pieChart.addPieChartSlice(new PieChartSlice.PieChartSliceBuilder(20).build());
pieChart.addPieChartSlice(new PieChartSlice.PieChartSliceBuilder(50).build());
pieChart.addPieChartSlice(new PieChartSlice.PieChartSliceBuilder(30).build());
```

# More about the builder pattern #

There are two optional parameters, the color and a label text. As you can see you are not forced to define a color or
label. To give you this piece of freedom we decided to use the builder pattern

```
PieChart pieChart = new PieChart(new Dimension(300,200));

pieChart.addPieChartSlice(new PieChartSlice.PieChartSliceBuilder(20).build());
pieChart.addPieChartSlice(new PieChartSlice.PieChartSliceBuilder(50).label("black").color(Color.BLACK).build());
pieChart.addPieChartSlice(new PieChartSlice.PieChartSliceBuilder(30).label("label").build());
```

**Limitation**: Keep in mind that in order to display the labels, the chart width needs to be bigger than the chart height. If not the labels are only partially displayed, because the chart is not wide enough. (see http://code.google.com/intl/de/apis/chart/docs/gallery/pie_charts.html#pie_chart_label)

<img src='http://chart.apis.google.com/chart?cht=p&chs=300x200&chco=ff9d0a,000000,ff9d0a&chd=e:Zm..mZ&chl=|black|label&nonsense=something_that_ends_with.png' />

It is also possible to change the value, color or text after creating the object with the builder pattern via setter methods.

```
PieChartSlice slice = new PieChartSlice.PieChartSliceBuilder(30).label("label").build();
slice.setLabel("new label");
pieChart.addPieChartSlice(slice);
```

# Its all about the color #

The so called _SolidFill_ needs a destination, in this case the charts background and a color.
```
pieChart.addSolidFill(new SolidFill(SolidFill.ChartFillDestination.Background,Color.GRAY));
```

<img src='http://chart.apis.google.com/chart?cht=p&chs=300x200&chd=e:SStt..&chf=bg,s,808080&nonsense=something_that_ends_with.png' />

You have seen that it is possible to define the color for each slice moreover you can add a single color or more with the _addChartColor_ method.

```
pieChart.addChartColor(new ChartColor(Color.BLUE));
```

As you can see the whole chart has blue gradations.

<img src='http://chart.apis.google.com/chart?cht=p&chs=300x200&chco=0000ff&chd=e:SStt..&nonsense=something_that_ends_with.png' />

But what happens if we add two colors?

```
pieChart.addChartColor(new ChartColor(Color.BLUE));
pieChart.addChartColor(new ChartColor(Color.RED));
```

We have defined a gradient from blue to red.

<img src='http://chart.apis.google.com/chart?cht=p&chs=300x200&chco=0000ff,ff0000&chd=e:SStt...&nonsense=something_that_ends_with.png' />

A _LinearGradient_ from green to blue with an angle of 45 degrees.
```
pieChart.setLinearGradient(new LinearGradient(LinearGradient.GradientFillDestination.Background,45,Color.GREEN,0.5f,Color.BLUE,0.9f));
```

<img src='http://chart.apis.google.com/chart?cht=p&chs=300x200&chd=e:SStt..&chf=bg,lg,45,00ff00,0.5,0000ff,0.9&nonsense=something_that_ends_with.png' />

The _LinearStripe_ is very similar to the _LinearGradient_
```
pieChart.setLinearStripes(new LinearStripe(LinearStripe.LinearStripesDestination.Background,45,Color.RED,0.3f,Color.GREEN,0.8f));
```

<img src='http://chart.apis.google.com/chart?cht=p&chs=300x200&chd=e:SStt..&chf=bg,ls,45,ff0000,0.3,00ff00,0.8&nonsense=something_that_ends_with.png' />

# Some misc stuff #

Lets try the _set3D_ method

```
pieChart.set3D();
```

<img src='http://chart.apis.google.com/chart?cht=p3&chs=300x200&chd=e:SStt..&nonsense=something_that_ends_with.png' />

# Almost complete example #

```
PieChart pieChart = new PieChart(new Dimension(400,200));

pieChart.setChartTitle(new ChartTitle("Title",Color.BLACK,24));

pieChart.addPieChartSlice(new PieChartSlice.PieChartSliceBuilder(10).label("one").color(Color.ORANGE).build());
pieChart.addPieChartSlice(new PieChartSlice.PieChartSliceBuilder(50).label("two").color(Color.LIGHT_GRAY).build());
pieChart.addPieChartSlice(new PieChartSlice.PieChartSliceBuilder(60).label("three").color(Color.RED).build());

pieChart.setChartLegend(new ChartLegend(Arrays.asList("one","two","three")));

pieChart.setLinearGradient(new LinearGradient(LinearGradient.GradientFillDestination.Background,45,Color.WHITE,0.5f,Color.LIGHT_GRAY,0.9f));

pieChart.set3D();
```

<img src='http://chart.apis.google.com/chart?cht=p3&chs=400x200&chco=ffc800,c0c0c0,ff0000&chd=e:Kr1V..&chdl=one|two|three&chdlp=r&chf=bg,lg,45,ffffff,0.5,c0c0c0,0.9&chl=one|two|three&chtt=Title&chts=000000,24&nonsense=something_that_ends_with.png' />

Further documentation is available in the javadoc: http://www.toolforge.de/javadoc/googlechartwrapper/de/toolforge/googlechartwrapper/PieChart.html