import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fp")
public class class171 {
	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "[Loa;"
	)
	@Export("mapDotSprites")
	static SpritePixels[] mapDotSprites;

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-592340813"
	)
	public static int method3614(int var0, int var1, int var2) {
		var2 &= 3;
		if (var2 == 0) {
			return var1;
		} else if (var2 == 1) {
			return 7 - var0;
		} else {
			return var2 == 2 ? 7 - var1 : var0;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(DDII)[D",
		garbageValue = "-1088637460"
	)
	public static double[] method3616(double var0, double var2, int var4) {
		int var5 = var4 * 2 + 1;
		double[] var6 = new double[var5];
		int var7 = -var4;

		for (int var8 = 0; var7 <= var4; ++var8) {
			var6[var8] = CollisionMap.method3213((double)var7, var0, var2);
			++var7;
		}

		return var6;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIILez;II)V",
		garbageValue = "671627265"
	)
	static void method3612(int var0, int var1, int var2, ObjectComposition var3, int var4) {
		ObjectSound var5 = new ObjectSound();
		var5.plane = var0;
		var5.x = var1 * 128;
		var5.y = var2 * 128;
		int var6 = var3.sizeX;
		int var7 = var3.sizeY;
		if (var4 == 1 || var4 == 3) {
			var6 = var3.sizeY;
			var7 = var3.sizeX;
		}

		var5.field937 = (var6 + var1) * 128;
		var5.field944 = (var7 + var2) * 128;
		var5.soundEffectId = var3.ambientSoundId;
		var5.field939 = var3.field1801 * 128;
		var5.field941 = var3.int5;
		var5.field943 = var3.int6;
		var5.soundEffectIds = var3.soundEffectIds;
		if (var3.transforms != null) {
			var5.obj = var3;
			var5.set();
		}

		ObjectSound.objectSounds.addFirst(var5);
		if (var5.soundEffectIds != null) {
			var5.field945 = var5.field941 + (int)(Math.random() * (double)(var5.field943 - var5.field941));
		}

	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1022341437"
	)
	public static int[] method3615() {
		int[] var0 = new int[KeyHandler.field271];

		for (int var1 = 0; var1 < KeyHandler.field271; ++var1) {
			var0[var1] = KeyHandler.field257[var1];
		}

		return var0;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1497317992"
	)
	public static void method3613() {
		HitSplatDefinition.HitSplatDefinition_cached.clear();
		HitSplatDefinition.HealthBarDefinition_cached.clear();
		HitSplatDefinition.HealthBarDefinition_cachedSprites.clear();
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "81"
	)
	static boolean method3611() {
		return (Client.drawPlayerNames & 4) != 0;
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-68"
	)
	static final void method3610() {
		PacketBuffer var0 = Client.packetWriter.packetBuffer;
		var0.importIndex();
		int var1 = var0.readBits(8);
		int var2;
		if (var1 < Client.npcCount) {
			for (var2 = var1; var2 < Client.npcCount; ++var2) {
				Client.field859[++Client.field783 - 1] = Client.npcIndices[var2];
			}
		}

		if (var1 > Client.npcCount) {
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0;

			for (var2 = 0; var2 < var1; ++var2) {
				int var3 = Client.npcIndices[var2];
				NPC var4 = Client.npcs[var3];
				int var5 = var0.readBits(1);
				if (var5 == 0) {
					Client.npcIndices[++Client.npcCount - 1] = var3;
					var4.npcCycle = Client.cycle;
				} else {
					int var6 = var0.readBits(2);
					if (var6 == 0) {
						Client.npcIndices[++Client.npcCount - 1] = var3;
						var4.npcCycle = Client.cycle;
						Client.field763[++Client.field636 - 1] = var3;
					} else {
						int var7;
						int var8;
						if (var6 == 1) {
							Client.npcIndices[++Client.npcCount - 1] = var3;
							var4.npcCycle = Client.cycle;
							var7 = var0.readBits(3);
							var4.method2343(var7, (byte)1);
							var8 = var0.readBits(1);
							if (var8 == 1) {
								Client.field763[++Client.field636 - 1] = var3;
							}
						} else if (var6 == 2) {
							Client.npcIndices[++Client.npcCount - 1] = var3;
							var4.npcCycle = Client.cycle;
							var7 = var0.readBits(3);
							var4.method2343(var7, (byte)2);
							var8 = var0.readBits(3);
							var4.method2343(var8, (byte)2);
							int var9 = var0.readBits(1);
							if (var9 == 1) {
								Client.field763[++Client.field636 - 1] = var3;
							}
						} else if (var6 == 3) {
							Client.field859[++Client.field783 - 1] = var3;
						}
					}
				}
			}

		}
	}
}
