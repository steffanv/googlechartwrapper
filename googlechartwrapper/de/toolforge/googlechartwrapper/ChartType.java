package de.toolforge.googlechartwrapper;

/**
 * 
 * @author steffan
 *
 */
public enum ChartType {
	
	  	LineChart("lc"),
	  	LineChartPair("lxy"),	  	
	  	SparkLine("ls"),
	    ScatterPlot("s"),
	    BarChartStackedH("bhs"),
	    BarChartStackedV("bvs"),
	    BarChartGroupedH("bhg"),
	    BarChartGroupedV("bvg"),	    
	    VennDiagram("v"),
	    PieChart("p"),
	    PieChart3d("p3"),
	    PieChartConcentric("pc"),
	    GoogleOMeter("gom"),
	    Map("t"),
	    RadarChartStraightLines("r"),
	    RadarChartSplines("rs"),
	    QRCode("qr"),
	    Formula("tx"),
	    FreestandingDynamicIcon("chst");
	  	
	  	private final String prefix;
	  	
	  	private ChartType(String prefix) {
			this.prefix = prefix;
		}
	  	
	  	/**
	  	 * Prefix for every chart, scatterplot means 's'
	  	 * 
	  	 * @return prefix for the chart
	  	 */
	  	public String getPrefix(){
	  		return this.prefix;
	  	}

}
