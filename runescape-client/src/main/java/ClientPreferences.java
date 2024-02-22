import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("df")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	static Task field1324;
	@ObfuscatedName("ar")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("as")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("aa")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("az")
	@Export("displayFps")
	boolean displayFps;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1866097351
	)
	int field1315;
	@ObfuscatedName("au")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 736040543
	)
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1932975703
	)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -375148259
	)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1759293937
	)
	int field1320;
	@ObfuscatedName("ax")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1287239755
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
		this.field1320 = -1;
		this.rememberedUsername = null;
		this.windowMode = 1;
		this.parameters = new LinkedHashMap();
		this.method2551(true); // L: 33
	} // L: 34

	@ObfuscatedSignature(
		descriptor = "(Luq;)V"
	)
	ClientPreferences(Buffer var1) {
		this.hideUsername = false; // L: 19
		this.displayFps = false; // L: 21
		this.brightness = 0.8D; // L: 23
		this.musicVolume = 127; // L: 24
		this.soundEffectsVolume = 127; // L: 25
		this.areaSoundEffectsVolume = 127; // L: 26
		this.field1320 = -1; // L: 27
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

				if (var2 > 2) {
					int var3 = var1.readUnsignedByte();

					for (int var4 = 0; var4 < var3; ++var4) {
						int var5 = var1.readInt();
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
					this.musicVolume = var1.readUnsignedByte();
					this.soundEffectsVolume = var1.readUnsignedByte();
					this.areaSoundEffectsVolume = var1.readUnsignedByte();
				}

				if (var2 > 7) {
					this.field1320 = var1.readUnsignedByte();
				}

				if (var2 > 8) { // L: 78
					this.displayFps = var1.readUnsignedByte() == 1; // L: 79
				}

				if (var2 > 9) { // L: 81
					this.field1315 = var1.readInt(); // L: 82
				}
			} else {
				this.method2551(true); // L: 43
			}
		} else {
			this.method2551(true); // L: 38
		}

	} // L: 86

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1072051283"
	)
	void method2551(boolean var1) {
	} // L: 88

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)Luq;",
		garbageValue = "3"
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
		var1.writeByte((int)(this.brightness * 100.0D)); // L: 106
		var1.writeByte(this.musicVolume); // L: 107
		var1.writeByte(this.soundEffectsVolume); // L: 108
		var1.writeByte(this.areaSoundEffectsVolume); // L: 109
		var1.writeByte(this.field1320); // L: 110
		var1.writeByte(this.displayFps ? 1 : 0); // L: 111
		var1.writeInt(this.field1315); // L: 112
		return var1; // L: 113
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-11"
	)
	void method2530(boolean var1) {
		this.roofsHidden = var1; // L: 157
		class160.savePreferences(); // L: 158
	} // L: 159

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	boolean method2635() {
		return this.roofsHidden; // L: 162
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "131184855"
	)
	void method2532(boolean var1) {
		this.hideUsername = var1; // L: 166
		class160.savePreferences(); // L: 167
	} // L: 168

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	boolean method2533() {
		return this.hideUsername; // L: 171
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1025729054"
	)
	void method2534(boolean var1) {
		this.titleMusicDisabled = var1; // L: 175
		class160.savePreferences(); // L: 176
	} // L: 177

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "53"
	)
	boolean method2580() {
		return this.titleMusicDisabled; // L: 180
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-822599346"
	)
	void method2563(boolean var1) {
		this.displayFps = var1; // L: 184
		class160.savePreferences(); // L: 185
	} // L: 186

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-876252989"
	)
	void method2631() {
		this.method2563(!this.displayFps); // L: 189
	} // L: 190

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1588774685"
	)
	boolean method2637() {
		return this.displayFps; // L: 193
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "53"
	)
	void method2564(int var1) {
		this.field1315 = var1; // L: 197
		class160.savePreferences(); // L: 198
	} // L: 199

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "997972984"
	)
	int method2526() {
		return this.field1315; // L: 202
	}

	@ObfuscatedName("an")
	void method2538(double var1) {
		this.brightness = var1; // L: 206
		class160.savePreferences(); // L: 207
	} // L: 208

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)D",
		garbageValue = "1359471924"
	)
	double method2542() {
		return this.brightness; // L: 211
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-81"
	)
	void method2556(int var1) {
		this.musicVolume = var1; // L: 215
		class160.savePreferences(); // L: 216
	} // L: 217

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1645311515"
	)
	int method2544() {
		return this.musicVolume; // L: 220
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "490129715"
	)
	@Export("updateSoundEffectVolume")
	void updateSoundEffectVolume(int var1) {
		this.soundEffectsVolume = var1; // L: 224
		class160.savePreferences(); // L: 225
	} // L: 226

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-102"
	)
	int method2622() {
		return this.soundEffectsVolume; // L: 229
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "302385188"
	)
	void method2546(int var1) {
		this.areaSoundEffectsVolume = var1; // L: 233
		class160.savePreferences(); // L: 234
	} // L: 235

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "987"
	)
	int method2572() {
		return this.areaSoundEffectsVolume; // L: 238
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1994504415"
	)
	void method2548(String var1) {
		this.rememberedUsername = var1; // L: 242
		class160.savePreferences(); // L: 243
	} // L: 244

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-692692162"
	)
	String method2629() {
		return this.rememberedUsername; // L: 247
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1245445754"
	)
	void method2550(int var1) {
		this.field1320 = var1; // L: 251
		class160.savePreferences(); // L: 252
	} // L: 253

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1822932671"
	)
	int method2539() {
		return this.field1320; // L: 256
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "894528462"
	)
	void method2552(int var1) {
		this.windowMode = var1; // L: 260
		class160.savePreferences(); // L: 261
	} // L: 262

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-250363242"
	)
	int method2553() {
		return this.windowMode; // L: 265
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IS)V",
		garbageValue = "-16399"
	)
	void method2573(String var1, int var2) {
		int var3 = this.method2557(var1); // L: 269
		if (this.parameters.size() >= 10 && !this.parameters.containsKey(var3)) { // L: 270
			Iterator var4 = this.parameters.entrySet().iterator(); // L: 271
			var4.next(); // L: 272
			var4.remove(); // L: 273
		}

		this.parameters.put(var3, var2); // L: 275
		class160.savePreferences(); // L: 276
	} // L: 277

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-1007980205"
	)
	boolean method2555(String var1) {
		int var2 = this.method2557(var1); // L: 280
		return this.parameters.containsKey(var2); // L: 281
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1382916780"
	)
	int method2536(String var1) {
		int var2 = this.method2557(var1); // L: 285
		return !this.parameters.containsKey(var2) ? 0 : (Integer)this.parameters.get(var2); // L: 286 287 289
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "894618712"
	)
	int method2557(String var1) {
		return class130.method3069(var1.toLowerCase()); // L: 293
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "8"
	)
	static int method2540(int var0, int var1, int var2) {
		if (var2 > 179) { // L: 71
			var1 /= 2;
		}

		if (var2 > 192) { // L: 72
			var1 /= 2;
		}

		if (var2 > 217) { // L: 73
			var1 /= 2;
		}

		if (var2 > 243) { // L: 74
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2; // L: 75
		return var3; // L: 76
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1154508453"
	)
	static void method2638() {
		Messages.Messages_channels.clear(); // L: 54
		Messages.Messages_hashTable.clear(); // L: 55
		Messages.Messages_queue.clear(); // L: 56
		Messages.Messages_count = 0; // L: 57
	} // L: 58

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Ldz;IB)V",
		garbageValue = "-3"
	)
	static final void method2639(Actor var0, int var1) {
		ClanChannelMember.worldToScreen(var0.x, var0.y, var1); // L: 5765
	} // L: 5766
}
