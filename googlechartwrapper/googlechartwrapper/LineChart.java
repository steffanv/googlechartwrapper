package googlechartwrapper;

import googlechartwrapper.coder.IEncoder;
import googlechartwrapper.color.FillArea;
import googlechartwrapper.color.ISolidFillable;
import googlechartwrapper.color.LinearGradient;
import googlechartwrapper.color.LinearStripes;
import googlechartwrapper.color.SolidFill;
import googlechartwrapper.data.DataScaling;
import googlechartwrapper.interfaces.ILinearable;
import googlechartwrapper.interfaces.IMarkable;
import googlechartwrapper.interfaces.IStyleable;
import googlechartwrapper.label.AxisLabelAppender;
import googlechartwrapper.label.AxisLabelSummary;
import googlechartwrapper.label.ChartTitle;
import googlechartwrapper.style.GridLine;
import googlechartwrapper.style.IGridLineable;
import googlechartwrapper.style.ILineStyle;
import googlechartwrapper.style.LineStyle;
import googlechartwrapper.style.RangeMarker;
import googlechartwrapper.style.ShapeMarker;
import googlechartwrapper.util.GenericAppender;
import googlechartwrapper.util.UpperLimitGenericAppender;
import googlechartwrapper.util.UpperLimitGenericAppender.UpperLimitReactions;

import java.awt.Dimension;
import java.util.List;

/**
 * 
 * @author steffan
 *
 */
public class LineChart extends AbstractChart implements IMarkable,ILinearable,IStyleable, IGridLineable, ISolidFillable{


	private LineChartType lineChartType;

	protected GenericAppender<RangeMarker> rangeMarkerAppender = 
	    	new GenericAppender<RangeMarker>(ChartTypeFeature.Marker);
	    protected  GenericAppender<ShapeMarker> shapeMarkerAppender =
	    	new GenericAppender<ShapeMarker>(ChartTypeFeature.Marker);
	    protected UpperLimitGenericAppender<GridLine> gridLineAppender =
	    	new UpperLimitGenericAppender<GridLine>(ChartTypeFeature.GridLine, 1,UpperLimitReactions.RemoveFirst);
	    protected UpperLimitGenericAppender<LinearGradient> linearGradientAppender =
	    	new UpperLimitGenericAppender<LinearGradient>(ChartTypeFeature.LinearGradient, 1,UpperLimitReactions.RemoveFirst);
	    protected GenericAppender<FillArea> fillAreaAppender = new GenericAppender<FillArea>(ChartTypeFeature.FillArea);
	    protected GenericAppender<SolidFill> solidFillAppender = new GenericAppender<SolidFill>(ChartTypeFeature.SolidFill);
	    protected UpperLimitGenericAppender<ChartTitle>  chartTitleAppender =
	    	new UpperLimitGenericAppender<ChartTitle>(ChartTypeFeature.ChartTitle, 1,UpperLimitReactions.RemoveFirst);
	    
	    protected AxisLabelAppender axisLabelAppender = 
			new AxisLabelAppender();
	    
	    /**
	     * Constructs a lineChart
	     * 
	     * @param chartDimension the size of the diagram
	     * @param lineChartType  
	     * 
	     * @throws IllegalArgumentException
	     */
		 public LineChart(Dimension chartDimension ,LineChartType lineChartType) {
				super(chartDimension);
				// TODO Auto-generated constructor stub
			
			
			if(chartDimension == null)
				throw new IllegalArgumentException("chartDimension can not be null");
			if(lineChartType == null)
				throw new IllegalArgumentException("lineChartType can not be null");
			
			this.lineChartType = lineChartType;
		}

		@Override
		protected ChartType getChartType() {
			
			return ChartType.LineChart;
		}

		@Override
		protected String getUrlChartType() {
			
			/*
			  char orientationChar = this.orientation == BarChartOrientation.Horizontal ? 'v' : 'h';
	          char styleChar = this.style == BarChartStyle.Stacked ? 's' : 'g';

	          return MessageFormat.format("b{0}{1}", orientationChar, styleChar);
	          */
			return null;
		}
		
		
		/**
		 * 
		 * 
		 * @author steffan
		 *
		 */
		public enum LineChartType
	    {
	        
			
	    }
		
		public void addRangeMarker(RangeMarker rm) {
				this.rangeMarkerAppender.add(rm);
			
		}

		public List<RangeMarker> getRangeMarkers() {
			return rangeMarkerAppender.getList();
		}

		public void addShapeMarker(ShapeMarker shapeMarker) {
			this.shapeMarkerAppender.add(shapeMarker);
			
		}

