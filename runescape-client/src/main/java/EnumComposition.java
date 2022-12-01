import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
@Implements("EnumComposition")
public class EnumComposition extends DualNode {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	@Export("EnumDefinition_archive")
	public static AbstractArchive EnumDefinition_archive;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("EnumDefinition_cached")
	static EvictingDualNodeHashTable EnumDefinition_cached;
	@ObfuscatedName("c")
	@Export("inputType")
	public char inputType;
	@ObfuscatedName("x")
	@Export("outputType")
	public char outputType;
	@ObfuscatedName("h")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 727291743
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1642297391
	)
	@Export("outputCount")
	public int outputCount;
	@ObfuscatedName("d")
	@Export("keys")
	public int[] keys;
	@ObfuscatedName("n")
	@Export("intVals")
	public int[] intVals;
	@ObfuscatedName("r")
	@Export("strVals")
	public String[] strVals;

	static {
		EnumDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	EnumComposition() {
		this.defaultStr = "null"; // L: 15
		this.outputCount = 0; // L: 17
	} // L: 22

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqr;B)V",
		garbageValue = "-2"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 36
			if (var2 == 0) { // L: 37
				return; // L: 40
			}

			this.decodeNext(var1, var2); // L: 38
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqr;II)V",
		garbageValue = "-828068148"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 43
			this.inputType = (char)var1.readUnsignedByte();
		} else if (var2 == 2) { // L: 44
			this.outputType = (char)var1.readUnsignedByte();
		} else if (var2 == 3) { // L: 45
			this.defaultStr = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 46
			this.defaultInt = var1.readInt();
		} else {
			int var3;
			if (var2 == 5) { // L: 47
				this.outputCount = var1.readUnsignedShort(); // L: 48
				this.keys = new int[this.outputCount]; // L: 49
				this.strVals = new String[this.outputCount]; // L: 50

				for (var3 = 0; var3 < this.outputCount; ++var3) { // L: 51
					this.keys[var3] = var1.readInt(); // L: 52
					this.strVals[var3] = var1.readStringCp1252NullTerminated(); // L: 53
				}
			} else if (var2 == 6) { // L: 56
				this.outputCount = var1.readUnsignedShort(); // L: 57
				this.keys = new int[this.outputCount]; // L: 58
				this.intVals = new int[this.outputCount]; // L: 59

				for (var3 = 0; var3 < this.outputCount; ++var3) { // L: 60
					this.keys[var3] = var1.readInt(); // L: 61
					this.intVals[var3] = var1.readInt(); // L: 62
				}
			}
		}

	} // L: 66

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "64"
	)
	@Export("size")
	public int size() {
		return this.outputCount; // L: 69
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(Lcw;I)V",
		garbageValue = "-1074689727"
	)
	static final void method3528(PendingSpawn var0) {
		long var1 = 0L; // L: 8065
		int var3 = -1; // L: 8066
		int var4 = 0; // L: 8067
		int var5 = 0; // L: 8068
		if (var0.type == 0) { // L: 8069
			var1 = class139.scene.getWallObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) { // L: 8070
			var1 = class139.scene.getDecorativeObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) { // L: 8071
			var1 = class139.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) { // L: 8072
			var1 = class139.scene.getGroundObjectTag(var0.plane, var0.x, var0.y);
		}

		if (0L != var1) { // L: 8073
			int var6 = class139.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1); // L: 8074
			var3 = AttackOption.Entity_unpackID(var1); // L: 8075
			var4 = var6 & 31; // L: 8076
			var5 = var6 >> 6 & 3; // L: 8077
		}

		var0.objectId = var3; // L: 8079
		var0.field1126 = var4; // L: 8080
		var0.field1125 = var5; // L: 8081
	} // L: 8082
}
