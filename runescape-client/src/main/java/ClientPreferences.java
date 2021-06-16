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
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -454250637
	)
	@Export("ClientPreferences_optionCount")
	static int ClientPreferences_optionCount;
	@ObfuscatedName("v")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("y")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1571023127
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("o")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("m")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("r")
	double field1312;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1112571497
	)
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1870852049
	)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 348107745
	)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("b")
	@Export("parameters")
	LinkedHashMap parameters;

	static {
		ClientPreferences_optionCount = 7;
	}

	ClientPreferences() {
		this.windowMode = 1;
		this.rememberedUsername = null;
		this.hideUsername = false;
		this.field1312 = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.parameters = new LinkedHashMap();
		this.method2315(true);
	}

	@ObfuscatedSignature(
		descriptor = "(Lnt;)V"
	)
	ClientPreferences(Buffer var1) {
		this.windowMode = 1;
		this.rememberedUsername = null;
		this.hideUsername = false;
		this.field1312 = 0.8D;
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
					this.field1312 = (double)var1.readUnsignedByte() / 100.0D;
					this.musicVolume = var1.readUnsignedByte();
					this.soundEffectsVolume = var1.readUnsignedByte();
					this.areaSoundEffectsVolume = var1.readUnsignedByte();
				}
			} else {
				this.method2315(true);
			}
		} else {
			this.method2315(true);
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-49"
	)
	void method2315(boolean var1) {
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Lnt;",
		garbageValue = "1929327586"
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
		var1.writeByte((int)(100.0D * this.field1312));
		var1.writeByte(this.musicVolume);
		var1.writeByte(this.soundEffectsVolume);
		var1.writeByte(this.areaSoundEffectsVolume);
		return var1;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-648393673"
	)
	static int method2330(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
		return var3;
	}
}
