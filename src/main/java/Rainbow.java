public class Rainbow {
	public enum MyColor {
		RED(0xff0000), GREEN(0x00ff00), BLUE(0x0000ff);
		private final int rgb;
		MyColor(int rgb) { this.rgb = rgb; }
		public int getRGB() { return rgb; }
	};
	public static void main(String[] args) {
		// insert code here
	}
}