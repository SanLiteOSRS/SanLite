import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("o")
public class class5 extends class16 {
	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	static Widget field42;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 835981453
	)
	int field43;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ls;"
	)
	final class19 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ls;)V"
	)
	class5(class19 var1) {
		this.this$0 = var1;
		this.field43 = -1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "851460888"
	)
	void vmethod331(Buffer var1) {
		this.field43 = var1.readUnsignedShort();
		var1.readUnsignedByte();
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ly;I)V",
		garbageValue = "-1362614343"
	)
	void vmethod332(ClanChannel var1) {
		var1.removeMember(this.field43);
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2066845091"
	)
	public static boolean method73(int var0) {
		return (var0 >> 20 & 1) != 0;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-217249908"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0;
		if (var0 < 0 || var0 >= 65536) {
			var0 >>>= 16;
			var1 += 16;
		}

		if (var0 >= 256) {
			var0 >>>= 8;
			var1 += 8;
		}

		if (var0 >= 16) {
			var0 >>>= 4;
			var1 += 4;
		}

		if (var0 >= 4) {
			var0 >>>= 2;
			var1 += 2;
		}

		if (var0 >= 1) {
			var0 >>>= 1;
			++var1;
		}

		return var0 + var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZB)I",
		garbageValue = "-72"
	)
	static int method72(int var0, Script var1, boolean var2) {
		if (var0 == 6800) {
			Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
			return 1;
		} else if (var0 != 6801 && var0 != 6802) {
			if (var0 == 6850) {
				Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
				return 1;
			} else if (var0 != 6851 && var0 != 6852) {
				if (var0 == 6853) {
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
					return 1;
				} else {
					return 2;
				}
			} else {
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1;
				return 1;
			}
		} else {
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1;
			return 1;
		}
	}
}
