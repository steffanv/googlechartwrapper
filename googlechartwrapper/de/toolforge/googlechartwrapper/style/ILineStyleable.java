package de.toolforge.googlechartwrapper.style;

import java.util.List;

/**
 * 
 * Line and sparkline charts: specifying thickness and dash style (and color with data set colors)
 * Line, sparkline, and bar charts: specifying thickness, color, and priority
 * 
 * @author steffan
 *
 */
public interface ILineStyleable {
	
	/**
	 * 
	 * 
	 * @param lineStyle
	 */
	public void addLineStyle(LineStyle lineStyle);
	
	/**
	 * 
	 * @return list of {@link LineStyle}
	 */
	public List<LineStyle> getLineStyles();
	
	/**
	 * 
	 * @param index
	 * @return the removed {@link LineStyle}
	 */
	public LineStyle removeLineStyle(int index);
	
	/**
	 * 
	 * @param lineStyle
	 * @return {@code true} if success
	 */
	public boolean removeLineStyle(LineStyle lineStyle);
	
	/**
	 * 
	 */
	public void removeAllLineStyles();	

}
