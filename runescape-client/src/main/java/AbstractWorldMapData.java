import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hc")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1905790976
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -871596096
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -743392137
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -493602369
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1840059819
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1086583875
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1776846601
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1471098933
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("m")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("u")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("l")
	byte[][][] field2814;
	@ObfuscatedName("z")
	byte[][][] field2808;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "[[[[Lif;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("y")
	boolean field2817;
	@ObfuscatedName("p")
	boolean field2818;

	AbstractWorldMapData() {
		this.groupId = -1; // L: 14
		this.fileId = -1; // L: 15
		new LinkedList();
		this.field2817 = false; // L: 26
		this.field2818 = false; // L: 27
	} // L: 29

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lqr;B)V",
		garbageValue = "42"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "723385833"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field2817 && this.field2818; // L: 32
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lls;I)V",
		garbageValue = "-1436707847"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) { // L: 36
			byte[] var2 = var1.takeFile(this.groupId, this.fileId); // L: 37
			if (var2 != null) { // L: 38
				this.readGeography(new Buffer(var2)); // L: 39
				this.field2817 = true; // L: 40
				this.field2818 = true; // L: 41
			}

		}
	} // L: 43

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2142698481"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null; // L: 46
		this.floorOverlayIds = null; // L: 47
		this.field2814 = null; // L: 48
		this.field2808 = null; // L: 49
		this.decorations = null; // L: 50
		this.field2817 = false; // L: 51
		this.field2818 = false; // L: 52
	} // L: 53

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IILqr;B)V",
		garbageValue = "71"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte(); // L: 56
		if (var4 != 0) { // L: 57
			if ((var4 & 1) != 0) { // L: 60
				this.method4885(var1, var2, var3, var4); // L: 61
			} else {
				this.method4886(var1, var2, var3, var4); // L: 64
			}

		}
	} // L: 58 66

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IILqr;II)V",
		garbageValue = "709673601"
	)
	void method4885(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0; // L: 69
		if (var5) { // L: 70
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedByte(); // L: 71
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte(); // L: 73
	} // L: 74

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IILqr;II)V",
		garbageValue = "1302752199"
	)
	void method4886(int var1, int var2, Buffer var3, int var4) {
		int var5 = ((var4 & 24) >> 3) + 1; // L: 77
		boolean var6 = (var4 & 2) != 0; // L: 78
		boolean var7 = (var4 & 4) != 0; // L: 79
		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte(); // L: 80
		int var8;
		int var9;
		int var11;
		if (var6) { // L: 81
			var8 = var3.readUnsignedByte(); // L: 82

			for (var9 = 0; var9 < var8; ++var9) { // L: 83
				int var14 = var3.readUnsignedByte(); // L: 84
				if (var14 != 0) { // L: 85
					this.floorOverlayIds[var9][var1][var2] = (short)var14; // L: 86
					var11 = var3.readUnsignedByte(); // L: 87
					this.field2814[var9][var1][var2] = (byte)(var11 >> 2); // L: 88
					this.field2808[var9][var1][var2] = (byte)(var11 & 3); // L: 89
				}
			}
		}

		if (var7) { // L: 93
			for (var8 = 0; var8 < var5; ++var8) { // L: 94
				var9 = var3.readUnsignedByte(); // L: 95
				if (var9 != 0) { // L: 96
					WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9]; // L: 99

					for (var11 = 0; var11 < var9; ++var11) { // L: 100
						int var12 = var3.method7652(); // L: 101
						int var13 = var3.readUnsignedByte(); // L: 102
						var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3); // L: 103
					}
				}
			}
		}

	} // L: 107

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1989273008"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX; // L: 112
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-68513364"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY; // L: 116
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1537080128"
	)
	public static String method4895(String var0) {
		int var1 = var0.length(); // L: 164
		char[] var2 = new char[var1]; // L: 165
		byte var3 = 2; // L: 166

		for (int var4 = 0; var4 < var1; ++var4) { // L: 167
			char var5 = var0.charAt(var4); // L: 168
			if (var3 == 0) { // L: 169
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) { // L: 170
				var5 = ChatChannel.method1958(var5);
			}

			if (Character.isLetter(var5)) { // L: 171
				var3 = 0;
			} else if (var5 != '.' && var5 != '?' && var5 != '!') { // L: 172
				if (Character.isSpaceChar(var5)) { // L: 173
					if (var3 != 2) { // L: 174
						var3 = 1;
					}
				} else {
					var3 = 1; // L: 176
				}
			} else {
				var3 = 2;
			}

			var2[var4] = var5; // L: 177
		}

		return new String(var2); // L: 179
	}

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1358123367"
	)
	static void method4911() {
		if (class347.field4164 != null) { // L: 12253
			Client.field765 = Client.cycle; // L: 12254
			class347.field4164.method5977(); // L: 12255

			for (int var0 = 0; var0 < Client.players.length; ++var0) { // L: 12256
				if (Client.players[var0] != null) { // L: 12257
					class347.field4164.method5964(Decimator.baseX * 64 + (Client.players[var0].x >> 7), class7.baseY * 64 + (Client.players[var0].y >> 7)); // L: 12258
				}
			}
		}

	} // L: 12262
}
