package demo;

import googlechartwrapper.BarChart;
import googlechartwrapper.BarChart.BarChartOrientation;
import googlechartwrapper.BarChart.BarChartStyle;
import googlechartwrapper.style.GridLine;
import googlechartwrapper.style.RangeMarker;
import googlechartwrapper.style.ShapeMarker;
import googlechartwrapper.style.RangeMarker.Alignment;
import googlechartwrapper.style.ShapeMarker.MarkerTyp;

import java.awt.Color;
import java.awt.Dimension;


public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BarChart c = new BarChart(new Dimension(300,300),BarChartOrientation.Horizontal,BarChartStyle.Grouped);
		
		//c.setTitle("wer klaut am besten code?");
		
		
		int [] values = new int[] {10,60,33,10,10,23,12,32};
		c.setValues(values);
		
		c.addRangeMarker(new RangeMarker(Alignment.Vertical,Color.BLUE,0.2f,0.5f));
		c.addShapeMarker(new ShapeMarker(MarkerTyp.Cross,Color.BLACK,0,5.5f,10));
		c.addShapeMarker(new ShapeMarker(MarkerTyp.HorizontalLine,Color.CYAN,6,0.4f,5));
		//c.removeAllShapeMarkers();
		c.setGridLine(new GridLine(10f,20f));
		System.out.println(c.getUrl());
		
		/*
		GeographicMap c = new GeographicMap(new Dimension(440,220), GeographicalArea.USA);
		
		System.out.println(c.getUrl());
		ArrayList<String> t = new ArrayList<String>();
		//t.add("DE");
		//t.add("FR");
		//t.add("CN");
		//t.add("JP");
		//t.add("RU");
		String state ="NYPATNWVNVNJNHVAHIVTNMNCNDNELASDDCDEFLWAKSWIORKYMEOHIAIDCTWYUTINILAKTXCOMDMAALMOMNCAOKMIGAAZMTMSSCRIAR";
		for (int i = 0; i < "NYPATNWVNVNJNHVAHIVTNMNCNDNELASDDCDEFLWAKSWIORKYMEOHIAIDCTWYUTINILAKTXCOMDMAALMOMNCAOKMIGAAZMTMSSCRIAR".length()-2;i= i+2){
			t.add(state.substring(i,i+2));
		}
		t.add("AR");
		http://chart.apis.google.com/chart?chco=f5f5f5,edf0d4,6c9642,365e24,13390a&chd=s:fSGBDQBQBBAGABCBDAKLCDGFCLBBEBBEPASDKJBDD9BHHEAACAC&chf=bg,s,eaf7fe&chtm=usa&chld=NYPATNWVNVNJNHVAHIVTNMNCNDNELASDDCDEFLWAKSWIORKYMEOHIAIDCTWYUTINILAKTXCOMDMAALMOMNCAOKMIGAAZMTMSSCRIAR&chs=440x220&cht=t
		c.setDataColors(new Color[]{
				//f5f5f5,edf0d4,6c9642,365e24,13390a
				new Color(Integer.parseInt("f5f5f5".toUpperCase(),16)),
				//Color.decode("f5f5f5".toUpperCase()),
				new Color(Integer.parseInt("edf0d4".toUpperCase(),16)),
				//Color.decode("edf0d4".toUpperCase()),
				new Color(Integer.parseInt("6c9642".toUpperCase(),16)),
				//Color.decode("6c9642".toUpperCase()),	
				new Color(Integer.parseInt("365e24".toUpperCase(),16)),
				//Color.decode("13390a".toUpperCase()),
				new Color(Integer.parseInt("13390a".toUpperCase(),16))});
		;
		c.setColoredStates(t);
		//values: fSGBDQBQBBAGABCBDAKLCDGFCLBBEBBEPASDKJBDD9BHHEAACAC
		String val = "fSGBDQBQBBAGABCBDAKLCDGFCLBBEBBEPASDKJBDD9BHHEAACAC";
		final String simpleEncoding = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		int[] v = new int[val.length()];
		for (int i = 0; i < val.length(); i++){
			v[i] = simpleEncoding.indexOf(val.charAt(i)+"");
			System.out.println(v[i]);
		}
		System.out.println(Arrays.toString(v));
		c.setValues(v);
		System.out.println(c.getUrl());
		*/

	}

}
