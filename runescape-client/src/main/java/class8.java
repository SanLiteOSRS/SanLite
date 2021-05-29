import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("d")
public class class8 extends class14 {
	@ObfuscatedName("o")
	public static boolean field75;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("archive2")
	static Archive archive2;
	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("archive17")
	static Archive archive17;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = 5988895091532737889L
	)
	long field77;
	@ObfuscatedName("n")
	String field71;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lf;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lf;)V"
	)
	class8(class2 var1) {
		this.this$0 = var1;
		this.field77 = -1L;
		this.field71 = null;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-1281352827"
	)
	void vmethod276(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field77 = var1.readLong();
		}

		this.field71 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ll;B)V",
		garbageValue = "29"
	)
	void vmethod281(class11 var1) {
		var1.method103(this.field77, this.field71, 0);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZB)I",
		garbageValue = "-51"
	)
	static int method82(int var0, Script var1, boolean var2) {
		if (var0 == 7100) {
			++class44.Interpreter_intStackSize;
			return 1;
		} else if (var0 == 7101) {
			Interpreter.Interpreter_stringStackSize += 2;
			return 1;
		} else if (var0 != 7102 && var0 != 7103 && var0 != 7104 && var0 != 7105 && var0 != 7109) {
			if (var0 == 7106) {
				++class44.Interpreter_intStackSize;
				return 1;
			} else if (var0 == 7107) {
				++class44.Interpreter_intStackSize;
				return 1;
			} else if (var0 == 7108) {
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = WorldMapIcon_1.method3235() ? 1 : 0;
				return 1;
			} else {
				return 2;
			}
		} else {
			++class44.Interpreter_intStackSize;
			return 1;
		}
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1387423967"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop;
	}
}
