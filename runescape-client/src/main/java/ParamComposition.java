import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ho")
@Implements("ParamComposition")
public class ParamComposition extends DualNode {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("ParamDefinition_archive")
	static AbstractArchive ParamDefinition_archive;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("ParamComposition_cached")
	static EvictingDualNodeHashTable ParamComposition_cached;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ltq;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;
	@ObfuscatedName("aw")
	@Export("type")
	char type;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -171401431
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("au")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("ab")
	@Export("autoDisable")
	boolean autoDisable;

	static {
		ParamComposition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	ParamComposition() {
		this.autoDisable = true; // L: 16
	} // L: 18

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1924870301"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 35

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lsg;B)V",
		garbageValue = "-102"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 39
			if (var2 == 0) { // L: 40
				return; // L: 43
			}

			this.decodeNext(var1, var2); // L: 41
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lsg;II)V",
		garbageValue = "1800051666"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 46
			byte var4 = var1.readByte(); // L: 48
			int var5 = var4 & 255; // L: 50
			if (var5 == 0) { // L: 51
				throw new IllegalArgumentException("" + Integer.toString(var5, 16));
			}

			if (var5 >= 128 && var5 < 160) { // L: 52
				char var6 = class369.cp1252AsciiExtension[var5 - 128]; // L: 53
				if (var6 == 0) { // L: 54
					var6 = '?';
				}

				var5 = var6; // L: 55
			}

			char var3 = (char)var5; // L: 57
			this.type = var3; // L: 59
		} else if (var2 == 2) { // L: 61
			this.defaultInt = var1.readInt();
		} else if (var2 == 4) { // L: 62
			this.autoDisable = false;
		} else if (var2 == 5) { // L: 63
			this.defaultStr = var1.readStringCp1252NullTerminated();
		}

	} // L: 65

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1346057295"
	)
	@Export("isString")
	public boolean isString() {
		return this.type == 's'; // L: 68
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lnm;Lnm;Lnm;Lln;I)Z",
		garbageValue = "-1821221274"
	)
	public static boolean method3900(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, MidiPcmStream var3) {
		class297.musicPatchesArchive = var0; // L: 26
		class297.musicSamplesArchive = var1; // L: 27
		class297.soundEffectsArchive = var2; // L: 28
		class475.midiPcmStream = var3; // L: 29
		return true; // L: 30
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lek;FFFFFFFFI)V",
		garbageValue = "-2028355721"
	)
	static void method3916(class125 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
		if (var0 != null) { // L: 258
			float var9 = var4 - var1; // L: 261
			if (0.0D != (double)var9) { // L: 262
				float var10 = var2 - var1; // L: 265
				float var11 = var3 - var1; // L: 266
				float[] var12 = new float[]{var10 / var9, var11 / var9}; // L: 267 268 269
				var0.field1509 = var12[0] == 0.33333334F && 0.6666667F == var12[1]; // L: 270
				float var13 = var12[0]; // L: 271
				float var14 = var12[1]; // L: 272
				if ((double)var12[0] < 0.0D) { // L: 273
					var12[0] = 0.0F;
				}

				if ((double)var12[1] > 1.0D) { // L: 274
					var12[1] = 1.0F;
				}

				float var15;
				if ((double)var12[0] > 1.0D || var12[1] < -1.0F) { // L: 275
					var12[1] = 1.0F - var12[1]; // L: 277
					if (var12[0] < 0.0F) { // L: 278
						var12[0] = 0.0F;
					}

					if (var12[1] < 0.0F) { // L: 279
						var12[1] = 0.0F;
					}

					if (var12[0] > 1.0F || var12[1] > 1.0F) { // L: 280
						var15 = (float)(1.0D + (double)var12[1] * ((double)var12[1] - 2.0D) + (double)((var12[0] - 2.0F + var12[1]) * var12[0])); // L: 281
						if (class121.field1462 + var15 > 0.0F) { // L: 282
							UrlRequester.method2839(var12); // L: 283
						}
					}

					var12[1] = 1.0F - var12[1]; // L: 286
				}

				if (var13 != var12[0]) { // L: 289
					float var10000 = var1 + var9 * var12[0]; // L: 290
					if ((double)var13 != 0.0D) { // L: 291
						var6 = var5 + var12[0] * (var6 - var5) / var13; // L: 292
					}
				}

				if (var12[1] != var14) { // L: 295
					var3 = var9 * var12[1] + var1; // L: 296
					if ((double)var14 != 1.0D) { // L: 297
						var7 = (float)((double)var8 - (double)(var8 - var7) * (1.0D - (double)var12[1]) / (1.0D - (double)var14)); // L: 298
					}
				}

				var0.field1513 = var1; // L: 301
				var0.field1521 = var4; // L: 302
				class151.method3365(0.0F, var12[0], var12[1], 1.0F, var0); // L: 303
				var15 = var6 - var5; // L: 305
				float var16 = var7 - var6; // L: 306
				float var17 = var8 - var7; // L: 307
				float var18 = var16 - var15; // L: 308
				var0.field1522 = var17 - var16 - var18; // L: 309
				var0.field1517 = var18 + var18 + var18; // L: 310
				var0.field1520 = var15 + var15 + var15; // L: 311
				var0.field1519 = var5; // L: 312
			}
		}
	} // L: 259 263 314
}
