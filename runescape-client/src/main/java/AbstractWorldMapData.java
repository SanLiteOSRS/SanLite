import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("o")
	public static boolean field2951;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -726069248
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -469545536
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 827902535
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -255256689
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1536744925
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1761460877
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 347944191
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -872993431
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("b")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("m")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("t")
	byte[][][] field2960;
	@ObfuscatedName("h")
	byte[][][] field2956;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "[[[[Lik;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("u")
	boolean field2957;
	@ObfuscatedName("x")
	boolean field2958;

	static {
		field2951 = true; // L: 21
	}

	AbstractWorldMapData() {
		this.groupId = -1; // L: 14
		this.fileId = -1; // L: 15
		new LinkedList();
		this.field2957 = false; // L: 27
		this.field2958 = false; // L: 28
	} // L: 30

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lrd;B)V",
		garbageValue = "9"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-217482611"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field2957 && this.field2958; // L: 33
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lln;B)V",
		garbageValue = "110"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) { // L: 37
			byte[] var2 = var1.takeFile(this.groupId, this.fileId); // L: 38
			if (var2 != null) { // L: 39
				this.readGeography(new Buffer(var2)); // L: 40
				this.field2957 = true; // L: 41
				this.field2958 = true; // L: 42
			}

		}
	} // L: 44

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "126"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null; // L: 47
		this.floorOverlayIds = null; // L: 48
		this.field2960 = null; // L: 49
		this.field2956 = null; // L: 50
		this.decorations = null; // L: 51
		this.field2957 = false; // L: 52
		this.field2958 = false; // L: 53
	} // L: 54

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IILrd;B)V",
		garbageValue = "1"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte(); // L: 57
		if (var4 != 0) { // L: 58
			if ((var4 & 1) != 0) { // L: 61
				this.method5303(var1, var2, var3, var4); // L: 62
			} else {
				this.method5327(var1, var2, var3, var4); // L: 65
			}

		}
	} // L: 59 67

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IILrd;II)V",
		garbageValue = "-2024811095"
	)
	void method5303(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0; // L: 70
		if (var5) { // L: 71
			this.floorOverlayIds[0][var1][var2] = field2951 ? (short)var3.readUnsignedShort() : (short)var3.readUnsignedByte(); // L: 72
		}

		this.floorUnderlayIds[0][var1][var2] = field2951 ? (short)var3.readUnsignedShort() : (short)var3.readUnsignedByte(); // L: 74
	} // L: 75

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IILrd;II)V",
		garbageValue = "2043326073"
	)
	void method5327(int var1, int var2, Buffer var3, int var4) {
		int var5 = ((var4 & 24) >> 3) + 1; // L: 78
		boolean var6 = (var4 & 2) != 0; // L: 79
		boolean var7 = (var4 & 4) != 0; // L: 80
		this.floorUnderlayIds[0][var1][var2] = field2951 ? (short)var3.readUnsignedShort() : (short)var3.readUnsignedByte(); // L: 81
		int var8;
		int var9;
		int var11;
		if (var6) { // L: 82
			var8 = var3.readUnsignedByte(); // L: 83

			for (var9 = 0; var9 < var8; ++var9) { // L: 84
				int var14 = field2951 ? var3.readUnsignedShort() : var3.readUnsignedByte(); // L: 85
				if (var14 != 0) { // L: 86
					this.floorOverlayIds[var9][var1][var2] = (short)var14; // L: 87
					var11 = var3.readUnsignedByte(); // L: 88
					this.field2960[var9][var1][var2] = (byte)(var11 >> 2); // L: 89
					this.field2956[var9][var1][var2] = (byte)(var11 & 3); // L: 90
				}
			}
		}

		if (var7) { // L: 94
			for (var8 = 0; var8 < var5; ++var8) { // L: 95
				var9 = var3.readUnsignedByte(); // L: 96
				if (var9 != 0) { // L: 97
					WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9]; // L: 100

					for (var11 = 0; var11 < var9; ++var11) { // L: 101
						int var12 = var3.method8709(); // L: 102
						int var13 = var3.readUnsignedByte(); // L: 103
						var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3); // L: 104
					}
				}
			}
		}

	} // L: 108

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1948785623"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX; // L: 113
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1777462733"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY; // L: 117
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "([Lkz;Lkz;ZB)V",
		garbageValue = "-1"
	)
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth != 0 ? var1.scrollWidth : var1.width; // L: 11437
		int var4 = var1.scrollHeight != 0 ? var1.scrollHeight : var1.height; // L: 11438
		class374.resizeInterface(var0, var1.id, var3, var4, var2); // L: 11439
		if (var1.children != null) {
			class374.resizeInterface(var1.children, var1.id, var3, var4, var2); // L: 11440
		}

		InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id); // L: 11441
		if (var5 != null) { // L: 11442
			int var6 = var5.group; // L: 11443
			if (class153.loadInterface(var6)) { // L: 11445
				class374.resizeInterface(WorldMapLabel.Widget_interfaceComponents[var6], -1, var3, var4, var2); // L: 11446
			}
		}

		if (var1.contentType == 1337) { // L: 11449
		}

	} // L: 11450
}
