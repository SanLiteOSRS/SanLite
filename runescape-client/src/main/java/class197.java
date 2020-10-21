import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("gp")
public class class197 {
	@ObfuscatedName("z")
	static int[] field2380;

	static {
		new Object();
		field2380 = new int[33];
		field2380[0] = 0;
		int var0 = 2;

		for (int var1 = 1; var1 < 33; ++var1) {
			field2380[var1] = var0 - 1;
			var0 += var0;
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(IIIIB)V",
		garbageValue = "1"
	)
	static void method3743(int var0, int var1, int var2, int var3) {
		for (ObjectSound var4 = (ObjectSound)ObjectSound.objectSounds.last(); var4 != null; var4 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var4.soundEffectId != -1 || var4.soundEffectIds != null) {
				int var5 = 0;
				if (var1 > var4.field1106 * 16384) {
					var5 += var1 - var4.field1106 * 16384;
				} else if (var1 < var4.x * 128) {
					var5 += var4.x * 128 - var1;
				}

				if (var2 > var4.field1117 * 128) {
					var5 += var2 - var4.field1117 * 128;
				} else if (var2 < var4.y * 128) {
					var5 += var4.y * 128 - var2;
				}

				if (var5 - 64 <= var4.field1108 && Client.areaSoundEffectVolume != 0 && var0 == var4.plane) {
					var5 -= 64;
					if (var5 < 0) {
						var5 = 0;
					}

					int var6 = (var4.field1108 - var5) * Client.areaSoundEffectVolume / var4.field1108;
					if (var4.stream1 == null) {
						if (var4.soundEffectId >= 0) {
							SoundEffect var7 = SoundEffect.readSoundEffect(GrandExchangeOfferUnitPriceComparator.archive4, var4.soundEffectId, 0);
							if (var7 != null) {
								RawSound var8 = var7.toRawSound().resample(class9.decimator);
								RawPcmStream var9 = RawPcmStream.createRawPcmStream(var8, 100, var6);
								var9.setNumLoops(-1);
								Players.pcmStreamMixer.addSubStream(var9);
								var4.stream1 = var9;
							}
						}
					} else {
						var4.stream1.method2641(var6);
					}

					if (var4.stream2 == null) {
						if (var4.soundEffectIds != null && (var4.field1118 -= var3) <= 0) {
							int var11 = (int)(Math.random() * (double)var4.soundEffectIds.length);
							SoundEffect var12 = SoundEffect.readSoundEffect(GrandExchangeOfferUnitPriceComparator.archive4, var4.soundEffectIds[var11], 0);
							if (var12 != null) {
								RawSound var13 = var12.toRawSound().resample(class9.decimator);
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var13, 100, var6);
								var10.setNumLoops(0);
								Players.pcmStreamMixer.addSubStream(var10);
								var4.stream2 = var10;
								var4.field1118 = var4.field1109 + (int)(Math.random() * (double)(var4.field1115 - var4.field1109));
							}
						}
					} else {
						var4.stream2.method2641(var6);
						if (!var4.stream2.hasNext()) {
							var4.stream2 = null;
						}
					}
				} else {
					if (var4.stream1 != null) {
						Players.pcmStreamMixer.removeSubStream(var4.stream1);
						var4.stream1 = null;
					}

					if (var4.stream2 != null) {
						Players.pcmStreamMixer.removeSubStream(var4.stream2);
						var4.stream2 = null;
					}
				}
			}
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)Ljava/lang/Class;",
		garbageValue = "432871093"
	)
	@Export("loadClassFromDescriptor")
	static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) {
			return Byte.TYPE;
		} else if (var0.equals("I")) {
			return Integer.TYPE;
		} else if (var0.equals("S")) {
			return Short.TYPE;
		} else if (var0.equals("J")) {
			return Long.TYPE;
		} else if (var0.equals("Z")) {
			return Boolean.TYPE;
		} else if (var0.equals("F")) {
			return Float.TYPE;
		} else if (var0.equals("D")) {
			return Double.TYPE;
		} else if (var0.equals("C")) {
			return Character.TYPE;
		} else {
			return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0);
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(Lic;IB)Z",
		garbageValue = "1"
	)
	public static boolean method3742(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1);
		if (var2 == null) {
			return false;
		} else {
			Occluder.SpriteBuffer_decode(var2);
			return true;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		signature = "(II)I",
		garbageValue = "-822542722"
	)
	static int method3741(int var0) {
		return (int)Math.pow(2.0D, (double)((float)var0 / 256.0F + 7.0F));
	}
}
