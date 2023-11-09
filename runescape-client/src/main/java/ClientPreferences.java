import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("db")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	static Archive field1265;
	@ObfuscatedName("an")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("ao")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("av")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("aq")
	@Export("displayFps")
	boolean displayFps;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 56202733
	)
	int field1254;
	@ObfuscatedName("ar")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -748755615
	)
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1580172555
	)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -899530291
	)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -485702959
	)
	int field1261;
	@ObfuscatedName("am")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 909376049
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("ae")
	@Export("parameters")
	final Map parameters;

	ClientPreferences() {
		this.hideUsername = false;
		this.displayFps = false;
		this.brightness = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.field1261 = -1;
		this.rememberedUsername = null;
		this.windowMode = 1;
		this.parameters = new LinkedHashMap();
		this.method2425(true); // L: 33
	} // L: 34

	@ObfuscatedSignature(
		descriptor = "(Lsy;)V"
	)
	ClientPreferences(Buffer var1) {
		this.hideUsername = false; // L: 19
		this.displayFps = false; // L: 21
		this.brightness = 0.8D; // L: 23
		this.musicVolume = 127; // L: 24
		this.soundEffectsVolume = 127; // L: 25
		this.areaSoundEffectsVolume = 127; // L: 26
		this.field1261 = -1; // L: 27
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

				if (var2 > 4) {
					this.rememberedUsername = var1.readStringCp1252NullTerminatedOrNull();
				}

				if (var2 > 5) {
					this.hideUsername = var1.readBoolean();
				}

				if (var2 > 6) {
					this.brightness = (double)var1.readUnsignedByte() / 100.0D;
					this.musicVolume = var1.readUnsignedByte();
					this.soundEffectsVolume = var1.readUnsignedByte(); // L: 72
					this.areaSoundEffectsVolume = var1.readUnsignedByte();
				}

				if (var2 > 7) {
					this.field1261 = var1.readUnsignedByte(); // L: 76
				}

				if (var2 > 8) { // L: 78
					this.displayFps = var1.readUnsignedByte() == 1; // L: 79
				}

				if (var2 > 9) { // L: 81
					this.field1254 = var1.readInt(); // L: 82
				}
			} else {
				this.method2425(true); // L: 43
			}
		} else {
			this.method2425(true); // L: 38
		}

	} // L: 86

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1710618"
	)
	void method2425(boolean var1) {
	} // L: 88

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Lsy;",
		garbageValue = "69"
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
		var1.writeByte((int)(100.0D * this.brightness)); // L: 106
		var1.writeByte(this.musicVolume); // L: 107
		var1.writeByte(this.soundEffectsVolume); // L: 108
		var1.writeByte(this.areaSoundEffectsVolume); // L: 109
		var1.writeByte(this.field1261); // L: 110
		var1.writeByte(this.displayFps ? 1 : 0); // L: 111
		var1.writeInt(this.field1254); // L: 112
		return var1; // L: 113
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1391541433"
	)
	void method2432(boolean var1) {
		this.roofsHidden = var1; // L: 133
		class146.savePreferences(); // L: 134
	} // L: 135

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1333321648"
	)
	boolean method2458() {
		return this.roofsHidden; // L: 138
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "278116329"
	)
	void method2459(boolean var1) {
		this.hideUsername = var1; // L: 142
		class146.savePreferences(); // L: 143
	} // L: 144

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2098142981"
	)
	boolean method2429() {
		return this.hideUsername; // L: 147
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "147492823"
	)
	void method2500(boolean var1) {
		this.titleMusicDisabled = var1; // L: 151
		class146.savePreferences(); // L: 152
	} // L: 153

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "846356129"
	)
	boolean method2445() {
		return this.titleMusicDisabled; // L: 156
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-9"
	)
	void method2523(boolean var1) {
		this.displayFps = var1; // L: 160
		class146.savePreferences(); // L: 161
	} // L: 162

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	void method2433() {
		this.method2523(!this.displayFps); // L: 165
	} // L: 166

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2082731266"
	)
	boolean method2426() {
		return this.displayFps; // L: 169
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-6657"
	)
	void method2435(int var1) {
		this.field1254 = var1; // L: 173
		class146.savePreferences(); // L: 174
	} // L: 175

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-599544988"
	)
	int method2529() {
		return this.field1254; // L: 178
	}

	@ObfuscatedName("am")
	void method2522(double var1) {
		this.brightness = var1; // L: 182
		class146.savePreferences(); // L: 183
	} // L: 184

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)D",
		garbageValue = "64"
	)
	double method2438() {
		return this.brightness; // L: 187
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	void method2428(int var1) {
		this.musicVolume = var1; // L: 191
		class146.savePreferences(); // L: 192
	} // L: 193

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-348477158"
	)
	int method2440() {
		return this.musicVolume; // L: 196
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1816212673"
	)
	@Export("updateSoundEffectVolume")
	void updateSoundEffectVolume(int var1) {
		this.soundEffectsVolume = var1; // L: 200
		class146.savePreferences(); // L: 201
	} // L: 202

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1553842749"
	)
	int method2442() {
		return this.soundEffectsVolume; // L: 205
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1358573710"
	)
	void method2443(int var1) {
		this.areaSoundEffectsVolume = var1; // L: 209
		class146.savePreferences(); // L: 210
	} // L: 211

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "8"
	)
	int method2463() {
		return this.areaSoundEffectsVolume; // L: 214
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-474744901"
	)
	void method2439(String var1) {
		this.rememberedUsername = var1; // L: 218
		class146.savePreferences(); // L: 219
	} // L: 220

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-832983404"
	)
	String method2446() {
		return this.rememberedUsername; // L: 223
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "77"
	)
	void method2447(int var1) {
		this.field1261 = var1; // L: 227
		class146.savePreferences(); // L: 228
	} // L: 229

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1119305336"
	)
	int method2448() {
		return this.field1261; // L: 232
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "103"
	)
	void method2510(int var1) {
		this.windowMode = var1; // L: 236
		class146.savePreferences(); // L: 237
	} // L: 238

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "87"
	)
	int method2450() {
		return this.windowMode; // L: 241
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)V",
		garbageValue = "106"
	)
	void method2488(String var1, int var2) {
		int var3 = this.method2454(var1); // L: 245
		if (this.parameters.size() >= 10 && !this.parameters.containsKey(var3)) { // L: 246
			Iterator var4 = this.parameters.entrySet().iterator(); // L: 247
			var4.next(); // L: 248
			var4.remove(); // L: 249
		}

		this.parameters.put(var3, var2); // L: 251
		class146.savePreferences(); // L: 252
	} // L: 253

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-763604251"
	)
	boolean method2452(String var1) {
		int var2 = this.method2454(var1); // L: 256
		return this.parameters.containsKey(var2); // L: 257
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1472188766"
	)
	int method2453(String var1) {
		int var2 = this.method2454(var1); // L: 261
		return !this.parameters.containsKey(var2) ? 0 : (Integer)this.parameters.get(var2); // L: 262 263 265
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1940131826"
	)
	int method2454(String var1) {
		String var3 = var1.toLowerCase(); // L: 270
		int var4 = var3.length(); // L: 272
		int var5 = 0; // L: 273

		for (int var6 = 0; var6 < var4; ++var6) { // L: 274
			var5 = (var5 << 5) - var5 + var3.charAt(var6);
		}

		return var5; // L: 277
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([BIII)Ljava/lang/String;",
		garbageValue = "2059491791"
	)
	static String method2537(byte[] var0, int var1, int var2) {
		StringBuilder var3 = new StringBuilder(); // L: 62

		for (int var4 = var1; var4 < var2 + var1; var4 += 3) { // L: 63
			int var5 = var0[var4] & 255; // L: 64
			var3.append(class366.field4340[var5 >>> 2]); // L: 65
			if (var4 < var2 - 1) { // L: 66
				int var6 = var0[var4 + 1] & 255; // L: 67
				var3.append(class366.field4340[(var5 & 3) << 4 | var6 >>> 4]); // L: 68
				if (var4 < var2 - 2) { // L: 69
					int var7 = var0[var4 + 2] & 255; // L: 70
					var3.append(class366.field4340[(var6 & 15) << 2 | var7 >>> 6]).append(class366.field4340[var7 & 63]); // L: 71
				} else {
					var3.append(class366.field4340[(var6 & 15) << 2]).append("="); // L: 73
				}
			} else {
				var3.append(class366.field4340[(var5 & 3) << 4]).append("=="); // L: 75
			}
		}

		return var3.toString(); // L: 77
	}
}
