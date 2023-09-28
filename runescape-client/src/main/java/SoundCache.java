import java.util.concurrent.ThreadPoolExecutor;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bl")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("ab")
	public static ThreadPoolExecutor field333;
	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	@Export("fontBold12")
	static Font fontBold12;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	AbstractArchive field327;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	NodeHashTable field328;

	@ObfuscatedSignature(
		descriptor = "(Lom;Lom;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		new NodeHashTable(256); // L: 11
		this.field328 = new NodeHashTable(256); // L: 14
		this.soundEffectIndex = var1; // L: 17
		this.field327 = var2; // L: 18
	} // L: 19

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II[II)Lbs;",
		garbageValue = "804068595"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		long var4 = this.method862(var1, var2, false); // L: 22
		class53 var6 = (class53)this.field328.get(var4); // L: 23
		if (var6 != null) { // L: 24
			return var6.method1078();
		} else if (var3 != null && var3[0] <= 0) { // L: 25
			return null;
		} else {
			SoundEffect var7 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2); // L: 26
			if (var7 == null) { // L: 27
				return null;
			} else {
				RawSound var8 = var7.toRawSound(); // L: 28
				this.field328.put(new class53(var8), var4); // L: 29
				if (var3 != null) {
					var3[0] -= var8.samples.length;
				}

				return var8;
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)Lcu;",
		garbageValue = "941566921"
	)
	class53 method849(int var1, int var2) {
		long var3 = this.method862(var1, var2, true);
		class53 var5 = (class53)this.field328.get(var3);
		if (var5 != null) {
			return var5; // L: 38
		} else {
			VorbisSample var6 = VorbisSample.readMusicSample(this.field327, var1, var2);
			if (var6 == null) {
				return new class53(); // L: 42
			} else {
				class53 var7 = new class53(var6); // L: 44
				this.field328.put(var7, var3); // L: 45
				return var7; // L: 46
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I[IB)Lbs;",
		garbageValue = "-23"
	)
	@Export("getSoundEffect")
	RawSound getSoundEffect(int var1, int[] var2) {
		if (this.soundEffectIndex.getGroupCount() == 1) { // L: 50
			return this.getSoundEffect0(0, var1, var2);
		} else if (this.soundEffectIndex.getGroupFileCount(var1) == 1) {
			return this.getSoundEffect0(var1, 0, var2); // L: 51
		} else {
			throw new RuntimeException(); // L: 52
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)Lcu;",
		garbageValue = "0"
	)
	public class53 method851(int var1) {
		if (this.field327.getGroupCount() == 1) { // L: 56
			return this.method849(0, var1); // L: 57
		} else if (this.field327.getGroupFileCount(var1) == 1) { // L: 59
			return this.method849(var1, 0); // L: 60
		} else {
			throw new RuntimeException(); // L: 63
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IS)Lbs;",
		garbageValue = "11636"
	)
	public RawSound method852(int var1) {
		return this.getSoundEffect(var1, (int[])null); // L: 68
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIZI)J",
		garbageValue = "1435261523"
	)
	long method862(int var1, int var2, boolean var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >> 12); // L: 72
		var4 |= var1 << 16; // L: 73
		return var3 ? (long)var4 ^ 4294967296L : (long)var4; // L: 74 75 78
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "74"
	)
	static void method866() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 30
			if (var0.stream1 != null) { // L: 31
				class140.pcmStreamMixer.removeSubStream(var0.stream1); // L: 32
				var0.stream1 = null; // L: 33
			}

			if (var0.stream2 != null) {
				class140.pcmStreamMixer.removeSubStream(var0.stream2);
				var0.stream2 = null; // L: 37
			}
		}

		ObjectSound.objectSounds.clear(); // L: 40
	} // L: 41

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)Lcr;",
		garbageValue = "1668135160"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 35
		return var2.getMessage(var1); // L: 36
	}

	@ObfuscatedName("og")
	@ObfuscatedSignature(
		descriptor = "(IB)Luq;",
		garbageValue = "-5"
	)
	static class521 method865(int var0) {
		class521 var1 = (class521)Client.Widget_cachedModels.get((long)var0); // L: 12885
		if (var1 == null) { // L: 12886
			var1 = new class521(class313.field3396, AbstractArchive.method6972(var0), VarbitComposition.method3896(var0)); // L: 12887
			Client.Widget_cachedModels.put(var1, (long)var0); // L: 12888
		}

		return var1; // L: 12890
	}
}
