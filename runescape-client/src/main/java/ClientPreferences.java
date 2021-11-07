import java.lang.management.GarbageCollectorMXBean;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cs")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1485573005
	)
	@Export("ClientPreferences_optionCount")
	static int ClientPreferences_optionCount;
	@ObfuscatedName("aj")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;
	@ObfuscatedName("s")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("a")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -884769931
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("g")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("e")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("p")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -162381111
	)
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 452159187
	)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1910295805
	)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1017713591
	)
	int field1182;
	@ObfuscatedName("k")
	@Export("parameters")
	LinkedHashMap parameters;

	static {
		ClientPreferences_optionCount = 8;
	}

	ClientPreferences() {
		this.windowMode = 1;
		this.rememberedUsername = null;
		this.hideUsername = false;
		this.brightness = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.field1182 = -1;
		this.parameters = new LinkedHashMap();
		this.method2231(true);
	}

	@ObfuscatedSignature(
		descriptor = "(Lop;)V"
	)
	ClientPreferences(Buffer var1) {
		this.windowMode = 1;
		this.rememberedUsername = null;
		this.hideUsername = false;
		this.brightness = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.field1182 = -1;
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
					this.brightness = (double)var1.readUnsignedByte() / 100.0D;
					this.musicVolume = var1.readUnsignedByte();
					this.soundEffectsVolume = var1.readUnsignedByte();
					this.areaSoundEffectsVolume = var1.readUnsignedByte();
				}

				if (var2 > 7) {
					this.field1182 = var1.readUnsignedByte();
				}
			} else {
				this.method2231(true);
			}
		} else {
			this.method2231(true);
		}

	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1940266105"
	)
	void method2231(boolean var1) {
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Lop;",
		garbageValue = "2037390205"
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
		var1.writeByte((int)(100.0D * this.brightness));
		var1.writeByte(this.musicVolume);
		var1.writeByte(this.soundEffectsVolume);
		var1.writeByte(this.areaSoundEffectsVolume);
		var1.writeByte(this.field1182);
		return var1;
	}
}
