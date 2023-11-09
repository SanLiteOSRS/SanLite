import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dd")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("ay")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("ap")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("av")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("an")
	@Export("displayFps")
	boolean displayFps;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1396829741
	)
	int field1284;
	@ObfuscatedName("az")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -279596779
	)
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1090176965
	)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1040414983
	)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1476798271
	)
	int field1296;
	@ObfuscatedName("ag")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1362782589
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("ar")
	@Export("parameters")
	final Map parameters;

	ClientPreferences() {
		this.hideUsername = false;
		this.displayFps = false;
		this.brightness = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.field1296 = -1;
		this.rememberedUsername = null;
		this.windowMode = 1;
		this.parameters = new LinkedHashMap();
		this.method2500(true);
	}

	@ObfuscatedSignature(
		descriptor = "(Ltl;)V"
	)
	ClientPreferences(Buffer var1) {
		this.hideUsername = false; // L: 19
		this.displayFps = false; // L: 21
		this.brightness = 0.8D; // L: 23
		this.musicVolume = 127; // L: 24
		this.soundEffectsVolume = 127; // L: 25
		this.areaSoundEffectsVolume = 127; // L: 26
		this.field1296 = -1; // L: 27
		this.rememberedUsername = null; // L: 28
		this.windowMode = 1; // L: 29
		this.parameters = new LinkedHashMap(); // L: 30
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
					this.field1296 = var1.readUnsignedByte(); // L: 76
				}

				if (var2 > 8) { // L: 78
					this.displayFps = var1.readUnsignedByte() == 1; // L: 79
				}

				if (var2 > 9) { // L: 81
					this.field1284 = var1.readInt(); // L: 82
				}
			} else {
				this.method2500(true); // L: 43
			}
		} else {
			this.method2500(true); // L: 38
		}

	} // L: 86

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "34"
	)
	void method2500(boolean var1) {
	} // L: 88

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Ltl;",
		garbageValue = "-2140743158"
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

		while (var2.hasNext()) { // L: 103
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
		var1.writeByte(this.field1296); // L: 110
		var1.writeByte(this.displayFps ? 1 : 0); // L: 111
		var1.writeInt(this.field1284); // L: 112
		return var1; // L: 113
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "0"
	)
	void method2502(boolean var1) {
		this.roofsHidden = var1; // L: 133
		class20.savePreferences(); // L: 134
	} // L: 135

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-700410068"
	)
	boolean method2543() {
		return this.roofsHidden; // L: 138
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "895430790"
	)
	void method2589(boolean var1) {
		this.hideUsername = var1; // L: 142
		class20.savePreferences(); // L: 143
	} // L: 144

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1096389843"
	)
	boolean method2505() {
		return this.hideUsername; // L: 147
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2016659140"
	)
	void method2566(boolean var1) {
		this.titleMusicDisabled = var1; // L: 151
		class20.savePreferences(); // L: 152
	} // L: 153

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "820037975"
	)
	boolean method2507() {
		return this.titleMusicDisabled; // L: 156
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "5004"
	)
	void method2508(boolean var1) {
		this.displayFps = var1; // L: 160
		class20.savePreferences(); // L: 161
	} // L: 162

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2030339760"
	)
	void method2533() {
		this.method2508(!this.displayFps); // L: 165
	} // L: 166

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1052428807"
	)
	boolean method2510() {
		return this.displayFps; // L: 169
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1605480473"
	)
	void method2559(int var1) {
		this.field1284 = var1; // L: 173
		class20.savePreferences(); // L: 174
	} // L: 175

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "942319064"
	)
	int method2509() {
		return this.field1284; // L: 178
	}

	@ObfuscatedName("ag")
	void method2513(double var1) {
		this.brightness = var1; // L: 182
		class20.savePreferences(); // L: 183
	} // L: 184

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)D",
		garbageValue = "75"
	)
	double method2514() {
		return this.brightness; // L: 187
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "762348543"
	)
	void method2593(int var1) {
		this.musicVolume = var1; // L: 191
		class20.savePreferences(); // L: 192
	} // L: 193

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "991708481"
	)
	int method2516() {
		return this.musicVolume; // L: 196
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "11"
	)
	@Export("updateSoundEffectVolume")
	void updateSoundEffectVolume(int var1) {
		this.soundEffectsVolume = var1; // L: 200
		class20.savePreferences(); // L: 201
	} // L: 202

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1571566649"
	)
	int method2518() {
		return this.soundEffectsVolume; // L: 205
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "60"
	)
	void method2519(int var1) {
		this.areaSoundEffectsVolume = var1; // L: 209
		class20.savePreferences(); // L: 210
	} // L: 211

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "151226824"
	)
	int method2571() {
		return this.areaSoundEffectsVolume; // L: 214
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "372263447"
	)
	void method2521(String var1) {
		this.rememberedUsername = var1; // L: 218
		class20.savePreferences(); // L: 219
	} // L: 220

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1313593058"
	)
	String method2504() {
		return this.rememberedUsername; // L: 223
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-87"
	)
	void method2517(int var1) {
		this.field1296 = var1; // L: 227
		class20.savePreferences(); // L: 228
	} // L: 229

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-13"
	)
	int method2582() {
		return this.field1296; // L: 232
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "25934198"
	)
	void method2525(int var1) {
		this.windowMode = var1; // L: 236
		class20.savePreferences(); // L: 237
	} // L: 238

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2018229597"
	)
	int method2523() {
		return this.windowMode; // L: 241
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)V",
		garbageValue = "19"
	)
	void method2527(String var1, int var2) {
		int var3 = this.method2530(var1); // L: 245
		if (this.parameters.size() >= 10 && !this.parameters.containsKey(var3)) { // L: 246
			Iterator var4 = this.parameters.entrySet().iterator(); // L: 247
			var4.next(); // L: 248
			var4.remove(); // L: 249
		}

		this.parameters.put(var3, var2); // L: 251
		class20.savePreferences(); // L: 252
	} // L: 253

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-1428204874"
	)
	boolean method2528(String var1) {
		int var2 = this.method2530(var1); // L: 256
		return this.parameters.containsKey(var2); // L: 257
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1439005070"
	)
	int method2529(String var1) {
		int var2 = this.method2530(var1); // L: 261
		return !this.parameters.containsKey(var2) ? 0 : (Integer)this.parameters.get(var2); // L: 262 263 265
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1593937337"
	)
	int method2530(String var1) {
		return Player.method2404(var1.toLowerCase()); // L: 269
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lnr;Lnr;I)V",
		garbageValue = "790011329"
	)
	public static void method2552(AbstractArchive var0, AbstractArchive var1) {
		SpotAnimationDefinition.SpotAnimationDefinition_archive = var0; // L: 32
		SpotAnimationDefinition.field2069 = var1; // L: 33
	} // L: 34
}