		public List<ShapeMarker> getShapeMarkers() {		
			return shapeMarkerAppender.getList();
		}

		public void removeAllRangeMarkers() {
			this.rangeMarkerAppender.removeAll();
			
		}

		public RangeMarker removeRangeMarker(int index) {
			
			return this.removeRangeMarker(index);
		}

		public boolean removeRangeMarker(RangeMarker rm) {
			
			return this.removeRangeMarker(rm);
		}

		public void removeAllShapeMarkers() {
			this.shapeMarkerAppender.removeAll();
			
		}

		public ShapeMarker removeShapeMarker(int index) {
			
			return this.shapeMarkerAppender.remove(index);
		}

		public boolean removeShapeMarker(ShapeMarker sm) {
			
			return this.shapeMarkerAppender.remove(sm);
		}

		public void removeGridLine() {
			this.gridLineAppender.removeAll();
			
		}

		public void setGridLine(GridLine gl) {
			this.gridLineAppender.add(gl);
			
		}

		public void removeLinearGradient() {
			this.linearGradientAppender.removeAll();
			
		}

		public void setLinearGradient(LinearGradient lg) {
			this.linearGradientAppender.add(lg);
			
		}

		public void addFillArea(FillArea fa) {
			this.fillAreaAppender.add(fa);
			
		}

		public List<FillArea> getFillAreas() {
			
			return this.fillAreaAppender.getList();
		}

		public void removeAllFillAreas() {
			this.fillAreaAppender.removeAll();
			
		}

		public FillArea removeFillArea(int index) {
			
			return this.fillAreaAppender.remove(index);
		}

		public boolean removeFillArea(FillArea fa) {
			
			return this.fillAreaAppender.remove(fa);
		}

		public void addSolidFill(SolidFill sf) {
			this.solidFillAppender.add(sf);
			
		}

		public List<SolidFill> getSolidFills() {
			
			return this.solidFillAppender.getList();
		}

		public void removeAllSolidFills() {
			this.solidFillAppender.removeAll();
			
		}

		public SolidFill removeSolidFill(int index) {
			
			return this.solidFillAppender.remove(index);
		}

		public boolean removeSolidFill(SolidFill sf) {
			
			return this.solidFillAppender.remove(sf);
		}

		public void addAxisLabelSummary(AxisLabelSummary labelSummary) {
			
			this.axisLabelAppender.addAxis(labelSummary);
		}

		public List<AxisLabelSummary> getAxisLabelSummaries() {
			
			return this.axisLabelAppender.getList();
		}

		public void removeAllAxisLabelSummaries() {
			this.axisLabelAppender.removeAll();
			
		}

		public AxisLabelSummary removeAxisLabelSummary(int index) {
			
			return this.axisLabelAppender.removeAxis(index);
		}

		public boolean removeAxisLabelSummary(AxisLabelSummary labelSummary) {
			
			return this.axisLabelAppender.removeAxis(labelSummary);
		}

		public void removeChartTitle() {
			this.chartTitleAppender.removeAll();
			
		}

		public void setChartTitle(ChartTitle title) {
			this.chartTitleAppender.add(title);
			
		}

		public GridLine getGridLine() {
			// TODO Auto-generated method stub
			return null;
		}

		public ChartTitle getChartTitle() {
			// TODO Auto-generated method stub
			return null;
		}

		public LinearStripes getLinearStripes() {
			// TODO Auto-generated method stub
			return null;
		}

		public void removeLinearStripes() {
			// TODO Auto-generated method stub
			
		}

		public void setLinearStripes(LinearStripes ls) {
			// TODO Auto-generated method stub
			
		}

		public DataScaling getDataScaling() {
			// TODO Auto-generated method stub
			return null;
		}

		public void setDataScaling(DataScaling ds) {
			// TODO Auto-generated method stub
			
		}

		public void addLineStyle(ILineStyle lineStyle) {
			// TODO Auto-generated method stub
			
		}

		public List<ILineStyle> getLineStyles() {
			// TODO Auto-generated method stub
			return null;
		}

		public void removeAllLineStyles() {
			// TODO Auto-generated method stub
			
		}

		public LineStyle removeLineStyle(int index) {
			// TODO Auto-generated method stub
			return null;
		}

		public boolean removeLineStyle(LineStyle lineStyle) {
			// TODO Auto-generated method stub
			return false;
		}

		public IEncoder getEncoder() {
			// TODO Auto-generated method stub
			return null;
		}

		
}