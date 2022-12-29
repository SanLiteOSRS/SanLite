import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("aj")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1263171115
	)
	static int field350;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("musicSampleIndex")
	AbstractArchive musicSampleIndex;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	@Export("musicSamples")
	NodeHashTable musicSamples;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	@Export("rawSounds")
	NodeHashTable rawSounds;

	@ObfuscatedSignature(
		descriptor = "(Lly;Lly;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		this.musicSamples = new NodeHashTable(256); // L: 9
		this.rawSounds = new NodeHashTable(256); // L: 10
		this.soundEffectIndex = var1; // L: 13
		this.musicSampleIndex = var2; // L: 14
	} // L: 15

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II[IB)Laf;",
		garbageValue = "1"
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
				var7 = var8.toRawSound(); // L: 26
				this.rawSounds.put(var7, var5); // L: 27
				if (var3 != null) {
					var3[0] -= var7.samples.length; // L: 28
				}

				return var7; // L: 29
			}
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II[II)Laf;",
		garbageValue = "-1966397833"
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
		descriptor = "(I[II)Laf;",
		garbageValue = "112511764"
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

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I[II)Laf;",
		garbageValue = "1767210019"
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILbm;ZI)I",
		garbageValue = "-390039727"
	)
	static int method893(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) { // L: 2650
			class87.Interpreter_intStackSize -= 2; // L: 2651
			var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 2652
			var9 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 2653
			EnumComposition var10 = class87.getEnum(var3); // L: 2654
			if (var10.outputType != 's') { // L: 2655
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) { // L: 2656
				if (var9 == var10.keys[var6]) { // L: 2657
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var10.strVals[var6]; // L: 2658
					var10 = null; // L: 2659
					break;
				}
			}

			if (var10 != null) { // L: 2663
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}

			return 1; // L: 2664
		} else if (var0 != ScriptOpcodes.ENUM) { // L: 2666
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) { // L: 2692
				var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 2693
				EnumComposition var4 = class87.getEnum(var3); // L: 2694
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4.size(); // L: 2695
				return 1; // L: 2696
			} else {
				return 2; // L: 2698
			}
		} else {
			class87.Interpreter_intStackSize -= 4; // L: 2667
			var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 2668
			var9 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 2669
			int var5 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 2]; // L: 2670
			var6 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 3]; // L: 2671
			EnumComposition var7 = class87.getEnum(var5); // L: 2672
			if (var3 == var7.inputType && var9 == var7.outputType) { // L: 2673
				for (int var8 = 0; var8 < var7.outputCount; ++var8) { // L: 2678
					if (var6 == var7.keys[var8]) { // L: 2679
						if (var9 == 115) { // L: 2680
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7.intVals[var8]; // L: 2681
						}

						var7 = null; // L: 2682
						break;
					}
				}

				if (var7 != null) { // L: 2686
					if (var9 == 115) { // L: 2687
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7.defaultInt; // L: 2688
					}
				}

				return 1; // L: 2690
			} else {
				if (var9 == 115) { // L: 2674
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 2675
				}

				return 1; // L: 2676
			}
		}
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-1"
	)
	static boolean method890() {
		return (Client.drawPlayerNames & 1) != 0; // L: 5007
	}

	@ObfuscatedName("mg")
	@ObfuscatedSignature(
		descriptor = "(Lkd;IIII)V",
		garbageValue = "-1447783720"
	)
	@Export("drawCompass")
	static final void drawCompass(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.getSpriteMask(false); // L: 12455
		if (var4 != null) { // L: 12456
			if (Client.minimapState < 3) { // L: 12457
				class201.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 12458
			}

		}
	} // L: 12459
}
