import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bc")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("gy")
	@ObfuscatedGetter(
		intValue = 1804855299
	)
	static int field303;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	AbstractArchive field302;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ltw;"
	)
	NodeHashTable field306;

	@ObfuscatedSignature(
		descriptor = "(Lol;Lol;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		new NodeHashTable(256); // L: 11
		this.field306 = new NodeHashTable(256); // L: 14
		this.soundEffectIndex = var1; // L: 17
		this.field302 = var2; // L: 18
	} // L: 19

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II[II)Lbt;",
		garbageValue = "1933572054"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		long var4 = this.method876(var1, var2, false); // L: 22
		class53 var6 = (class53)this.field306.get(var4); // L: 23
		if (var6 != null) { // L: 24
			return var6.method1094();
		} else if (var3 != null && var3[0] <= 0) { // L: 25
			return null;
		} else {
			SoundEffect var7 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2); // L: 26
			if (var7 == null) { // L: 27
				return null;
			} else {
				RawSound var8 = var7.toRawSound(); // L: 28
				this.field306.put(new class53(var8), var4); // L: 29
				if (var3 != null) { // L: 30
					var3[0] -= var8.samples.length;
				}

				return var8; // L: 31
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lcg;",
		garbageValue = "1"
	)
	class53 method886(int var1, int var2) {
		long var3 = this.method876(var1, var2, true); // L: 35
		class53 var5 = (class53)this.field306.get(var3); // L: 36
		if (var5 != null) { // L: 37
			return var5; // L: 38
		} else {
			VorbisSample var6 = VorbisSample.readMusicSample(this.field302, var1, var2); // L: 40
			if (var6 == null) { // L: 41
				return new class53(); // L: 42
			} else {
				class53 var7 = new class53(var6); // L: 44
				this.field306.put(var7, var3); // L: 45
				return var7; // L: 46
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I[IB)Lbt;",
		garbageValue = "47"
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Lcg;",
		garbageValue = "656232055"
	)
	public class53 method874(int var1) {
		if (this.field302.getGroupCount() == 1) { // L: 56
			return this.method886(0, var1); // L: 57
		} else if (this.field302.getGroupFileCount(var1) == 1) { // L: 59
			return this.method886(var1, 0); // L: 60
		} else {
			throw new RuntimeException(); // L: 63
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IS)Lbt;",
		garbageValue = "26403"
	)
	public RawSound method892(int var1) {
		return this.getSoundEffect(var1, (int[])null); // L: 68
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIZI)J",
		garbageValue = "414633479"
	)
	long method876(int var1, int var2, boolean var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >> 12); // L: 72
		var4 |= var1 << 16; // L: 73
		return var3 ? (long)var4 ^ 4294967296L : (long)var4; // L: 74 75 78
	}

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "([Lnn;II)V",
		garbageValue = "685108589"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 12238
			Widget var3 = var0[var2]; // L: 12239
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !class11.isComponentHidden(var3))) { // L: 12240 12241 12242
				if (var3.type == 0) { // L: 12243
					if (!var3.isIf3 && class11.isComponentHidden(var3) && var3 != Interpreter.mousedOverWidgetIf1) { // L: 12244
						continue;
					}

					drawModelComponents(var0, var3.id); // L: 12245
					if (var3.children != null) { // L: 12246
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 12247
					if (var4 != null) { // L: 12248
						ClanChannel.method3471(var4.group);
					}
				}

				if (var3.type == 6) { // L: 12250
					int var5;
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) { // L: 12251
						boolean var8 = class335.runCs1(var3); // L: 12252
						if (var8) { // L: 12254
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId; // L: 12255
						}

						if (var5 != -1) { // L: 12256
							SequenceDefinition var6 = DynamicObject.SequenceDefinition_get(var5); // L: 12257
							if (!var6.isCachedModelIdSet()) { // L: 12258
								for (var3.modelFrameCycle += Client.field564; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; class159.invalidateWidget(var3)) { // L: 12259 12260 12267
									var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame]; // L: 12261
									++var3.modelFrame; // L: 12262
									if (var3.modelFrame >= var6.frameIds.length) { // L: 12263
										var3.modelFrame -= var6.frameCount; // L: 12264
										if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) { // L: 12265
											var3.modelFrame = 0;
										}
									}
								}
							} else {
								var3.modelFrame += Client.field564; // L: 12271
								int var7 = var6.method4064(); // L: 12272
								if (var3.modelFrame >= var7) { // L: 12273
									var3.modelFrame -= var6.frameCount; // L: 12274
									if (var3.modelFrame < 0 || var3.modelFrame >= var7) { // L: 12275
										var3.modelFrame = 0;
									}
								}

								class159.invalidateWidget(var3); // L: 12277
							}
						}
					}

					if (var3.field3716 != 0 && !var3.isIf3) { // L: 12281
						int var9 = var3.field3716 >> 16; // L: 12282
						var5 = var3.field3716 << 16 >> 16; // L: 12283
						var9 *= Client.field564; // L: 12284
						var5 *= Client.field564; // L: 12285
						var3.modelAngleX = var9 + var3.modelAngleX & 2047; // L: 12286
						var3.modelAngleY = var5 + var3.modelAngleY & 2047; // L: 12287
						class159.invalidateWidget(var3); // L: 12288
					}
				}
			}
		}

	} // L: 12292
}
