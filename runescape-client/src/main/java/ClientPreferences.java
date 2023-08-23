import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dp")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("ac")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("ai")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("az")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("ap")
	@Export("displayFps")
	boolean displayFps;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -2033437103
	)
	int field1305;
	@ObfuscatedName("af")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -2121204659
	)
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 148824169
	)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1998848961
	)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -451342601
	)
	int field1309;
	@ObfuscatedName("ar")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 321590221
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("ag")
	@Export("parameters")
	final Map parameters;

	ClientPreferences() {
		this.hideUsername = false;
		this.displayFps = false;
		this.brightness = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.field1309 = -1;
		this.rememberedUsername = null;
		this.windowMode = 1;
		this.parameters = new LinkedHashMap();
		this.method2445(true); // L: 33
	} // L: 34

	@ObfuscatedSignature(
		descriptor = "(Ltm;)V"
	)
	ClientPreferences(Buffer var1) {
		this.hideUsername = false;
		this.displayFps = false;
		this.brightness = 0.8D; // L: 23
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.field1309 = -1;
		this.rememberedUsername = null;
		this.windowMode = 1;
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

				if (var2 > 6) { // L: 69
					this.brightness = (double)var1.readUnsignedByte() / 100.0D; // L: 70
					this.musicVolume = var1.readUnsignedByte(); // L: 71
					this.soundEffectsVolume = var1.readUnsignedByte(); // L: 72
					this.areaSoundEffectsVolume = var1.readUnsignedByte(); // L: 73
				}

				if (var2 > 7) { // L: 75
					this.field1309 = var1.readUnsignedByte(); // L: 76
				}

				if (var2 > 8) { // L: 78
					this.displayFps = var1.readUnsignedByte() == 1; // L: 79
				}

				if (var2 > 9) { // L: 81
					this.field1305 = var1.readInt(); // L: 82
				}
			} else {
				this.method2445(true); // L: 43
			}
		} else {
			this.method2445(true); // L: 38
		}

	} // L: 86

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-35"
	)
	void method2445(boolean var1) {
	} // L: 88

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Ltm;",
		garbageValue = "1941143653"
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
		var1.writeByte(this.field1309); // L: 110
		var1.writeByte(this.displayFps ? 1 : 0); // L: 111
		var1.writeInt(this.field1305); // L: 112
		return var1; // L: 113
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "932955968"
	)
	void method2447(boolean var1) {
		this.roofsHidden = var1; // L: 133
		class338.savePreferences(); // L: 134
	} // L: 135

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-767626364"
	)
	boolean method2448() {
		return this.roofsHidden; // L: 138
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-211242200"
	)
	void method2494(boolean var1) {
		this.hideUsername = var1; // L: 142
		class338.savePreferences(); // L: 143
	} // L: 144

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1977526319"
	)
	boolean method2454() {
		return this.hideUsername; // L: 147
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-973658923"
	)
	void method2474(boolean var1) {
		this.titleMusicDisabled = var1; // L: 151
		class338.savePreferences(); // L: 152
	} // L: 153

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "120"
	)
	boolean method2484() {
		return this.titleMusicDisabled; // L: 156
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "534613668"
	)
	void method2452(boolean var1) {
		this.displayFps = var1; // L: 160
		class338.savePreferences(); // L: 161
	} // L: 162

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1847880996"
	)
	void method2453() {
		this.method2452(!this.displayFps); // L: 165
	} // L: 166

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1017741261"
	)
	boolean method2463() {
		return this.displayFps; // L: 169
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-11"
	)
	void method2455(int var1) {
		this.field1305 = var1; // L: 173
		class338.savePreferences(); // L: 174
	} // L: 175

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1963125343"
	)
	int method2456() {
		return this.field1305; // L: 178
	}

	@ObfuscatedName("ar")
	void method2516(double var1) {
		this.brightness = var1; // L: 182
		class338.savePreferences(); // L: 183
	} // L: 184

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)D",
		garbageValue = "-1673173244"
	)
	double method2505() {
		return this.brightness; // L: 187
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-631794357"
	)
	void method2458(int var1) {
		this.musicVolume = var1; // L: 191
		class338.savePreferences(); // L: 192
	} // L: 193

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "121"
	)
	int method2451() {
		return this.musicVolume; // L: 196
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-18"
	)
	@Export("updateSoundEffectVolume")
	void updateSoundEffectVolume(int var1) {
		this.soundEffectsVolume = var1; // L: 200
		class338.savePreferences(); // L: 201
	} // L: 202

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1509566185"
	)
	int method2462() {
		return this.soundEffectsVolume; // L: 205
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "291571755"
	)
	void method2556(int var1) {
		this.areaSoundEffectsVolume = var1; // L: 209
		class338.savePreferences(); // L: 210
	} // L: 211

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-76"
	)
	int method2554() {
		return this.areaSoundEffectsVolume; // L: 214
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1859632471"
	)
	void method2465(String var1) {
		this.rememberedUsername = var1; // L: 218
		class338.savePreferences(); // L: 219
	} // L: 220

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "63"
	)
	String method2466() {
		return this.rememberedUsername; // L: 223
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1109709806"
	)
	void method2547(int var1) {
		this.field1309 = var1; // L: 227
		class338.savePreferences(); // L: 228
	} // L: 229

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1749033471"
	)
	int method2468() {
		return this.field1309; // L: 232
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "23"
	)
	void method2469(int var1) {
		this.windowMode = var1; // L: 236
		class338.savePreferences(); // L: 237
	} // L: 238

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1232255249"
	)
	int method2470() {
		return this.windowMode; // L: 241
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-867564338"
	)
	void method2471(String var1, int var2) {
		int var3 = this.method2473(var1); // L: 245
		if (this.parameters.size() >= 10 && !this.parameters.containsKey(var3)) { // L: 246
			Iterator var4 = this.parameters.entrySet().iterator(); // L: 247
			var4.next(); // L: 248
			var4.remove(); // L: 249
		}

		this.parameters.put(var3, var2); // L: 251
		class338.savePreferences(); // L: 252
	} // L: 253

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-1796045546"
	)
	boolean method2472(String var1) {
		int var2 = this.method2473(var1); // L: 256
		return this.parameters.containsKey(var2); // L: 257
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)I",
		garbageValue = "-25926"
	)
	int method2506(String var1) {
		int var2 = this.method2473(var1); // L: 261
		return !this.parameters.containsKey(var2) ? 0 : (Integer)this.parameters.get(var2); // L: 262 263 265
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "-112"
	)
	int method2473(String var1) {
		return VarbitComposition.method3800(var1.toLowerCase()); // L: 269
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1544580715"
	)
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var1 = class384.method7145(var0); // L: 24
		int var2 = var1.baseVar; // L: 25
		int var3 = var1.startBit;
		int var4 = var1.endBit;
		int var5 = Varps.Varps_masks[var4 - var3];
		return Varps.Varps_main[var2] >> var3 & var5;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "31"
	)
	public static final boolean method2555(char var0) {
		if (Character.isISOControl(var0)) { // L: 16
			return false;
		} else if (WorldMapLabel.isAlphaNumeric(var0)) { // L: 17
			return true;
		} else {
			char[] var1 = class493.field5002; // L: 19

			int var2;
			char var3;
			for (var2 = 0; var2 < var1.length; ++var2) { // L: 20
				var3 = var1[var2]; // L: 21
				if (var0 == var3) { // L: 22
					return true;
				}
			}

			var1 = class493.field5001; // L: 26

			for (var2 = 0; var2 < var1.length; ++var2) { // L: 27
				var3 = var1[var2]; // L: 28
				if (var0 == var3) {
					return true; // L: 29
				}
			}

			return false; // L: 32
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ltm;J)V"
	)
	static void method2464(Buffer var0, long var1) {
		var1 /= 10L; // L: 63
		if (var1 < 0L) { // L: 64
			var1 = 0L;
		} else if (var1 > 65535L) { // L: 65
			var1 = 65535L;
		}

		var0.writeShort((int)var1); // L: 66
	} // L: 67

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-51"
	)
	public static int method2552(int var0) {
		class137 var1 = class338.method6589(var0); // L: 353
		if (var1 == null) { // L: 354
			return 2; // L: 355
		} else {
			return var1.method3068() ? 0 : 1; // L: 357
		}
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIS)V",
		garbageValue = "10324"
	)
	static final void method2475(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		PendingSpawn var10 = null; // L: 8374

		for (PendingSpawn var11 = (PendingSpawn)Client.pendingSpawns.last(); var11 != null; var11 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 8375 8376 8381
			if (var0 == var11.plane && var11.x == var1 && var2 == var11.y && var3 == var11.type) { // L: 8377
				var10 = var11; // L: 8378
				break;
			}
		}

		if (var10 == null) { // L: 8383
			var10 = new PendingSpawn(); // L: 8384
			var10.plane = var0; // L: 8385
			var10.type = var3; // L: 8386
			var10.x = var1; // L: 8387
			var10.y = var2; // L: 8388
			var10.field1190 = -1; // L: 8389
			PacketWriter.method2805(var10); // L: 8390
			Client.pendingSpawns.addFirst(var10); // L: 8391
		}

		var10.field1187 = var4; // L: 8393
		var10.field1183 = var5; // L: 8394
		var10.field1189 = var6; // L: 8395
		var10.delay = var8; // L: 8396
		var10.hitpoints = var9; // L: 8397
		var10.method2360(var7); // L: 8398
	} // L: 8399
}
