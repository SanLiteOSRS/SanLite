import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("je")
public class class250 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lje;"
	)
	static final class250 field2605;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lje;"
	)
	static final class250 field2602;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Luz;"
	)
	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1022094585
	)
	@Export("value")
	final int value;

	static {
		field2605 = new class250(0); // L: 4
		field2602 = new class250(1); // L: 5
	}

	class250(int var1) {
		this.value = var1; // L: 9
	} // L: 10

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([BIILkf;[Liw;B)V",
		garbageValue = "-28"
	)
	static final void method4934(byte[] var0, int var1, int var2, Scene var3, CollisionMap[] var4) {
		Buffer var5 = new Buffer(var0); // L: 254
		int var6 = -1; // L: 255

		while (true) {
			int var7 = var5.method9278(); // L: 257
			if (var7 == 0) { // L: 258
				return; // L: 282
			}

			var6 += var7; // L: 259
			int var8 = 0; // L: 260

			while (true) {
				int var9 = var5.readUShortSmart(); // L: 262
				if (var9 == 0) { // L: 263
					break;
				}

				var8 += var9 - 1; // L: 264
				int var10 = var8 & 63; // L: 265
				int var11 = var8 >> 6 & 63; // L: 266
				int var12 = var8 >> 12; // L: 267
				int var13 = var5.readUnsignedByte(); // L: 268
				int var14 = var13 >> 2; // L: 269
				int var15 = var13 & 3; // L: 270
				int var16 = var11 + var1; // L: 271
				int var17 = var10 + var2; // L: 272
				if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) { // L: 273
					int var18 = var12; // L: 274
					if ((Tiles.Tiles_renderFlags[1][var16][var17] & 2) == 2) { // L: 275
						var18 = var12 - 1;
					}

					CollisionMap var19 = null; // L: 276
					if (var18 >= 0) { // L: 277
						var19 = var4[var18];
					}

					Interpreter.addObjects(var12, var16, var17, var6, var15, var14, var3, var19); // L: 278
				}
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "205742925"
	)
	static String method4935() {
		StringBuilder var0 = new StringBuilder(); // L: 80

		Message var2;
		for (Iterator var1 = Messages.Messages_hashTable.iterator(); var1.hasNext(); var0.append(var2.text).append('\n')) { // L: 81 87
			var2 = (Message)var1.next(); // L: 82
			if (var2.sender != null && !var2.sender.isEmpty()) { // L: 84
				var0.append(var2.sender).append(':'); // L: 85
			}
		}

		return var0.toString(); // L: 90
	}
}
