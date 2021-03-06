import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("d")
final class class2 implements class0 {
	@ObfuscatedName("q")
	@Export("SpriteBuffer_pixels")
	public static byte[][] SpriteBuffer_pixels;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "Ldk;"
	)
	@Export("pcmPlayerProvider")
	public static class108 pcmPlayerProvider;
	@ObfuscatedName("k")
	static int[][][] field12;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		signature = "Lly;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;
	@ObfuscatedName("gn")
	@Export("regionLandArchives")
	static byte[][] regionLandArchives;

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		garbageValue = "-41",
		signature = "(Ljava/lang/Object;Lkx;B)V"
	)
	public void vmethod48(Object var1, Buffer var2) {
		this.method20((Long)var1, var2);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "1678106953",
		signature = "(Lkx;I)Ljava/lang/Object;"
	)
	public Object vmethod45(Buffer var1) {
		return var1.readLong();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "444192974",
		signature = "(Ljava/lang/Long;Lkx;I)V"
	)
	void method20(Long var1, Buffer var2) {
		var2.writeLong(var1);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		garbageValue = "-27165",
		signature = "(ILcl;ZS)I"
	)
	static int method25(int var0, Script var1, boolean var2) {
		if (var0 != 3700 && var0 != 3701) {
			if (var0 == 3702) {
				++Interpreter.Interpreter_intStackSize;
				return 1;
			} else {
				return 2;
			}
		} else {
			--Interpreter.Interpreter_intStackSize;
			--Interpreter.Interpreter_stringStackSize;
			return 1;
		}
	}

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		garbageValue = "1857096968",
		signature = "(I)V"
	)
	static void method27() {
		if (SoundSystem.worldMap != null) {
			SoundSystem.worldMap.method6530(class90.Client_plane, GrandExchangeOfferNameComparator.baseX * 64 + (UserComparator9.localPlayer.x >> 7), NetCache.baseY * 64 + (UserComparator9.localPlayer.y >> 7), false);
			SoundSystem.worldMap.loadCache();
		}

	}
}
