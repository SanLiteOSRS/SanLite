import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kz")
@Implements("ParamDefinition")
public class ParamDefinition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lir;"
	)
	@Export("ParamDefinition_archive")
	static AbstractArchive ParamDefinition_archive;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lgf;"
	)
	@Export("ParamDefinition_cached")
	public static EvictingDualNodeHashTable ParamDefinition_cached;
	@ObfuscatedName("u")
	@Export("type")
	char type;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1078497239
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("b")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("e")
	@Export("autoDisable")
	boolean autoDisable;

	static {
		ParamDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	ParamDefinition() {
		this.autoDisable = true;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1223154324"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(Lnu;B)V",
		garbageValue = "-36"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(Lnu;II)V",
		garbageValue = "1477627389"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			byte var4 = var1.readByte();
			int var5 = var4 & 255;
			if (var5 == 0) {
				throw new IllegalArgumentException("" + Integer.toString(var5, 16));
			}

			if (var5 >= 128 && var5 < 160) {
				char var6 = class300.cp1252AsciiExtension[var5 - 128];
				if (var6 == 0) {
					var6 = '?';
				}

				var5 = var6;
			}

			char var3 = (char)var5;
			this.type = var3;
		} else if (var2 == 2) {
			this.defaultInt = var1.readInt();
		} else if (var2 == 4) {
			this.autoDisable = false;
		} else if (var2 == 5) {
			this.defaultStr = var1.readStringCp1252NullTerminated();
		}

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "206427050"
	)
	@Export("isString")
	public boolean isString() {
		return this.type == 's';
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1027659488"
	)
	public static void method5096() {
		StructDefinition.StructDefinition_cached.clear();
	}
}
