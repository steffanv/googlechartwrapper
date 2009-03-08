package unitTests;

import static org.junit.Assert.assertEquals;
import googlechartwrapper.PieChart;
import googlechartwrapper.color.LinearStripe;
import googlechartwrapper.color.LinearStripe.LinearStripesDestination;
import googlechartwrapper.data.PieChartSlice;
import googlechartwrapper.label.ChartTitle;
import googlechartwrapper.style.ChartMargin;

import java.awt.Color;
import java.awt.Dimension;

import org.junit.Test;

public class PieChartTest {

	@Test
	public void testSimpleExample (){
		PieChart chart = new PieChart(new Dimension(400,180),true);
		chart.setChartTitle(new ChartTitle("GDP (nominal)"));
		//WORLD: 54,620,000	//EU: 16,620,000 //USA: 13,840,000 
		//JAPAN: 4,384,000 //China: 3,251,000
		chart.addPieChartSlice(new PieChartSlice(16620000,"EU", null));
		chart.addPieChartSlice(new PieChartSlice(13840000,"USA", null));
		chart.addPieChartSlice(new PieChartSlice( 4384000,"Japan", null));
		chart.addPieChartSlice(new PieChartSlice( 3251000,"China", null));
		chart.addPieChartSlice(new PieChartSlice(54620000-16620000-13840000
				-4384000-3251000,"rest", null));
		
		
		assertEquals("http://chart.apis.google.com/chart?cht=p3&chs=400x180&chd=t:30,25,8,5,30&chl=EU|USA|Japan|China|rest&chtt=GDP+(nominal)", 
				chart.getUrl());
	}
	
	@Test
	public void testExtendedExample (){
		PieChart chart = new PieChart(new Dimension(400,180),false);
		chart.setChartTitle(new ChartTitle("GDP of the world(nominal)"));
		
		chart.addPieChartSlice(new PieChartSlice(13840000,"USA", Color.BLUE));
		chart.addPieChartSlice(new PieChartSlice( 4384000,"Japan", null));
		chart.addPieChartSlice(new PieChartSlice( 3322000,"Germany", null));
		chart.addPieChartSlice(new PieChartSlice( 3251000,"China (PRC)", null));
		chart.addPieChartSlice(new PieChartSlice( 2773000,"United Kingdom", null));
		chart.addPieChartSlice(new PieChartSlice( 2560000,"France", null));
		chart.addPieChartSlice(new PieChartSlice( 2105000,"Italy", null));
		chart.addPieChartSlice(new PieChartSlice( 1439000,"Spain", null));
		chart.addPieChartSlice(new PieChartSlice( 1432000,"Canada", null));
		chart.addPieChartSlice(new PieChartSlice( 1314000,"Brazil", null));
		chart.addPieChartSlice(new PieChartSlice(54620000-13840000-4384000-3322000-
				3251000-2773000-2560000-2105000-1439000-1432000-1314000,"other", null));
		
		chart.setLinearStripes(new LinearStripe(LinearStripesDestination.Background,30,Color.ORANGE,0.1f, Color.YELLOW, 0.4f));
			
		//System.out.println(chart.getUrl());
		//TODO assert???
	}
	@Test
	public void example1(){
		
		PieChart chart = new PieChart(new Dimension(400,180),false);
		chart.setChartTitle(new ChartTitle("GDP of the world(nominal)"));
		chart.addPieChartSlice(new PieChartSlice(80,"USA", Color.BLUE));
		chart.addPieChartSlice(new PieChartSlice(20,"Canada", null));
		chart.setPieChartOrientation(2.5f);
		//chart.removePieChartOrientation();		
		
		assertEquals("http://chart.apis.google.com/chart?cht=p&chs=400x180&chd=t:80,20&chco=0000ff&chl=USA|Canada&chp=2.5&chtt=GDP+of+the+world(nominal)"
				,chart.getUrl());
	}
	@Test
	public void example2(){
		
		PieChart chart = new PieChart(new Dimension(400,180),false);
		chart.setChartTitle(new ChartTitle("GDP of the world(nominal)"));
		chart.addPieChartSlice(new PieChartSlice(80,"USA", Color.BLUE));
		chart.addPieChartSlice(new PieChartSlice(20,"Canada", null));
		chart.setChartMargin(new ChartMargin(40,40,40,40));
	
		assertEquals("http://chart.apis.google.com/chart?cht=p&chs=400x180&chd=t:80,20&chco=0000ff&chl=USA|Canada&chma=40,40,40,40&chtt=GDP+of+the+world(nominal)"
				,chart.getUrl());
		
		
	}
	
}
