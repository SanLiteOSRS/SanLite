import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("ab")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("au")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("aa")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("ac")
	@Export("displayFps")
	boolean displayFps;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -125977763
	)
	int field1286;
	@ObfuscatedName("az")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 681538859
	)
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -392533553
	)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 717748859
	)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -910618713
	)
	int field1291;
	@ObfuscatedName("ay")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1858072331
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("aj")
	@Export("parameters")
	final Map parameters;

	ClientPreferences() {
		this.hideUsername = false;
		this.displayFps = false;
		this.brightness = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.field1291 = -1;
		this.rememberedUsername = null;
		this.windowMode = 1;
		this.parameters = new LinkedHashMap();
		this.method2537(true);
	}

	@ObfuscatedSignature(
		descriptor = "(Luj;)V"
	)
	ClientPreferences(Buffer var1) {
		this.hideUsername = false; // L: 19
		this.displayFps = false; // L: 21
		this.brightness = 0.8D; // L: 23
		this.musicVolume = 127; // L: 24
		this.soundEffectsVolume = 127; // L: 25
		this.areaSoundEffectsVolume = 127; // L: 26
		this.field1291 = -1; // L: 27
		this.rememberedUsername = null;
		this.windowMode = 1;
		this.parameters = new LinkedHashMap();
		if (var1 != null && var1.array != null) { // L: 37
			int var2 = var1.readUnsignedByte(); // L: 41
			if (var2 >= 0 && var2 <= 10) { // L: 42
				if (var1.readUnsignedByte() == 1) { // L: 46
					this.roofsHidden = true; // L: 47
				}

				if (var2 > 1) { // L: 49
					this.titleMusicDisabled = var1.readUnsignedByte() == 1; // L: 50
				}

				if (var2 > 3) { // L: 52
					this.windowMode = var1.readUnsignedByte(); // L: 53
				}

				if (var2 > 2) { // L: 55
					int var3 = var1.readUnsignedByte(); // L: 56

					for (int var4 = 0; var4 < var3; ++var4) { // L: 57
						int var5 = var1.readInt(); // L: 58
						int var6 = var1.readInt(); // L: 59
						this.parameters.put(var5, var6); // L: 60
					}
				}

				if (var2 > 4) { // L: 63
					this.rememberedUsername = var1.readStringCp1252NullTerminatedOrNull(); // L: 64
				}

				if (var2 > 5) { // L: 66
					this.hideUsername = var1.readBoolean(); // L: 67
				}

				if (var2 > 6) { // L: 69
					this.brightness = (double)var1.readUnsignedByte() / 100.0D; // L: 70
					this.musicVolume = var1.readUnsignedByte(); // L: 71
					this.soundEffectsVolume = var1.readUnsignedByte(); // L: 72
					this.areaSoundEffectsVolume = var1.readUnsignedByte(); // L: 73
				}

				if (var2 > 7) { // L: 75
					this.field1291 = var1.readUnsignedByte(); // L: 76
				}

				if (var2 > 8) { // L: 78
					this.displayFps = var1.readUnsignedByte() == 1; // L: 79
				}

				if (var2 > 9) { // L: 81
					this.field1286 = var1.readInt(); // L: 82
				}
			} else {
				this.method2537(true); // L: 43
			}
		} else {
			this.method2537(true); // L: 38
		}

	} // L: 86

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "65"
	)
	void method2537(boolean var1) {
	} // L: 88

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Luj;",
		garbageValue = "1617415071"
	)
	@Export("toBuffer")
	Buffer toBuffer() {
		Buffer var1 = new Buffer(417, true); // L: 91
		var1.writeByte(10); // L: 92
		var1.writeByte(this.roofsHidden ? 1 : 0); // L: 93
		var1.writeByte(this.titleMusicDisabled ? 1 : 0); // L: 94
		var1.writeByte(this.windowMode); // L: 95
		var1.writeByte(this.parameters.size()); // L: 96
		Iterator var2 = this.parameters.entrySet().iterator(); // L: 97

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next(); // L: 98
			var1.writeInt((Integer)var3.getKey()); // L: 100
			var1.writeInt((Integer)var3.getValue()); // L: 101
		}

		var1.writeStringCp1252NullTerminated(this.rememberedUsername != null ? this.rememberedUsername : ""); // L: 104
		var1.writeBoolean(this.hideUsername); // L: 105
		var1.writeByte((int)(this.brightness * 100.0D)); // L: 106
		var1.writeByte(this.musicVolume); // L: 107
		var1.writeByte(this.soundEffectsVolume); // L: 108
		var1.writeByte(this.areaSoundEffectsVolume); // L: 109
		var1.writeByte(this.field1291); // L: 110
		var1.writeByte(this.displayFps ? 1 : 0); // L: 111
		var1.writeInt(this.field1286); // L: 112
		return var1; // L: 113
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-10"
	)
	void method2540(boolean var1) {
		this.roofsHidden = var1; // L: 133
		TextureProvider.savePreferences(); // L: 134
	} // L: 135

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-194443239"
	)
	boolean method2541() {
		return this.roofsHidden; // L: 138
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-2140370030"
	)
	void method2583(boolean var1) {
		this.hideUsername = var1; // L: 142
		TextureProvider.savePreferences(); // L: 143
	} // L: 144

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "190376852"
	)
	boolean method2543() {
		return this.hideUsername; // L: 147
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "-5895"
	)
	void method2571(boolean var1) {
		this.titleMusicDisabled = var1; // L: 151
		TextureProvider.savePreferences(); // L: 152
	} // L: 153

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1853874202"
	)
	boolean method2631() {
		return this.titleMusicDisabled; // L: 156
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1108077215"
	)
	void method2546(boolean var1) {
		this.displayFps = var1; // L: 160
		TextureProvider.savePreferences(); // L: 161
	} // L: 162

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-482539852"
	)
	void method2547() {
		this.method2546(!this.displayFps); // L: 165
	} // L: 166

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "682721054"
	)
	boolean method2608() {
		return this.displayFps; // L: 169
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-12427"
	)
	void method2549(int var1) {
		this.field1286 = var1; // L: 173
		TextureProvider.savePreferences(); // L: 174
	} // L: 175

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	int method2604() {
		return this.field1286; // L: 178
	}

	@ObfuscatedName("ay")
	void method2551(double var1) {
		this.brightness = var1; // L: 182
		TextureProvider.savePreferences(); // L: 183
	} // L: 184

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)D",
		garbageValue = "-2063080274"
	)
	double method2548() {
		return this.brightness; // L: 187
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1063115901"
	)
	void method2553(int var1) {
		this.musicVolume = var1; // L: 191
		TextureProvider.savePreferences(); // L: 192
	} // L: 193

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2102721692"
	)
	int method2554() {
		return this.musicVolume; // L: 196
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "256"
	)
	@Export("updateSoundEffectVolume")
	void updateSoundEffectVolume(int var1) {
		this.soundEffectsVolume = var1; // L: 200
		TextureProvider.savePreferences(); // L: 201
	} // L: 202

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "782450849"
	)
	int method2556() {
		return this.soundEffectsVolume; // L: 205
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-568127597"
	)
	void method2559(int var1) {
		this.areaSoundEffectsVolume = var1; // L: 209
		TextureProvider.savePreferences(); // L: 210
	} // L: 211

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1804486619"
	)
	int method2605() {
		return this.areaSoundEffectsVolume; // L: 214
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1092362617"
	)
	void method2586(String var1) {
		this.rememberedUsername = var1; // L: 218
		TextureProvider.savePreferences(); // L: 219
	} // L: 220

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-25"
	)
	String method2593() {
		return this.rememberedUsername; // L: 223
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "608118295"
	)
	void method2561(int var1) {
		this.field1291 = var1; // L: 227
		TextureProvider.savePreferences(); // L: 228
	} // L: 229

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-12"
	)
	int method2562() {
		return this.field1291; // L: 232
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "32"
	)
	void method2563(int var1) {
		this.windowMode = var1; // L: 236
		TextureProvider.savePreferences(); // L: 237
	} // L: 238

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1248539592"
	)
	int method2564() {
		return this.windowMode; // L: 241
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-1748399566"
	)
	void method2565(String var1, int var2) {
		int var3 = this.method2568(var1); // L: 245
		if (this.parameters.size() >= 10 && !this.parameters.containsKey(var3)) { // L: 246
			Iterator var4 = this.parameters.entrySet().iterator(); // L: 247
			var4.next(); // L: 248
			var4.remove(); // L: 249
		}

		this.parameters.put(var3, var2); // L: 251
		TextureProvider.savePreferences(); // L: 252
	} // L: 253

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-885731567"
	)
	boolean method2566(String var1) {
		int var2 = this.method2568(var1); // L: 256
		return this.parameters.containsKey(var2); // L: 257
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1978025457"
	)
	int method2567(String var1) {
		int var2 = this.method2568(var1); // L: 261
		return !this.parameters.containsKey(var2) ? 0 : (Integer)this.parameters.get(var2); // L: 262 263 265
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "8"
	)
	int method2568(String var1) {
		return Message.method1245(var1.toLowerCase()); // L: 269
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lht;",
		garbageValue = "1728806709"
	)
	public static VarbitComposition method2644(int var0) {
		VarbitComposition var1 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0); // L: 28
		if (var1 != null) { // L: 29
			return var1;
		} else {
			byte[] var2 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0); // L: 30
			var1 = new VarbitComposition(); // L: 31
			if (var2 != null) { // L: 32
				var1.decode(new Buffer(var2));
			}

			VarbitComposition.VarbitDefinition_cached.put(var1, (long)var0); // L: 33
			return var1; // L: 34
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "2085182056"
	)
	static int method2570(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 14
		if (var2 == null) { // L: 15
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1; // L: 16 17
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-77"
	)
	static void method2645(boolean var0) {
		byte var1 = 0; // L: 1546
		if (!class4.method21()) { // L: 1547
			var1 = 12; // L: 1548
		} else if (SpriteMask.client.method1351() || SpriteMask.client.isOtlTokenRequesterInitialized() || SpriteMask.client.method1267()) { // L: 1550
			var1 = 10; // L: 1551
		}

		UserComparator7.method2966(var1); // L: 1553
		if (var0) { // L: 1554
			Login.Login_username = ""; // L: 1555
			Login.Login_password = ""; // L: 1556
			class53.field350 = 0; // L: 1557
			class187.otp = ""; // L: 1558
		}

		Frames.method5517(); // L: 1560
		class150.method3281(); // L: 1561
	} // L: 1562
}
