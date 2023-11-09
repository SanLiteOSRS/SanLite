import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ah")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("musicSampleIndex")
	AbstractArchive musicSampleIndex;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lqg;"
	)
	@Export("musicSamples")
	NodeHashTable musicSamples;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lqg;"
	)
	@Export("rawSounds")
	NodeHashTable rawSounds;

	@ObfuscatedSignature(
		descriptor = "(Lln;Lln;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		this.musicSamples = new NodeHashTable(256); // L: 9
		this.rawSounds = new NodeHashTable(256); // L: 10
		this.soundEffectIndex = var1; // L: 13
		this.musicSampleIndex = var2; // L: 14
	} // L: 15

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II[IB)Lav;",
		garbageValue = "14"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12); // L: 18
		var4 |= var1 << 16; // L: 19
		long var5 = (long)var4; // L: 20
		RawSound var7 = (RawSound)this.rawSounds.get(var5); // L: 21
		if (var7 != null) { // L: 22
			return var7;
		} else if (var3 != null && var3[0] <= 0) { // L: 23
			return null;
		} else {
			SoundEffect var8 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2); // L: 24
			if (var8 == null) { // L: 25
				return null;
			} else {
				var7 = var8.toRawSound();
				this.rawSounds.put(var7, var5); // L: 27
				if (var3 != null) {
					var3[0] -= var7.samples.length; // L: 28
				}

				return var7; // L: 29
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II[II)Lav;",
		garbageValue = "-1578715416"
	)
	@Export("getMusicSample0")
	RawSound getMusicSample0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12); // L: 33
		var4 |= var1 << 16; // L: 34
		long var5 = (long)var4 ^ 4294967296L; // L: 35
		RawSound var7 = (RawSound)this.rawSounds.get(var5); // L: 36
		if (var7 != null) { // L: 37
			return var7;
		} else if (var3 != null && var3[0] <= 0) { // L: 38
			return null;
		} else {
			VorbisSample var8 = (VorbisSample)this.musicSamples.get(var5); // L: 39
			if (var8 == null) { // L: 40
				var8 = VorbisSample.readMusicSample(this.musicSampleIndex, var1, var2); // L: 41
				if (var8 == null) { // L: 42
					return null;
				}

				this.musicSamples.put(var8, var5); // L: 43
			}

			var7 = var8.toRawSound(var3); // L: 45
			if (var7 == null) { // L: 46
				return null;
			} else {
				var8.remove(); // L: 47
				this.rawSounds.put(var7, var5); // L: 48
				return var7; // L: 49
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I[II)Lav;",
		garbageValue = "-2120561438"
	)
	@Export("getSoundEffect")
	public RawSound getSoundEffect(int var1, int[] var2) {
		if (this.soundEffectIndex.getGroupCount() == 1) { // L: 53
			return this.getSoundEffect0(0, var1, var2);
		} else if (this.soundEffectIndex.getGroupFileCount(var1) == 1) {
			return this.getSoundEffect0(var1, 0, var2); // L: 54
		} else {
			throw new RuntimeException(); // L: 55
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I[II)Lav;",
		garbageValue = "-1244571189"
	)
	@Export("getMusicSample")
	public RawSound getMusicSample(int var1, int[] var2) {
		if (this.musicSampleIndex.getGroupCount() == 1) { // L: 59
			return this.getMusicSample0(0, var1, var2);
		} else if (this.musicSampleIndex.getGroupFileCount(var1) == 1) {
			return this.getMusicSample0(var1, 0, var2); // L: 60
		} else {
			throw new RuntimeException(); // L: 61
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "106"
	)
	public static int method871(int var0) {
		return class288.field3340[var0]; // L: 26
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-22"
	)
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) { // L: 5106
			if (class153.loadInterface(var0)) { // L: 5107
				Widget[] var1 = WorldMapLabel.Widget_interfaceComponents[var0]; // L: 5108

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 5109
					Widget var3 = var1[var2]; // L: 5110
					if (var3.onLoad != null) { // L: 5111
						ScriptEvent var4 = new ScriptEvent(); // L: 5112
						var4.widget = var3; // L: 5113
						var4.args = var3.onLoad; // L: 5114
						ItemLayer.runScript(var4, 5000000, 0); // L: 5115
					}
				}

			}
		}
	} // L: 5118

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(Lge;IIII)V",
		garbageValue = "1281233177"
	)
	static void method868(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && PacketWriter.clientPreferences.method2499() != 0) { // L: 3993
			if (var0.soundEffects != null && var1 < var0.soundEffects.length) { // L: 3994
				class461.method8491(var0.soundEffects[var1], var2, var3); // L: 3995
			}
		}
	} // L: 3996

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	static final void method869() {
		PacketBufferNode var0 = Renderable.getPacketBufferNode(ClientPacket.field3097, Client.packetWriter.isaacCipher); // L: 12883
		Client.packetWriter.addNode(var0); // L: 12884
		Interpreter.field866 = true; // L: 12885

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) { // L: 12886
			if (var1.type == 0 || var1.type == 3) { // L: 12887
				class10.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) { // L: 12889
			LoginScreenAnimation.invalidateWidget(Client.meslayerContinueWidget); // L: 12890
			Client.meslayerContinueWidget = null; // L: 12891
		}

		Interpreter.field866 = false; // L: 12893
	} // L: 12894

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1985115844"
	)
	static final void method861() {
		Client.field694 = Client.cycleCntr; // L: 13121
		VarbitComposition.field2116 = true; // L: 13122
	} // L: 13123
}
