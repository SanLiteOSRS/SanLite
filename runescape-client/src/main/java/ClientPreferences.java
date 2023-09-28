import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dy")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 839650701
	)
	static int field1295;
	@ObfuscatedName("ao")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("ah")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("ar")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("ab")
	@Export("displayFps")
	boolean displayFps;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1065224631
	)
	int field1308;
	@ObfuscatedName("av")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 674895671
	)
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 834160931
	)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1096046381
	)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -400941645
	)
	int field1298;
	@ObfuscatedName("as")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1748491441
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("an")
	@Export("parameters")
	final Map parameters;

	ClientPreferences() {
		this.hideUsername = false;
		this.displayFps = false;
		this.brightness = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.field1298 = -1;
		this.rememberedUsername = null;
		this.windowMode = 1;
		this.parameters = new LinkedHashMap();
		this.method2499(true); // L: 33
	} // L: 34

	@ObfuscatedSignature(
		descriptor = "(Lul;)V"
	)
	ClientPreferences(Buffer var1) {
		this.hideUsername = false; // L: 19
		this.displayFps = false; // L: 21
		this.brightness = 0.8D; // L: 23
		this.musicVolume = 127; // L: 24
		this.soundEffectsVolume = 127; // L: 25
		this.areaSoundEffectsVolume = 127; // L: 26
		this.field1298 = -1; // L: 27
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
					this.field1298 = var1.readUnsignedByte(); // L: 76
				}

				if (var2 > 8) { // L: 78
					this.displayFps = var1.readUnsignedByte() == 1; // L: 79
				}

				if (var2 > 9) { // L: 81
					this.field1308 = var1.readInt(); // L: 82
				}
			} else {
				this.method2499(true); // L: 43
			}
		} else {
			this.method2499(true); // L: 38
		}

	} // L: 86

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "12"
	)
	void method2499(boolean var1) {
	} // L: 88

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lul;",
		garbageValue = "2143107784"
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
		var1.writeByte(this.field1298); // L: 110
		var1.writeByte(this.displayFps ? 1 : 0); // L: 111
		var1.writeInt(this.field1308); // L: 112
		return var1; // L: 113
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "5523"
	)
	void method2558(boolean var1) {
		this.roofsHidden = var1; // L: 157
		class144.savePreferences(); // L: 158
	} // L: 159

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-16777216"
	)
	boolean method2502() {
		return this.roofsHidden; // L: 162
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-118"
	)
	void method2531(boolean var1) {
		this.hideUsername = var1; // L: 166
		class144.savePreferences(); // L: 167
	} // L: 168

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2079873029"
	)
	boolean method2504() {
		return this.hideUsername; // L: 171
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1738158187"
	)
	void method2505(boolean var1) {
		this.titleMusicDisabled = var1; // L: 175
		class144.savePreferences(); // L: 176
	} // L: 177

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-76"
	)
	boolean method2503() {
		return this.titleMusicDisabled; // L: 180
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1239790948"
	)
	void method2573(boolean var1) {
		this.displayFps = var1; // L: 184
		class144.savePreferences(); // L: 185
	} // L: 186

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-448178452"
	)
	void method2508() {
		this.method2573(!this.displayFps); // L: 189
	} // L: 190

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1788161752"
	)
	boolean method2523() {
		return this.displayFps; // L: 193
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "34"
	)
	void method2516(int var1) {
		this.field1308 = var1; // L: 197
		class144.savePreferences(); // L: 198
	} // L: 199

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-67"
	)
	int method2564() {
		return this.field1308; // L: 202
	}

	@ObfuscatedName("aj")
	void method2506(double var1) {
		this.brightness = var1; // L: 206
		class144.savePreferences(); // L: 207
	} // L: 208

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)D",
		garbageValue = "579802004"
	)
	double method2513() {
		return this.brightness; // L: 211
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "428446104"
	)
	void method2514(int var1) {
		this.musicVolume = var1; // L: 215
		class144.savePreferences(); // L: 216
	} // L: 217

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "813225298"
	)
	int method2515() {
		return this.musicVolume; // L: 220
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1930056928"
	)
	@Export("updateSoundEffectVolume")
	void updateSoundEffectVolume(int var1) {
		this.soundEffectsVolume = var1; // L: 224
		class144.savePreferences(); // L: 225
	} // L: 226

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "440195040"
	)
	int method2517() {
		return this.soundEffectsVolume; // L: 229
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1563658200"
	)
	void method2518(int var1) {
		this.areaSoundEffectsVolume = var1; // L: 233
		class144.savePreferences(); // L: 234
	} // L: 235

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-40"
	)
	int method2589() {
		return this.areaSoundEffectsVolume; // L: 238
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "8224"
	)
	void method2520(String var1) {
		this.rememberedUsername = var1; // L: 242
		class144.savePreferences(); // L: 243
	} // L: 244

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "222957667"
	)
	String method2576() {
		return this.rememberedUsername; // L: 247
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "305556660"
	)
	void method2522(int var1) {
		this.field1298 = var1; // L: 251
		class144.savePreferences(); // L: 252
	} // L: 253

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2047489929"
	)
	int method2562() {
		return this.field1298; // L: 256
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1603412139"
	)
	void method2524(int var1) {
		this.windowMode = var1; // L: 260
		class144.savePreferences(); // L: 261
	} // L: 262

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-453513391"
	)
	int method2525() {
		return this.windowMode; // L: 265
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "1984702450"
	)
	void method2583(String var1, int var2) {
		int var3 = this.method2529(var1); // L: 269
		if (this.parameters.size() >= 10 && !this.parameters.containsKey(var3)) { // L: 270
			Iterator var4 = this.parameters.entrySet().iterator(); // L: 271
			var4.next(); // L: 272
			var4.remove(); // L: 273
		}

		this.parameters.put(var3, var2); // L: 275
		class144.savePreferences(); // L: 276
	} // L: 277

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-754165935"
	)
	boolean method2527(String var1) {
		int var2 = this.method2529(var1); // L: 280
		return this.parameters.containsKey(var2); // L: 281
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-558374148"
	)
	int method2510(String var1) {
		int var2 = this.method2529(var1); // L: 285
		return !this.parameters.containsKey(var2) ? 0 : (Integer)this.parameters.get(var2); // L: 286 287 289
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1498275662"
	)
	int method2529(String var1) {
		return PacketWriter.method2809(var1.toLowerCase()); // L: 293
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZS)I",
		garbageValue = "-14036"
	)
	static int method2572(int var0, Script var1, boolean var2) {
		int var3 = -1; // L: 573
		Widget var4;
		if (var0 >= 2000) { // L: 575
			var0 -= 1000; // L: 576
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 577
			var4 = class33.field184.method6240(var3); // L: 578
		} else {
			var4 = var2 ? class416.scriptDotWidget : class306.field3131; // L: 580
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) { // L: 581
			Interpreter.Interpreter_intStackSize -= 4; // L: 582
			var4.rawX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 583
			var4.rawY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 584
			var4.xAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 585
			var4.yAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 586
			ClanChannelMember.invalidateWidget(var4); // L: 587
			class159.client.alignWidget(var4); // L: 588
			if (var3 != -1 && var4.type == 0) { // L: 589
				PendingSpawn.revalidateWidgetScroll(class33.field184.field3587[var3 >> 16], var4, false);
			}

			return 1; // L: 590
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) { // L: 592
			Interpreter.Interpreter_intStackSize -= 4; // L: 593
			var4.rawWidth = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 594
			var4.rawHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 595
			var4.widthAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 596
			var4.heightAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 597
			ClanChannelMember.invalidateWidget(var4); // L: 598
			class159.client.alignWidget(var4); // L: 599
			if (var3 != -1 && var4.type == 0) { // L: 600
				PendingSpawn.revalidateWidgetScroll(class33.field184.field3587[var3 >> 16], var4, false);
			}

			return 1; // L: 601
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) { // L: 603
			boolean var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 604
			if (var5 != var4.isHidden) { // L: 605
				var4.isHidden = var5; // L: 606
				ClanChannelMember.invalidateWidget(var4); // L: 607
			}

			return 1; // L: 609
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) { // L: 611
			var4.noClickThrough = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 612
			return 1; // L: 613
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) { // L: 615
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 616
			return 1; // L: 617
		} else {
			return 2; // L: 619
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[Lem;",
		garbageValue = "1083227717"
	)
	static AttackOption[] method2604() {
		return new AttackOption[]{AttackOption.field1346, AttackOption.field1348, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_hidden, AttackOption.AttackOption_alwaysRightClick}; // L: 12999
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-29"
	)
	static final int method2602(int var0, int var1) {
		int var2 = var1 * 57 + var0; // L: 969
		var2 ^= var2 << 13; // L: 970
		int var3 = var2 * (var2 * var2 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE; // L: 971
		return var3 >> 19 & 255; // L: 972
	}
}
