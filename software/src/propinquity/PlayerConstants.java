package propinquity;

public interface PlayerConstants {

	public static final int MAX_PLAYERS = 2;
	static final int MIN_PLAYERS = 2;

	public static final int[][] PATCH_ADDR = new int[][] {
		{1, 2, 3, 4},
		{6, 7, 8, 9}
	};

	public static final int[] GLOVE_ADDR = new int[] {
		5,
		10
	};

	public static final Color[] PLAYER_COLORS = { Color.blue(), Color.red() };
	public static final Color NEUTRAL_COLOR = Color.violet();


}