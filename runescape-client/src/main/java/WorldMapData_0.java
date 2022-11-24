import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ht")
@Implements("WorldMapData_0")
public class WorldMapData_0 extends AbstractWorldMapData {
	WorldMapData_0() {
	} // L: 6

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lqr;B)V",
		garbageValue = "-67"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 9
		if (var2 != WorldMapID.field2926.value) { // L: 10
			throw new IllegalStateException(""); // L: 11
		} else {
			super.minPlane = var1.readUnsignedByte(); // L: 13
			super.planes = var1.readUnsignedByte(); // L: 14
			super.regionXLow = var1.readUnsignedShort() * 4096; // L: 15
			super.regionYLow = var1.readUnsignedShort() * 64; // L: 16
			super.regionX = var1.readUnsignedShort(); // L: 17
			super.regionY = var1.readUnsignedShort(); // L: 18
			super.groupId = var1.method8422(); // L: 19
			super.fileId = var1.method8422(); // L: 20
		}
	} // L: 21

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "-1742589874"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4); // L: 25
		super.floorUnderlayIds = new short[1][64][64]; // L: 26
		super.floorOverlayIds = new short[super.planes][64][64]; // L: 27
		super.field2886 = new byte[super.planes][64][64]; // L: 28
		super.field2887 = new byte[super.planes][64][64]; // L: 29
		super.decorations = new WorldMapDecoration[super.planes][64][64][]; // L: 30
		int var2 = var1.readUnsignedByte(); // L: 31
		if (var2 != class248.field2915.value) { // L: 32
			throw new IllegalStateException(""); // L: 33
		} else {
			int var3 = var1.readUnsignedByte(); // L: 35
			int var4 = var1.readUnsignedByte(); // L: 36
			if (var3 == super.regionX && var4 == super.regionY) { // L: 37
				for (int var5 = 0; var5 < 64; ++var5) { // L: 40
					for (int var6 = 0; var6 < 64; ++var6) { // L: 41
						this.readTile(var5, var6, var1); // L: 42
					}
				}

			} else {
				throw new IllegalStateException(""); // L: 38
			}
		}
	} // L: 45

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_0)) { // L: 49
			return false; // L: 50
		} else {
			WorldMapData_0 var2 = (WorldMapData_0)var1; // L: 52
			return super.regionX == var2.regionX && super.regionY == var2.regionY; // L: 53
		}
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8; // L: 58
	}

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "611853521"
	)
	static void method4678() {
		Client.packetWriter.clearBuffer(); // L: 2795
		Client.packetWriter.packetBuffer.offset = 0; // L: 2796
		Client.packetWriter.serverPacket = null; // L: 2797
		Client.packetWriter.field1380 = null; // L: 2798
		Client.packetWriter.field1373 = null; // L: 2799
		Client.packetWriter.field1381 = null; // L: 2800
		Client.packetWriter.serverPacketLength = 0; // L: 2801
		Client.packetWriter.field1371 = 0; // L: 2802
		Client.rebootTimer = 0; // L: 2803
		Client.menuOptionsCount = 0; // L: 2805
		Client.isMenuOpen = false; // L: 2806
		Client.minimapState = 0; // L: 2808
		Client.destinationX = 0; // L: 2809

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) { // L: 2810
			Client.players[var0] = null;
		}

		class296.localPlayer = null; // L: 2811

		for (var0 = 0; var0 < Client.npcs.length; ++var0) { // L: 2812
			NPC var1 = Client.npcs[var0]; // L: 2813
			if (var1 != null) { // L: 2814
				var1.targetIndex = -1; // L: 2815
				var1.false0 = false; // L: 2816
			}
		}

		class133.method2975(); // L: 2819
		class21.method305(30); // L: 2820

		for (var0 = 0; var0 < 100; ++var0) { // L: 2821
			Client.field717[var0] = true;
		}

		class9.method61(); // L: 2822
	} // L: 2823

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1620030234"
	)
	static final void method4667(int var0, int var1) {
		if (Client.menuOptionsCount >= 2 || Client.isItemSelected != 0 || Client.isSpellSelected) { // L: 8672
			if (Client.showMouseOverText) { // L: 8673
				int var2 = class250.method5167(); // L: 8674
				String var3;
				if (Client.isItemSelected == 1 && Client.menuOptionsCount < 2) { // L: 8676
					var3 = "Use" + " " + Client.selectedItemName + " " + "->";
				} else if (Client.isSpellSelected && Client.menuOptionsCount < 2) { // L: 8677
					var3 = Client.selectedSpellActionName + " " + Client.selectedSpellName + " " + "->";
				} else {
					var3 = FaceNormal.method4461(var2); // L: 8678
				}

				if (Client.menuOptionsCount > 2) { // L: 8679
					var3 = var3 + GameObject.colorStartTag(16777215) + " " + '/' + " " + (Client.menuOptionsCount - 2) + " more options";
				}

				UserComparator3.fontBold12.drawRandomAlphaAndSpacing(var3, var0 + 4, var1 + 15, 16777215, 0, Client.cycle / 1000); // L: 8680
			}
		}
	} // L: 8681

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "131998521"
	)
	static final void method4676(int var0) {
		var0 = Math.max(Math.min(var0, 100), 0); // L: 12152
		var0 = 100 - var0; // L: 12153
		float var1 = (float)var0 / 200.0F + 0.5F; // L: 12154
		GroundObject.method4134((double)var1); // L: 12155
	} // L: 12156
}
