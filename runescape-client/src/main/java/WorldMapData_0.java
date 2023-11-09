import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jx")
@Implements("WorldMapData_0")
public class WorldMapData_0 extends AbstractWorldMapData {
	WorldMapData_0() {
	} // L: 6

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ltm;B)V",
		garbageValue = "0"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 9
		if (var2 != WorldMapID.field3043.value) { // L: 10
			throw new IllegalStateException(""); // L: 11
		} else {
			super.minPlane = var1.readUnsignedByte(); // L: 13
			super.planes = var1.readUnsignedByte(); // L: 14
			super.regionXLow = var1.readUnsignedShort() * 4096; // L: 15
			super.regionYLow = var1.readUnsignedShort() * 4096; // L: 16
			super.regionX = var1.readUnsignedShort(); // L: 17
			super.regionY = var1.readUnsignedShort(); // L: 18
			super.groupId = var1.method9198(); // L: 19
			super.fileId = var1.method9198();
		}
	} // L: 21

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)V",
		garbageValue = "2049371979"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4); // L: 25
		super.floorUnderlayIds = new short[1][64][64]; // L: 26
		super.floorOverlayIds = new short[super.planes][64][64]; // L: 27
		super.field3014 = new byte[super.planes][64][64]; // L: 28
		super.field3000 = new byte[super.planes][64][64]; // L: 29
		super.decorations = new WorldMapDecoration[super.planes][64][64][]; // L: 30
		int var2 = var1.readUnsignedByte(); // L: 31
		if (var2 != class270.field3036.value) { // L: 32
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

	@ObfuscatedName("ae")
	static final void method5047(long var0) {
		try {
			Thread.sleep(var0); // L: 20
		} catch (InterruptedException var3) { // L: 22
		}

	} // L: 23

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-100"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(boolean var0) {
		for (int var1 = 0; var1 < Client.npcCount; ++var1) { // L: 5099
			NPC var2 = Client.npcs[Client.npcIndices[var1]]; // L: 5100
			if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) { // L: 5101
				int var3 = var2.x >> 7; // L: 5102
				int var4 = var2.y >> 7; // L: 5103
				if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) { // L: 5104
					if (var2.field1201 * 1127163057 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) { // L: 5105
						if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) { // L: 5106
							continue;
						}

						Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount; // L: 5107
					}

					long var5 = FontName.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]); // L: 5109
					var2.playerCycle = Client.cycle; // L: 5110
					class130.scene.drawEntity(HealthBar.Client_plane, var2.x, var2.y, class18.getTileHeight(var2.field1201 * -876008384 - 64 + var2.x, var2.field1201 * -876008384 - 64 + var2.y, HealthBar.Client_plane), var2.field1201 * -876008384 - 64 + 60, var2, var2.rotation, var5, var2.isWalking); // L: 5111
				}
			}
		}

	} // L: 5115

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "20"
	)
	@Export("formatItemStacks")
	static final String formatItemStacks(int var0) {
		String var1 = Integer.toString(var0); // L: 11018

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) { // L: 11019
			var1 = var1.substring(0, var2) + "," + var1.substring(var2); // L: 11020
		}

		if (var1.length() > 9) { // L: 11022
			return " " + class217.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
		} else {
			return var1.length() > 6 ? " " + class217.colorStartTag(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + class217.colorStartTag(16776960) + var1 + "</col>"; // L: 11023 11024
		}
	}
}
