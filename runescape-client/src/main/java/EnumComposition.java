import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ep")
@Implements("EnumComposition")
public class EnumComposition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("EnumDefinition_archive")
	static AbstractArchive EnumDefinition_archive;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("EnumDefinition_cached")
	static EvictingDualNodeHashTable EnumDefinition_cached;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 422415445
	)
	static int field1629;
	@ObfuscatedName("v")
	@Export("inputType")
	public char inputType;
	@ObfuscatedName("y")
	@Export("outputType")
	public char outputType;
	@ObfuscatedName("j")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -883966701
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 691082953
	)
	@Export("outputCount")
	public int outputCount;
	@ObfuscatedName("r")
	@Export("keys")
	public int[] keys;
	@ObfuscatedName("h")
	@Export("intVals")
	public int[] intVals;
	@ObfuscatedName("d")
	@Export("strVals")
	public String[] strVals;

	static {
		EnumDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	EnumComposition() {
		this.defaultStr = "null";
		this.outputCount = 0;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "1541381103"
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

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lnt;II)V",
		garbageValue = "1108617782"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.inputType = (char)var1.readUnsignedByte();
		} else if (var2 == 2) {
			this.outputType = (char)var1.readUnsignedByte();
		} else if (var2 == 3) {
			this.defaultStr = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) {
			this.defaultInt = var1.readInt();
		} else {
			int var3;
			if (var2 == 5) {
				this.outputCount = var1.readUnsignedShort();
				this.keys = new int[this.outputCount];
				this.strVals = new String[this.outputCount];

				for (var3 = 0; var3 < this.outputCount; ++var3) {
					this.keys[var3] = var1.readInt();
					this.strVals[var3] = var1.readStringCp1252NullTerminated();
				}
			} else if (var2 == 6) {
				this.outputCount = var1.readUnsignedShort();
				this.keys = new int[this.outputCount];
				this.intVals = new int[this.outputCount];

				for (var3 = 0; var3 < this.outputCount; ++var3) {
					this.keys[var3] = var1.readInt();
					this.intVals[var3] = var1.readInt();
				}
			}
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1940899899"
	)
	@Export("size")
	public int size() {
		return this.outputCount;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-1376417697"
	)
	static boolean method2831(String var0) {
		if (var0 == null) {
			return false;
		} else {
			try {
				new URL(var0);
				return true;
			} catch (MalformedURLException var2) {
				return false;
			}
		}
	}

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "49"
	)
	static void method2827() {
		if (LoginPacket.field2800 != null) {
			Client.field798 = Client.cycle;
			LoginPacket.field2800.method5246();

			for (int var0 = 0; var0 < Client.players.length; ++var0) {
				if (Client.players[var0] != null) {
					LoginPacket.field2800.method5245(class15.baseX * 64 + (Client.players[var0].x >> 7), WorldMapSprite.baseY * 64 + (Client.players[var0].y >> 7));
				}
			}
		}

	}
}
