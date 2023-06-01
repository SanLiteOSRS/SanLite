import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kj")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("ls")
	@ObfuscatedGetter(
		intValue = -356120565
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -657933635
	)
	@Export("oldZ")
	int oldZ;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 2100824589
	)
	@Export("newZ")
	int newZ;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1574521147
	)
	@Export("oldX")
	int oldX;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1194702037
	)
	@Export("oldY")
	int oldY;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1981113697
	)
	@Export("newX")
	int newX;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1588845015
	)
	@Export("newY")
	int newY;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -78213429
	)
	@Export("oldChunkXLow")
	int oldChunkXLow;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1370354895
	)
	@Export("oldChunkYLow")
	int oldChunkYLow;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -49249613
	)
	@Export("oldChunkXHigh")
	int oldChunkXHigh;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -820582955
	)
	@Export("oldChunkYHigh")
	int oldChunkYHigh;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1822005183
	)
	@Export("newChunkXLow")
	int newChunkXLow;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 525334851
	)
	@Export("newChunkYLow")
	int newChunkYLow;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 165345731
	)
	@Export("newChunkXHigh")
	int newChunkXHigh;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1312406341
	)
	@Export("newChunkYHigh")
	int newChunkYHigh;

	WorldMapSection0() {
	} // L: 22

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lju;B)V",
		garbageValue = "-106"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.newX) { // L: 26
			var1.regionLowX = this.newX;
		}

		if (var1.regionHighX < this.newX) {
			var1.regionHighX = this.newX; // L: 27
		}

		if (var1.regionLowY > this.newY) { // L: 28
			var1.regionLowY = this.newY;
		}

		if (var1.regionHighY < this.newY) { // L: 29
			var1.regionHighY = this.newY;
		}

	} // L: 30

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "0"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.oldZ && var1 < this.newZ + this.oldZ) { // L: 34
			return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7; // L: 37
		} else {
			return false; // L: 35
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "326256885"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7; // L: 42
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIS)[I",
		garbageValue = "3148"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 47
			return null; // L: 48
		} else {
			int[] var4 = new int[]{this.newX * 64 - this.oldX * 64 + var2 + (this.newChunkXLow * 8 - this.oldChunkXLow * 8), var3 + (this.newY * 64 - this.oldY * 64) + (this.newChunkYLow * 8 - this.oldChunkYLow * 8)}; // L: 50 51 52
			return var4; // L: 53
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)Lms;",
		garbageValue = "-2137162191"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 58
			return null; // L: 59
		} else {
			int var3 = this.oldX * 64 - this.newX * 64 + (this.oldChunkXLow * 8 - this.newChunkXLow * 8) + var1; // L: 61
			int var4 = this.oldY * 64 - this.newY * 64 + var2 + (this.oldChunkYLow * 8 - this.newChunkYLow * 8); // L: 62
			return new Coord(this.oldZ, var3, var4); // L: 63
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ltc;B)V",
		garbageValue = "8"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.oldZ = var1.readUnsignedByte(); // L: 68
		this.newZ = var1.readUnsignedByte(); // L: 69
		this.oldX = var1.readUnsignedShort(); // L: 70
		this.oldChunkXLow = var1.readUnsignedByte(); // L: 71
		this.oldChunkXHigh = var1.readUnsignedByte(); // L: 72
		this.oldY = var1.readUnsignedShort(); // L: 73
		this.oldChunkYLow = var1.readUnsignedByte(); // L: 74
		this.oldChunkYHigh = var1.readUnsignedByte(); // L: 75
		this.newX = var1.readUnsignedShort(); // L: 76
		this.newChunkXLow = var1.readUnsignedByte(); // L: 77
		this.newChunkXHigh = var1.readUnsignedByte(); // L: 78
		this.newY = var1.readUnsignedShort(); // L: 79
		this.newChunkYLow = var1.readUnsignedByte(); // L: 80
		this.newChunkYHigh = var1.readUnsignedByte(); // L: 81
		this.postRead(); // L: 82
	} // L: 83

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "65"
	)
	@Export("postRead")
	void postRead() {
	} // L: 85

	@ObfuscatedName("or")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "0"
	)
	static String method5430(String var0) {
		PlayerType[] var1 = class31.PlayerType_values(); // L: 12602

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 12603
			PlayerType var3 = var1[var2]; // L: 12604
			if (var3.modIcon != -1 && var0.startsWith(ViewportMouse.method4904(var3.modIcon))) { // L: 12606 12607
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length()); // L: 12608
				break;
			}
		}

		return var0; // L: 12615
	}
}
