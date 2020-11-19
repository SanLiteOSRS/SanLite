import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cp")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 297838275
	)
	@Export("ClientPreferences_optionCount")
	static int ClientPreferences_optionCount;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		signature = "Llw;"
	)
	static Bounds field1089;
	@ObfuscatedName("l")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("m")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 183452859
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("q")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("k")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("c")
	@Export("parameters")
	LinkedHashMap parameters;

	static {
		ClientPreferences_optionCount = 6;
	}

	ClientPreferences() {
		this.windowMode = 1;
		this.rememberedUsername = null;
		this.hideUsername = false;
		this.parameters = new LinkedHashMap();
		this.method1948(true);
	}

	@ObfuscatedSignature(
		signature = "(Lkb;)V"
	)
	ClientPreferences(Buffer var1) {
		this.windowMode = 1;
		this.rememberedUsername = null;
		this.hideUsername = false;
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
			} else {
				this.method1948(true);
			}
		} else {
			this.method1948(true);
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(ZB)V",
		garbageValue = "120"
	)
	void method1948(boolean var1) {
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(I)Lkb;",
		garbageValue = "-948717510"
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
		return var1;
	}
}
