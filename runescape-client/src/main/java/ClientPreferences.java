import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1849447049
	)
	@Export("ClientPreferences_optionCount")
	static int ClientPreferences_optionCount;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lqr;"
	)
	@Export("NetCache_responseArchiveBuffer")
	public static Buffer NetCache_responseArchiveBuffer;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 546312455
	)
	static int field1245;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("jn")
	@ObfuscatedGetter(
		intValue = 1468675189
	)
	@Export("cameraYaw")
	static int cameraYaw;
	@ObfuscatedName("w")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("v")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("c")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("q")
	@Export("displayFps")
	boolean displayFps;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1551707667
	)
	int field1240;
	@ObfuscatedName("k")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 798414231
	)
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1689386949
	)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -608443659
	)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1481673311
	)
	int field1241;
	@ObfuscatedName("m")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 296751793
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("l")
	@Export("parameters")
	LinkedHashMap parameters;

	static {
		ClientPreferences_optionCount = 10; // L: 11
	}

	ClientPreferences() {
		this.hideUsername = false;
		this.displayFps = false;
		this.brightness = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.field1241 = -1;
		this.rememberedUsername = null;
		this.windowMode = 1;
		this.parameters = new LinkedHashMap();
		this.method2221(true); // L: 28
	} // L: 29

	@ObfuscatedSignature(
		descriptor = "(Lqr;)V"
	)
	ClientPreferences(Buffer var1) {
		this.hideUsername = false; // L: 14
		this.displayFps = false; // L: 16
		this.brightness = 0.8D; // L: 18
		this.musicVolume = 127; // L: 19
		this.soundEffectsVolume = 127; // L: 20
		this.areaSoundEffectsVolume = 127; // L: 21
		this.field1241 = -1; // L: 22
		this.rememberedUsername = null; // L: 23
		this.windowMode = 1; // L: 24
		this.parameters = new LinkedHashMap(); // L: 25
		if (var1 != null && var1.array != null) { // L: 32
			int var2 = var1.readUnsignedByte(); // L: 36
			if (var2 >= 0 && var2 <= ClientPreferences_optionCount) { // L: 37
				if (var1.readUnsignedByte() == 1) { // L: 41
					this.roofsHidden = true; // L: 42
				}

				if (var2 > 1) {
					this.titleMusicDisabled = var1.readUnsignedByte() == 1; // L: 45
				}

				if (var2 > 3) { // L: 47
					this.windowMode = var1.readUnsignedByte(); // L: 48
				}

				if (var2 > 2) { // L: 50
					int var3 = var1.readUnsignedByte(); // L: 51

					for (int var4 = 0; var4 < var3; ++var4) { // L: 52
						int var5 = var1.readInt(); // L: 53
						int var6 = var1.readInt(); // L: 54
						this.parameters.put(var5, var6); // L: 55
					}
				}

				if (var2 > 4) { // L: 58
					this.rememberedUsername = var1.readStringCp1252NullTerminatedOrNull(); // L: 59
				}

				if (var2 > 5) { // L: 61
					this.hideUsername = var1.readBoolean(); // L: 62
				}

				if (var2 > 6) { // L: 64
					this.brightness = (double)var1.readUnsignedByte() / 100.0D; // L: 65
					this.musicVolume = var1.readUnsignedByte(); // L: 66
					this.soundEffectsVolume = var1.readUnsignedByte(); // L: 67
					this.areaSoundEffectsVolume = var1.readUnsignedByte(); // L: 68
				}

				if (var2 > 7) { // L: 70
					this.field1241 = var1.readUnsignedByte(); // L: 71
				}

				if (var2 > 8) { // L: 73
					this.displayFps = var1.readUnsignedByte() == 1; // L: 74
				}

				if (var2 > 9) { // L: 76
					this.field1240 = var1.readInt(); // L: 77
				}
			} else {
				this.method2221(true); // L: 38
			}
		} else {
			this.method2221(true); // L: 33
		}

	} // L: 81

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "285882004"
	)
	void method2221(boolean var1) {
	} // L: 83

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Lqr;",
		garbageValue = "2077502173"
	)
	@Export("toBuffer")
	Buffer toBuffer() {
		Buffer var1 = new Buffer(100); // L: 86
		var1.writeByte(ClientPreferences_optionCount); // L: 87
		var1.writeByte(this.roofsHidden ? 1 : 0); // L: 88
		var1.writeByte(this.titleMusicDisabled ? 1 : 0); // L: 89
		var1.writeByte(this.windowMode); // L: 90
		var1.writeByte(this.parameters.size()); // L: 91
		Iterator var2 = this.parameters.entrySet().iterator(); // L: 92

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next(); // L: 93
			var1.writeInt((Integer)var3.getKey()); // L: 95
			var1.writeInt((Integer)var3.getValue()); // L: 96
		}

		var1.writeStringCp1252NullTerminated(this.rememberedUsername != null ? this.rememberedUsername : ""); // L: 99
		var1.writeBoolean(this.hideUsername); // L: 100
		var1.writeByte((int)(100.0D * this.brightness)); // L: 101
		var1.writeByte(this.musicVolume); // L: 102
		var1.writeByte(this.soundEffectsVolume); // L: 103
		var1.writeByte(this.areaSoundEffectsVolume); // L: 104
		var1.writeByte(this.field1241); // L: 105
		var1.writeByte(this.displayFps ? 1 : 0); // L: 106
		var1.writeInt(this.field1240); // L: 107
		return var1; // L: 108
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1245363455"
	)
	void method2241(boolean var1) {
		this.roofsHidden = var1; // L: 128
		class83.savePreferences(); // L: 129
	} // L: 130

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "174409666"
	)
	boolean method2209() {
		return this.roofsHidden; // L: 133
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1424806446"
	)
	void method2210(boolean var1) {
		this.hideUsername = var1; // L: 137
		class83.savePreferences(); // L: 138
	} // L: 139

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1653420381"
	)
	boolean method2211() {
		return this.hideUsername; // L: 142
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "121825973"
	)
	void method2212(boolean var1) {
		this.titleMusicDisabled = var1; // L: 146
		class83.savePreferences(); // L: 147
	} // L: 148

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1529007775"
	)
	boolean method2213() {
		return this.titleMusicDisabled; // L: 151
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-25"
	)
	void method2276(boolean var1) {
		this.displayFps = var1; // L: 155
		class83.savePreferences(); // L: 156
	} // L: 157

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-245844861"
	)
	void method2255() {
		this.method2276(!this.displayFps); // L: 160
	} // L: 161

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "744050622"
	)
	boolean method2216() {
		return this.displayFps; // L: 164
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1413642376"
	)
	void method2217(int var1) {
		this.field1240 = var1; // L: 168
		class83.savePreferences(); // L: 169
	} // L: 170

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1323232903"
	)
	int method2218() {
		return this.field1240; // L: 173
	}

	@ObfuscatedName("l")
	void method2234(double var1) {
		this.brightness = var1; // L: 177
		class83.savePreferences(); // L: 178
	} // L: 179

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(S)D",
		garbageValue = "20495"
	)
	double method2220() {
		return this.brightness; // L: 182
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "4"
	)
	void method2224(int var1) {
		this.musicVolume = var1; // L: 186
		class83.savePreferences(); // L: 187
	} // L: 188

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "807829996"
	)
	int method2222() {
		return this.musicVolume; // L: 191
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1777260479"
	)
	@Export("updateSoundEffectVolume")
	void updateSoundEffectVolume(int var1) {
		this.soundEffectsVolume = var1; // L: 195
		class83.savePreferences(); // L: 196
	} // L: 197

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2022982328"
	)
	int method2204() {
		return this.soundEffectsVolume; // L: 200
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "22"
	)
	void method2225(int var1) {
		this.areaSoundEffectsVolume = var1; // L: 204
		class83.savePreferences(); // L: 205
	} // L: 206

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-963216332"
	)
	int method2226() {
		return this.areaSoundEffectsVolume; // L: 209
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1592880074"
	)
	void method2268(String var1) {
		this.rememberedUsername = var1; // L: 213
		class83.savePreferences(); // L: 214
	} // L: 215

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1574056178"
	)
	String method2227() {
		return this.rememberedUsername; // L: 218
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1056396306"
	)
	void method2228(int var1) {
		this.field1241 = var1; // L: 222
		class83.savePreferences(); // L: 223
	} // L: 224

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "76"
	)
	int method2229() {
		return this.field1241; // L: 227
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1468848973"
	)
	void method2244(int var1) {
		this.windowMode = var1; // L: 231
		class83.savePreferences(); // L: 232
	} // L: 233

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1353353753"
	)
	int method2231() {
		return this.windowMode; // L: 236
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Lbb;",
		garbageValue = "-30419640"
	)
	@Export("Messages_getMessage")
	static Message Messages_getMessage(int var0) {
		return (Message)Messages.Messages_hashTable.get((long)var0); // L: 44
	}
}
