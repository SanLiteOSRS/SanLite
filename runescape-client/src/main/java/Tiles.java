import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bu")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("z")
	@Export("Tiles_heights")
	static int[][][] Tiles_heights;
	@ObfuscatedName("k")
	@Export("Tiles_renderFlags")
	static byte[][][] Tiles_renderFlags;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 210424451
	)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("t")
	static byte[][][] field528;
	@ObfuscatedName("i")
	static byte[][][] field521;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1682339213
	)
	@Export("musicTrackVolume")
	public static int musicTrackVolume;
	@ObfuscatedName("m")
	@Export("Tiles_hue")
	static int[] Tiles_hue;
	@ObfuscatedName("n")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;
	@ObfuscatedName("v")
	static final int[] field524;
	@ObfuscatedName("j")
	static final int[] field525;
	@ObfuscatedName("r")
	static final int[] field517;
	@ObfuscatedName("u")
	static final int[] field527;
	@ObfuscatedName("p")
	static final int[] field534;
	@ObfuscatedName("b")
	static final int[] field529;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1084049787
	)
	static int field535;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 96867879
	)
	static int field520;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		signature = "Lis;"
	)
	static StudioGame field532;

	static {
		Tiles_heights = new int[4][105][105];
		Tiles_renderFlags = new byte[4][104][104];
		Tiles_minPlane = 99;
		field524 = new int[]{1, 2, 4, 8};
		field525 = new int[]{16, 32, 64, 128};
		field517 = new int[]{1, 0, -1, 0};
		field527 = new int[]{0, -1, 0, 1};
		field534 = new int[]{1, -1, -1, 1};
		field529 = new int[]{-1, -1, 1, 1};
		field535 = (int)(Math.random() * 17.0D) - 8;
		field520 = (int)(Math.random() * 33.0D) - 16;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(II)Lih;",
		garbageValue = "1036194944"
	)
	@Export("SpotAnimationDefinition_get")
	public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0) {
		SpotAnimationDefinition var1 = (SpotAnimationDefinition)SpotAnimationDefinition.SpotAnimationDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = SpotAnimationDefinition.SpotAnimationDefinition_archive.takeFile(13, var0);
			var1 = new SpotAnimationDefinition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("z")
	static boolean method1191(long var0) {
		int var2 = (int)(var0 >>> 14 & 3L);
		return var2 == 2;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(Lky;S)I",
		garbageValue = "5748"
	)
	static int method1186(PacketBuffer var0) {
		int var1 = var0.readBits(2);
		int var2;
		if (var1 == 0) {
			var2 = 0;
		} else if (var1 == 1) {
			var2 = var0.readBits(5);
		} else if (var1 == 2) {
			var2 = var0.readBits(8);
		} else {
			var2 = var0.readBits(11);
		}

		return var2;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(CI)Z",
		garbageValue = "-877871317"
	)
	public static boolean method1187(char var0) {
		if (var0 >= ' ' && var0 < 127 || var0 > 127 && var0 < 160 || var0 > 160 && var0 <= 255) {
			return true;
		} else {
			if (var0 != 0) {
				char[] var1 = class297.cp1252AsciiExtension;

				for (int var2 = 0; var2 < var1.length; ++var2) {
					char var3 = var1[var2];
					if (var0 == var3) {
						return true;
					}
				}
			}

			return false;
		}
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1367737542"
	)
	static void method1177() {
		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) {
			VarpDefinition.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false);
		}

	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;Ljava/lang/String;IIIIZB)V",
		garbageValue = "-1"
	)
	@Export("insertMenuItem")
	static final void insertMenuItem(String var0, String var1, int var2, int var3, int var4, int var5, boolean var6) {
		if (!Client.isMenuOpen) {
			if (Client.menuOptionsCount < 500) {
				Client.menuActions[Client.menuOptionsCount] = var0;
				Client.menuTargets[Client.menuOptionsCount] = var1;
				Client.menuOpcodes[Client.menuOptionsCount] = var2;
				Client.menuIdentifiers[Client.menuOptionsCount] = var3;
				Client.menuArguments1[Client.menuOptionsCount] = var4;
				Client.menuArguments2[Client.menuOptionsCount] = var5;
				Client.menuShiftClick[Client.menuOptionsCount] = var6;
				++Client.menuOptionsCount;
			}

		}
	}
}
