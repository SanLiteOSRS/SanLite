import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cv")
public class class68 {
	@ObfuscatedName("au")
	static final BigInteger field874;
	@ObfuscatedName("ab")
	static final BigInteger field871;

	static {
		field874 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049"); // L: 20
		field871 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683"); // L: 21
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lnm;III)[Ltc;",
		garbageValue = "-973800610"
	)
	public static IndexedSprite[] method2030(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2); // L: 25
		boolean var3;
		if (var4 == null) { // L: 26
			var3 = false; // L: 27
		} else {
			class485.SpriteBuffer_decode(var4); // L: 30
			var3 = true; // L: 31
		}

		if (!var3) { // L: 33
			return null;
		} else {
			IndexedSprite[] var5 = new IndexedSprite[class503.SpriteBuffer_spriteCount]; // L: 36

			for (int var6 = 0; var6 < class503.SpriteBuffer_spriteCount; ++var6) { // L: 37
				IndexedSprite var7 = var5[var6] = new IndexedSprite(); // L: 38
				var7.width = class503.SpriteBuffer_spriteWidth; // L: 39
				var7.height = class503.SpriteBuffer_spriteHeight; // L: 40
				var7.xOffset = class503.SpriteBuffer_xOffsets[var6]; // L: 41
				var7.yOffset = class17.SpriteBuffer_yOffsets[var6]; // L: 42
				var7.subWidth = class97.SpriteBuffer_spriteWidths[var6]; // L: 43
				var7.subHeight = class138.SpriteBuffer_spriteHeights[var6]; // L: 44
				var7.palette = class394.SpriteBuffer_spritePalette; // L: 45
				var7.pixels = VarbitComposition.SpriteBuffer_pixels[var6]; // L: 46
			}

			class398.method7709(); // L: 48
			return var5; // L: 51
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lmq;IIII)V",
		garbageValue = "-635612095"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field3627 == null) { // L: 1221
			throw new RuntimeException(); // L: 1222
		} else {
			var0.field3627[var1] = var2; // L: 1224
			var0.field3670[var1] = var3; // L: 1225
		}
	} // L: 1226

	@ObfuscatedName("nf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZS)V",
		garbageValue = "255"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase(); // L: 12106
		short[] var2 = new short[16]; // L: 12107
		int var3 = 0; // L: 12108

		for (int var4 = 0; var4 < MouseRecorder.ItemComposition_fileCount; ++var4) { // L: 12109
			ItemComposition var9 = HealthBarUpdate.ItemComposition_get(var4); // L: 12110
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) { // L: 12111 12112 12113
				if (var3 >= 250) { // L: 12114
					class264.foundItemIdCount = -1; // L: 12115
					class399.foundItemIds = null; // L: 12116
					return; // L: 12117
				}

				if (var3 >= var2.length) { // L: 12119
					short[] var6 = new short[var2.length * 2]; // L: 12120

					for (int var7 = 0; var7 < var3; ++var7) { // L: 12121
						var6[var7] = var2[var7];
					}

					var2 = var6; // L: 12122
				}

				var2[var3++] = (short)var4; // L: 12124
			}
		}

		class399.foundItemIds = var2; // L: 12126
		FontName.foundItemIndex = 0; // L: 12127
		class264.foundItemIdCount = var3; // L: 12128
		String[] var8 = new String[class264.foundItemIdCount]; // L: 12129

		for (int var5 = 0; var5 < class264.foundItemIdCount; ++var5) { // L: 12130
			var8[var5] = HealthBarUpdate.ItemComposition_get(var2[var5]).name;
		}

		GrandExchangeOffer.method6878(var8, class399.foundItemIds); // L: 12131
	} // L: 12132
}
