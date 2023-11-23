import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jg")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1310653337
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1994817079
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -672114413
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 433200453
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1228637641
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 33622073
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -942189481
	)
	int field2452;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1040610857
	)
	int field2460;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1034393799
	)
	int field2457;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 367055233
	)
	int field2459;

	WorldMapSection2() {
	} // L: 18

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljv;B)V",
		garbageValue = "16"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2452) { // L: 22
			var1.regionLowX = this.field2452;
		}

		if (var1.regionHighX < this.field2457) {
			var1.regionHighX = this.field2457; // L: 23
		}

		if (var1.regionLowY > this.field2460) { // L: 24
			var1.regionLowY = this.field2460;
		}

		if (var1.regionHighY < this.field2459) { // L: 25
			var1.regionHighY = this.field2459;
		}

	} // L: 26

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "2"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) { // L: 30
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY; // L: 33
		} else {
			return false; // L: 31
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "542110974"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 >= this.field2452 && var1 >> 6 <= this.field2457 && var2 >> 6 >= this.field2460 && var2 >> 6 <= this.field2459; // L: 38
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIS)[I",
		garbageValue = "12300"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 43
			return null; // L: 44
		} else {
			int[] var4 = new int[]{this.field2452 * 64 - this.regionStartX * 64 + var2, var3 + (this.field2460 * 64 - this.regionStartY * 64)}; // L: 46 47 48
			return var4; // L: 49
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)Lmh;",
		garbageValue = "-1535299153"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 54
			return null; // L: 55
		} else {
			int var3 = this.regionStartX * 64 - this.field2452 * 64 + var1; // L: 57
			int var4 = this.regionStartY * 64 - this.field2460 * 64 + var2; // L: 58
			return new Coord(this.minPlane, var3, var4); // L: 59
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Luj;B)V",
		garbageValue = "-10"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte(); // L: 64
		this.planes = var1.readUnsignedByte(); // L: 65
		this.regionStartX = var1.readUnsignedShort(); // L: 66
		this.regionStartY = var1.readUnsignedShort(); // L: 67
		this.regionEndX = var1.readUnsignedShort(); // L: 68
		this.regionEndY = var1.readUnsignedShort(); // L: 69
		this.field2452 = var1.readUnsignedShort(); // L: 70
		this.field2460 = var1.readUnsignedShort(); // L: 71
		this.field2457 = var1.readUnsignedShort(); // L: 72
		this.field2459 = var1.readUnsignedShort(); // L: 73
		this.postRead(); // L: 74
	} // L: 75

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-471572167"
	)
	@Export("postRead")
	void postRead() {
	} // L: 77

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Lhs;",
		garbageValue = "-726042655"
	)
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0); // L: 79
		if (var1 != null) { // L: 80
			return var1;
		} else {
			byte[] var2 = ObjectComposition.ObjectDefinition_archive.takeFile(6, var0); // L: 81
			var1 = new ObjectComposition(); // L: 82
			var1.id = var0; // L: 83
			if (var2 != null) { // L: 84
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 85
			if (var1.isSolid) { // L: 86
				var1.interactType = 0; // L: 87
				var1.boolean1 = false; // L: 88
			}

			ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0); // L: 90
			return var1; // L: 91
		}
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1992791084"
	)
	static void method4516(int var0) {
		if (var0 != Client.gameState) { // L: 1301
			if (Client.gameState == 30) { // L: 1302
				Client.field725.method4281(); // L: 1303
			}

			if (Client.gameState == 0) { // L: 1305
				SpriteMask.client.method515();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) { // L: 1306
				class19.method295(0); // L: 1307
				Client.field522 = 0; // L: 1308
				Client.field614 = 0; // L: 1309
				Client.timer.method7931(var0); // L: 1310
				if (var0 != 20) { // L: 1311
					VerticalAlignment.method3754(false);
				}
			}

			if (var0 != 20 && var0 != 40 && class4.field4 != null) { // L: 1313 1314
				class4.field4.close(); // L: 1315
				class4.field4 = null; // L: 1316
			}

			if (Client.gameState == 25) { // L: 1319
				Client.field559 = 0; // L: 1320
				Client.field555 = 0; // L: 1321
				Client.field678 = 1; // L: 1322
				Client.field521 = 0; // L: 1323
				Client.field558 = 1; // L: 1324
			}

			int var1;
			if (var0 != 5 && var0 != 10) { // L: 1326
				if (var0 == 20) { // L: 1330
					var1 = Client.gameState == 11 ? 4 : 0; // L: 1331
					class6.method44(WorldMapDecorationType.field3867, GrandExchangeOfferOwnWorldComparator.field481, false, var1); // L: 1332
				} else if (var0 == 11) { // L: 1334
					class6.method44(WorldMapDecorationType.field3867, GrandExchangeOfferOwnWorldComparator.field481, false, 4); // L: 1335
				} else if (var0 == 50) { // L: 1337
					class139.setLoginResponseString("", "Updating date of birth...", ""); // L: 1338
					class6.method44(WorldMapDecorationType.field3867, GrandExchangeOfferOwnWorldComparator.field481, false, 7); // L: 1339
				} else {
					class14.method189(); // L: 1341
				}
			} else {
				var1 = class4.method21() ? 0 : 12; // L: 1327
				class6.method44(WorldMapDecorationType.field3867, GrandExchangeOfferOwnWorldComparator.field481, true, var1); // L: 1328
			}

			Client.gameState = var0; // L: 1342
		}
	} // L: 1343
}
