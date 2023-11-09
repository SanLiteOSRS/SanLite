import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("z")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("j")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("i")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("n")
	@Export("displayFps")
	boolean displayFps;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -757807693
	)
	int field1270;
	@ObfuscatedName("k")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1582995675
	)
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -759122883
	)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1069704695
	)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -211175145
	)
	int field1275;
	@ObfuscatedName("t")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1652253159
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("p")
	@Export("parameters")
	final Map parameters;

	ClientPreferences() {
		this.hideUsername = false;
		this.displayFps = false;
		this.brightness = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.field1275 = -1;
		this.rememberedUsername = null;
		this.windowMode = 1;
		this.parameters = new LinkedHashMap();
		this.method2480(true); // L: 33
	} // L: 34

	@ObfuscatedSignature(
		descriptor = "(Lrd;)V"
	)
	ClientPreferences(Buffer var1) {
		this.hideUsername = false; // L: 19
		this.displayFps = false; // L: 21
		this.brightness = 0.8D; // L: 23
		this.musicVolume = 127; // L: 24
		this.soundEffectsVolume = 127; // L: 25
		this.areaSoundEffectsVolume = 127; // L: 26
		this.field1275 = -1; // L: 27
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
					this.field1275 = var1.readUnsignedByte(); // L: 76
				}

				if (var2 > 8) { // L: 78
					this.displayFps = var1.readUnsignedByte() == 1; // L: 79
				}

				if (var2 > 9) { // L: 81
					this.field1270 = var1.readInt(); // L: 82
				}
			} else {
				this.method2480(true); // L: 43
			}
		} else {
			this.method2480(true); // L: 38
		}

	} // L: 86

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "54"
	)
	void method2480(boolean var1) {
	} // L: 88

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Lrd;",
		garbageValue = "1661663667"
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
		var1.writeByte(this.field1275); // L: 110
		var1.writeByte(this.displayFps ? 1 : 0); // L: 111
		var1.writeInt(this.field1270); // L: 112
		return var1; // L: 113
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-109"
	)
	void method2551(boolean var1) {
		this.roofsHidden = var1; // L: 157
		SoundSystem.savePreferences(); // L: 158
	} // L: 159

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "180"
	)
	boolean method2572() {
		return this.roofsHidden; // L: 162
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "2"
	)
	void method2483(boolean var1) {
		this.hideUsername = var1; // L: 166
		SoundSystem.savePreferences(); // L: 167
	} // L: 168

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "8123"
	)
	boolean method2484() {
		return this.hideUsername; // L: 171
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-642291381"
	)
	void method2563(boolean var1) {
		this.titleMusicDisabled = var1; // L: 175
		SoundSystem.savePreferences(); // L: 176
	} // L: 177

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1585419909"
	)
	boolean method2570() {
		return this.titleMusicDisabled; // L: 180
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "810617878"
	)
	void method2485(boolean var1) {
		this.displayFps = var1; // L: 184
		SoundSystem.savePreferences(); // L: 185
	} // L: 186

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "915076830"
	)
	void method2488() {
		this.method2485(!this.displayFps); // L: 189
	} // L: 190

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "2"
	)
	boolean method2489() {
		return this.displayFps; // L: 193
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-8"
	)
	void method2490(int var1) {
		this.field1270 = var1; // L: 197
		SoundSystem.savePreferences(); // L: 198
	} // L: 199

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2141806502"
	)
	int method2491() {
		return this.field1270; // L: 202
	}

	@ObfuscatedName("h")
	void method2583(double var1) {
		this.brightness = var1; // L: 206
		SoundSystem.savePreferences(); // L: 207
	} // L: 208

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)D",
		garbageValue = "76"
	)
	double method2557() {
		return this.brightness; // L: 211
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "8"
	)
	void method2533(int var1) {
		this.musicVolume = var1; // L: 215
		SoundSystem.savePreferences(); // L: 216
	} // L: 217

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-348918421"
	)
	int method2495() {
		return this.musicVolume; // L: 220
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "107"
	)
	@Export("updateSoundEffectVolume")
	void updateSoundEffectVolume(int var1) {
		this.soundEffectsVolume = var1; // L: 224
		SoundSystem.savePreferences(); // L: 225
	} // L: 226

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1825265297"
	)
	int method2497() {
		return this.soundEffectsVolume; // L: 229
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1384124032"
	)
	void method2481(int var1) {
		this.areaSoundEffectsVolume = var1; // L: 233
		SoundSystem.savePreferences(); // L: 234
	} // L: 235

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1799077602"
	)
	int method2499() {
		return this.areaSoundEffectsVolume; // L: 238
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-83522118"
	)
	void method2500(String var1) {
		this.rememberedUsername = var1; // L: 242
		SoundSystem.savePreferences(); // L: 243
	} // L: 244

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-919916182"
	)
	String method2545() {
		return this.rememberedUsername; // L: 247
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1162088376"
	)
	void method2502(int var1) {
		this.field1275 = var1; // L: 251
		SoundSystem.savePreferences(); // L: 252
	} // L: 253

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	int method2503() {
		return this.field1275; // L: 256
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "724225707"
	)
	void method2504(int var1) {
		this.windowMode = var1; // L: 260
		SoundSystem.savePreferences(); // L: 261
	} // L: 262

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1675025735"
	)
	int method2505() {
		return this.windowMode; // L: 265
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-1508652053"
	)
	void method2589(String var1, int var2) {
		int var3 = this.method2509(var1); // L: 269
		if (this.parameters.size() >= 10 && !this.parameters.containsKey(var3)) { // L: 270
			Iterator var4 = this.parameters.entrySet().iterator(); // L: 271
			var4.next(); // L: 272
			var4.remove(); // L: 273
		}

		this.parameters.put(var3, var2); // L: 275
		SoundSystem.savePreferences(); // L: 276
	} // L: 277

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-1879605728"
	)
	boolean method2507(String var1) {
		int var2 = this.method2509(var1); // L: 280
		return this.parameters.containsKey(var2); // L: 281
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-2142036926"
	)
	int method2508(String var1) {
		int var2 = this.method2509(var1); // L: 285
		return !this.parameters.containsKey(var2) ? 0 : (Integer)this.parameters.get(var2); // L: 286 287 289
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "14"
	)
	int method2509(String var1) {
		return GrandExchangeOfferAgeComparator.method6684(var1.toLowerCase()); // L: 293
	}
}
