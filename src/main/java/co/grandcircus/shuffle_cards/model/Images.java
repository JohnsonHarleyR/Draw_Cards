package co.grandcircus.shuffle_cards.model;

public class Images {

	private String svg;
	private String png;
	
	
	/**
	 * @return the svg
	 */
	public String getSvg() {
		return svg;
	}
	/**
	 * @param svg the svg to set
	 */
	public void setSvg(String svg) {
		this.svg = svg;
	}
	/**
	 * @return the png
	 */
	public String getPng() {
		return png;
	}
	/**
	 * @param png the png to set
	 */
	public void setPng(String png) {
		this.png = png;
	}
	
	
	@Override
	public String toString() {
		return "Images [svg=" + svg + ", png=" + png + "]";
	}
	
	
	
}
