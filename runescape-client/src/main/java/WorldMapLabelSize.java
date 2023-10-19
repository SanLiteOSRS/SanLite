import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ka")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1083194051
	)
	final int field2902;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 494520973
	)
	final int field2903;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -2063403365
	)
	final int field2904;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(1, 0, 4); // L: 7
		WorldMapLabelSize_medium = new WorldMapLabelSize(0, 1, 2); // L: 8
		WorldMapLabelSize_large = new WorldMapLabelSize(2, 2, 0); // L: 9
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field2902 = var1; // L: 15
		this.field2903 = var2; // L: 16
		this.field2904 = var3; // L: 17
	} // L: 18

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(FI)Z",
		garbageValue = "-198292177"
	)
	boolean method5218(float var1) {
		return var1 >= (float)this.field2904; // L: 21
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)Lka;",
		garbageValue = "108"
	)
	static WorldMapLabelSize method5212(int var0) {
		WorldMapLabelSize[] var1 = new WorldMapLabelSize[]{WorldMapLabelSize_medium, WorldMapLabelSize_large, WorldMapLabelSize_small}; // L: 28
		WorldMapLabelSize[] var2 = var1; // L: 30

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 31
			WorldMapLabelSize var4 = var2[var3]; // L: 32
			if (var0 == var4.field2903) { // L: 34
				return var4; // L: 35
			}
		}

		return null; // L: 40
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1105487530"
	)
	public static int method5221(int var0) {
		return class479.field4825[var0 & 16383]; // L: 37
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1216862596"
	)
	static final int method5220() {
		return ViewportMouse.ViewportMouse_y; // L: 121
	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-13"
	)
	static boolean method5219() {
		return (Client.drawPlayerNames & 8) != 0; // L: 5379
	}
}
