import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 561302179
	)
	static int field1262;
	@ObfuscatedName("at")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("ax")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("al")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("aj")
	@Export("displayFps")
	boolean displayFps;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1809723505
	)
	int field1260;
	@ObfuscatedName("ag")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 327642339
	)
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 513354559
	)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1056317535
	)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -701599599
	)
	int field1256;
	@ObfuscatedName("ap")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 878420799
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("am")
	@Export("parameters")
	final Map parameters;

	ClientPreferences() {
		this.hideUsername = false;
		this.displayFps = false;
		this.brightness = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.field1256 = -1;
		this.rememberedUsername = null;
		this.windowMode = 1;
		this.parameters = new LinkedHashMap();
		this.method2424(true); // L: 33
	} // L: 34

	@ObfuscatedSignature(
		descriptor = "(Ltc;)V"
	)
	ClientPreferences(Buffer var1) {
		this.hideUsername = false; // L: 19
		this.displayFps = false; // L: 21
		this.brightness = 0.8D; // L: 23
		this.musicVolume = 127; // L: 24
		this.soundEffectsVolume = 127; // L: 25
		this.areaSoundEffectsVolume = 127; // L: 26
		this.field1256 = -1; // L: 27
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
					this.field1256 = var1.readUnsignedByte(); // L: 76
				}

				if (var2 > 8) { // L: 78
					this.displayFps = var1.readUnsignedByte() == 1; // L: 79
				}

				if (var2 > 9) { // L: 81
					this.field1260 = var1.readInt(); // L: 82
				}
			} else {
				this.method2424(true); // L: 43
			}
		} else {
			this.method2424(true); // L: 38
		}

	} // L: 86

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1395761186"
	)
	void method2424(boolean var1) {
	} // L: 88

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Ltc;",
		garbageValue = "65"
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
			var1.writeIntME((Integer)var3.getKey()); // L: 100
			var1.writeIntME((Integer)var3.getValue()); // L: 101
		}

		var1.writeStringCp1252NullTerminated(this.rememberedUsername != null ? this.rememberedUsername : ""); // L: 104
		var1.writeBoolean(this.hideUsername); // L: 105
		var1.writeByte((int)(this.brightness * 100.0D)); // L: 106
		var1.writeByte(this.musicVolume); // L: 107
		var1.writeByte(this.soundEffectsVolume); // L: 108
		var1.writeByte(this.areaSoundEffectsVolume); // L: 109
		var1.writeByte(this.field1256); // L: 110
		var1.writeByte(this.displayFps ? 1 : 0); // L: 111
		var1.writeIntME(this.field1260); // L: 112
		return var1; // L: 113
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1684280654"
	)
	void method2426(boolean var1) {
		this.roofsHidden = var1; // L: 133
		class302.savePreferences(); // L: 134
	} // L: 135

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1747607016"
	)
	boolean method2536() {
		return this.roofsHidden; // L: 138
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "21309"
	)
	void method2428(boolean var1) {
		this.hideUsername = var1; // L: 142
		class302.savePreferences(); // L: 143
	} // L: 144

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1090395540"
	)
	boolean method2458() {
		return this.hideUsername; // L: 147
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-101"
	)
	void method2481(boolean var1) {
		this.titleMusicDisabled = var1; // L: 151
		class302.savePreferences(); // L: 152
	} // L: 153

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1684707757"
	)
	boolean method2435() {
		return this.titleMusicDisabled; // L: 156
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "54"
	)
	void method2432(boolean var1) {
		this.displayFps = var1; // L: 160
		class302.savePreferences(); // L: 161
	} // L: 162

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "20912"
	)
	void method2433() {
		this.method2432(!this.displayFps); // L: 165
	} // L: 166

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-414576318"
	)
	boolean method2434() {
		return this.displayFps; // L: 169
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "5"
	)
	void method2493(int var1) {
		this.field1260 = var1; // L: 173
		class302.savePreferences(); // L: 174
	} // L: 175

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "11"
	)
	int method2436() {
		return this.field1260; // L: 178
	}

	@ObfuscatedName("ap")
	void method2503(double var1) {
		this.brightness = var1; // L: 182
		class302.savePreferences(); // L: 183
	} // L: 184

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)D",
		garbageValue = "216326283"
	)
	double method2427() {
		return this.brightness; // L: 187
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1496369353"
	)
	void method2439(int var1) {
		this.musicVolume = var1; // L: 191
		class302.savePreferences(); // L: 192
	} // L: 193

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "129593643"
	)
	int method2440() {
		return this.musicVolume; // L: 196
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "66"
	)
	@Export("updateSoundEffectVolume")
	void updateSoundEffectVolume(int var1) {
		this.soundEffectsVolume = var1; // L: 200
		class302.savePreferences(); // L: 201
	} // L: 202

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "13"
	)
	int method2442() {
		return this.soundEffectsVolume; // L: 205
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1820945618"
	)
	void method2456(int var1) {
		this.areaSoundEffectsVolume = var1; // L: 209
		class302.savePreferences(); // L: 210
	} // L: 211

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2055311670"
	)
	int method2444() {
		return this.areaSoundEffectsVolume; // L: 214
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-101682049"
	)
	void method2445(String var1) {
		this.rememberedUsername = var1; // L: 218
		class302.savePreferences(); // L: 219
	} // L: 220

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1315495617"
	)
	String method2446() {
		return this.rememberedUsername; // L: 223
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1984133222"
	)
	void method2447(int var1) {
		this.field1256 = var1; // L: 227
		class302.savePreferences(); // L: 228
	} // L: 229

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-64"
	)
	int method2448() {
		return this.field1256; // L: 232
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-25661"
	)
	void method2452(int var1) {
		this.windowMode = var1; // L: 236
		class302.savePreferences(); // L: 237
	} // L: 238

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-833656095"
	)
	int method2469() {
		return this.windowMode; // L: 241
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IS)V",
		garbageValue = "31672"
	)
	void method2451(String var1, int var2) {
		int var3 = this.method2454(var1); // L: 245
		if (this.parameters.size() >= 10 && !this.parameters.containsKey(var3)) { // L: 246
			Iterator var4 = this.parameters.entrySet().iterator(); // L: 247
			var4.next(); // L: 248
			var4.remove(); // L: 249
		}

		this.parameters.put(var3, var2); // L: 251
		class302.savePreferences(); // L: 252
	} // L: 253

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-1028963769"
	)
	boolean method2488(String var1) {
		int var2 = this.method2454(var1); // L: 256
		return this.parameters.containsKey(var2); // L: 257
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "753646551"
	)
	int method2453(String var1) {
		int var2 = this.method2454(var1); // L: 261
		return !this.parameters.containsKey(var2) ? 0 : (Integer)this.parameters.get(var2); // L: 262 263 265
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "-1"
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfi;",
		garbageValue = "-901239475"
	)
	static class131[] method2537() {
		return new class131[]{class131.field1544, class131.field1541, class131.field1554, class131.field1540, class131.field1550, class131.field1545, class131.field1546, class131.field1559, class131.field1548, class131.field1549, class131.field1542, class131.field1551, class131.field1552, class131.field1553, class131.field1560, class131.field1555, class131.field1556}; // L: 68
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-2083432515"
	)
	public static int method2538(int var0, int var1) {
		return (int)(Math.atan2((double)var0, (double)var1) * 325.94932345220167D) & 2047; // L: 11
	}
}
