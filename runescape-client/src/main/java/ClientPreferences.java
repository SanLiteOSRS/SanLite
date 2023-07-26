import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("as")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("aj")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("ag")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("az")
	@Export("displayFps")
	boolean displayFps;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1403799925
	)
	int field1288;
	@ObfuscatedName("ap")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1671115943
	)
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -278459181
	)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 860923845
	)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1429186969
	)
	int field1290;
	@ObfuscatedName("aa")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -860100157
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
		this.field1290 = -1;
		this.rememberedUsername = null;
		this.windowMode = 1;
		this.parameters = new LinkedHashMap();
		this.method2462(true); // L: 33
	} // L: 34

	@ObfuscatedSignature(
		descriptor = "(Lty;)V"
	)
	ClientPreferences(Buffer var1) {
		this.hideUsername = false;
		this.displayFps = false;
		this.brightness = 0.8D; // L: 23
		this.musicVolume = 127; // L: 24
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127; // L: 26
		this.field1290 = -1; // L: 27
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
					this.field1290 = var1.readUnsignedByte(); // L: 76
				}

				if (var2 > 8) { // L: 78
					this.displayFps = var1.readUnsignedByte() == 1; // L: 79
				}

				if (var2 > 9) { // L: 81
					this.field1288 = var1.readInt(); // L: 82
				}
			} else {
				this.method2462(true); // L: 43
			}
		} else {
			this.method2462(true); // L: 38
		}

	} // L: 86

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-46"
	)
	void method2462(boolean var1) {
	} // L: 88

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Lty;",
		garbageValue = "-819930938"
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
		var1.writeByte(this.field1290); // L: 110
		var1.writeByte(this.displayFps ? 1 : 0); // L: 111
		var1.writeInt(this.field1288); // L: 112
		return var1; // L: 113
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "100"
	)
	void method2464(boolean var1) {
		this.roofsHidden = var1; // L: 157
		GrandExchangeEvents.savePreferences(); // L: 158
	} // L: 159

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-38"
	)
	boolean method2465() {
		return this.roofsHidden; // L: 162
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "441049992"
	)
	void method2529(boolean var1) {
		this.hideUsername = var1; // L: 166
		GrandExchangeEvents.savePreferences(); // L: 167
	} // L: 168

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2023726507"
	)
	boolean method2467() {
		return this.hideUsername; // L: 171
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1734059763"
	)
	void method2468(boolean var1) {
		this.titleMusicDisabled = var1; // L: 175
		GrandExchangeEvents.savePreferences(); // L: 176
	} // L: 177

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1364267368"
	)
	boolean method2469() {
		return this.titleMusicDisabled; // L: 180
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "102997965"
	)
	void method2519(boolean var1) {
		this.displayFps = var1; // L: 184
		GrandExchangeEvents.savePreferences(); // L: 185
	} // L: 186

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-728222714"
	)
	void method2501() {
		this.method2519(!this.displayFps); // L: 189
	} // L: 190

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "19"
	)
	boolean method2546() {
		return this.displayFps; // L: 193
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-95805097"
	)
	void method2473(int var1) {
		this.field1288 = var1; // L: 197
		GrandExchangeEvents.savePreferences(); // L: 198
	} // L: 199

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-11415"
	)
	int method2461() {
		return this.field1288; // L: 202
	}

	@ObfuscatedName("au")
	void method2475(double var1) {
		this.brightness = var1; // L: 206
		GrandExchangeEvents.savePreferences(); // L: 207
	} // L: 208

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)D",
		garbageValue = "49"
	)
	double method2476() {
		return this.brightness; // L: 211
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1354981451"
	)
	void method2528(int var1) {
		this.musicVolume = var1; // L: 215
		GrandExchangeEvents.savePreferences(); // L: 216
	} // L: 217

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-54"
	)
	int method2478() {
		return this.musicVolume; // L: 220
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-65"
	)
	@Export("updateSoundEffectVolume")
	void updateSoundEffectVolume(int var1) {
		this.soundEffectsVolume = var1; // L: 224
		GrandExchangeEvents.savePreferences(); // L: 225
	} // L: 226

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-232317840"
	)
	int method2480() {
		return this.soundEffectsVolume; // L: 229
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-58"
	)
	void method2556(int var1) {
		this.areaSoundEffectsVolume = var1; // L: 233
		GrandExchangeEvents.savePreferences(); // L: 234
	} // L: 235

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "160605956"
	)
	int method2481() {
		return this.areaSoundEffectsVolume; // L: 238
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "-1250"
	)
	void method2482(String var1) {
		this.rememberedUsername = var1; // L: 242
		GrandExchangeEvents.savePreferences(); // L: 243
	} // L: 244

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "575676245"
	)
	String method2483() {
		return this.rememberedUsername; // L: 247
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2070702766"
	)
	void method2484(int var1) {
		this.field1290 = var1; // L: 251
		GrandExchangeEvents.savePreferences(); // L: 252
	} // L: 253

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2072184025"
	)
	int method2539() {
		return this.field1290; // L: 256
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1480770994"
	)
	void method2572(int var1) {
		this.windowMode = var1; // L: 260
		GrandExchangeEvents.savePreferences(); // L: 261
	} // L: 262

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-56"
	)
	int method2487() {
		return this.windowMode; // L: 265
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-159104125"
	)
	void method2488(String var1, int var2) {
		int var3 = this.method2491(var1); // L: 269
		if (this.parameters.size() >= 10 && !this.parameters.containsKey(var3)) { // L: 270
			Iterator var4 = this.parameters.entrySet().iterator(); // L: 271
			var4.next(); // L: 272
			var4.remove(); // L: 273
		}

		this.parameters.put(var3, var2); // L: 275
		GrandExchangeEvents.savePreferences(); // L: 276
	} // L: 277

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "1920162688"
	)
	boolean method2540(String var1) {
		int var2 = this.method2491(var1); // L: 280
		return this.parameters.containsKey(var2); // L: 281
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-458294629"
	)
	int method2490(String var1) {
		int var2 = this.method2491(var1); // L: 285
		return !this.parameters.containsKey(var2) ? 0 : (Integer)this.parameters.get(var2); // L: 286 287 289
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1679605451"
	)
	int method2491(String var1) {
		return ItemLayer.method4292(var1.toLowerCase()); // L: 293
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([Los;II)Los;",
		garbageValue = "-1385726051"
	)
	@Export("findEnumerated")
	public static class372 findEnumerated(class372[] var0, int var1) {
		class372[] var2 = var0; // L: 17

		for (int var3 = 0; var3 < var2.length; ++var3) {
			class372 var4 = var2[var3];
			if (var1 == var4.rsOrdinal()) {
				return var4;
			}
		}

		return null; // L: 25
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(FB)F",
		garbageValue = "-99"
	)
	public static final float method2577(float var0) {
		float var1 = 75.0F; // L: 18
		float var2 = 10000.0F; // L: 19
		float var3 = 750000.0F / (10000.0F - var0 * 9925.0F); // L: 20
		return (var3 - 75.0F) / 9925.0F; // L: 21
	}
}
