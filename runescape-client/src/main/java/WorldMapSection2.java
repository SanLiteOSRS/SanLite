import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jm")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 2127199599
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -118010281
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -278390823
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 170990425
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 838083521
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1539558065
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1436754725
	)
	int field2892;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 552398117
	)
	int field2887;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 2074313849
	)
	int field2893;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1311821527
	)
	int field2885;

	WorldMapSection2() {
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljh;I)V",
		garbageValue = "-821781156"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2892) {
			var1.regionLowX = this.field2892;
		}

		if (var1.regionHighX < this.field2893) {
			var1.regionHighX = this.field2893;
		}

		if (var1.regionLowY > this.field2887) {
			var1.regionLowY = this.field2887;
		}

		if (var1.regionHighY < this.field2885) {
			var1.regionHighY = this.field2885;
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1764737995"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) {
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY; // L: 33
		} else {
			return false;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1249387971"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 >= this.field2892 && var1 >> 6 <= this.field2893 && var2 >> 6 >= this.field2887 && var2 >> 6 <= this.field2885; // L: 38
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-560637356"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 43
			return null; // L: 44
		} else {
			int[] var4 = new int[]{this.field2892 * 64 - this.regionStartX * 64 + var2, var3 + (this.field2887 * 64 - this.regionStartY * 64)}; // L: 46 47 48
			return var4; // L: 49
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)Lmk;",
		garbageValue = "-1072096611"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 54
			return null; // L: 55
		} else {
			int var3 = this.regionStartX * 64 - this.field2892 * 64 + var1; // L: 57
			int var4 = this.regionStartY * 64 - this.field2887 * 64 + var2; // L: 58
			return new Coord(this.minPlane, var3, var4); // L: 59
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)V",
		garbageValue = "1760890975"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte(); // L: 64
		this.planes = var1.readUnsignedByte(); // L: 65
		this.regionStartX = var1.readUnsignedShort(); // L: 66
		this.regionStartY = var1.readUnsignedShort(); // L: 67
		this.regionEndX = var1.readUnsignedShort(); // L: 68
		this.regionEndY = var1.readUnsignedShort(); // L: 69
		this.field2892 = var1.readUnsignedShort(); // L: 70
		this.field2887 = var1.readUnsignedShort(); // L: 71
		this.field2893 = var1.readUnsignedShort(); // L: 72
		this.field2885 = var1.readUnsignedShort(); // L: 73
		this.postRead(); // L: 74
	} // L: 75

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-765680155"
	)
	@Export("postRead")
	void postRead() {
	} // L: 77

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/io/File;",
		garbageValue = "1042308672"
	)
	@Export("getFile")
	static File getFile(String var0) {
		if (!FileSystem.FileSystem_hasPermissions) { // L: 16
			throw new RuntimeException("");
		} else {
			File var1 = (File)FileSystem.FileSystem_cacheFiles.get(var0); // L: 17
			if (var1 != null) { // L: 18
				return var1;
			} else {
				File var2 = new File(FileSystem.FileSystem_cacheDir, var0); // L: 19
				RandomAccessFile var3 = null; // L: 20

				try {
					File var4 = new File(var2.getParent()); // L: 22
					if (!var4.exists()) { // L: 23
						throw new RuntimeException("");
					} else {
						var3 = new RandomAccessFile(var2, "rw"); // L: 24
						int var5 = var3.read(); // L: 25
						var3.seek(0L); // L: 26
						var3.write(var5); // L: 27
						var3.seek(0L); // L: 28
						var3.close(); // L: 29
						FileSystem.FileSystem_cacheFiles.put(var0, var2); // L: 30
						return var2; // L: 31
					}
				} catch (Exception var8) {
					try {
						if (var3 != null) { // L: 35
							var3.close(); // L: 36
							var3 = null; // L: 37
						}
					} catch (Exception var7) { // L: 40
					}

					throw new RuntimeException(); // L: 42
				}
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IZI)Ljava/lang/String;",
		garbageValue = "-1422342677"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		return var1 && var0 >= 0 ? MouseHandler.method686(var0, 10, var1) : Integer.toString(var0); // L: 115 116
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-221527065"
	)
	static final boolean method5191() {
		return ViewportMouse.ViewportMouse_isInViewport; // L: 83
	}

	@ObfuscatedName("mv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "492595541"
	)
	static final void method5174() {
		for (int var0 = 0; var0 < Players.Players_count; ++var0) { // L: 12579
			Player var1 = Client.players[Players.Players_indices[var0]]; // L: 12580
			var1.method2354(); // L: 12581
		}

	} // L: 12583
}
