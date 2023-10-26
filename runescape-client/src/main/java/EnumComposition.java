import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ht")
@Implements("EnumComposition")
public class EnumComposition extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("EnumDefinition_archive")
	static AbstractArchive EnumDefinition_archive;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("EnumDefinition_cached")
	public static EvictingDualNodeHashTable EnumDefinition_cached;
	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "[Lud;"
	)
	static SpritePixels[] field2021;
	@ObfuscatedName("ak")
	@Export("inputType")
	public char inputType;
	@ObfuscatedName("ax")
	@Export("outputType")
	public char outputType;
	@ObfuscatedName("ao")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -2088464929
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 464493353
	)
	@Export("outputCount")
	public int outputCount;
	@ObfuscatedName("ab")
	@Export("keys")
	public int[] keys;
	@ObfuscatedName("am")
	@Export("intVals")
	public int[] intVals;
	@ObfuscatedName("av")
	@Export("strVals")
	public String[] strVals;

	static {
		EnumDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	EnumComposition() {
		this.defaultStr = "null"; // L: 15
		this.outputCount = 0; // L: 17
	} // L: 22

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lul;B)V",
		garbageValue = "72"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 40
			if (var2 == 0) { // L: 41
				return; // L: 44
			}

			this.decodeNext(var1, var2); // L: 42
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lul;IB)V",
		garbageValue = "101"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 47
			this.inputType = (char)var1.readUnsignedByte();
		} else if (var2 == 2) { // L: 48
			this.outputType = (char)var1.readUnsignedByte();
		} else if (var2 == 3) { // L: 49
			this.defaultStr = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 50
			this.defaultInt = var1.readInt();
		} else {
			int var3;
			if (var2 == 5) { // L: 51
				this.outputCount = var1.readUnsignedShort(); // L: 52
				this.keys = new int[this.outputCount]; // L: 53
				this.strVals = new String[this.outputCount]; // L: 54

				for (var3 = 0; var3 < this.outputCount; ++var3) { // L: 55
					this.keys[var3] = var1.readInt(); // L: 56
					this.strVals[var3] = var1.readStringCp1252NullTerminated(); // L: 57
				}
			} else if (var2 == 6) { // L: 60
				this.outputCount = var1.readUnsignedShort(); // L: 61
				this.keys = new int[this.outputCount]; // L: 62
				this.intVals = new int[this.outputCount]; // L: 63

				for (var3 = 0; var3 < this.outputCount; ++var3) { // L: 64
					this.keys[var3] = var1.readInt(); // L: 65
					this.intVals[var3] = var1.readInt(); // L: 66
				}
			}
		}

	} // L: 70

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("size")
	public int size() {
		return this.outputCount; // L: 73
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "164767930"
	)
	public static int method3749(int var0) {
		--var0; // L: 77
		var0 |= var0 >>> 1; // L: 78
		var0 |= var0 >>> 2; // L: 79
		var0 |= var0 >>> 4; // L: 80
		var0 |= var0 >>> 8; // L: 81
		var0 |= var0 >>> 16; // L: 82
		return var0 + 1; // L: 83
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "-124"
	)
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length(); // L: 133
		int var2 = 0; // L: 134

		for (int var3 = 0; var3 < var1; ++var3) { // L: 135
			var2 = (var2 << 5) - var2 + Actor.charToByteCp1252(var0.charAt(var3));
		}

		return var2; // L: 136
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1375573031"
	)
	static final int method3750(int var0, int var1, int var2) {
		if (var2 > 179) { // L: 997
			var1 /= 2;
		}

		if (var2 > 192) { // L: 998
			var1 /= 2;
		}

		if (var2 > 217) { // L: 999
			var1 /= 2;
		}

		if (var2 > 243) { // L: 1000
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2; // L: 1001
		return var3; // L: 1002
	}

	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "(Lnm;B)Z",
		garbageValue = "1"
	)
	static final boolean method3761(Widget var0) {
		int var1 = var0.contentType; // L: 12422
		if (var1 == 205) { // L: 12423
			Client.logoutTimer = 250; // L: 12424
			return true; // L: 12425
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) { // L: 12427
				var2 = (var1 - 300) / 2; // L: 12428
				var3 = var1 & 1; // L: 12429
				Client.playerAppearance.changeAppearance(var2, var3 == 1); // L: 12430
			}

			if (var1 >= 314 && var1 <= 323) { // L: 12432
				var2 = (var1 - 314) / 2; // L: 12433
				var3 = var1 & 1; // L: 12434
				Client.playerAppearance.method6270(var2, var3 == 1); // L: 12435
			}

			if (var1 == 324) { // L: 12437
				Client.playerAppearance.method6265(0);
			}

			if (var1 == 325) { // L: 12438
				Client.playerAppearance.method6265(1);
			}

			if (var1 == 326) { // L: 12439
				PacketBufferNode var4 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3140, Client.packetWriter.isaacCipher); // L: 12441
				Client.playerAppearance.write(var4.packetBuffer); // L: 12442
				Client.packetWriter.addNode(var4); // L: 12443
				return true; // L: 12444
			} else {
				return false; // L: 12446
			}
		}
	}
}
