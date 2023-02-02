import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("archive8")
	static Archive archive8;
	@ObfuscatedName("m")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("q")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("f")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("r")
	@Export("displayFps")
	boolean displayFps;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 150827165
	)
	int field1296;
	@ObfuscatedName("b")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -631517997
	)
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1737283137
	)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1250836455
	)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1676041029
	)
	int field1300;
	@ObfuscatedName("n")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -628738235
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("a")
	@Export("parameters")
	final Map parameters;

	ClientPreferences() {
		this.hideUsername = false;
		this.displayFps = false;
		this.brightness = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.field1300 = -1;
		this.rememberedUsername = null;
		this.windowMode = 1;
		this.parameters = new LinkedHashMap();
		this.method2409(true); // L: 33
	} // L: 34

	@ObfuscatedSignature(
		descriptor = "(Lqy;)V"
	)
	ClientPreferences(Buffer var1) {
		this.hideUsername = false; // L: 19
		this.displayFps = false;
		this.brightness = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127; // L: 25
		this.areaSoundEffectsVolume = 127; // L: 26
		this.field1300 = -1; // L: 27
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
					this.field1300 = var1.readUnsignedByte(); // L: 76
				}

				if (var2 > 8) { // L: 78
					this.displayFps = var1.readUnsignedByte() == 1; // L: 79
				}

				if (var2 > 9) { // L: 81
					this.field1296 = var1.readInt(); // L: 82
				}
			} else {
				this.method2409(true); // L: 43
			}
		} else {
			this.method2409(true); // L: 38
		}

	} // L: 86

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "1"
	)
	void method2409(boolean var1) {
	} // L: 88

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Lqy;",
		garbageValue = "-1732648006"
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
			var1.method8536((Integer)var3.getKey()); // L: 100
			var1.method8536((Integer)var3.getValue()); // L: 101
		}

		var1.writeStringCp1252NullTerminated(this.rememberedUsername != null ? this.rememberedUsername : ""); // L: 104
		var1.writeBoolean(this.hideUsername); // L: 105
		var1.writeByte((int)(this.brightness * 100.0D)); // L: 106
		var1.writeByte(this.musicVolume); // L: 107
		var1.writeByte(this.soundEffectsVolume); // L: 108
		var1.writeByte(this.areaSoundEffectsVolume); // L: 109
		var1.writeByte(this.field1300); // L: 110
		var1.writeByte(this.displayFps ? 1 : 0); // L: 111
		var1.method8536(this.field1296); // L: 112
		return var1; // L: 113
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "533129640"
	)
	void method2486(boolean var1) {
		this.roofsHidden = var1; // L: 157
		Tile.savePreferences(); // L: 158
	} // L: 159

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "105464922"
	)
	boolean method2412() {
		return this.roofsHidden; // L: 162
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "64"
	)
	void method2461(boolean var1) {
		this.hideUsername = var1; // L: 166
		Tile.savePreferences(); // L: 167
	} // L: 168

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1900607558"
	)
	boolean method2413() {
		return this.hideUsername; // L: 171
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "7"
	)
	void method2448(boolean var1) {
		this.titleMusicDisabled = var1; // L: 175
		Tile.savePreferences(); // L: 176
	} // L: 177

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "39"
	)
	boolean method2428() {
		return this.titleMusicDisabled; // L: 180
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "8323"
	)
	void method2470(boolean var1) {
		this.displayFps = var1; // L: 184
		Tile.savePreferences(); // L: 185
	} // L: 186

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "141048333"
	)
	void method2433() {
		this.method2470(!this.displayFps); // L: 189
	} // L: 190

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1316033707"
	)
	boolean method2419() {
		return this.displayFps; // L: 193
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "54"
	)
	void method2420(int var1) {
		this.field1296 = var1; // L: 197
		Tile.savePreferences(); // L: 198
	} // L: 199

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1786491107"
	)
	int method2421() {
		return this.field1296; // L: 202
	}

	@ObfuscatedName("k")
	void method2475(double var1) {
		this.brightness = var1; // L: 206
		Tile.savePreferences(); // L: 207
	} // L: 208

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)D",
		garbageValue = "2073863373"
	)
	double method2422() {
		return this.brightness; // L: 211
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "18863"
	)
	void method2414(int var1) {
		this.musicVolume = var1; // L: 215
		Tile.savePreferences(); // L: 216
	} // L: 217

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-5026"
	)
	int method2425() {
		return this.musicVolume; // L: 220
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-25"
	)
	@Export("updateSoundEffectVolume")
	void updateSoundEffectVolume(int var1) {
		this.soundEffectsVolume = var1; // L: 224
		Tile.savePreferences(); // L: 225
	} // L: 226

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1444608091"
	)
	int method2426() {
		return this.soundEffectsVolume; // L: 229
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-315220076"
	)
	void method2427(int var1) {
		this.areaSoundEffectsVolume = var1; // L: 233
		Tile.savePreferences(); // L: 234
	} // L: 235

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1615345308"
	)
	int method2506() {
		return this.areaSoundEffectsVolume; // L: 238
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1040224572"
	)
	void method2429(String var1) {
		this.rememberedUsername = var1; // L: 242
		Tile.savePreferences(); // L: 243
	} // L: 244

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-10"
	)
	String method2430() {
		return this.rememberedUsername; // L: 247
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1027292403"
	)
	void method2431(int var1) {
		this.field1300 = var1; // L: 251
		Tile.savePreferences(); // L: 252
	} // L: 253

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1999692147"
	)
	int method2424() {
		return this.field1300; // L: 256
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-9009"
	)
	void method2460(int var1) {
		this.windowMode = var1; // L: 260
		Tile.savePreferences(); // L: 261
	} // L: 262

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1455962060"
	)
	int method2434() {
		return this.windowMode; // L: 265
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "8447783"
	)
	void method2435(String var1, int var2) {
		int var3 = this.method2438(var1); // L: 269
		if (this.parameters.size() >= 10 && !this.parameters.containsKey(var3)) { // L: 270
			Iterator var4 = this.parameters.entrySet().iterator(); // L: 271
			var4.next(); // L: 272
			var4.remove(); // L: 273
		}

		this.parameters.put(var3, var2); // L: 275
		Tile.savePreferences(); // L: 276
	} // L: 277

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-2059825929"
	)
	boolean method2436(String var1) {
		int var2 = this.method2438(var1); // L: 280
		return this.parameters.containsKey(var2); // L: 281
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-2095892809"
	)
	int method2437(String var1) {
		int var2 = this.method2438(var1); // L: 285
		return !this.parameters.containsKey(var2) ? 0 : (Integer)this.parameters.get(var2); // L: 286 287 289
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "41"
	)
	int method2438(String var1) {
		String var3 = var1.toLowerCase(); // L: 294
		int var4 = var3.length(); // L: 296
		int var5 = 0; // L: 297

		for (int var6 = 0; var6 < var4; ++var6) { // L: 298
			var5 = (var5 << 5) - var5 + var3.charAt(var6);
		}

		return var5; // L: 301
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1700481860"
	)
	@Export("ItemContainer_getCount")
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 21
		if (var2 == null) { // L: 22
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0; // L: 23 24
		}
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(Lct;II)V",
		garbageValue = "-935643958"
	)
	static final void method2513(Actor var0, int var1) {
		ScriptFrame.worldToScreen(var0.x, var0.y, var1); // L: 5478
	} // L: 5479
}
