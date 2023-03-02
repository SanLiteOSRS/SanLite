import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bd")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1507744253
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1231672185
	)
	@Export("x")
	int x;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 384654351
	)
	int field845;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 279135104
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 445471917
	)
	@Export("y")
	int y;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1742067623
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 2111223021
	)
	int field837;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -139276523
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lab;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -387748741
	)
	int field841;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lgp;"
	)
	@Export("obj")
	ObjectComposition obj;
	@ObfuscatedName("b")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1523032859
	)
	int field843;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lab;"
	)
	@Export("stream2")
	RawPcmStream stream2;

	static {
		objectSounds = new NodeDeque(); // L: 11
	}

	ObjectSound() {
	} // L: 27

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1406631425"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId; // L: 44
		ObjectComposition var2 = this.obj.transform(); // L: 45
		if (var2 != null) { // L: 46
			this.soundEffectId = var2.ambientSoundId; // L: 47
			this.field837 = var2.int7 * 128; // L: 48
			this.field845 = var2.int5; // L: 49
			this.field841 = var2.int6; // L: 50
			this.soundEffectIds = var2.soundEffectIds; // L: 51
		} else {
			this.soundEffectId = -1;
			this.field837 = 0; // L: 55
			this.field845 = 0;
			this.field841 = 0;
			this.soundEffectIds = null;
		}

		if (var1 != this.soundEffectId && this.stream1 != null) {
			class209.pcmStreamMixer.removeSubStream(this.stream1);
			this.stream1 = null;
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "1"
	)
	static String method1919(int var0) {
		return "<img=" + var0 + ">"; // L: 18
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lkz;I[B[BB)V",
		garbageValue = "8"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3632 == null) { // L: 1172
			if (var2 == null) { // L: 1173
				return; // L: 1179
			}

			var0.field3632 = new byte[11][]; // L: 1174
			var0.field3633 = new byte[11][]; // L: 1175
			var0.field3634 = new int[11]; // L: 1176
			var0.field3635 = new int[11]; // L: 1177
		}

		var0.field3632[var1] = var2; // L: 1181
		if (var2 != null) {
			var0.field3631 = true; // L: 1182
		} else {
			var0.field3631 = false; // L: 1184

			for (int var4 = 0; var4 < var0.field3632.length; ++var4) { // L: 1185
				if (var0.field3632[var4] != null) { // L: 1186
					var0.field3631 = true; // L: 1187
					break;
				}
			}
		}

		var0.field3633[var1] = var3; // L: 1192
	} // L: 1193

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1223653382"
	)
	public static void method1920() {
		SequenceDefinition.SequenceDefinition_cached.clear(); // L: 490
		SequenceDefinition.SequenceDefinition_cachedFrames.clear(); // L: 491
		SequenceDefinition.SequenceDefinition_cachedModel.clear(); // L: 492
	} // L: 493

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lfg;III)Lak;",
		garbageValue = "-613295096"
	)
	public static final PcmPlayer method1911(TaskHandler var0, int var1, int var2) {
		if (class284.field3321 == 0) { // L: 52
			throw new IllegalStateException();
		} else if (var1 >= 0 && var1 < 2) { // L: 53
			if (var2 < 256) { // L: 54
				var2 = 256;
			}

			try {
				PcmPlayer var3 = class157.pcmPlayerProvider.player(); // L: 56
				var3.samples = new int[256 * (PcmPlayer.PcmPlayer_stereo ? 2 : 1)]; // L: 57
				var3.field313 = var2; // L: 58
				var3.init(); // L: 59
				var3.capacity = (var2 & -1024) + 1024; // L: 60
				if (var3.capacity > 16384) { // L: 61
					var3.capacity = 16384;
				}

				var3.open(var3.capacity); // L: 62
				if (WorldMapCacheName.field3010 > 0 && class266.soundSystem == null) { // L: 63
					class266.soundSystem = new SoundSystem(); // L: 64
					PcmPlayer.soundSystemExecutor = Executors.newScheduledThreadPool(1); // L: 65
					PcmPlayer.soundSystemExecutor.scheduleAtFixedRate(class266.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS); // L: 66
				}

				if (class266.soundSystem != null) { // L: 68
					if (class266.soundSystem.players[var1] != null) { // L: 69
						throw new IllegalArgumentException();
					}

					class266.soundSystem.players[var1] = var3; // L: 70
				}

				return var3; // L: 72
			} catch (Throwable var4) { // L: 74
				return new PcmPlayer(); // L: 75
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
