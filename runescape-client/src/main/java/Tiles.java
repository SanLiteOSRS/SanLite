import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cg")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("v")
	@Export("Tiles_heights")
	static int[][][] Tiles_heights;
	@ObfuscatedName("n")
	@Export("Tiles_renderFlags")
	static byte[][][] Tiles_renderFlags;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1752941579
	)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("y")
	static byte[][][] field1120;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "[Lbg;"
	)
	@Export("World_worlds")
	static World[] World_worlds;
	@ObfuscatedName("l")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;
	@ObfuscatedName("m")
	static final int[] field1117;
	@ObfuscatedName("x")
	static final int[] field1125;
	@ObfuscatedName("z")
	static final int[] field1126;
	@ObfuscatedName("w")
	static final int[] field1123;
	@ObfuscatedName("t")
	static final int[] field1128;
	@ObfuscatedName("h")
	static final int[] field1129;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -760931637
	)
	static int field1130;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 696638661
	)
	static int field1131;

	static {
		Tiles_heights = new int[4][105][105];
		Tiles_renderFlags = new byte[4][104][104];
		Tiles_minPlane = 99;
		field1117 = new int[]{1, 2, 4, 8};
		field1125 = new int[]{16, 32, 64, 128};
		field1126 = new int[]{1, 0, -1, 0};
		field1123 = new int[]{0, -1, 0, 1};
		field1128 = new int[]{1, -1, -1, 1};
		field1129 = new int[]{-1, -1, 1, 1};
		field1130 = (int)(Math.random() * 17.0D) - 8;
		field1131 = (int)(Math.random() * 33.0D) - 16;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "928975395"
	)
	static final void method2053() {
		Object var10000 = null;
		String var0 = "Your friend list is full. Max of 200 for free users, and 400 for members";
		World.addGameMessage(30, "", var0);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-175787881"
	)
	@Export("stringCp1252NullTerminatedByteSize")
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1;
	}
}
