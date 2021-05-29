import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("be")
@Implements("Decimator")
public class Decimator {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "[Lop;"
	)
	@Export("title_muteSprite")
	static IndexedSprite[] title_muteSprite;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	static IndexedSprite field553;
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("archive9")
	static Archive archive9;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("archive13")
	static Archive archive13;
	@ObfuscatedName("mm")
	@ObfuscatedGetter(
		intValue = 1430642749
	)
	@Export("selectedSpellWidget")
	static int selectedSpellWidget;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1278002573
	)
	@Export("inputRate")
	int inputRate;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -308385855
	)
	@Export("outputRate")
	int outputRate;
	@ObfuscatedName("j")
	@Export("table")
	int[][] table;

	public Decimator(int var1, int var2) {
		if (var2 != var1) {
			int var3 = class386.method6818(var1, var2);
			var1 /= var3;
			var2 /= var3;
			this.inputRate = var1;
			this.outputRate = var2;
			this.table = new int[var1][14];

			for (int var4 = 0; var4 < var1; ++var4) {
				int[] var5 = this.table[var4];
				double var6 = (double)var4 / (double)var1 + 6.0D;
				int var8 = (int)Math.floor(1.0D + (var6 - 7.0D));
				if (var8 < 0) {
					var8 = 0;
				}

				int var9 = (int)Math.ceil(var6 + 7.0D);
				if (var9 > 14) {
					var9 = 14;
				}

				for (double var10 = (double)var2 / (double)var1; var8 < var9; ++var8) {
					double var12 = ((double)var8 - var6) * 3.141592653589793D;
					double var14 = var10;
					if (var12 < -1.0E-4D || var12 > 1.0E-4D) {
						var14 = var10 * (Math.sin(var12) / var12);
					}

					var14 *= 0.54D + 0.46D * Math.cos(0.2243994752564138D * ((double)var8 - var6));
					var5[var8] = (int)Math.floor(var14 * 65536.0D + 0.5D);
				}
			}

		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "25186157"
	)
	@Export("resample")
	byte[] resample(byte[] var1) {
		if (this.table != null) {
			int var2 = (int)((long)var1.length * (long)this.outputRate / (long)this.inputRate) + 14;
			int[] var3 = new int[var2];
			int var4 = 0;
			int var5 = 0;

			int var6;
			for (var6 = 0; var6 < var1.length; ++var6) {
				byte var7 = var1[var6];
				int[] var8 = this.table[var5];

				int var9;
				for (var9 = 0; var9 < 14; ++var9) {
					var3[var9 + var4] += var7 * var8[var9];
				}

				var5 += this.outputRate;
				var9 = var5 / this.inputRate;
				var4 += var9;
				var5 -= var9 * this.inputRate;
			}

			var1 = new byte[var2];

			for (var6 = 0; var6 < var2; ++var6) {
				int var10 = var3[var6] + 32768 >> 16;
				if (var10 < -128) {
					var1[var6] = -128;
				} else if (var10 > 127) {
					var1[var6] = 127;
				} else {
					var1[var6] = (byte)var10;
				}
			}
		}

		return var1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-202023878"
	)
	@Export("scaleRate")
	int scaleRate(int var1) {
		if (this.table != null) {
			var1 = (int)((long)this.outputRate * (long)var1 / (long)this.inputRate);
		}

		return var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1042913417"
	)
	@Export("scalePosition")
	int scalePosition(int var1) {
		if (this.table != null) {
			var1 = (int)((long)var1 * (long)this.outputRate / (long)this.inputRate) + 6;
		}

		return var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljv;II)Z",
		garbageValue = "-1461937174"
	)
	static boolean method1075(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1);
		if (var2 == null) {
			return false;
		} else {
			ItemLayer.SpriteBuffer_decode(var2);
			return true;
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1064690457"
	)
	public static void method1073() {
		ItemComposition.ItemDefinition_cachedSprites.clear();
	}

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "(Lfl;IIII)V",
		garbageValue = "-1353639896"
	)
	static void method1074(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && ObjectComposition.clientPreferences.areaSoundEffectsVolume != 0) {
			if (var0.soundEffects != null && var1 < var0.soundEffects.length) {
				int var4 = var0.soundEffects[var1];
				if (var4 != 0) {
					int var5 = var4 >> 8;
					int var6 = var4 >> 4 & 7;
					int var7 = var4 & 15;
					Client.soundEffectIds[Client.soundEffectCount] = var5;
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var6;
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0;
					Client.soundEffects[Client.soundEffectCount] = null;
					int var8 = (var2 - 64) / 128;
					int var9 = (var3 - 64) / 128;
					Client.soundLocations[Client.soundEffectCount] = var7 + (var9 << 8) + (var8 << 16);
					++Client.soundEffectCount;
				}
			}
		}
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "5"
	)
	static void method1068() {
		if (Client.renderSelf) {
			NetSocket.addPlayerToScene(class93.localPlayer, false);
		}

	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2146015753"
	)
	static final void method1071() {
		Client.field836 = Client.cycleCntr;
	}
}
