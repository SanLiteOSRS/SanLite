import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qs")
@Implements("IgnoreList")
public class IgnoreList extends NameableContainer {
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 131186403
	)
	static int field4663;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ltt;"
	)
	final LoginType field4661;

	@ObfuscatedSignature(
		descriptor = "(Ltt;)V"
	)
	public IgnoreList(LoginType var1) {
		super(400); // L: 16
		this.field4661 = var1; // L: 17
	} // L: 18

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Lrf;",
		garbageValue = "794695059"
	)
	@Export("newInstance")
	Nameable newInstance() {
		return new Ignored(); // L: 22
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)[Lrf;",
		garbageValue = "-190310061"
	)
	@Export("newTypedArray")
	Nameable[] newTypedArray(int var1) {
		return new Ignored[var1]; // L: 27
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Luj;IB)V",
		garbageValue = "-24"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		while (var1.offset < var2) { // L: 31
			int var3 = var1.readUnsignedByte(); // L: 32
			if (var3 == 4) { // L: 33
				Username var10 = new Username(var1.readStringCp1252NullTerminated(), this.field4661); // L: 34
				if (!var10.hasCleanName()) {
					throw new IllegalStateException(); // L: 35
				}

				boolean var11 = false; // L: 36
				class12.friendSystem.method1914(var10.getName(), var11); // L: 37
			} else {
				boolean var4 = (var3 & 1) != 0; // L: 40
				Username var5 = new Username(var1.readStringCp1252NullTerminated(), this.field4661); // L: 41
				Username var6 = new Username(var1.readStringCp1252NullTerminated(), this.field4661); // L: 42
				var1.readStringCp1252NullTerminated(); // L: 43
				if (!var5.hasCleanName()) { // L: 44
					throw new IllegalStateException();
				}

				Ignored var7 = (Ignored)this.getByCurrentUsername(var5); // L: 45
				if (var4) { // L: 46
					Ignored var8 = (Ignored)this.getByCurrentUsername(var6); // L: 47
					if (var8 != null && var7 != var8) { // L: 48
						if (var7 != null) { // L: 49
							this.remove(var8); // L: 50
						} else {
							var7 = var8; // L: 53
						}
					}
				}

				if (var7 != null) { // L: 57
					this.changeName(var7, var5, var6); // L: 58
				} else if (this.getSize() < 400) { // L: 60
					int var9 = this.getSize(); // L: 61
					var7 = (Ignored)this.addLast(var5, var6); // L: 62
					var7.id = var9; // L: 63
				}
			}
		}

	} // L: 67

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lol;IIB)Luz;",
		garbageValue = "-123"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2);
		boolean var3;
		if (var4 == null) {
			var3 = false;
		} else {
			class162.SpriteBuffer_decode(var4);
			var3 = true;
		}

		return !var3 ? null : WorldMapCacheName.method5004(); // L: 111
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "35"
	)
	static void method8061(int var0, int var1, int var2, int var3) {
		for (ObjectSound var4 = (ObjectSound)ObjectSound.objectSounds.last(); var4 != null; var4 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 100
			if (var4.soundEffectId != -1 || var4.soundEffectIds != null) { // L: 101
				int var5 = 0; // L: 102
				if (var1 > var4.maxX * 128) { // L: 103
					var5 += var1 - var4.maxX * 128;
				} else if (var1 < var4.x * 16384) { // L: 104
					var5 += var4.x * 16384 - var1;
				}

				if (var2 > var4.maxY * 16384) { // L: 105
					var5 += var2 - var4.maxY * 16384;
				} else if (var2 < var4.y * 16384) { // L: 106
					var5 += var4.y * 16384 - var2;
				}

				if (var5 - 64 <= var4.field824 && WorldMapIcon_1.clientPreferences.method2605() != 0 && var0 == var4.plane) { // L: 107
					var5 -= 64; // L: 118
					if (var5 < 0) { // L: 119
						var5 = 0;
					}

					int var6 = (var4.field824 - var5) * WorldMapIcon_1.clientPreferences.method2605() / var4.field824; // L: 120
					if (var4.stream1 == null) { // L: 121
						if (var4.soundEffectId >= 0) { // L: 122
							SoundEffect var7 = SoundEffect.readSoundEffect(Language.field4412, var4.soundEffectId, 0); // L: 123
							if (var7 != null) { // L: 124
								RawSound var8 = var7.toRawSound().resample(class521.decimator); // L: 125
								RawPcmStream var9 = RawPcmStream.createRawPcmStream(var8, 100, var6); // L: 126
								var9.setNumLoops(-1); // L: 127
								LoginScreenAnimation.pcmStreamMixer.addSubStream(var9); // L: 128
								var4.stream1 = var9; // L: 129
							}
						}
					} else {
						var4.stream1.method1000(var6); // L: 133
					}

					if (var4.stream2 == null) { // L: 134
						if (var4.soundEffectIds != null && (var4.field832 -= var3) <= 0) { // L: 135
							int var11 = (int)(Math.random() * (double)var4.soundEffectIds.length); // L: 136
							SoundEffect var12 = SoundEffect.readSoundEffect(Language.field4412, var4.soundEffectIds[var11], 0); // L: 137
							if (var12 != null) { // L: 138
								RawSound var13 = var12.toRawSound().resample(class521.decimator); // L: 139
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var13, 100, var6); // L: 140
								var10.setNumLoops(0); // L: 141
								LoginScreenAnimation.pcmStreamMixer.addSubStream(var10); // L: 142
								var4.stream2 = var10; // L: 143
								var4.field832 = var4.field827 + (int)(Math.random() * (double)(var4.field828 - var4.field827)); // L: 144
							}
						}
					} else {
						var4.stream2.method1000(var6); // L: 149
						if (!var4.stream2.hasNext()) { // L: 150
							var4.stream2 = null; // L: 151
						}
					}
				} else {
					if (var4.stream1 != null) { // L: 108
						LoginScreenAnimation.pcmStreamMixer.removeSubStream(var4.stream1); // L: 109
						var4.stream1 = null; // L: 110
					}

					if (var4.stream2 != null) { // L: 112
						LoginScreenAnimation.pcmStreamMixer.removeSubStream(var4.stream2); // L: 113
						var4.stream2 = null; // L: 114
					}
				}
			}
		}

	} // L: 155

	@ObfuscatedName("my")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-24"
	)
	@Export("setTapToDrop")
	static void setTapToDrop(boolean var0) {
		Client.tapToDrop = var0; // L: 11517
	} // L: 11518
}
