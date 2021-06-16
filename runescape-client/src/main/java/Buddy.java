import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ly")
@Implements("Buddy")
public class Buddy extends Nameable {
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = -1354630149
	)
	@Export("selectedItemId")
	static int selectedItemId;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1822382333
	)
	@Export("world")
	public int world;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -286288271
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -2998287
	)
	@Export("rank")
	public int rank;

	Buddy() {
		this.world = -1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1543137847"
	)
	@Export("set")
	void set(int var1, int var2) {
		this.world = var1;
		this.int2 = var2;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "27"
	)
	@Export("getWorld")
	public int getWorld() {
		return this.world;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1186976863"
	)
	@Export("hasWorld")
	public boolean hasWorld() {
		return this.world > 0;
	}

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "(Lfm;IIIB)V",
		garbageValue = "-89"
	)
	static void method5896(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && class4.clientPreferences.areaSoundEffectsVolume != 0) {
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

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-589209298"
	)
	static final void method5892() {
		Client.field629 = 0;
		int var0 = class15.baseX * 64 + (class262.localPlayer.x >> 7);
		int var1 = WorldMapSprite.baseY * 64 + (class262.localPlayer.y >> 7);
		if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
			Client.field629 = 1;
		}

		if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
			Client.field629 = 1;
		}

		if (Client.field629 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
			Client.field629 = 0;
		}

	}
}
