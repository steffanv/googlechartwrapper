Java Library for the Google Chart API. It supports developers generating chart URLs within the java environment via an intuitive API. Currently most<sup>1</sup> features of the google API are supported and it is easily expandable to match own requirements.



&lt;hr/&gt;


## Features ##


  * Supports **most** features of the [Google Chart API](http://code.google.com/apis/chart/)
  * As a wrapper, it creates the URL for the request to the [Google Chart API](http://code.google.com/apis/chart/) while hiding the details of creating the URL parameters that are necessary
  * Written in Java
  * Easy to use
  * Only the jar and an Internet connection is required for generating charts
  * Well [documented](http://www.toolforge.de/javadoc/googlechartwrapper/index.html)
  * Open Source - **BSD License**


---

## Documentation & Examples ##
We continue to work on the documentation of the project. Most implementation details are documented in the [javadoc](http://www.toolforge.de/javadoc/googlechartwrapper/index.html) of the project. Furthermore, a growing list of wiki sites
contains simple and extended examples how to use the API.

  * PieChartExample - wiki page explaining the use of the PieChart with many examples
  * [Javadoc](http://www.toolforge.de/javadoc/googlechartwrapper/index.html)


---


## Chart Gallery with Code Examples ##

<p><img src='http://chart.apis.google.com/chart?cht=tx&chl=e^{\mathrm{i}\,\pi}%2B1=0\&nonsense=something_that_ends_with.png' />
</p>
<p>
<a href='http://code.google.com/p/googlechartwrapper/source/browse/trunk/googlechartwrapper/unitTests/FormulaTest.java#17'>Formula Code Example</a>
</p>

<p>
<img src='http://chart.apis.google.com/chart?cht=bvg&chs=300x300&chbh=a&chco=ffc800&chd=t:24,24,64,80,40,16&chm=D,ff7a59,0,0,5&chtt=Heights+of+Black+Cherry+trees&chxl=2:|Height (feet)|3:|Frequency&chxp=2,50|3,50&chxr=0,60,90,5|1,0,10,2&chxt=x,y,x,y&nonsense=something_that_ends_with.png' />
</p>
<p><a href='http://code.google.com/p/googlechartwrapper/source/browse/trunk/googlechartwrapper/unitTests/BarChartTest.java#36'>Bar Chart Code Example </a>
</p>


&lt;hr/&gt;

<p><img src='http://chart.apis.google.com/chart?cht=gom&chs=225x125&chd=t:70.0&chl=Hello&nonsense=something_that_ends_with.png' />
</p>
<p>
<a href='http://code.google.com/p/googlechartwrapper/source/browse/trunk/googlechartwrapper/unitTests/GoogleOMeterTest.java#26'>GoogleOMeter Example</a>
</p>


&lt;hr/&gt;

<p><img src='http://chart.apis.google.com/chart?cht=lc&chs=600x350&chd=s:CDDDDEEFGIJLLKIKLLMNJ&chdl=Dow Jones&chls=5.0,0.0,0.0&chm=d,0000ff,0,-1,10|B,ff0000,0,0,0|N*p1*,000000,0,-5,10,-1&chtt=Dow+Jones+89-09&chxr=0,1989,2009,2&chxt=x&nonsense=something_that_ends_with.png' />
</p>
<p><a href='http://code.google.com/p/googlechartwrapper/source/browse/trunk/googlechartwrapper/unitTests/LineChartTest.java#85'>Line Chart Code Example 1</a>
</p>


&lt;hr/&gt;


<p><img src='http://chart.apis.google.com/chart?cht=lxy&chs=300x300&chco=000000,ff9d0a&chd=t:10.0,20.0,30.0,45.0,58.0,60.0,80.0|34.0,12.0,89.0,45.0,70.0,80.0,110.0|-1.0|25.0,26.0,25.0,70.0&chls=1.0,0.0,0.0|5.0,2.0,2.0&chtt=xyLineChart&nonsense=something_that_ends_with.png' />
</p>
<p>
<a href='http://code.google.com/p/googlechartwrapper/source/browse/trunk/googlechartwrapper/unitTests/LineChartTest.java#63'>Line Chart Code Example 2</a>
</p>
<p><img src='http://chart.apis.google.com/chart?cht=t&chs=400x200&chtm=europe&chld=DEFRBEITROBGLTSEDKLVSKLUSIEEMTESFINLCZATHUGRPLGBIEPTCY&chd=t:100,100,100,100,0,0,0,0,0,0,0,100,0,0,0,0,0,100,0,0,0,0,0,0,0,0,0&chco=c0c0c0,ffff00,ffd700&chf=bg,s,0000ff&nonsense=something_that_ends_with.png' />
</p>
<p>
<a href='http://code.google.com/p/googlechartwrapper/source/browse/trunk/googlechartwrapper/unitTests/MapTest.java#45'>Map Code Example</a>
</p>

<p><img src='http://chart.apis.google.com/chart?cht=p3&chs=400x180&chd=e:..1SQ4Mh.o&chl=EU|USA|Japan|China|rest&chtt=GDP(nominal)&nonsense=something_that_ends_with.png' />
</p>
<p>
<a href='http://code.google.com/p/googlechartwrapper/source/browse/trunk/googlechartwrapper/unitTests/PieChartTest.java#128'>Pie Chart Code Example 1</a>
</p>
<p><img src='http://chart.apis.google.com/chart?cht=pc&chs=400x180&chco=0000ff|ff9d0a,ff0000&chd=e:..Go,GFUR&chl=USA|Canada|Brazil|Japan&nonsense=something_that_ends_with.png' />
</p>
<p>
<a href='http://code.google.com/p/googlechartwrapper/source/browse/trunk/googlechartwrapper/unitTests/PieChartTest.java#94'>Pie Chart Code Example 2</a>
</p>

<p><img src='http://chart.apis.google.com/chart?chs=300x300&cht=qr&chl=made%20in%20germany&choe=UTF-8&nonsense=something_that_ends_with.png' />
</p>
<p>
<a href='http://code.google.com/p/googlechartwrapper/source/browse/trunk/googlechartwrapper/unitTests/QRCodeTest.java#51'>QR Code Example</a>
</p>

<p><img src='http://chart.apis.google.com/chart?cht=r&chs=400x400&chco=00ff00&chd=t:30,50,50,80,20,30&chls=3.5,0.0,0.0&chm=a,ff0000,0,3.0,10|h,ffff00,0,-1,1&chtt=free+time+activities&chxl=0:|Math|Coding (Java)|Music|Sport|Reading|1:|0|20|40|60|100&chxr=1,0,100&chxt=x,y&nonsense=something_that_ends_with.png' />
</p>
<p>
<a href='http://code.google.com/p/googlechartwrapper/source/browse/trunk/googlechartwrapper/unitTests/RadarChartTest.java#81'>Radar Chart Code Example</a>
</p>

<p><img src='http://chart.apis.google.com/chart?cht=s&chs=600x450&chd=t:10,50,30,45,65,95,20,80,40|20,40,40,15,85,95,80,20,20|100,30,50,75,40,35,80,100,10&chg=30.0,15.0,12.0,12.0,25.0,25.0&chm=a,ff0000,1,-1,20,-1&chtt=Scatter Plot&chts=ffffff,12&nonsense=something_that_ends_with.png' />
</p>
<p>
<a href='http://code.google.com/p/googlechartwrapper/source/browse/trunk/googlechartwrapper/unitTests/ScatterPlotTest.java#106'>Scatter Plot Code Example</a>
</p>

<p><img src='http://chart.apis.google.com/chart?cht=v&chs=200x200&chd=e:BkBQA8AeAeAeAK&chdl=A|B|C&chdlp=r&chtt=Venn+Diagramm&nonsense=something_that_ends_with.png' />
</p>
<p>
<a href='http://code.google.com/p/googlechartwrapper/source/browse/trunk/googlechartwrapper/unitTests/VennDiagramTest.java#137'>Venn Diagram Code Example</a>
</p>



&lt;hr/&gt;


<sup>1</sup>The team is currently developing version 1.1 which will support features added to the google chart api after the release of version 1.0.