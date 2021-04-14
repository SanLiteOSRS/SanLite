import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cm")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -2043822785
	)
	@Export("ClientPreferences_optionCount")
	static int ClientPreferences_optionCount;
	@ObfuscatedName("u")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("p")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1525185657
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("e")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("k")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("g")
	double field1304;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1506536185
	)
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 285061551
	)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1453902285
	)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("m")
	@Export("parameters")
	LinkedHashMap parameters;

	static {
		ClientPreferences_optionCount = 7;
	}

	ClientPreferences() {
		this.windowMode = 1;
		this.rememberedUsername = null;
		this.hideUsername = false;
		this.field1304 = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.parameters = new LinkedHashMap();
		this.method2215(true);
	}

	@ObfuscatedSignature(
		signature = "(Lnu;)V"
	)
	ClientPreferences(Buffer var1) {
		this.windowMode = 1;
		this.rememberedUsername = null;
		this.hideUsername = false;
		this.field1304 = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.parameters = new LinkedHashMap();
		if (var1 != null && var1.array != null) {
			int var2 = var1.readUnsignedByte();
			if (var2 >= 0 && var2 <= ClientPreferences_optionCount) {
				if (var1.readUnsignedByte() == 1) {
					this.roofsHidden = true;
				}

				if (var2 > 1) {
					this.titleMusicDisabled = var1.readUnsignedByte() == 1;
				}

				if (var2 > 3) {
					this.windowMode = var1.readUnsignedByte();
				}

				if (var2 > 2) {
					int var3 = var1.readUnsignedByte();

					for (int var4 = 0; var4 < var3; ++var4) {
						int var5 = var1.readInt();
						int var6 = var1.readInt();
						this.parameters.put(var5, var6);
					}
				}

				if (var2 > 4) {
					this.rememberedUsername = var1.readStringCp1252NullTerminatedOrNull();
				}

				if (var2 > 5) {
					this.hideUsername = var1.readBoolean();
				}

				if (var2 > 6) {
					this.field1304 = (double)var1.readUnsignedByte() / 100.0D;
					this.musicVolume = var1.readUnsignedByte();
					this.soundEffectsVolume = var1.readUnsignedByte();
					this.areaSoundEffectsVolume = var1.readUnsignedByte();
				}
			} else {
				this.method2215(true);
			}
		} else {
			this.method2215(true);
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(ZI)V",
		garbageValue = "224718677"
	)
	void method2215(boolean var1) {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(I)Lnu;",
		garbageValue = "787030147"
	)
	@Export("toBuffer")
	Buffer toBuffer() {
		Buffer var1 = new Buffer(100);
		var1.writeByte(ClientPreferences_optionCount);
		var1.writeByte(this.roofsHidden ? 1 : 0);
		var1.writeByte(this.titleMusicDisabled ? 1 : 0);
		var1.writeByte(this.windowMode);
		var1.writeByte(this.parameters.size());
		Iterator var2 = this.parameters.entrySet().iterator();

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next();
			var1.writeInt((Integer)var3.getKey());
			var1.writeInt((Integer)var3.getValue());
		}

		var1.writeStringCp1252NullTerminated(this.rememberedUsername != null ? this.rememberedUsername : "");
		var1.writeBoolean(this.hideUsername);
		var1.writeByte((int)(100.0D * this.field1304));
		var1.writeByte(this.musicVolume);
		var1.writeByte(this.soundEffectsVolume);
		var1.writeByte(this.areaSoundEffectsVolume);
		return var1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		signature = "(IB)I",
		garbageValue = "58"
	)
	static int method2221(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field934 - 7.0D) * 256.0D);
	}
}
