import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("ru")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("varcs")
	static Varcs varcs;
	@ObfuscatedName("tl")
	@ObfuscatedSignature(
		descriptor = "Lrp;"
	)
	@Export("friendsChatManager")
	static FriendsChatManager friendsChatManager;
	@ObfuscatedName("aq")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("ar")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("ag")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("ao")
	@Export("displayFps")
	boolean displayFps;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1372038433
	)
	int field1282;
	@ObfuscatedName("aa")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 2086965761
	)
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -920440221
	)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 672929229
	)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 651819517
	)
	int field1287;
	@ObfuscatedName("aw")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 995106877
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("av")
	@Export("parameters")
	final Map parameters;

	ClientPreferences() {
		this.hideUsername = false;
		this.displayFps = false;
		this.brightness = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.field1287 = -1;
		this.rememberedUsername = null;
		this.windowMode = 1;
		this.parameters = new LinkedHashMap();
		this.method2532(true); // L: 33
	} // L: 34

	@ObfuscatedSignature(
		descriptor = "(Luk;)V"
	)
	ClientPreferences(Buffer var1) {
		this.hideUsername = false; // L: 19
		this.displayFps = false; // L: 21
		this.brightness = 0.8D; // L: 23
		this.musicVolume = 127; // L: 24
		this.soundEffectsVolume = 127; // L: 25
		this.areaSoundEffectsVolume = 127; // L: 26
		this.field1287 = -1; // L: 27
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
					this.field1287 = var1.readUnsignedByte(); // L: 76
				}

				if (var2 > 8) { // L: 78
					this.displayFps = var1.readUnsignedByte() == 1; // L: 79
				}

				if (var2 > 9) { // L: 81
					this.field1282 = var1.readInt(); // L: 82
				}
			} else {
				this.method2532(true); // L: 43
			}
		} else {
			this.method2532(true); // L: 38
		}

	} // L: 86

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "0"
	)
	void method2532(boolean var1) {
	} // L: 88

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Luk;",
		garbageValue = "-944858017"
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
			var1.method9373((Integer)var3.getKey()); // L: 100
			var1.method9373((Integer)var3.getValue()); // L: 101
		}

		var1.writeStringCp1252NullTerminated(this.rememberedUsername != null ? this.rememberedUsername : ""); // L: 104
		var1.writeBoolean(this.hideUsername); // L: 105
		var1.writeByte((int)(this.brightness * 100.0D)); // L: 106
		var1.writeByte(this.musicVolume); // L: 107
		var1.writeByte(this.soundEffectsVolume); // L: 108
		var1.writeByte(this.areaSoundEffectsVolume); // L: 109
		var1.writeByte(this.field1287); // L: 110
		var1.writeByte(this.displayFps ? 1 : 0); // L: 111
		var1.method9373(this.field1282); // L: 112
		return var1; // L: 113
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "393238374"
	)
	void method2577(boolean var1) {
		this.roofsHidden = var1; // L: 133
		class408.savePreferences(); // L: 134
	} // L: 135

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1364303448"
	)
	boolean method2535() {
		return this.roofsHidden; // L: 138
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "134539261"
	)
	void method2536(boolean var1) {
		this.hideUsername = var1; // L: 142
		class408.savePreferences(); // L: 143
	} // L: 144

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-937579643"
	)
	boolean method2619() {
		return this.hideUsername; // L: 147
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "52"
	)
	void method2589(boolean var1) {
		this.titleMusicDisabled = var1; // L: 151
		class408.savePreferences(); // L: 152
	} // L: 153

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	boolean method2546() {
		return this.titleMusicDisabled; // L: 156
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1048576"
	)
	void method2568(boolean var1) {
		this.displayFps = var1; // L: 160
		class408.savePreferences(); // L: 161
	} // L: 162

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-216753423"
	)
	void method2555() {
		this.method2568(!this.displayFps); // L: 165
	} // L: 166

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-107"
	)
	boolean method2541() {
		return this.displayFps; // L: 169
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2132474807"
	)
	void method2542(int var1) {
		this.field1282 = var1; // L: 173
		class408.savePreferences(); // L: 174
	} // L: 175

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2081223933"
	)
	int method2543() {
		return this.field1282; // L: 178
	}

	@ObfuscatedName("aw")
	void method2544(double var1) {
		this.brightness = var1; // L: 182
		class408.savePreferences(); // L: 183
	} // L: 184

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)D",
		garbageValue = "4"
	)
	double method2548() {
		return this.brightness; // L: 187
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-774091800"
	)
	void method2628(int var1) {
		this.musicVolume = var1; // L: 191
		class408.savePreferences(); // L: 192
	} // L: 193

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "226795268"
	)
	int method2597() {
		return this.musicVolume; // L: 196
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1314720258"
	)
	@Export("updateSoundEffectVolume")
	void updateSoundEffectVolume(int var1) {
		this.soundEffectsVolume = var1; // L: 200
		class408.savePreferences(); // L: 201
	} // L: 202

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-969144890"
	)
	int method2549() {
		return this.soundEffectsVolume; // L: 205
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1717905485"
	)
	void method2539(int var1) {
		this.areaSoundEffectsVolume = var1; // L: 209
		class408.savePreferences(); // L: 210
	} // L: 211

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1211805205"
	)
	int method2551() {
		return this.areaSoundEffectsVolume; // L: 214
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-113"
	)
	void method2604(String var1) {
		this.rememberedUsername = var1; // L: 218
		class408.savePreferences(); // L: 219
	} // L: 220

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "902516274"
	)
	String method2553() {
		return this.rememberedUsername; // L: 223
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2083288143"
	)
	void method2599(int var1) {
		this.field1287 = var1; // L: 227
		class408.savePreferences(); // L: 228
	} // L: 229

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-709001314"
	)
	int method2605() {
		return this.field1287; // L: 232
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1907190812"
	)
	void method2556(int var1) {
		this.windowMode = var1; // L: 236
		class408.savePreferences(); // L: 237
	} // L: 238

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "8"
	)
	int method2552() {
		return this.windowMode; // L: 241
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-1268066825"
	)
	void method2558(String var1, int var2) {
		int var3 = this.method2586(var1); // L: 245
		if (this.parameters.size() >= 10 && !this.parameters.containsKey(var3)) { // L: 246
			Iterator var4 = this.parameters.entrySet().iterator(); // L: 247
			var4.next(); // L: 248
			var4.remove(); // L: 249
		}

		this.parameters.put(var3, var2); // L: 251
		class408.savePreferences(); // L: 252
	} // L: 253

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "1253643061"
	)
	boolean method2559(String var1) {
		int var2 = this.method2586(var1); // L: 256
		return this.parameters.containsKey(var2); // L: 257
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "-9"
	)
	int method2560(String var1) {
		int var2 = this.method2586(var1); // L: 261
		return !this.parameters.containsKey(var2) ? 0 : (Integer)this.parameters.get(var2); // L: 262 263 265
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)I",
		garbageValue = "9755"
	)
	int method2586(String var1) {
		String var3 = var1.toLowerCase(); // L: 270
		int var4 = var3.length(); // L: 272
		int var5 = 0; // L: 273

		for (int var6 = 0; var6 < var4; ++var6) { // L: 274
			var5 = (var5 << 5) - var5 + var3.charAt(var6);
		}

		return var5; // L: 277
	}
}
