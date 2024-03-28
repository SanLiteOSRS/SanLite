import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("an")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("ao")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("ab")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("aw")
	@Export("displayFps")
	boolean displayFps;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -240650087
	)
	int field1312;
	@ObfuscatedName("al")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1881122229
	)
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1753320905
	)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1775426865
	)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -2082315561
	)
	int field1305;
	@ObfuscatedName("ar")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 524815229
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("au")
	@Export("parameters")
	final Map parameters;

	ClientPreferences() {
		this.hideUsername = false;
		this.displayFps = false;
		this.brightness = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.field1305 = -1;
		this.rememberedUsername = null;
		this.windowMode = 1;
		this.parameters = new LinkedHashMap();
		this.method2489(true); // L: 33
	} // L: 34

	@ObfuscatedSignature(
		descriptor = "(Lur;)V"
	)
	ClientPreferences(Buffer var1) {
		this.hideUsername = false; // L: 19
		this.displayFps = false; // L: 21
		this.brightness = 0.8D; // L: 23
		this.musicVolume = 127; // L: 24
		this.soundEffectsVolume = 127; // L: 25
		this.areaSoundEffectsVolume = 127; // L: 26
		this.field1305 = -1; // L: 27
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
					this.field1305 = var1.readUnsignedByte(); // L: 76
				}

				if (var2 > 8) { // L: 78
					this.displayFps = var1.readUnsignedByte() == 1; // L: 79
				}

				if (var2 > 9) { // L: 81
					this.field1312 = var1.readInt(); // L: 82
				}
			} else {
				this.method2489(true); // L: 43
			}
		} else {
			this.method2489(true); // L: 38
		}

	} // L: 86

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-61"
	)
	void method2489(boolean var1) {
	} // L: 88

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lur;",
		garbageValue = "167884271"
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
		var1.writeByte(this.field1305); // L: 110
		var1.writeByte(this.displayFps ? 1 : 0); // L: 111
		var1.writeIntME(this.field1312); // L: 112
		return var1; // L: 113
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-110"
	)
	void method2458(boolean var1) {
		this.roofsHidden = var1; // L: 157
		class486.savePreferences(); // L: 158
	} // L: 159

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-349982498"
	)
	boolean method2459() {
		return this.roofsHidden; // L: 162
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1138321849"
	)
	void method2538(boolean var1) {
		this.hideUsername = var1; // L: 166
		class486.savePreferences(); // L: 167
	} // L: 168

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-584781019"
	)
	boolean method2461() {
		return this.hideUsername; // L: 171
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "104"
	)
	void method2520(boolean var1) {
		this.titleMusicDisabled = var1; // L: 175
		class486.savePreferences(); // L: 176
	} // L: 177

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-396566311"
	)
	boolean method2463() {
		return this.titleMusicDisabled; // L: 180
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-52"
	)
	void method2464(boolean var1) {
		this.displayFps = var1; // L: 184
		class486.savePreferences(); // L: 185
	} // L: 186

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method2465() {
		this.method2464(!this.displayFps); // L: 189
	} // L: 190

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "82"
	)
	boolean method2466() {
		return this.displayFps; // L: 193
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-452808219"
	)
	void method2558(int var1) {
		this.field1312 = var1; // L: 197
		class486.savePreferences(); // L: 198
	} // L: 199

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "395586602"
	)
	int method2549() {
		return this.field1312; // L: 202
	}

	@ObfuscatedName("aj")
	void method2469(double var1) {
		this.brightness = var1; // L: 206
		class486.savePreferences(); // L: 207
	} // L: 208

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(S)D",
		garbageValue = "2047"
	)
	double method2470() {
		return this.brightness; // L: 211
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-74"
	)
	void method2471(int var1) {
		this.musicVolume = var1; // L: 215
		class486.savePreferences(); // L: 216
	} // L: 217

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1723333194"
	)
	int method2503() {
		return this.musicVolume; // L: 220
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "4"
	)
	@Export("updateSoundEffectVolume")
	void updateSoundEffectVolume(int var1) {
		this.soundEffectsVolume = var1; // L: 224
		class486.savePreferences(); // L: 225
	} // L: 226

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1720559268"
	)
	int method2473() {
		return this.soundEffectsVolume; // L: 229
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-689204352"
	)
	void method2541(int var1) {
		this.areaSoundEffectsVolume = var1; // L: 233
		class486.savePreferences(); // L: 234
	} // L: 235

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "52631059"
	)
	int method2475() {
		return this.areaSoundEffectsVolume; // L: 238
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-601327993"
	)
	void method2476(String var1) {
		this.rememberedUsername = var1; // L: 242
		class486.savePreferences(); // L: 243
	} // L: 244

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "359"
	)
	String method2547() {
		return this.rememberedUsername; // L: 247
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1155748080"
	)
	void method2478(int var1) {
		this.field1305 = var1; // L: 251
		class486.savePreferences(); // L: 252
	} // L: 253

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "796072003"
	)
	int method2479() {
		return this.field1305; // L: 256
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-1"
	)
	void method2480(int var1) {
		this.windowMode = var1; // L: 260
		class486.savePreferences(); // L: 261
	} // L: 262

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "16"
	)
	int method2560() {
		return this.windowMode; // L: 265
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IS)V",
		garbageValue = "321"
	)
	void method2519(String var1, int var2) {
		int var3 = this.method2485(var1); // L: 269
		if (this.parameters.size() >= 10 && !this.parameters.containsKey(var3)) { // L: 270
			Iterator var4 = this.parameters.entrySet().iterator(); // L: 271
			var4.next(); // L: 272
			var4.remove(); // L: 273
		}

		this.parameters.put(var3, var2); // L: 275
		class486.savePreferences(); // L: 276
	} // L: 277

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-1699106269"
	)
	boolean method2468(String var1) {
		int var2 = this.method2485(var1); // L: 280
		return this.parameters.containsKey(var2); // L: 281
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "-34"
	)
	int method2484(String var1) {
		int var2 = this.method2485(var1); // L: 285
		return !this.parameters.containsKey(var2) ? 0 : (Integer)this.parameters.get(var2); // L: 286 287 289
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "831132902"
	)
	int method2485(String var1) {
		String var3 = var1.toLowerCase(); // L: 294
		int var4 = var3.length(); // L: 296
		int var5 = 0; // L: 297

		for (int var6 = 0; var6 < var4; ++var6) { // L: 298
			var5 = (var5 << 5) - var5 + var3.charAt(var6);
		}

		return var5; // L: 301
	}
}
