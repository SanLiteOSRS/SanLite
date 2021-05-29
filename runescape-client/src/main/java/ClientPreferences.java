import java.security.SecureRandom;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -437407307
	)
	@Export("ClientPreferences_optionCount")
	static int ClientPreferences_optionCount;
	@ObfuscatedName("eg")
	@Export("secureRandom")
	static SecureRandom secureRandom;
	@ObfuscatedName("f")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("y")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -660685365
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("j")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("r")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("b")
	double field1337;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1285356667
	)
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -140834991
	)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1768933319
	)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("l")
	@Export("parameters")
	LinkedHashMap parameters;

	static {
		ClientPreferences_optionCount = 7;
	}

	ClientPreferences() {
		this.windowMode = 1;
		this.rememberedUsername = null;
		this.hideUsername = false;
		this.field1337 = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.parameters = new LinkedHashMap();
		this.method2239(true);
	}

	@ObfuscatedSignature(
		descriptor = "(Lnd;)V"
	)
	ClientPreferences(Buffer var1) {
		this.windowMode = 1;
		this.rememberedUsername = null;
		this.hideUsername = false;
		this.field1337 = 0.8D;
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
					this.field1337 = (double)var1.readUnsignedByte() / 100.0D;
					this.musicVolume = var1.readUnsignedByte();
					this.soundEffectsVolume = var1.readUnsignedByte();
					this.areaSoundEffectsVolume = var1.readUnsignedByte();
				}
			} else {
				this.method2239(true);
			}
		} else {
			this.method2239(true);
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2046027023"
	)
	void method2239(boolean var1) {
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Lnd;",
		garbageValue = "2063389348"
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
		var1.writeByte((int)(100.0D * this.field1337));
		var1.writeByte(this.musicVolume);
		var1.writeByte(this.soundEffectsVolume);
		var1.writeByte(this.areaSoundEffectsVolume);
		return var1;
	}
}
